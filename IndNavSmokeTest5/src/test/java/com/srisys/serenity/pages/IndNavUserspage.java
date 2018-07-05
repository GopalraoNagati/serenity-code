package com.srisys.serenity.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.srisys.serenity.AcceptanceSuite;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class IndNavUserspage extends PageObject{
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
	
	WebElement usersMaxLimitActiveReservations;
	WebElement usersAdvancedReservationWindowInDays;
	
	WebElement userSubmitbuttonElem;
	WebElement userNameElem;
	
	
	public void usersCreate() throws InterruptedException{
     Thread.sleep(1000);
		AdminElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Admin")));
		AdminElem.click();
		Thread.sleep(1000);
		usersLinkElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("usersLink")));
		usersLinkElem.click();
		Thread.sleep(3000);
		useraaddButtonElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("useraaddButton")));
		useraaddButtonElem.click();
		Thread.sleep(3000);
		Select Enterprice = new Select(
				this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("usersenterprice"))));
		Enterprice.selectByVisibleText(AcceptanceSuite.props.getProperty("EnterpriceData"));
		Thread.sleep(3000);
		Select EnterpriceresourcesType = new Select(
				this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("userEnterpriceresources"))));
		EnterpriceresourcesType.selectByVisibleText(AcceptanceSuite.props.getProperty("Enterpriceresource"));
//
		Thread.sleep(3000);
		userNameElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("username")));
        userNameElem.sendKeys(AcceptanceSuite.props.getProperty("usersname"));
//		
        Thread.sleep(3000);
		Select parentfleetType = new Select(
				this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("RoleName"))));
		parentfleetType.selectByVisibleText(AcceptanceSuite.props.getProperty("RoleNamedata"));
//		 
//		// Thread.sleep(1000);
		Thread.sleep(3000);
		userscontactDetailsElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("usersContactDetails")));
		userscontactDetailsElem.click();
//		
//		MobilidElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Mobilid")));
//		MobilidElem.clear();
//		MobilidElem.sendKeys(AcceptanceSuite.props.getProperty("Worknumberdata"));
//		
//		fleetemailElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Emailid")));
//		fleetemailElem.clear();
//		fleetemailElem.sendKeys(AcceptanceSuite.props.getProperty("Emaildata"));
//	
		Thread.sleep(3000);
		usersaddressDetailsElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("usersAddressDetails")));
		//this.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		usersaddressDetailsElem.click();
		Thread.sleep(3000);
		userssettingDetailsElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("settingDetails")));
		//this.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		userssettingDetailsElem.click();
		
		Thread.sleep(3000);
		usersMaxLimitActiveReservations = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("usersMaxLimitActiveReservations")));
		usersMaxLimitActiveReservations.clear();
		usersMaxLimitActiveReservations.sendKeys(AcceptanceSuite.props.getProperty("usersMaxLimitActiveReservationsValue"));
		usersAdvancedReservationWindowInDays=this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("usersAdvancedReservationWindowInDays")));
		usersAdvancedReservationWindowInDays.clear();
		usersAdvancedReservationWindowInDays.sendKeys(AcceptanceSuite.props.getProperty("usersAdvancedReservationWindowInDaysValue"));
		
		Thread.sleep(3000);
		userpreferenceDetailsElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("usersPreferences")));
		//this.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		userpreferenceDetailsElem.click();
		
		Thread.sleep(3000);
		userSubmitbuttonElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("usersSubmit")));
		//this.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		userSubmitbuttonElem.click();
		try{
			this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("UsersaddClose"))).click();
		} catch (Exception Ex){
			Ex.printStackTrace();
		}

	}
	
	public void usersDelete() throws InterruptedException{
		Thread.sleep(5000);
		AdminElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Admin")));
		AdminElem.click();

		Thread.sleep(2000);
		usersLinkElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("usersLink")));
		usersLinkElem.click();

		
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();
		
		String xpathsString = AcceptanceSuite.props.getProperty("usersDeleteXpaths");
		String valuesString = AcceptanceSuite.props.getProperty("usersDeleteValue");
		
		for (int i=0; i<xpathsString.split(",").length; i++){
			
			xpaths.add(xpathsString.split(",")[i]);
			System.out.println("lllllllllll"+xpaths);
			values.add(valuesString.split(",")[i]);
			System.out.println("lllllllllll"+values);
		}
		
		String actionXPath = AcceptanceSuite.props.getProperty("usersDeleteActionXPath");
		String nextPageXPath = AcceptanceSuite.props.getProperty("usersResourceNextPagePath");
		
		String searchXPath = AcceptanceSuite.props.getProperty("userssearchxpath");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("userssearchbutton");
		

		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(), searchXPath, searchButtonXPath);
		this.getDriver().findElement(By.xpath(action)).click();
		
		if (!action.equalsIgnoreCase("No Match")){
			Thread.sleep(2000);
			this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("usersFinalDeleteXPath"))).click();
		}
	}
}
