package com.srisys.serenity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.jbehave.SerenityStories;

public class AcceptanceSuite extends SerenityStories {
	public static Properties props = new Properties();
	static{		
		try {
			props.load(new FileInputStream("serenity.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Properties Keyset size="+props.keySet().size());
	}
	
	public static String getXPath(ArrayList<String> xpaths, ArrayList<String> values, String actionXPath,  String nextPageXPath, WebDriver driver, String searchXPath, String searchButtonXPath) throws InterruptedException{
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		System.out.println("size of values="+values.size());
		System.out.println("search xpath="+searchXPath);
		
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(searchXPath))).clear();
		driver.findElement(By.xpath(searchXPath)).sendKeys(values.get(0));
		driver.findElement(By.xpath(searchButtonXPath)).click();
		
		int pageNumber = 4;
		String nextXPath;
		try {
			int j=0;
			for (j=0; j<xpaths.size();j++)
			{
				System.out.println("j="+j);
				System.out.println("on page value="+wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpaths.get(j).toString().replace("tr[:]", "tr")))).getText());
				System.out.println("passed value="+values.get(j).toString());
				if (!driver.findElement(By.xpath(xpaths.get(j).toString().replace("tr[:]", "tr"))).getText().equalsIgnoreCase(values.get(j).toString())){
					break;
				} 
			}
			if (j==xpaths.size())
				return actionXPath.replace("tr[:]", "tr");
		} catch(Exception ex){
			
		}
		
		do{			
			//since we dont know how many records a page has, we are not giving conditional block
			for (int i=1;; i++){
				int j=0;
				try{	
					//System.out.println("xpaths"+xpaths.size());
					//System.out.println("values"+values.size());
					for (j=0; j<xpaths.size();j++)
					{
						//System.out.println("i="+i+";j="+j+";");
						//System.out.println(values.get(j).toString());
						Thread.sleep(1000);			
						if (!wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpaths.get(j).toString().replace(":", new Integer(i).toString())))).getText().equalsIgnoreCase(values.get(j).toString())){
							break;
						} 
					}
					
					if (j==xpaths.size())
						return actionXPath.replace(":", new Integer(i).toString());
					
				} catch( org.openqa.selenium.NoSuchElementException Ex){
					break;
				}
			}	
			pageNumber++;
			nextXPath = nextPageXPath.replaceFirst(":", new Integer(pageNumber).toString());
			try{
				driver.findElement(By.xpath(nextXPath)).click();
			} catch ( org.openqa.selenium.NoSuchElementException Ex){
				break;
			}
		}while (!By.xpath(nextXPath).equals(null));
		return "No Match";

	}
}
