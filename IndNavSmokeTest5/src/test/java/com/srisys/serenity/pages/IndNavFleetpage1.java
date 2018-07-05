package com.srisys.serenity.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.srisys.serenity.AcceptanceSuite;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class IndNavFleetpage1 extends PageObject{
	WebDriver driver;
	
	WebElement EnterpriceElem;
	WebElement EnterpricesElem;
    WebElement FleetsElem;
	WebElement FleetsAddElem;
	WebElement FleetElem;
	WebElement MobilidElem;
	WebElement fleetemailElem;
	WebElement fleetcontactDetailsElem;
	WebElement fleetaddressDetailsElem;
	WebElement fleetaddressLine1Elem;
	WebElement fleetcityElem;
	WebElement fleetzipElem;
	WebElement fleetLattitudeElem;
	WebElement fleetLongitudeElem;
	WebElement SettingsElem;
	WebElement preferenceElem;
	WebElement attributeElem;
	WebElement fleetSubmitbuttonElem;
	WebElement advancedReservationWindowInDays;
	
	
	public void fleetCreate() throws InterruptedException{

		//Thread.sleep(1000);
		//EnterpricesElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Enterprices")));
		//EnterpricesElem.click();

		Thread.sleep(1000);
		FleetsElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Fleets")));
		FleetsElem.click();

		Thread.sleep(1000);
		FleetsAddElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("FleetsAdd")));
		//this.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(2000);
		FleetsAddElem.click();
		Select Enterprice = new Select(
		this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("FleetEnterprice"))));
		Thread.sleep(2000);
		Enterprice.selectByVisibleText(AcceptanceSuite.props.getProperty("EnterpriceData"));

		Select FleetType = new Select(
				this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("FleetType"))));
		FleetType.selectByVisibleText(AcceptanceSuite.props.getProperty("FleetTypeData"));

		FleetElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Fleet")));

		FleetElem.sendKeys(AcceptanceSuite.props.getProperty("FleetData"));
		
//		Select parentfleetType = new Select(
//				this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("ParentFleet"))));
//		parentfleetType.selectByVisibleText(AcceptanceSuite.props.getProperty("ParentFleetdata"));
		 
		// Thread.sleep(1000);
		fleetcontactDetailsElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("ContactDetails")));
		fleetcontactDetailsElem.click();
		
		Thread.sleep(1000);
		MobilidElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Mobilid")));
		MobilidElem.clear();
		MobilidElem.sendKeys(AcceptanceSuite.props.getProperty("Worknumberdata"));
		
		Thread.sleep(2000);
		fleetemailElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Emailid")));
		fleetemailElem.clear();
		fleetemailElem.sendKeys(AcceptanceSuite.props.getProperty("Emaildata"));
		
		Thread.sleep(1000);
		fleetaddressDetailsElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("AddressDetails")));
		fleetaddressDetailsElem.click();
		
		
		Thread.sleep(1000);
		fleetaddressLine1Elem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("FleetAddresLine1")));
		fleetaddressLine1Elem.clear();
		fleetaddressLine1Elem.sendKeys(AcceptanceSuite.props.getProperty("fleetAdreesline1"));
		 //Thread.sleep(1000);

		Thread.sleep(1000);
		fleetcityElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("fleetCity")));
		fleetcityElem.clear();
		fleetcityElem.sendKeys(AcceptanceSuite.props.getProperty("fleetCity1"));
		//Thread.sleep(1000);
		
		Thread.sleep(1000);
		Select country = new Select(this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("FleetCountry"))));
		country.selectByVisibleText(AcceptanceSuite.props.getProperty("fleetcountry"));
		
		Thread.sleep(1000);
		Select state = new Select(this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Fleetstate"))));
		state.selectByVisibleText(AcceptanceSuite.props.getProperty("fleetstate"));
		//Thread.sleep(1000);
		
		Thread.sleep(1000);
		fleetzipElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Fleetzip")));
		fleetzipElem.clear();
		fleetzipElem.sendKeys(AcceptanceSuite.props.getProperty("fleetzip"));
		//Thread.sleep(1000);
		
		
		Thread.sleep(1000);
		fleetLattitudeElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("FleetLattitude")));
		fleetLattitudeElem.clear();
		fleetLattitudeElem.sendKeys(AcceptanceSuite.props.getProperty("fleetlattitude"));
		//Thread.sleep(1000);
		
		Thread.sleep(1000);
		fleetLongitudeElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("FleetLongitude")));
		fleetLongitudeElem.clear();
		fleetLongitudeElem.sendKeys(AcceptanceSuite.props.getProperty("fleetlongtitude"));
		
		Thread.sleep(1000);
		SettingsElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Settings")));
		SettingsElem.click();
		
		Thread.sleep(1000);
		advancedReservationWindowInDays = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("fleetadvancedReservationWindowInDays")));
		advancedReservationWindowInDays.clear();
		advancedReservationWindowInDays.sendKeys(AcceptanceSuite.props.getProperty("fleetadvancedReservationWindowInDaysValue"));
		
		Thread.sleep(2000);
		preferenceElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("preferences")));
		preferenceElem.click();
		//attributeElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("FleetAttribute")));
		//attributeElem.click();
		
		Thread.sleep(2000);
		fleetSubmitbuttonElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Submitbutton")));
		fleetSubmitbuttonElem.click();
	}
	
	public void fleetDelete() throws InterruptedException{
		Thread.sleep(5000);
		EnterpricesElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Enterprices")));
		EnterpricesElem.click();
	
		Thread.sleep(1000);
		FleetsElem = this.getDriver()
				.findElement(By.xpath(AcceptanceSuite.props.getProperty("Fleets")));
		FleetsElem.click();
		
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();
		
		String xpathsString = AcceptanceSuite.props.getProperty("fleetDeleteXpaths");
		String valuesString = AcceptanceSuite.props.getProperty("fleetDeleteValue");
		
		for (int i=0; i<xpathsString.split(",").length; i++){
			
			xpaths.add(xpathsString.split(",")[i]);
			System.out.println("lllllllllll"+xpaths);
			values.add(valuesString.split(",")[i]);
			System.out.println("lllllllllll"+values);
		}
		
		String actionXPath = AcceptanceSuite.props.getProperty("fleetDeleteActionXPath");
		String nextPageXPath = AcceptanceSuite.props.getProperty("fleetResourceNextPagePath");
		
		String searchXPath = AcceptanceSuite.props.getProperty("fleetsearchxpath");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("fleetsearchbutton");
		
		Thread.sleep(1000);
		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(), searchXPath, searchButtonXPath);
		this.getDriver().findElement(By.xpath(action)).click();
		
		if (!action.equalsIgnoreCase("No Match")){
			Thread.sleep(2000);
			this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("fleetFinalDeleteXPath"))).click();
		}
	}
}
