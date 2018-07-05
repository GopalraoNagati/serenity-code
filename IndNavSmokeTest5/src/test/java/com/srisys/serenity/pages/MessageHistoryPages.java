package com.srisys.serenity.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.srisys.serenity.AcceptanceSuite;

public class MessageHistoryPages extends PageObject {

	WebDriver driver;
	WebElement historyLinkElem;
	WebElement MessageHistoryHeaderElem;
	WebElement MessageHistory_AdvancedButtonElem;
	WebElement MessageHistory_EnterpriseElem;
	WebElement MessageHistory_FromElem;
	WebElement MessageHistory_ToElem;
	WebElement MessageHistory_SubmitBtnElem;
	WebElement MessageHistoryAdvancedSearch_EnterpriseInListingElem;
	WebElement MessageHistoryViewActionEleml;
	WebElement MessageHistoryViewCloseElem;
	WebElement MessageHistoryDeleteActionElem;
	WebElement MessageHistoryDeleteCloseElem;
	WebElement fleetSubmitbuttonElem;

	public void clickOnMessageHistoryHeader() {

		WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
		historyLinkElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("HistoryBlock"))));
		historyLinkElem.click();
		MessageHistoryHeaderElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("MessageHistoryHeader"))));
		MessageHistoryHeaderElem.click();

	}
	
	public void messageHistoryCreate() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);

		WebElement messageHistory;
		messageHistory = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("MessageHistoryadd"))));
		messageHistory.click();
		Select Enterprice = new Select(
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("MessageHistoryEnterprises")))));
		Enterprice.selectByVisibleText(AcceptanceSuite.props.getProperty("messageHistoryEnterprisesData"));

		Thread.sleep(2000);
		Select EnterpriceresourcesType = new Select(
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("MessagehistoryTo")))));
		EnterpriceresourcesType.selectByVisibleText(AcceptanceSuite.props.getProperty("messagehistoryToData"));
		
		
		Select messageType = new Select(
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("MessageTypee")))));
		messageType.selectByVisibleText(AcceptanceSuite.props.getProperty("MessageTypeeData"));
		
		MessageHistory_FromElem = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(AcceptanceSuite.props.getProperty("MeassageTextArea"))));
		MessageHistory_FromElem.sendKeys(AcceptanceSuite.props.getProperty("MessageData"));


		MessageHistory_SubmitBtnElem = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(AcceptanceSuite.props.getProperty("Messagesubmit"))));
		MessageHistory_SubmitBtnElem.click();

	}


	public void messageHistoryAdvanceSearch() {
		WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);

		System.out.println("I AM IN ADVANCED SEARCH OF MESSAGE HISTORY");
		MessageHistory_AdvancedButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(AcceptanceSuite.props.getProperty("MessageHistoryAdvancedSearch_AdvancedButton"))));
		MessageHistory_AdvancedButtonElem.click();

		MessageHistory_EnterpriseElem = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(AcceptanceSuite.props.getProperty("MessageHistoryAdvancedSearch_Enterprise"))));
		MessageHistory_EnterpriseElem
				.sendKeys(AcceptanceSuite.props.getProperty("MessageHistoryAdvancedSearch_EnterpriseData"));

		MessageHistory_FromElem = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(AcceptanceSuite.props.getProperty("MessageHistoryAdvancedSearch_From"))));
		MessageHistory_FromElem.sendKeys(AcceptanceSuite.props.getProperty("MessageHistoryAdvancedSearch_FromData"));

		MessageHistory_ToElem = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(AcceptanceSuite.props.getProperty("MessageHistoryAdvancedSearch_To"))));
		MessageHistory_ToElem.sendKeys(AcceptanceSuite.props.getProperty("MessageHistoryAdvancedSearch_ToData"));

		MessageHistory_SubmitBtnElem = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(AcceptanceSuite.props.getProperty("MessageHistoryAdvancedSearch_SubmitButton"))));
		MessageHistory_SubmitBtnElem.click();

	}

	public String checkWeather_SearchMessageHistoryDispalyedInListing() {
		WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);

		MessageHistoryAdvancedSearch_EnterpriseInListingElem = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(AcceptanceSuite.props.getProperty("MessageHistoryAdvancedSearch_EnterpriseInListing"))));
		MessageHistoryAdvancedSearch_EnterpriseInListingElem.isDisplayed();
		String a = MessageHistoryAdvancedSearch_EnterpriseInListingElem.getText();
		System.out.println(a);
		return a;

	}

	public void clickONViewBtn() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
		
		//WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("MessageHistoryBanner"))));
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("mesageHistoryViewxpaths");
		String valuesString = AcceptanceSuite.props.getProperty("mesageHistoryViewValues");

		for (int i = 0; i < xpathsString.split(",").length; i++) {

			xpaths.add(xpathsString.split(",")[i]);
			System.out.println("lllllllllll" + xpaths);
			values.add(valuesString.split(",")[i]);
			System.out.println("lllllllllll" + values);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("messageHistoryView");
		String nextPageXPath = AcceptanceSuite.props.getProperty("MessageHistoryNext");

		String searchXPath = AcceptanceSuite.props.getProperty("messageHistorysearch");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("messgeHistorysearchclick");

		//Thread.sleep(2000);
		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		//Thread.sleep(2000);
		
		
	
		fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("messagehistoryclose"))));
		fleetSubmitbuttonElem.click();

	}

	

	public void clickONDeleteBtn() throws InterruptedException {
WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
		
		//WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("MessageHistoryBanner"))));
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("mesageHistoryViewxpaths");
		String valuesString = AcceptanceSuite.props.getProperty("mesageHistoryViewValues");

		for (int i = 0; i < xpathsString.split(",").length; i++) {

			xpaths.add(xpathsString.split(",")[i]);
			System.out.println("lllllllllll" + xpaths);
			values.add(valuesString.split(",")[i]);
			System.out.println("lllllllllll" + values);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("messageHistoryDelete");
		String nextPageXPath = AcceptanceSuite.props.getProperty("MessageHistoryNext");

		String searchXPath = AcceptanceSuite.props.getProperty("messageHistorysearch");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("messgeHistorysearchclick");

		//Thread.sleep(2000);
		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		//Thread.sleep(2000);
		
		
	
		fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("messageHistoryfinalDelete"))));
		fleetSubmitbuttonElem.click();
	}

	public void clickONDelete_DeleteBtn() {
		MessageHistoryDeleteCloseElem = this.getDriver()
				.findElement(By.xpath(AcceptanceSuite.props.getProperty("MessageHistoryDelete_DeleteButton")));
		MessageHistoryDeleteCloseElem.click();
	}
//	
	public void readUnread() throws InterruptedException{
//		WebElement MessageHistoryReadUnreadElem = this.getDriver()
//				.findElement(By.xpath(AcceptanceSuite.props.getProperty("MessageHistoryReadUnread")));
//		MessageHistoryReadUnreadElem.click();
//		Thread.sleep(2000);
//		MessageHistoryReadUnreadElem.click();
	}
	
	public void clickCreate(){
		WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
		WebElement messageHistory;
		messageHistory = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("MessageHistoryadd"))));
		messageHistory.click();
		
		
	}
	
	public void invalidCombinationsAdd(String Enterprise, String To, String MessageType,
			String Message) throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
		Thread.sleep(2000);
		
		
		Select enterprise = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(AcceptanceSuite.props.getProperty("MessageHistoryEnterprises")))));
		enterprise.selectByVisibleText(Enterprise);
		
		Select to = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(AcceptanceSuite.props.getProperty("MessagehistoryTo")))));
		to.selectByVisibleText(To);
		
		Select messageType = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(AcceptanceSuite.props.getProperty("MessageTypee")))));
		messageType.selectByVisibleText(MessageType);
		if(!Message.isEmpty()){
		WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(AcceptanceSuite.props.getProperty("MessageText"))));
		message.sendKeys(Keys.CONTROL, "a");
		message.sendKeys(Keys.DELETE);
		message.sendKeys(Message);
		}
		MessageHistory_SubmitBtnElem = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(AcceptanceSuite.props.getProperty("Messagesubmit"))));
		MessageHistory_SubmitBtnElem.click();
	}


}
