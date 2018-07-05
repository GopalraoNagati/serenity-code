package com.srisys.serenity.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.srisys.serenity.AcceptanceSuite;

public class LoginHistoryPage extends PageObject{
	
	WebElement historyLinkElem;
	WebElement LoginHistoryHeaderElem;
	WebElement LoginHistory_AdvancedButtonElem;
	WebElement LoginHistory_EnterpriseElem;
	WebElement LoginHistoryHistory_VersionElem;
	WebElement LoginHistory_VersionElem;
	WebElement LoginHistory_SubmitBtnElem;
	WebElement LoginHistoryAdvancedSearch_EnterpriseInListingElem;
	WebElement LoginHistoryViewActionElem;
	WebElement LoginHistoryViewCloseElem;
	WebElement LoginHistoryDeleteActionElem;
	WebElement LoginHistoryDeleteCloseElem;

	public void clickOnLoginHistoryHeader() {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		historyLinkElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("HistoryBlock"))));
		historyLinkElem.click();
		LoginHistoryHeaderElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("LoginHistoryHeader"))));
		LoginHistoryHeaderElem.click();	
	}

	public void loginHistoryAdvanceSearch() {
        
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
        LoginHistory_AdvancedButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("LoginHistoryAdvancedSearch_AdvancedButton"))));
        LoginHistory_AdvancedButtonElem.click();
		
        LoginHistory_EnterpriseElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("LoginHistoryAdvancedSearch_Enterprise"))));
        LoginHistory_EnterpriseElem.sendKeys(AcceptanceSuite.props.getProperty("LoginHistoryAdvancedSearch_EnterpriseData"));
		
        LoginHistory_VersionElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("LoginHistoryAdvancedSearch_Version"))));
        LoginHistory_VersionElem.sendKeys(AcceptanceSuite.props.getProperty("LoginHistoryAdvancedSearch_VersionData"));
        
        LoginHistory_SubmitBtnElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("LoginHistoryAdvancedSearch_SubmitButton"))));
        LoginHistory_SubmitBtnElem.click();
		
	}  

	public String checkWeather_SearchLoginHistoryDispalyedInListing() {
		    WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		    LoginHistoryAdvancedSearch_EnterpriseInListingElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("MessageHistoryAdvancedSearch_EnterpriseInListing"))));
	        LoginHistoryAdvancedSearch_EnterpriseInListingElem.isDisplayed();
			String a = LoginHistoryAdvancedSearch_EnterpriseInListingElem.getText();
			System.out.println(a);
			return a;
	}

	public void clickONViewBtn() {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		LoginHistoryViewActionElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("LoginHistoryView_ViewAction"))));
		LoginHistoryViewActionElem.click();
		
	}

	public void clickONView_CloseBtn() {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		LoginHistoryViewCloseElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("LoginHistoryView_CloseButton"))));
		LoginHistoryViewCloseElem.click();
	}

	public void clickONDeleteBtn() {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		LoginHistoryDeleteActionElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("LoginHistoryDelete_DeleteAction"))));
		LoginHistoryDeleteActionElem.click();
		
	}

	public void clickONDelete_DeleteBtn() {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		LoginHistoryDeleteCloseElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("LoginHistoryDelete_DeleteButton"))));
		LoginHistoryDeleteCloseElem.click();
		
	}

}
