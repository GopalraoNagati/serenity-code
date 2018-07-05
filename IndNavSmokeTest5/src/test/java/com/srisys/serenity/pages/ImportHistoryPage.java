package com.srisys.serenity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.srisys.serenity.AcceptanceSuite;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class ImportHistoryPage extends PageObject{
	
	WebDriver  driver;
	WebElement historyLinkElem;
	WebElement ImportHistoryHeaderElem;
	WebElement ImportHistory_AdvancedButtonElem;
	WebElement ImportHistory_EnterpriseElem;
	WebElement ImportHistoryAdvancedSearch_ApplicationPageElem;
	WebElement ImportHistoryAdvancedSearch_SubmitButtonElem;
	WebElement ImportHistoryAdvancedSearch_EnterpriseInListingElem;
	WebElement importHistoryViewActionElem;
	WebElement importHistoryViewCloseElem;
	WebElement importHistoryDeleteActionElem;
	WebElement importHistoryDeleteCloseElem;
	
	
public void clickOnImportHistoryHeader() {
		
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		historyLinkElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("HistoryBlock"))));
		historyLinkElem.click();
		ImportHistoryHeaderElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ImportHistoryHeader"))));
		ImportHistoryHeaderElem.click();
		
	}

	public void importHistoryAdvanceSearch() {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
        ImportHistory_AdvancedButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ImportHistoryAdvancedSearch_AdvancedButton"))));
        ImportHistory_AdvancedButtonElem.click();
		
        ImportHistory_EnterpriseElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ImportHistoryAdvancedSearch_Enterprise"))));
        ImportHistory_EnterpriseElem.sendKeys(AcceptanceSuite.props.getProperty("ImportHistoryAdvancedSearch_EnterpriseData"));
		
        ImportHistoryAdvancedSearch_ApplicationPageElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ImportHistoryAdvancedSearch_ApplicationPage"))));
        ImportHistoryAdvancedSearch_ApplicationPageElem.sendKeys(AcceptanceSuite.props.getProperty("ImportHistoryAdvancedSearch_ApplicationPageData"));
        
        ImportHistoryAdvancedSearch_SubmitButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ImportHistoryAdvancedSearch_SubmitButton"))));
        ImportHistoryAdvancedSearch_SubmitButtonElem.click();
		
	}

	public String checkWeather_SearchImportHistoryDispalyedInListing() {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		ImportHistoryAdvancedSearch_EnterpriseInListingElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ImportHistoryAdvancedSearch_EnterpriseInListing"))));
        ImportHistoryAdvancedSearch_EnterpriseInListingElem.isDisplayed();
		String a = ImportHistoryAdvancedSearch_EnterpriseInListingElem.getText();
		System.out.println(a);
		return a;
		
	}

	public void clickONViewBtn() {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		importHistoryViewActionElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ImportHistoryView_ViewAction"))));
		importHistoryViewActionElem.click();
		
	}

	public void clickONView_CloseBtn() {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		importHistoryViewCloseElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ImportHistoryView_CloseButton"))));
		importHistoryViewCloseElem.click();
		
	}

	public void clickONDeleteBtn() {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		importHistoryDeleteActionElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ImportHistoryDelete_DeleteAction"))));
		importHistoryDeleteActionElem.click();
		
	}

	public void clickONDelete_DeleteBtn() {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		importHistoryDeleteCloseElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ImportHistoryDelete_DeleteButton"))));
		importHistoryDeleteCloseElem.click();
		
	}

	

}

