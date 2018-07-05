package com.srisys.serenity.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.srisys.serenity.AcceptanceSuite;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class ProfilePage extends PageObject{

	public void profileEdit(){
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		WebElement contactDetailsTab =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ProfileEditContactDetailsTab"))));
		contactDetailsTab.click();
		
		WebElement ProfileMobileNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ProfileMobileNumber"))));
		ProfileMobileNumber.clear();
		ProfileMobileNumber.sendKeys(AcceptanceSuite.props.getProperty("ProfileMobileNumberData"));
				
		WebElement ProfileWorkNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ProfileWorkNumber"))));
		ProfileWorkNumber.clear();
		ProfileWorkNumber.sendKeys(AcceptanceSuite.props.getProperty("ProfileWorkNumberData"));
				
		WebElement ProfileSubmitButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("profileEditSubmitButton"))));
		ProfileSubmitButton.click();
	}
	
	public void clickOnProfileEdit(){
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		WebElement SALinkElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ProfileEditSuperAdminLink"))));
		SALinkElem.click();
		
		WebElement profileEditLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ProfileEditLink"))));
		profileEditLink.click();
	}
	
	public void doValidations(String mobile, String a1, String a2, String a3, String a4, String a5) throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		
		WebElement contactDetailsTab =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ProfileEditContactDetailsTab"))));
		contactDetailsTab.click();
		
		WebElement mobileElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ProfileMobileNumber"))));
		mobileElem.clear();
		mobileElem.sendKeys(mobile);
			
		WebElement securityQuestionsTab =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("SecurityQuestionsTab"))));
		securityQuestionsTab.click();
		
		WebElement answer1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Answer1"))));
		WebElement answer2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Answer2"))));
		WebElement answer3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Answer3"))));
		WebElement answer4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Answer4"))));
		WebElement answer5 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Answer5"))));
		
		answer1.clear();
		answer1.sendKeys(a1);
		
		answer2.clear();
		answer2.sendKeys(a2);
		
		answer3.clear();
		answer3.sendKeys(a3);
		
		answer4.clear();
		answer4.sendKeys(a4);
		
		answer5.clear();
		answer5.sendKeys(a5);
		
		Thread.sleep(9000);
		
		WebElement ProfileSubmitButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("profileEditSubmitButton"))));
		ProfileSubmitButton.click();
		
		
	}
}
