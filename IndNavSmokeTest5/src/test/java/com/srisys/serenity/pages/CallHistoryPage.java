package com.srisys.serenity.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.srisys.serenity.AcceptanceSuite;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class CallHistoryPage extends PageObject{

	public void goToCallHistoryPage(){
		
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		WebElement historyBlock =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("CallHistory_HistoryBlock"))));
		historyBlock.click();
		
		WebElement callHistoryLink =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("CallHistory_CallHistoryLink"))));
		callHistoryLink.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("CallHistory_Banner"))));
	}
	
	public void clickView() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("CallHistory_Search"))));
		search.clear();		
		search.sendKeys(AcceptanceSuite.props.getProperty("CallHistory_SearchData"));
		WebElement searchBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("CallHistory_SearchButton"))));
		searchBtn.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("CallHistory_Banner"))));
		Thread.sleep(2000);
		WebElement view = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("CallHistory_View"))));
		view.click();
		WebElement closeView = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("CallHistory_ViewCloseButton"))));
		closeView.click();
		
	}
	
	public void clickDelete(){
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		WebElement delete = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("CallHistory_Delete"))));
		delete.click();
		WebElement confirmDelete = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("CallHistory_DeleteConfirmation"))));
		confirmDelete.click();
		
	}
	
	
	public void clickAdvSearch(){
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		WebElement advSearchBtn =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("CallHistory_AdvSearchButton"))));
		advSearchBtn.click();
		
		WebElement advSearchEntName =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("CallHistory_AdvSearchEntName"))));
		advSearchEntName.sendKeys(AcceptanceSuite.props.getProperty("CallHistory_AdvSearchEntNameData"));
		
		WebElement advSearchSubmitButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("CallHistory_AdvSearchSubmitButton"))));
		advSearchSubmitButton.click();
	}
}
