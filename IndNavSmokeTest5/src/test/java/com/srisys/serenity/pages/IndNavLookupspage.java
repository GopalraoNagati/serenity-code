package com.srisys.serenity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.srisys.serenity.AcceptanceSuite;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class IndNavLookupspage extends PageObject{
	WebDriver driver;
	
	WebElement AdminElem;
	WebElement usersLinkElem;
    WebElement useraaddButtonElem;
	WebElement FleetsAddElem;
	WebElement FleetElem;
	WebElement MobilidElem;
	WebElement fleetemailElem;
	WebElement userscontactDetailsElem;
	WebElement usersaddressDetailsElem;
	WebElement userssettingDetailsElem;
	WebElement userpreferenceDetailsElem;
	
	WebElement userSubmitbuttonElem;
	WebElement LookupsubmitElem;
	WebElement userNameElem;
	WebElement commentElem;
	
	
	public void lookupsCreate() throws InterruptedException{

		Thread.sleep(2000);
		AdminElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Admin")));
		AdminElem.click();

		Thread.sleep(2000);
		usersLinkElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("lookupsLink")));
		usersLinkElem.click();

		Thread.sleep(2000);
		useraaddButtonElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("lookupsAdd")));
		useraaddButtonElem.click();
		Thread.sleep(1000);
		Select Enterprice = new Select(
				this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("lookupEnterprice"))));
		Enterprice.selectByVisibleText(AcceptanceSuite.props.getProperty("EnterpriceData"));

		Select EnterpriceresourcesType = new Select(
				this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("LookupType"))));
		EnterpriceresourcesType.selectByVisibleText(AcceptanceSuite.props.getProperty("Lookuptypedata"));
//
		userNameElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("LookupValue")));
        userNameElem.sendKeys(AcceptanceSuite.props.getProperty("LookupValueData"));
        
        commentElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Comment")));
        commentElem.sendKeys(AcceptanceSuite.props.getProperty("commentValueData"));

		
		
		LookupsubmitElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Lookupsubmit")));
		LookupsubmitElem.click();
		
		Thread.sleep(2000);
		if(this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("LookupAdd_ErrorMessage"))).getText().length()!=0){
			this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("LookupAdd_CloseButton"))).click();
		}
		
		
		//Adding Second Lookup
		Thread.sleep(2000);
		usersLinkElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("lookupsLink")));
		usersLinkElem.click();

		Thread.sleep(2000);
		useraaddButtonElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("lookupsAdd")));
		useraaddButtonElem.click();
		Thread.sleep(1000);
		Enterprice = new Select(
				this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("lookupEnterprice"))));
		Enterprice.selectByVisibleText(AcceptanceSuite.props.getProperty("EnterpriceData"));

		EnterpriceresourcesType = new Select(
				this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("LookupType"))));
		EnterpriceresourcesType.selectByVisibleText(AcceptanceSuite.props.getProperty("Lookuptypedata1"));
//
		userNameElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("LookupValue")));
        userNameElem.sendKeys(AcceptanceSuite.props.getProperty("LookupValueData1"));
        
        commentElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Comment")));
        commentElem.sendKeys(AcceptanceSuite.props.getProperty("commentValueData1"));

		
		
		LookupsubmitElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Lookupsubmit")));
		LookupsubmitElem.click();

		Thread.sleep(2000);
		if(this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("LookupAdd_ErrorMessage"))).getText().length()!=0){
			this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("LookupAdd_CloseButton"))).click();
		}
		
		
		
		
	}
}
