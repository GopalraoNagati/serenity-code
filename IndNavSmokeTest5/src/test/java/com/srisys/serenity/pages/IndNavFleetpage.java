package com.srisys.serenity.pages;

import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.srisys.serenity.AcceptanceSuite;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class IndNavFleetpage extends PageObject {
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

	WebElement FleetAdvanceElem;
	WebElement FleetsAdvanceSubmitElem;
	WebElement FleetsAdvanceButtonElem;
	WebElement submitButtonElem;

	public void fleetAdvancedSearch() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
		Thread.sleep(2000);
		EnterpricesElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprices"))));
		EnterpricesElem.click();

		// Thread.sleep(1000);
		FleetsElem = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Fleets"))));
		FleetsElem.click();

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetBanner"))));
		FleetsAdvanceButtonElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetAdvancedSearch"))));
		FleetsAdvanceButtonElem.click();

		FleetAdvanceElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Fleetactionadavancesearch"))));

		FleetAdvanceElem.sendKeys(AcceptanceSuite.props.getProperty("FleetAdvanceSearchData"));
		// Thread.sleep(1000);
		FleetsAdvanceSubmitElem = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(AcceptanceSuite.props.getProperty("FleetAdvanceSearchsubmiButton"))));
		FleetsAdvanceSubmitElem.click();
		Thread.sleep(500);

	}

	public void fleetCreate() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
		EnterpricesElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprices"))));
		EnterpricesElem.click();

		// Thread.sleep(1000);
		FleetsElem = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Fleets"))));
		FleetsElem.click();

		// Thread.sleep(1000);

		// this.getDriver().manage().timeouts().implicitlyWait(5,
		// TimeUnit.SECONDS);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetBanner"))));
		FleetsAddElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetsAdd"))));
		FleetsAddElem.click();

		// try {
		// Thread.sleep(4000);
		// } catch (Exception ex){
		//
		// }

		Thread.sleep(2000);
		Select Enterprice = new Select(wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetEnterprice")))));
		Enterprice.selectByVisibleText(AcceptanceSuite.props.getProperty("EnterpriceData"));

		// try {
		// Thread.sleep(5000);
		// } catch (Exception ex){
		//
		// }

		Thread.sleep(2000);
		Select FleetType = new Select(wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetType")))));
		FleetType.selectByVisibleText(AcceptanceSuite.props.getProperty("FleetTypeData"));

		FleetElem = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Fleet"))));

		FleetElem.sendKeys(AcceptanceSuite.props.getProperty("FleetData"));

		// Select parentfleetType = new Select(
		// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("ParentFleet"))));
		// parentfleetType.selectByVisibleText(AcceptanceSuite.props.getProperty("ParentFleetdata"));

		// Thread.sleep(1000);
		fleetcontactDetailsElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ContactDetails"))));
		fleetcontactDetailsElem.click();

		// Thread.sleep(1000);
		MobilidElem = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Mobilid"))));
		MobilidElem.clear();
		MobilidElem.sendKeys(AcceptanceSuite.props.getProperty("Worknumberdata"));

		// Thread.sleep(2000);
		fleetemailElem = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Emailid"))));
		fleetemailElem.clear();
		fleetemailElem.sendKeys(AcceptanceSuite.props.getProperty("Emaildata"));

		// Thread.sleep(1000);
		fleetaddressDetailsElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AddressDetails"))));
		fleetaddressDetailsElem.click();

		// Thread.sleep(1000);
		fleetaddressLine1Elem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetAddresLine1"))));
		fleetaddressLine1Elem.clear();
		fleetaddressLine1Elem.sendKeys(AcceptanceSuite.props.getProperty("fleetAdreesline1"));
		// Thread.sleep(1000);

		// Thread.sleep(1000);
		fleetcityElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleetCity"))));
		fleetcityElem.clear();
		fleetcityElem.sendKeys(AcceptanceSuite.props.getProperty("fleetCity1"));
		// Thread.sleep(1000);

		// Thread.sleep(1000);
		Select country = new Select(wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetCountry")))));
		country.selectByVisibleText(AcceptanceSuite.props.getProperty("fleetcountry"));

		Thread.sleep(2000);
		Select state = new Select(wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Fleetstate")))));
		state.selectByVisibleText(AcceptanceSuite.props.getProperty("fleetstate"));
		// Thread.sleep(1000);

		// Thread.sleep(1000);
		fleetzipElem = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Fleetzip"))));
		fleetzipElem.clear();
		fleetzipElem.sendKeys(AcceptanceSuite.props.getProperty("fleetzip"));
		// Thread.sleep(1000);

		// Thread.sleep(1000);
		fleetLattitudeElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetLattitude"))));
		fleetLattitudeElem.clear();
		fleetLattitudeElem.sendKeys(AcceptanceSuite.props.getProperty("fleetlattitude"));
		// Thread.sleep(1000);

		// Thread.sleep(1000);
		fleetLongitudeElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetLongitude"))));
		fleetLongitudeElem.clear();
		fleetLongitudeElem.sendKeys(AcceptanceSuite.props.getProperty("fleetlongtitude"));

		// Thread.sleep(1000);
		SettingsElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Settings")));
		SettingsElem.click();

		// Thread.sleep(1000);
		advancedReservationWindowInDays = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(AcceptanceSuite.props.getProperty("fleetadvancedReservationWindowInDays"))));
		advancedReservationWindowInDays.clear();
		advancedReservationWindowInDays
				.sendKeys(AcceptanceSuite.props.getProperty("fleetadvancedReservationWindowInDaysValue"));

		// Thread.sleep(2000);
		preferenceElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("preferences"))));
		preferenceElem.click();
		// attributeElem =
		// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("FleetAttribute")));
		// attributeElem.click();

		// try {
		// Thread.sleep(5000);
		// } catch (Exception ex){
		//
		// }
		Thread.sleep(2000);
		fleetSubmitbuttonElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Submitbutton"))));
		fleetSubmitbuttonElem.click();
	}

	public void fleetView() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
		// Thread.sleep(3000);
		EnterpricesElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprices"))));
		EnterpricesElem.click();
		// Thread.sleep(2000);
		FleetsElem = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Fleets"))));
		FleetsElem.click();

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetBanner"))));
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("fleetViewXpaths");
		String valuesString = AcceptanceSuite.props.getProperty("fleetViewValue");

		for (int i = 0; i < xpathsString.split(",").length; i++) {

			xpaths.add(xpathsString.split(",")[i]);
			System.out.println("lllllllllll" + xpaths);
			values.add(valuesString.split(",")[i]);
			System.out.println("lllllllllll" + values);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("fleetViewActionXPath");
		String nextPageXPath = AcceptanceSuite.props.getProperty("fleetResourceNextPagePath");

		String searchXPath = AcceptanceSuite.props.getProperty("fleetsearchxpath");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("fleetsearchbutton");

		// Thread.sleep(2000);
		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		// Thread.sleep(2000);

	}

	public void fleetDelete() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
		EnterpricesElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprices"))));
		EnterpricesElem.click();

		// Thread.sleep(1000);
		FleetsElem = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Fleets"))));
		FleetsElem.click();

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetBanner"))));

		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("fleetDeleteXpaths");
		String valuesString = AcceptanceSuite.props.getProperty("fleetDeleteValue");

		for (int i = 0; i < xpathsString.split(",").length; i++) {

			xpaths.add(xpathsString.split(",")[i]);
			System.out.println("lllllllllll" + xpaths);
			values.add(valuesString.split(",")[i]);
			System.out.println("lllllllllll" + values);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("fleetDeleteActionXPath");
		String nextPageXPath = AcceptanceSuite.props.getProperty("fleetResourceNextPagePath");

		String searchXPath = AcceptanceSuite.props.getProperty("fleetsearchxpath");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("fleetsearchbutton");

		// Thread.sleep(1000);
		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();

		if (!action.equalsIgnoreCase("No Match")) {
			// Thread.sleep(2000);
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleetFinalDeleteXPath"))))
					.click();
		}
	}

	public void fleetEdit() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(this.getDriver(), 40);
		// Thread.sleep(3000);
		EnterpricesElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprices"))));
		EnterpricesElem.click();
		// Thread.sleep(2000);
		FleetsElem = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Fleets"))));
		FleetsElem.click();

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetBanner"))));

		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("fleetViewXpaths");
		String valuesString = AcceptanceSuite.props.getProperty("fleetEditValue");

		for (int i = 0; i < xpathsString.split(",").length; i++) {

			xpaths.add(xpathsString.split(",")[i]);
			System.out.println("lllllllllll" + xpaths);
			values.add(valuesString.split(",")[i]);
			System.out.println("lllllllllll" + values);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("fleetEditActionXPath");
		String nextPageXPath = AcceptanceSuite.props.getProperty("fleetResourceNextPagePath");

		String searchXPath = AcceptanceSuite.props.getProperty("fleetsearchxpath");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("fleetsearchbutton");

		// Thread.sleep(2000);
		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);
		// Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		// Thread.sleep(2000);

	}

	public void fleetEditCreation() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(this.getDriver(), 40);
		// Thread.sleep(2000);
		MobilidElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleetEdit"))));
		MobilidElem.clear();
		Thread.sleep(2000);
		MobilidElem.sendKeys(AcceptanceSuite.props.getProperty("fleetEditData"));
		// try {
		// Thread.sleep(5000);
		// } catch (Exception ex){
		//
		// }

		Thread.sleep(2000);

		fleetSubmitbuttonElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleetEditsunbmitbutton"))));
		fleetSubmitbuttonElem.click();
	}

	public void fleetChildCreate() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
		// Thread.sleep(5000);
		EnterpricesElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprices"))));
		EnterpricesElem.click();

		// Thread.sleep(1000);
		FleetsElem = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Fleets"))));
		FleetsElem.click();

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetBanner"))));

		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("fleetChildFleetXpaths");
		String valuesString = AcceptanceSuite.props.getProperty("fleetChildtValue");

		for (int i = 0; i < xpathsString.split(",").length; i++) {

			xpaths.add(xpathsString.split(",")[i]);
			System.out.println("lllllllllll" + xpaths);
			values.add(valuesString.split(",")[i]);
			System.out.println("lllllllllll" + values);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("ChildFleetAction");
		String nextPageXPath = AcceptanceSuite.props.getProperty("fleetResourceNextPagePath");

		String searchXPath = AcceptanceSuite.props.getProperty("fleetsearchxpath");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("fleetsearchbutton");

		// Thread.sleep(1000);
		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);
		this.getDriver().findElement(By.xpath(action)).click();

		if (!action.equalsIgnoreCase("No Match")) {
			// Thread.sleep(2000);
			/*
			 * Select Enterprice = new Select(
			 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath
			 * (AcceptanceSuite.props.getProperty("ChildfleetType")))));
			 * //Thread.sleep(2000);
			 * Enterprice.selectByVisibleText(AcceptanceSuite.props.getProperty(
			 * "ChildFleetData"));
			 */
			// Thread.sleep(1000);
			FleetElem = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ChildfleetName"))));

			FleetElem.sendKeys(AcceptanceSuite.props.getProperty("ChildFleetNameData"));
			// Thread.sleep(1000);
			fleetSubmitbuttonElem = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ChildFleetSubmitButton"))));
			fleetSubmitbuttonElem.click();
			// Thread.sleep(1000);
			// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("fleetFinalDeleteXPath"))).click();
		}
	}

	public void fleetsInactive() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
		EnterpricesElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprices"))));
		EnterpricesElem.click();

		// Thread.sleep(1000);
		FleetsElem = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Fleets"))));
		FleetsElem.click();

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetBanner"))));
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("fleetDeleteXpaths");
		String valuesString = AcceptanceSuite.props.getProperty("fleetDeleteValue");

		for (int i = 0; i < xpathsString.split(",").length; i++) {

			xpaths.add(xpathsString.split(",")[i]);
			System.out.println("lllllllllll" + xpaths);
			values.add(valuesString.split(",")[i]);
			System.out.println("lllllllllll" + values);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("fleetInactiveAction");
		String nextPageXPath = AcceptanceSuite.props.getProperty("fleetResourceNextPagePath");

		String searchXPath = AcceptanceSuite.props.getProperty("fleetsearchxpath");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("fleetsearchbutton");

		// Thread.sleep(1000);
		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();

		if (!action.equalsIgnoreCase("No Match")) {
			Select Enterprice = new Select(wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleetInactiveselect")))));
			// Thread.sleep(2000);
			Enterprice.selectByVisibleText(AcceptanceSuite.props.getProperty("FleetInactiveData"));
			// Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath(AcceptanceSuite.props.getProperty("fleetInactiveactualAction")))).click();
		}
	}

	public void fleetsactive() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
		EnterpricesElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprices"))));
		EnterpricesElem.click();

		// Thread.sleep(1000);
		FleetsElem = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Fleets"))));
		FleetsElem.click();

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetBanner"))));
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("fleetDeleteXpaths");
		String valuesString = AcceptanceSuite.props.getProperty("fleetDeleteValue");

		for (int i = 0; i < xpathsString.split(",").length; i++) {

			xpaths.add(xpathsString.split(",")[i]);
			System.out.println("lllllllllll" + xpaths);
			values.add(valuesString.split(",")[i]);
			System.out.println("lllllllllll" + values);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("fleetInactiveAction");
		String nextPageXPath = AcceptanceSuite.props.getProperty("fleetResourceNextPagePath");

		String searchXPath = AcceptanceSuite.props.getProperty("fleetsearchxpath");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("fleetsearchbutton");

		// Thread.sleep(1000);
		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();

		if (!action.equalsIgnoreCase("No Match")) {
			Select Enterprice = new Select(wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleetInactiveselect")))));
			// Thread.sleep(2000);
			Enterprice.selectByVisibleText(AcceptanceSuite.props.getProperty("FleetactiveData"));
			// Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath(AcceptanceSuite.props.getProperty("fleetInactiveactualAction")))).click();
		}
	}

	// Validations

	public void fleetCreatenegative() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
		EnterpricesElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprices"))));
		EnterpricesElem.click();

		// Thread.sleep(1000);
		FleetsElem = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Fleets"))));
		FleetsElem.click();

		Thread.sleep(1000);
      wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetBanner"))));
		FleetsAddElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetsAdd"))));
		FleetsAddElem.click();

		Thread.sleep(2000);
		
	}

	public void FleetsNegativeCases(String Enterprise, String FleetType, String FleetName, String WorkNumber,
			String Email, String Add1, String City, String Country, String State, String ZIPCode, String Latitude,
			String Longitude) throws InterruptedException {

		// System.out.println("=========="+EMailId+"kkkkkkkkkkkk"+EMailId);
		WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);

		// System.out.println("-------"+EnterpriceResourcesElem+"22222222222"+EnterpriceResourcesElem);
		if (!Enterprise.isEmpty()) {
			Select Enterprice = new Select(wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetEnterprice")))));
			Enterprice.selectByVisibleText(Enterprise);
		}
		if (!FleetType.isEmpty()) {
			Select Resource = new Select(wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetType")))));
			Resource.selectByVisibleText(FleetType);
		}
		if (!FleetName.isEmpty()) {
			FleetElem = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Fleet"))));
			FleetElem.clear();
			FleetElem.sendKeys(FleetName);

		}

		// System.out.println("wwwwwwwwwwwwww============"+MobileNumber);
		if (!WorkNumber.isEmpty()) {
			Thread.sleep(1000);
			// System.out.println("wwwwwwwwwwwwww"+MobileNumber);
			fleetcontactDetailsElem = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ContactDetails"))));
			fleetcontactDetailsElem.click();

			MobilidElem = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Mobilid"))));
			MobilidElem.clear();
			MobilidElem.sendKeys(WorkNumber);
			Thread.sleep(1000);

			Thread.sleep(5000);

		}
		fleetcontactDetailsElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ContactDetails"))));
		fleetcontactDetailsElem.click();
		fleetemailElem = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Emailid"))));

		fleetemailElem.sendKeys(Keys.CONTROL, "a");
		fleetemailElem.sendKeys(Keys.DELETE);
		// System.out.println("wwwwwwwwwwwwww"+MobileNumber+"8888888888"+MobileNumber);
		// System.out.println("lllllllllllllllll"+Email);
		if (!Email.isEmpty()) {
			Thread.sleep(1000);
			// System.out.println("llllllllllllllll=======================l"+Email);

			fleetcontactDetailsElem = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ContactDetails"))));
			fleetcontactDetailsElem.click();
			fleetemailElem = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Emailid"))));
			// emailElem.clear();
			fleetemailElem.sendKeys(Email);
			Thread.sleep(4000);
			fleetaddressDetailsElem = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AddressDetails"))));
			fleetaddressDetailsElem.click();
			Thread.sleep(1000);
			fleetaddressLine1Elem = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetAddresLine1"))));
			fleetaddressLine1Elem.sendKeys(Keys.CONTROL, "a");
			fleetaddressLine1Elem.sendKeys(Keys.DELETE);

		}

		if (!Add1.isEmpty()) {
			Thread.sleep(1000);

			fleetaddressLine1Elem = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetAddresLine1"))));
			fleetaddressLine1Elem.clear();
			fleetaddressLine1Elem.sendKeys(Add1);
			fleetcityElem = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleetCity"))));
			fleetcityElem.sendKeys(Keys.CONTROL, "a");
			fleetcityElem.sendKeys(Keys.DELETE);
		}
		if (!City.isEmpty()) {
			fleetcityElem = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleetCity"))));
			fleetcityElem.clear();
			fleetcityElem.sendKeys(City);
			fleetzipElem = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Fleetzip"))));
			fleetzipElem.sendKeys(Keys.CONTROL, "a");
			fleetzipElem.sendKeys(Keys.DELETE);
		}
		if (!Country.isEmpty()) {
			// countryElem =
			// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_Country"))));
			// countryElem.sendKeys(Country);
			Select country = new Select(wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetCountry")))));
			country.selectByVisibleText(Country);
		}
		if (!State.isEmpty()) {
			// stateElem =
			// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_State"))));
			// stateElem.sendKeys(State);
			Select state = new Select(wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Fleetstate")))));
			state.selectByVisibleText(State);
		}
		if (!ZIPCode.isEmpty()) {
			fleetzipElem = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Fleetzip"))));
			fleetzipElem.clear();
			fleetzipElem.sendKeys(ZIPCode);
			fleetLattitudeElem = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetLattitude"))));

			fleetLattitudeElem.sendKeys(Keys.CONTROL, "a");
			fleetLattitudeElem.sendKeys(Keys.DELETE);
		}
		if (!Latitude.isEmpty()) {
			fleetLattitudeElem = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetLattitude"))));
			fleetLattitudeElem.clear();
			fleetLattitudeElem.sendKeys(Latitude);
			fleetLongitudeElem = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetLongitude"))));
			fleetLongitudeElem.sendKeys(Keys.CONTROL, "a");
			fleetLongitudeElem.sendKeys(Keys.DELETE);
		}
		if (!Longitude.isEmpty()) {
			fleetLongitudeElem = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetLongitude"))));
			fleetLongitudeElem.clear();
			fleetLongitudeElem.sendKeys(Longitude);
		}

		submitButtonElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Submitbutton"))));
		submitButtonElem.click();
	}

	public void clickOnFleetEdtHeader() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(this.getDriver(), 40);
		// Thread.sleep(3000);
		EnterpricesElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprices"))));
		EnterpricesElem.click();
		// Thread.sleep(2000);
		FleetsElem = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Fleets"))));
		FleetsElem.click();

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetBanner"))));

	}

	public void clickOnFleetsEdit() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetBanner"))));

		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("fleetViewXpaths");
		String valuesString = AcceptanceSuite.props.getProperty("fleetEditValue");

		// log("xpathstr="+xpathsString);

		for (int i = 0; i < xpathsString.split(",").length; i++) {
			xpaths.add(xpathsString.split(",")[i]);
			values.add(valuesString.split(",")[i]);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("fleetEditActionXPath");
		String nextPageXPath = AcceptanceSuite.props.getProperty("fleetResourceNextPagePath");

		String searchXPath = AcceptanceSuite.props.getProperty("fleetsearchxpath");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("fleetsearchbutton");

		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
	}

	public void clickOnFleetsEditPopup(String FleetName, String WorkNumber, String Email, String Add1, String City,
			String ZIPCode, String Latitude, String Longitude) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
		FleetElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleetEdit"))));
		FleetElem.sendKeys(Keys.CONTROL, "a");
		FleetElem.sendKeys(Keys.DELETE);

		if (!FleetName.isEmpty()) {
           FleetElem.sendKeys(FleetName);

		}

		// System.out.println("wwwwwwwwwwwwww============"+MobileNumber);
		if (!WorkNumber.isEmpty()) {
			Thread.sleep(1000);
			// System.out.println("wwwwwwwwwwwwww"+MobileNumber);
			fleetcontactDetailsElem = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ContactDetailsBlock"))));
			fleetcontactDetailsElem.click();

			MobilidElem = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("MobileNum"))));
			MobilidElem.clear();
			MobilidElem.sendKeys(WorkNumber);
			Thread.sleep(1000);

			Thread.sleep(5000);

		}
		fleetcontactDetailsElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ContactAddressdetailBlock"))));
		fleetcontactDetailsElem.click();
		fleetemailElem = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetEditEmail"))));

		fleetemailElem.sendKeys(Keys.CONTROL, "a");
		fleetemailElem.sendKeys(Keys.DELETE);
		// System.out.println("wwwwwwwwwwwwww"+MobileNumber+"8888888888"+MobileNumber);
		// System.out.println("lllllllllllllllll"+Email);
		if (!Email.isEmpty()) {
			Thread.sleep(1000);
			fleetcontactDetailsElem = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ContactAddressdetailBlock"))));
			fleetcontactDetailsElem.click();
			fleetemailElem = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetEditEmail"))));
			// emailElem.clear();
			fleetemailElem.sendKeys(Email);
			Thread.sleep(4000);
			fleetaddressDetailsElem = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AddressDetailsBlock"))));
			fleetaddressDetailsElem.click();
			Thread.sleep(1000);
			fleetaddressLine1Elem = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Addressline1"))));
			fleetaddressLine1Elem.sendKeys(Keys.CONTROL, "a");
			fleetaddressLine1Elem.sendKeys(Keys.DELETE);

		}

		if (!Add1.isEmpty()) {
			Thread.sleep(1000);

			fleetaddressLine1Elem = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Addressline1"))));
			fleetaddressLine1Elem.clear();
			fleetaddressLine1Elem.sendKeys(Add1);
			fleetcityElem = wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("City"))));
			fleetcityElem.sendKeys(Keys.CONTROL, "a");
			fleetcityElem.sendKeys(Keys.DELETE);
		}
		if (!City.isEmpty()) {
			fleetcityElem = wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("City"))));
			fleetcityElem.clear();
			fleetcityElem.sendKeys(City);
			fleetzipElem = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ZIPCode"))));
			fleetzipElem.sendKeys(Keys.CONTROL, "a");
			fleetzipElem.sendKeys(Keys.DELETE);
		}

		if (!ZIPCode.isEmpty()) {
			fleetzipElem = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ZIPCode"))));
			fleetzipElem.clear();
			fleetzipElem.sendKeys(ZIPCode);
			fleetLattitudeElem = wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath(AcceptanceSuite.props.getProperty("FleetLattLatitudeEdititude"))));

			fleetLattitudeElem.sendKeys(Keys.CONTROL, "a");
			fleetLattitudeElem.sendKeys(Keys.DELETE);
		}
		if (!Latitude.isEmpty()) {
			fleetLattitudeElem = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("LatitudeEdit"))));
			fleetLattitudeElem.clear();
			fleetLattitudeElem.sendKeys(Latitude);
			fleetLongitudeElem = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("LongitudeEdit"))));
			fleetLongitudeElem.sendKeys(Keys.CONTROL, "a");
			fleetLongitudeElem.sendKeys(Keys.DELETE);
		}
		if (!Longitude.isEmpty()) {
			fleetLongitudeElem = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("LongitudeEdit"))));
			fleetLongitudeElem.clear();
			fleetLongitudeElem.sendKeys(Longitude);
		}

		submitButtonElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetEditSubmitButton"))));
		submitButtonElem.click();
	}

	public void clickOnFleetInactivateHeader() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(this.getDriver(), 40);
		// Thread.sleep(3000);
		EnterpricesElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprices"))));
		EnterpricesElem.click();
		// Thread.sleep(2000);
		FleetsElem = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Fleets"))));
		FleetsElem.click();

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetBanner"))));
	}

	public void clickOnFleetInactivate() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
		EnterpricesElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprices"))));
		EnterpricesElem.click();

		// Thread.sleep(1000);
		FleetsElem = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Fleets"))));
		FleetsElem.click();

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetBanner"))));
		ArrayList xpaths = new ArrayList();
		ArrayList values = new ArrayList();

		String xpathsString = AcceptanceSuite.props.getProperty("fleetDeleteXpaths");
		String valuesString = AcceptanceSuite.props.getProperty("fleetEditValue");

		for (int i = 0; i < xpathsString.split(",").length; i++) {

			xpaths.add(xpathsString.split(",")[i]);
			System.out.println("lllllllllll" + xpaths);
			values.add(valuesString.split(",")[i]);
			System.out.println("lllllllllll" + values);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("fleetInactiveAction");
		String nextPageXPath = AcceptanceSuite.props.getProperty("fleetResourceNextPagePath");

		String searchXPath = AcceptanceSuite.props.getProperty("fleetsearchxpath");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("fleetsearchbutton");

		// Thread.sleep(1000);
		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
	}

	public void clickOnFleetsEditPopup(String reason) throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(this.getDriver(), 40);

		Select Enterprice = new Select(wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleetInactiveselect")))));
		Thread.sleep(2000);
		Enterprice.selectByVisibleText(reason);
		// Thread.sleep(2000);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleetInactiveactualAction"))))
				.click();
	}

	public void clickOnFleetActivateHeader() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(this.getDriver(), 40);
		// Thread.sleep(3000);
		EnterpricesElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprices"))));
		EnterpricesElem.click();
		// Thread.sleep(2000);
		FleetsElem = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Fleets"))));
		FleetsElem.click();

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetBanner"))));
	}

	public void clickonFleetActivatePopup() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
		EnterpricesElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprices"))));
		EnterpricesElem.click();

		// Thread.sleep(1000);
		FleetsElem = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Fleets"))));
		FleetsElem.click();

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetBanner"))));
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("fleetDeleteXpaths");
		String valuesString = AcceptanceSuite.props.getProperty("fleetEditValue");

		for (int i = 0; i < xpathsString.split(",").length; i++) {

			xpaths.add(xpathsString.split(",")[i]);
			System.out.println("lllllllllll" + xpaths);
			values.add(valuesString.split(",")[i]);
			System.out.println("lllllllllll" + values);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("fleetInactiveAction");
		String nextPageXPath = AcceptanceSuite.props.getProperty("fleetResourceNextPagePath");

		String searchXPath = AcceptanceSuite.props.getProperty("fleetsearchxpath");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("fleetsearchbutton");

		// Thread.sleep(1000);
		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
	}

	public void childFleetCreate() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
		EnterpricesElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseBlock"))));
		EnterpricesElem.click();

		// Thread.sleep(1000);
		FleetsElem = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Fleets"))));
		FleetsElem.click();

		Thread.sleep(1000);

		// this.getDriver().manage().timeouts().implicitlyWait(5,
		// TimeUnit.SECONDS);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetBanner"))));
		FleetsAddElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleetChildFleetXpaths"))));
		FleetsAddElem.click();

		Thread.sleep(2000);
		/*
		 * fleetSubmitbuttonElem =
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * AcceptanceSuite.props.getProperty("Submitbutton"))));
		 * fleetSubmitbuttonElem.click();
		 */
	}

	public void clickOnFleetsCreateChildPopup(String FleetType, String Fleet, String WorkNumber, String Email,
			String Add1, String City, String Zip, String Latitude, String Longitude) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
		/*
		 * FleetElem =
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * AcceptanceSuite.props.getProperty("ChildFleetAction"))));
		 * FleetElem.sendKeys(Keys.CONTROL, "a");
		 * FleetElem.sendKeys(Keys.DELETE);
		 */
		if (!FleetType.isEmpty()) {
			Select Resource = new Select(wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetType")))));
			Resource.selectByVisibleText(FleetType);
		}
		if (!Fleet.isEmpty()) {
			FleetElem = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Fleet"))));
			FleetElem.clear();
			FleetElem.sendKeys(Fleet);

		}

		// System.out.println("wwwwwwwwwwwwww============"+MobileNumber);
		if (!WorkNumber.isEmpty()) {
			Thread.sleep(1000);
			// System.out.println("wwwwwwwwwwwwww"+MobileNumber);
			fleetcontactDetailsElem = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ContactDetailsBlock"))));
			fleetcontactDetailsElem.click();

			MobilidElem = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("MobileNum"))));
			MobilidElem.clear();
			MobilidElem.sendKeys(WorkNumber);
			Thread.sleep(1000);

			Thread.sleep(5000);

		}
		fleetcontactDetailsElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ContactDetailsBlock"))));
		fleetcontactDetailsElem.click();
		fleetemailElem = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Email"))));

		fleetemailElem.sendKeys(Keys.CONTROL, "a");
		fleetemailElem.sendKeys(Keys.DELETE);
		// System.out.println("wwwwwwwwwwwwww"+MobileNumber+"8888888888"+MobileNumber);
		// System.out.println("lllllllllllllllll"+Email);
		if (!Email.isEmpty()) {
			Thread.sleep(1000);
			// System.out.println("llllllllllllllll=======================l"+Email);

			fleetcontactDetailsElem = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ContactDetailsBlock"))));
			fleetcontactDetailsElem.click();
			fleetemailElem = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Email"))));
			// emailElem.clear();
			fleetemailElem.sendKeys(Email);
			Thread.sleep(4000);
			fleetaddressDetailsElem = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AddressDetailsBlock"))));
			fleetaddressDetailsElem.click();
			Thread.sleep(1000);
			fleetaddressLine1Elem = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Addressline1"))));
			fleetaddressLine1Elem.sendKeys(Keys.CONTROL, "a");
			fleetaddressLine1Elem.sendKeys(Keys.DELETE);

		}

		if (!Add1.isEmpty()) {
			Thread.sleep(1000);

			fleetaddressLine1Elem = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Addressline1"))));
			fleetaddressLine1Elem.clear();
			fleetaddressLine1Elem.sendKeys(Add1);
			fleetcityElem = wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("City"))));
			fleetcityElem.sendKeys(Keys.CONTROL, "a");
			fleetcityElem.sendKeys(Keys.DELETE);
		}
		if (!City.isEmpty()) {
			fleetcityElem = wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("City"))));
			fleetcityElem.clear();
			fleetcityElem.sendKeys(City);
			fleetzipElem = wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Zip"))));
			fleetzipElem.sendKeys(Keys.CONTROL, "a");
			fleetzipElem.sendKeys(Keys.DELETE);
		}

		if (!Zip.isEmpty()) {
			fleetzipElem = wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Zip"))));
			fleetzipElem.clear();
			fleetzipElem.sendKeys(Zip);
			fleetLattitudeElem = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Latitude"))));

			fleetLattitudeElem.sendKeys(Keys.CONTROL, "a");
			fleetLattitudeElem.sendKeys(Keys.DELETE);
		}
		if (!Latitude.isEmpty()) {
			fleetLattitudeElem = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Latitude"))));
			fleetLattitudeElem.clear();
			fleetLattitudeElem.sendKeys(Latitude);
			fleetLongitudeElem = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Longitude"))));
			fleetLongitudeElem.sendKeys(Keys.CONTROL, "a");
			fleetLongitudeElem.sendKeys(Keys.DELETE);
		}
		if (!Longitude.isEmpty()) {
			fleetLongitudeElem = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Longitude"))));
			fleetLongitudeElem.clear();
			fleetLongitudeElem.sendKeys(Longitude);
		}

		submitButtonElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("SubmitButtonChild"))));
		submitButtonElem.click();
	}

	public void clickOnFleetsDelete() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
		EnterpricesElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprices"))));
		EnterpricesElem.click();

		// Thread.sleep(1000);
		FleetsElem = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Fleets"))));
		FleetsElem.click();

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetBanner"))));

		ArrayList xpaths = new ArrayList();
		ArrayList values = new ArrayList();

		String xpathsString = AcceptanceSuite.props.getProperty("fleetDeleteXpaths");
		String valuesString = AcceptanceSuite.props.getProperty("fleetDeleteValue");

		for (int i = 0; i < xpathsString.split(",").length; i++) {

			xpaths.add(xpathsString.split(",")[i]);
			System.out.println("lllllllllll" + xpaths);
			values.add(valuesString.split(",")[i]);
			System.out.println("lllllllllll" + values);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("fleetDeleteActionXPath");
		String nextPageXPath = AcceptanceSuite.props.getProperty("fleetResourceNextPagePath");

		String searchXPath = AcceptanceSuite.props.getProperty("fleetsearchxpath");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("fleetsearchbutton");

		// Thread.sleep(1000);
		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();

		if (!action.equalsIgnoreCase("No Match")) {
			Thread.sleep(3000);
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleetFinalDeleteXPath"))))
					.click();
		}
	}
	
	
public void clickOnFleetCreateChildHeader() throws InterruptedException{
		
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 40);
		//Thread.sleep(3000);
		EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprices"))));
		EnterpricesElem.click();
		//Thread.sleep(2000);
		FleetsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Fleets"))));
		FleetsElem.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetBanner"))));

		}
		public void clickOnFleetsCreateChild() throws InterruptedException{
			WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
			
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetBanner"))));
			
			ArrayList<String> xpaths = new ArrayList<String>();
			ArrayList<String> values = new ArrayList<String>();
			
			String xpathsString = AcceptanceSuite.props.getProperty("fleetChildFleetXpaths");
			String valuesString = AcceptanceSuite.props.getProperty("fleetChildtValue");
			
			//log("xpathstr="+xpathsString);
			
			for (int i=0; i<xpathsString.split(",").length; i++){
				xpaths.add(xpathsString.split(",")[i]);
				values.add(valuesString.split(",")[i]);
			}
			
			String actionXPath = AcceptanceSuite.props.getProperty("ChildFleetAction");
			String nextPageXPath = AcceptanceSuite.props.getProperty("fleetResourceNextPagePath");
			
			String searchXPath = AcceptanceSuite.props.getProperty("fleetsearchxpath");
			String searchButtonXPath = AcceptanceSuite.props.getProperty("fleetsearchbutton");
			
			
			String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(), searchXPath, searchButtonXPath);
		
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		}

}
