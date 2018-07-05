package com.srisys.serenity.pages;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.srisys.serenity.AcceptanceSuite;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class IndNavFleeteReservationspage extends PageObject {
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
	WebElement CalenderElem;
	WebElement HoursElem;
	WebElement minituesElem;
	WebElement nextbuttonElem;
	WebElement monthElm;
	WebElement yearelm;
	WebElement columnelm;
	WebElement timenelm;

	WebElement endCalenderElem;
	WebElement endHoursElem;
	WebElement endminituesElem;
	WebElement endnextbuttonElem;
	WebElement endmonthElm;
	WebElement endyearelm;
	WebElement endcolumnelm;
	WebElement endtimenelm;

	WebElement closeCalenderElem;
	WebElement closeHoursElem;
	WebElement closeminituesElem;
	WebElement closenextbuttonElem;
	WebElement closemonthElm;
	WebElement closeyearelm;
	WebElement closecolumnelm;
	WebElement closetimenelm;
	WebElement submitElem;
	WebElement purposeElem;
	WebElement fleetSubmitbuttonElem;
	
	WebElement FleetAdvanceElem;
	WebElement FleetsAdvanceSubmitElem;
	WebElement FleetsAdvanceButtonElem;

	public void reseravtionsCreate() throws InterruptedException, ParseException {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		
		

		/*AdminElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Transparent")));
		AdminElem.click();*/

//		usersLinkElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservations"))));
//		usersLinkElem.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsBanner"))));
		useraaddButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationAdd"))));
		useraaddButtonElem.click();
		//Thread.sleep(1000);
		Select Enterprice = new Select(
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsEnterprse")))));
		Enterprice.selectByVisibleText(AcceptanceSuite.props.getProperty("leetReservationsEnterpriseData"));

		
		Select EnterpriceresourcesType = new Select(
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsFleet")))));
		EnterpriceresourcesType.selectByVisibleText(AcceptanceSuite.props.getProperty("FleetReservationsFleetData"));
		//
		
		//Thread.sleep(1000);
		Thread.sleep(1000);
		Select EventOwner = new Select(
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsEventOwnerName")))));
		EventOwner.selectByVisibleText(AcceptanceSuite.props.getProperty("FleetReservationsUserNameData"));

		
		//Thread.sleep(1000);

		//Thread.sleep(1000);
		submitElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsSubmit"))));
		submitElem.click();
		Thread.sleep(2000);

		//
		//
		// LookupsubmitElem =
		// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Lookupsubmit")));
		// LookupsubmitElem.click();

	}

	

	public void eventDelete() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(2000);
		/*AdminElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Transparent")));
		AdminElem.click();*/

		//Thread.sleep(1000);
		usersLinkElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Events"))));
		usersLinkElem.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventBanner"))));
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("EventDeleteXPaths");
		String valuesString = AcceptanceSuite.props.getProperty("EventDeleteValues");

		for (int i = 0; i < xpathsString.split(",").length; i++) {
			xpaths.add(xpathsString.split(",")[i]);
			values.add(valuesString.split(",")[i]);
		}
		String actionXPath = AcceptanceSuite.props.getProperty("EventDeleteActionXPath");
		// String actionXPath =
		// AcceptanceSuite.props.getProperty("EventCancelActionXPath");
		String nextPageXPath = AcceptanceSuite.props.getProperty("EventNextPagePath");

		String searchXPath = AcceptanceSuite.props.getProperty("EventsearchXPath");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("EventsearchButtonXPath");

		// Thread.sleep(1000);
		// String cancelAction = AcceptanceSuite.getXPath(xpaths, values,
		// actionXPath, nextPageXPath, this.getDriver(), searchXPath,
		// searchButtonXPath);
		// this.getDriver().findElement(By.xpath(cancelAction)).click();
//
		//Thread.sleep(1000);
		// Select reason = new
		// Select(this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EventCancelReasonXPath"))));
		// reason.selectByVisibleText(AcceptanceSuite.props.getProperty("EventCancelReason"));
		// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EventCancelXPath"))).click();

		//Thread.sleep(1000);
		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();

		if (!action.equalsIgnoreCase("No Match")) {
			//Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventFinalDeleteXPath")))).click();
		}
	}

	public void eventsEdit() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(2000);
	/*	AdminElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Transparent")));
		AdminElem.click();*/

		//Thread.sleep(2000);
//		usersLinkElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Events"))));
//		usersLinkElem.click();
//		
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsBanner"))));
		}catch (Exception ex){
			ex.printStackTrace();
		}
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("FleetReservationEditXpaths");
		String valuesString = AcceptanceSuite.props.getProperty("FleetReservationeditValue");

		for (int i = 0; i < xpathsString.split(",").length; i++) {
			xpaths.add(xpathsString.split(",")[i]);
			values.add(valuesString.split(",")[i]);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("FleetReservationEditButton");
		String nextPageXPath = AcceptanceSuite.props.getProperty("FleetReservationNextButton");

		String searchXPath = AcceptanceSuite.props.getProperty("FleetReservationsearchButton");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("FleetReservationsearchClick");

		//this.getDriver().
		//Thread.sleep(4000);
		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);
		System.out.println("l..lllllllllllllllllllll"+action);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		//Thread.sleep(1000);
		if (!action.equalsIgnoreCase("No Match")) {
			Thread.sleep(1000);

//			MobilidElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventName"))));
//			MobilidElem.clear();
//			//Thread.sleep(1000);
//			MobilidElem.sendKeys(AcceptanceSuite.props.getProperty("EventsEditData"));

			//Thread.sleep(2000);
			fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationEditSubmit"))));
			fleetSubmitbuttonElem.click();
			// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EventFinalDeleteXPath"))).click();
		}
	}

	public void fleetReservationsCheckIn() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(2000);
	/*	AdminElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Transparent")));
		AdminElem.click();*/

		//Thread.sleep(2000);
//		usersLinkElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Events"))));
//		usersLinkElem.click();
//		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsBanner"))));

		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("FleetReservationEditXpaths");
		String valuesString = AcceptanceSuite.props.getProperty("FleetReservationeditValue");

		for (int i = 0; i < xpathsString.split(",").length; i++) {
			xpaths.add(xpathsString.split(",")[i]);
			values.add(valuesString.split(",")[i]);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("FleetReservationcheckIn");
		String nextPageXPath = AcceptanceSuite.props.getProperty("FleetReservationNextButton");

		String searchXPath = AcceptanceSuite.props.getProperty("FleetReservationsearchButton");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("FleetReservationsearchClick");

		//Thread.sleep(1000);

		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		//Thread.sleep(1000);
		if (!action.equalsIgnoreCase("No Match")) {
			Thread.sleep(1000);

//			MobilidElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventName"))));
//			MobilidElem.clear();
//			//Thread.sleep(1000);
//			MobilidElem.sendKeys(AcceptanceSuite.props.getProperty("EventsEditData"));

			//Thread.sleep(2000);
			fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationCheckInSubmitbutton"))));
			fleetSubmitbuttonElem.click();
			// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EventFinalDeleteXPath"))).click();
		}
	}

	public void fleetReservationsCheckOut() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(2000);
	/*	AdminElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Transparent")));
		AdminElem.click();*/

		//Thread.sleep(2000);
//		usersLinkElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Events"))));
//		usersLinkElem.click();
//		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsBanner"))));

		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("FleetReservationEditXpaths");
		String valuesString = AcceptanceSuite.props.getProperty("FleetReservationeditValue");

		for (int i = 0; i < xpathsString.split(",").length; i++) {
			xpaths.add(xpathsString.split(",")[i]);
			values.add(valuesString.split(",")[i]);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("FleetReservationcheckOut");
		String nextPageXPath = AcceptanceSuite.props.getProperty("FleetReservationNextButton");

		String searchXPath = AcceptanceSuite.props.getProperty("FleetReservationsearchButton");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("FleetReservationsearchClick");

		//Thread.sleep(1000);

		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		//Thread.sleep(1000);
		if (!action.equalsIgnoreCase("No Match")) {
			Thread.sleep(1000);
			System.out.println("llllllllllllll");
			//Thread.sleep(2000);

//			MobilidElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventName"))));
//			MobilidElem.clear();
//			//Thread.sleep(1000);
//			MobilidElem.sendKeys(AcceptanceSuite.props.getProperty("EventsEditData"));

			//Thread.sleep(2000);
			fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsCheckOutSubmit"))));
			fleetSubmitbuttonElem.click();
			// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EventFinalDeleteXPath"))).click();
		}
	}

	public void fleetReservationsDelete() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(2000);
	/*	AdminElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Transparent")));
		AdminElem.click();*/

		//Thread.sleep(2000);
//		usersLinkElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Events"))));
//		usersLinkElem.click();
//		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsBanner"))));

		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("FleetReservationEditXpaths");
		String valuesString = AcceptanceSuite.props.getProperty("FleetReservationeditValue");

		for (int i = 0; i < xpathsString.split(",").length; i++) {
			xpaths.add(xpathsString.split(",")[i]);
			values.add(valuesString.split(",")[i]);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("FleetReservationsDelete");
		String nextPageXPath = AcceptanceSuite.props.getProperty("FleetReservationNextButton");

		String searchXPath = AcceptanceSuite.props.getProperty("FleetReservationsearchButton");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("FleetReservationsearchClick");

		//Thread.sleep(5000);

		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		//Thread.sleep(1000);
		if (!action.equalsIgnoreCase("No Match")) {
			Thread.sleep(1000);
			//Thread.sleep(2000);

//			MobilidElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventName"))));
//			MobilidElem.clear();
//			//Thread.sleep(1000);
//			MobilidElem.sendKeys(AcceptanceSuite.props.getProperty("EventsEditData"));

			//Thread.sleep(2000);
			fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsFinalDelete"))));
			fleetSubmitbuttonElem.click();
			// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EventFinalDeleteXPath"))).click();
		}
	}

	public void fleetReservationsExtend() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(2000);
		/*AdminElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Transparent")));
		AdminElem.click();*/

		//Thread.sleep(2000);
//		usersLinkElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Events"))));
//		usersLinkElem.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsBanner"))));
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("FleetReservationEditXpaths");
		String valuesString = AcceptanceSuite.props.getProperty("FleetReservationeditValue");

		for (int i = 0; i < xpathsString.split(",").length; i++) {
			xpaths.add(xpathsString.split(",")[i]);
			values.add(valuesString.split(",")[i]);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("FleetReservationsExended");
		String nextPageXPath = AcceptanceSuite.props.getProperty("FleetReservationNextButton");

		String searchXPath = AcceptanceSuite.props.getProperty("FleetReservationsearchButton");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("FleetReservationsearchClick");

		Thread.sleep(5000);

		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);
System.out.println("lllllllllllllllll"+action);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		//Thread.sleep(1000);
		if (!action.equalsIgnoreCase("No Match")) {
			Thread.sleep(1000);

			Select EventExtend = new Select(
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsExtendedReason")))));
			EventExtend.selectByVisibleText(AcceptanceSuite.props.getProperty("FleetReservationsExtendedData"));
			//Thread.sleep(2000);
			fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsExendedButton"))));
			fleetSubmitbuttonElem.click();
			// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EventFinalDeleteXPath"))).click();
		}
	}
	
	public void fleetReservationsCancel() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(2000);
		/*AdminElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Transparent")));
		AdminElem.click();*/

		//Thread.sleep(2000);
//		usersLinkElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Events"))));
//		usersLinkElem.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsBanner"))));
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("FleetReservationEditXpaths");
		String valuesString = AcceptanceSuite.props.getProperty("FleetReservationeditValue");

		for (int i = 0; i < xpathsString.split(",").length; i++) {
			xpaths.add(xpathsString.split(",")[i]);
			values.add(valuesString.split(",")[i]);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("FleetReservationCancel");
		String nextPageXPath = AcceptanceSuite.props.getProperty("FleetReservationNextButton");

		String searchXPath = AcceptanceSuite.props.getProperty("FleetReservationsearchButton");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("FleetReservationsearchClick");

		Thread.sleep(5000);

		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);

		//Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		//Thread.sleep(1000);
		if (!action.equalsIgnoreCase("No Match")) {
			Thread.sleep(1000);

			Select EventExtend = new Select(
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsExtendedReason")))));
			EventExtend.selectByVisibleText(AcceptanceSuite.props.getProperty("FleetReservationsCancelData"));
			//Thread.sleep(2000);
			fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationCancelButton"))));
			fleetSubmitbuttonElem.click();
			// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EventFinalDeleteXPath"))).click();
		}
	}
	
	public void fleetReservationsAdvanced() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(2000);
		/*AdminElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Transparent"))));
		AdminElem.click();

		//Thread.sleep(2000);
		usersLinkElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistration"))));
		usersLinkElem.click();*/
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsBanner"))));
		Thread.sleep(5000);
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetBanner"))));
		FleetsAdvanceButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetAdvancedSearch"))));
		FleetsAdvanceButtonElem.click();
		
		FleetAdvanceElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReseravtionsAdvancesearch"))));

		FleetAdvanceElem.sendKeys(AcceptanceSuite.props.getProperty("FleeetReservationsAdvanceData"));
		//Thread.sleep(1000);
		FleetsAdvanceSubmitElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistrationsubmitButton"))));
		FleetsAdvanceSubmitElem.click();
		//Thread.sleep(2000);
		

}
	
	public void fleetReservationsView() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(2000);
		/*AdminElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Transparent")));
		AdminElem.click();*/

		//Thread.sleep(2000);
//		usersLinkElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Events"))));
//		usersLinkElem.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsBanner"))));
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("FleetReservationEditXpaths");
		String valuesString = AcceptanceSuite.props.getProperty("FleetReservationeditValue");

		for (int i = 0; i < xpathsString.split(",").length; i++) {
			xpaths.add(xpathsString.split(",")[i]);
			values.add(valuesString.split(",")[i]);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("ViewFleetReservations");
		String nextPageXPath = AcceptanceSuite.props.getProperty("FleetReservationNextButton");

		String searchXPath = AcceptanceSuite.props.getProperty("FleetReservationsearchButton");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("FleetReservationsearchClick");

		Thread.sleep(5000);

		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);

		//Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		//Thread.sleep(1000);
		if (!action.equalsIgnoreCase("No Match")) {
			Thread.sleep(1000);

			
			//Thread.sleep(2000);
			fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsViewCloseButton"))));
			fleetSubmitbuttonElem.click();
			// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EventFinalDeleteXPath"))).click();
		}
	}
	
	public void fleetReservationsGuidedCreate() throws InterruptedException, ParseException {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		
		

		/*AdminElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Transparent")));
		AdminElem.click();*/

//		usersLinkElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservations"))));
//		usersLinkElem.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsBanner"))));
		useraaddButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsGuidedCreate"))));
		useraaddButtonElem.click();
		//Thread.sleep(1000);
		Select Enterprice = new Select(
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationEnterprise")))));
		Enterprice.selectByVisibleText(AcceptanceSuite.props.getProperty("leetReservationsEnterpriseData"));

		
		Select EnterpriceresourcesType = new Select(
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsFleetType")))));
		EnterpriceresourcesType.selectByVisibleText(AcceptanceSuite.props.getProperty("FleetReservationsFleetTypeData"));
		
		
		Select FleettpeAttributes = new Select(
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsFleetTypeattrbute")))));
		FleettpeAttributes.selectByVisibleText(AcceptanceSuite.props.getProperty("FleetReservationsFleetTypeattrbuteData"));
		
		
		Select Country = new Select(
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationscountrySelect")))));
		Country.selectByVisibleText(AcceptanceSuite.props.getProperty("FleetReservationscountryData"));
		
		WebElement Guidedsubmit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReseravtionssubmitguided"))));
		Guidedsubmit.click();
		Thread.sleep(1000);
		WebElement Guidedcheck = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleeteReservationsinputcheckbox"))));
		Guidedcheck.click();
		Thread.sleep(1000);
		WebElement Guidedfinalcheck = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Fleetreservationsfinalsubmit"))));
		Guidedfinalcheck.click();

		
		//
		
		Thread.sleep(1000);
		Select EventOwner = new Select(
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsUserName")))));
		EventOwner.selectByVisibleText(AcceptanceSuite.props.getProperty("FleetReservationsUserNameData"));

		
		//Thread.sleep(1000);

		Thread.sleep(1000);
		submitElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReseravtionGiudedfinalsubmit"))));
		submitElem.click();
		Thread.sleep(2000);

		//
		//
		// LookupsubmitElem =
		// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Lookupsubmit")));
		// LookupsubmitElem.click();

	}
	
	public void fleetReservationsAdvanceddata() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(2000);
		/*AdminElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Transparent"))));
		AdminElem.click();

		//Thread.sleep(2000);
		usersLinkElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistration"))));
		usersLinkElem.click();*/
		//Thread.sleep(2000);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsBanner"))));
		Thread.sleep(5000);
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetBanner"))));
		FleetsAdvanceButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetAdvancedSearch"))));
		FleetsAdvanceButtonElem.click();
		
		CalenderElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleerReservationsStartdate"))));

		
		Thread.sleep(6000);
		CalenderElem.click();

		//Thread.sleep(2000);
		monthElm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleerReservationsStartMonthXpath"))));
		yearelm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleerReservationsStartYearXpath"))));
		// columnelm =
		// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("columnsXPath")));
		minituesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleerReservationsStartMiniutesXpath"))));

		nextbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleerReservationsnextXpath"))));
		timenelm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleerReservationsTimeXpath"))));
		HoursElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleerReservationsHoursXpath"))));
		// List<WebElement> columns =
		// this.getDriver().findElements(By.xpath(AcceptanceSuite.props.getProperty("columnsXPath")));
		String userDate = AcceptanceSuite.props.getProperty("fleerReservationstartdateuser");
		String column = AcceptanceSuite.props.getProperty("fleerReservationsStartColumnXpathdate");
		Thread.sleep(1000);

		getUserDate(this.getDriver(), userDate, CalenderElem, monthElm, yearelm, column, nextbuttonElem, timenelm,
				HoursElem, minituesElem);
		
		Thread.sleep(2000);
		closeCalenderElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleerReservationsEnddate"))));
		
		closeCalenderElem.click();
		//Thread.sleep(2000);

		closemonthElm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleerReservationsEndMonthXpath"))));
		closeyearelm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleerReservationsEndtYearXpath"))));
		// columnelm =
		// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("columnsXPath")));
		closeminituesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleerReservationsEndMiniutesXpath"))));

		closenextbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleerReservationsEndnextXpath"))));
		closetimenelm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleerReservationsEndTimeXpath"))));
		closeHoursElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleerReservationsEndHoursXpath"))));
		// WebElement sring =
		// driver.findElement(By.xpath("html/body/app-dashboard/div[2]/main/div/ng-component/app-events-popup/div/div/div/div[2]/div/div[10]/p-calendar/span/input"));

		 String closeuserDate =
		 AcceptanceSuite.props.getProperty("fleerReservationEnddateuser");
		String closecolumn = AcceptanceSuite.props.getProperty("fleerReservationsEndColumnXpathdate");
		
		Thread.sleep(1000);
		getUserDate(this.getDriver(), closeuserDate, closeCalenderElem, closemonthElm, closeyearelm, closecolumn,
				closenextbuttonElem, closetimenelm, closeHoursElem, closeminituesElem);
		
//		FleetAdvanceElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReseravtionsAdvancesearch"))));
//
//		FleetAdvanceElem.sendKeys(AcceptanceSuite.props.getProperty("FleeetReservationsAdvanceData"));
		//Thread.sleep(1000);
		FleetsAdvanceSubmitElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistrationsubmitButton"))));
		FleetsAdvanceSubmitElem.click();
		
		
		//Thread.sleep(2000);
		

}
	
	public static void getUserDate(WebDriver driver, String userDate, WebElement CalenderElem, WebElement monthElm,
			WebElement yearelm, String column, WebElement nextbuttonElem, WebElement timenelm, WebElement HoursElem,
			WebElement minituesElem) throws InterruptedException {

//		System.out.println("lllllllll" + userDate);
//		System.out.println("lllllllllllllllllcccccccvvvvvvvvvvvvvvvvvv"+yearelm.getText());
		//
		String datePart = userDate.split(":")[0];
		System.out.println("datePart=======" + datePart);

		String userYear = datePart.split("-")[0];
		System.out.println("userYear=======" + userYear);
		String userMonth = datePart.split("-")[1];
		System.out.println("userMonth=======" + userMonth);
		String requiredDate = datePart.split("-")[2];
		System.out.println("requiredDate=======" + requiredDate);

		switch (new Integer(userMonth).intValue()) {
		case 01:
			userMonth = "January";
			break;
		case 02:
			userMonth = "February";
			break;
		case 03:
			userMonth = "March";
			break;
		case 04:
			userMonth = "April";
			break;
		case 05:
			userMonth = "May";
			break;
		case 06:
			userMonth = "June";
			break;
		case 07:
			userMonth = "July";
			break;
		case 8:
			userMonth = "August";
			break;
		case 9:
			userMonth = "September";
			break;
		case 10:
			userMonth = "October";

			break;
		case 11:
			userMonth = "November";
			System.out.println("lllllllllll");
			break;
		case 12:
			userMonth = "December";
			break;
		}
System.out.println("'''''''''''''''"+userMonth);
		String hours = userDate.split(":")[1];
		String minutes = userDate.split(":")[2];
		System.out.println("hours=======" + hours);
		System.out.println("hours=======" + minutes);

		// CalenderElem.click();
		// driver.findElement(By.xpath(calendarXPath)).click();
		Thread.sleep(5000);

		// Set Time
		// String actualHrs =
		// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("timeXPath"))).getText();
		String actualHrs = timenelm.getText();
		// String actualHrs = driver.findElement(By.xpath(timeXPath)).getText();
		System.out.println("Time=" + actualHrs);
		System.out.println("Time=" + actualHrs.substring(0, 2));
		while (!actualHrs.substring(actualHrs.length() - 2, actualHrs.length()).equalsIgnoreCase(minutes)) {
			// minituesElem =
			// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("minutesXPath")));
			minituesElem.click();
			actualHrs = timenelm.getText();
			System.out.println("llllllllllllllllllvvvvvvvvvvvv"+actualHrs);
			// driver.findElement(By.xpath(minutesXPath)).click();
			// actualHrs =
			// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("timeXPath"))).getText();
		}
		while (!actualHrs.substring(0, 2).equalsIgnoreCase(hours)) {
			HoursElem.click();
			// HoursElem =
			// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("hoursXPath")));
			// HoursElem.click();
			actualHrs = timenelm.getText();
			System.out.println(";;;;;;;;;;;;;;;;;"+actualHrs);
			// actualHrs =
			// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("timeXPath"))).getText();
		}
		

		// Get correct year
		while (true) {
			System.out.println("lllllllllllllllllccccccc"+yearelm);
			String year = yearelm.getText();
			// String year =
			// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("yearXPath"))).getText();
			// String year=driver.findElement(By.xpath(yearXPath)).getText();
			System.out.println("Year=" + year);
			if (year.equals(userYear)) {
				break;
			} else {
				// nextbuttonElem =
				// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("nextButtonXPath")));
				nextbuttonElem.click();
				// driver.findElement(By.xpath(nextButtonXPath)).click();
			}
		}
		// Get correct month
		while (2 > 1) {
			String month = monthElm.getText();
			// String month =
			// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("monthXPath"))).getText();
			// String month=driver.findElement(By.xpath(monthXPath)).getText();
			System.out.println("Month=" + month + ";userMonth=" + userMonth);

			if (month.equalsIgnoreCase(userMonth)) {
				List<WebElement> columns = driver.findElements(By.xpath(column));
				// List<WebElement> columns = columnelm

				// List<WebElement> columns =
				// driver.findElements(By.xpath(columnsXPath));

				// Using For Loop to iterate over cells
				for (int c = 0; c < columns.size();) {
					System.out.println("rrrrrrrrrrrr" + columns.size());

					String date1 = ((WebElement) columns.get(c)).getText();
					System.out.println("DATES" + date1);
					// System.out.println(columns.get(c).getAttribute("class"));
					// System.out.println(columns.get(c).getCssValue("class"));
					if (date1.equalsIgnoreCase(requiredDate)
							&& !columns.get(c).getAttribute("class").contains("disabled")) {
						try {
							columns.get(c).click();
							break;
						} catch (Exception e) {

						}
					}
					c++;
				}
				break;
			} else {
				// driver.findElement(By.xpath("//span[@class='fa
				// fa-angle-right']")).click();
				System.out.println("About to click next month" + nextbuttonElem);
				// driver.findElement(By.xpath(nextButtonXPath)).click();
				nextbuttonElem.click();
				// nextbuttonElem =
				// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("nextButtonXPath")));
				// nextbuttonElem.click();
			}
		}
	}

	
	
	
	
	
	
	public void ValidationsAddHeader(){
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsBanner"))));
	useraaddButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationAdd"))));
	useraaddButtonElem.click();
	}
	
	public void ValidationsAddReservations(String Enterprise,String Fleet,String StartDate,String EndDate) throws InterruptedException, ParseException {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		
		
		//Thread.sleep(1000);
		if(!Enterprise.isEmpty()){
		Select Enterprice = new Select(
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsEnterprse")))));
		Enterprice.selectByVisibleText(Enterprise);
		}

		if(!Fleet.isEmpty()){
		Select EnterpriceresourcesType = new Select(
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsFleet")))));
		EnterpriceresourcesType.selectByVisibleText(Fleet);
		}
		
		if(!StartDate.isEmpty()){
        CalenderElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleerReservationsaddStartdate"))));

		CalenderElem.click();

		//Thread.sleep(2000);
		monthElm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleerReservationsaddStartMonthXpath"))));
		yearelm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleerReservationsaddStartYearXpath"))));
		// columnelm =
		// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("columnsXPath")));
		minituesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleerReservationsaddStartMiniutesXpath"))));

		nextbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleerReservationsaddnextXpath"))));
		timenelm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleerReservationsaddTimeXpath"))));
		HoursElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleerReservationsaddHoursXpath"))));
		
		String column = AcceptanceSuite.props.getProperty("fleerReservationsaddStartColumnXpathdate");
		Thread.sleep(1000);
		
		// System.out.println("kkkkkkkkkkk"+sss1);

		
		Thread.sleep(2000);

		getUserDate(this.getDriver(), StartDate, CalenderElem, monthElm, yearelm, column, nextbuttonElem, timenelm,
				HoursElem, minituesElem);
		}
		
		Thread.sleep(2000);
		if(!EndDate.isEmpty()){
			closeCalenderElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleerReservationsaddEnddate"))));

			Thread.sleep(2000);
		
		closeCalenderElem.click();
		//Thread.sleep(2000);

		closemonthElm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleerReservationsaddEndMonthXpath"))));
		closeyearelm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleerReservationsaddEndtYearXpath"))));
		// columnelm =
		// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("columnsXPath")));
		closeminituesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleerReservationsaddEndMiniutesXpath"))));

		closenextbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleerReservationsaddEndnextXpath"))));
		closetimenelm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleerReservationsaddEndTimeXpath"))));
		closeHoursElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleerReservationsaddEndHoursXpath"))));
		// WebElement sring =
		// driver.findElement(By.xpath("html/body/app-dashboard/div[2]/main/div/ng-component/app-events-popup/div/div/div/div[2]/div/div[10]/p-calendar/span/input"));

//		 String closeuserDate =
//		 AcceptanceSuite.props.getProperty("fleerReservationEnddateuser");
		String closecolumn = AcceptanceSuite.props.getProperty("fleerReservationsaddEndColumnXpathdate");
		
		Thread.sleep(1000);
		getUserDate(this.getDriver(), EndDate, closeCalenderElem, closemonthElm, closeyearelm, closecolumn,
				closenextbuttonElem, closetimenelm, closeHoursElem, closeminituesElem);
		}
		//
		
		//Thread.sleep(1000);
		Thread.sleep(1000);
//		Select EventOwner = new Select(
//				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsEventOwnerName")))));
//		EventOwner.selectByVisibleText(AcceptanceSuite.props.getProperty("FleetReservationsUserNameData"));
		

		
		//Thread.sleep(1000);

		//Thread.sleep(1000);
		submitElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsSubmit"))));
		submitElem.click();
		Thread.sleep(4000);

		

	}
	
	public void fleetReservationsCheckdIn() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(2000);
	/*	AdminElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Transparent")));
		AdminElem.click();*/

		//Thread.sleep(2000);
//		usersLinkElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Events"))));
//		usersLinkElem.click();
//		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsBanner"))));

		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("FleetReservationEditXpaths");
		String valuesString = AcceptanceSuite.props.getProperty("FleetReservationeditValues");

		for (int i = 0; i < xpathsString.split(",").length; i++) {
			xpaths.add(xpathsString.split(",")[i]);
			values.add(valuesString.split(",")[i]);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("FleetReservationcheckIn");
		String nextPageXPath = AcceptanceSuite.props.getProperty("FleetReservationNextButton");

		String searchXPath = AcceptanceSuite.props.getProperty("FleetReservationsearchButton");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("FleetReservationsearchClick");

		//Thread.sleep(1000);

		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		//Thread.sleep(1000);
		if (!action.equalsIgnoreCase("No Match")) {
			Thread.sleep(1000);

//			MobilidElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventName"))));
//			MobilidElem.clear();
//			//Thread.sleep(1000);
//			MobilidElem.sendKeys(AcceptanceSuite.props.getProperty("EventsEditData"));

			//Thread.sleep(2000);
			fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationCheckInSubmitbutton"))));
			fleetSubmitbuttonElem.click();
			// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EventFinalDeleteXPath"))).click();
		}
	}


	public void fleetReservationsinvalidCancel() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(2000);
		/*AdminElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Transparent")));
		AdminElem.click();*/

		//Thread.sleep(2000);
//		usersLinkElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Events"))));
//		usersLinkElem.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsBanner"))));
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("FleetReservationEditXpaths");
		String valuesString = AcceptanceSuite.props.getProperty("FleetReservationeditValues");

		for (int i = 0; i < xpathsString.split(",").length; i++) {
			xpaths.add(xpathsString.split(",")[i]);
			values.add(valuesString.split(",")[i]);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("FleetReservationCancel");
		String nextPageXPath = AcceptanceSuite.props.getProperty("FleetReservationNextButton");

		String searchXPath = AcceptanceSuite.props.getProperty("FleetReservationsearchButton");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("FleetReservationsearchClick");

		Thread.sleep(5000);

		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);

		//Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		//Thread.sleep(1000);
		if (!action.equalsIgnoreCase("No Match")) {
			Thread.sleep(1000);


			//Thread.sleep(2000);
			fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationCancelButton"))));
			fleetSubmitbuttonElem.click();
			// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EventFinalDeleteXPath"))).click();
		}
	}
	public void fleetReservationsinvalidExtend() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(2000);
		/*AdminElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Transparent")));
		AdminElem.click();*/

		//Thread.sleep(2000);
//		usersLinkElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Events"))));
//		usersLinkElem.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsBanner"))));
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("FleetReservationEditXpaths");
		String valuesString = AcceptanceSuite.props.getProperty("FleetReservationeditValues");

		for (int i = 0; i < xpathsString.split(",").length; i++) {
			xpaths.add(xpathsString.split(",")[i]);
			values.add(valuesString.split(",")[i]);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("FleetReservationsExended");
		String nextPageXPath = AcceptanceSuite.props.getProperty("FleetReservationNextButton");

		String searchXPath = AcceptanceSuite.props.getProperty("FleetReservationsearchButton");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("FleetReservationsearchClick");

		Thread.sleep(5000);

		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);
//System.out.println("lllllllllllllllll"+action);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		//Thread.sleep(1000);
		if (!action.equalsIgnoreCase("No Match")) {
			Thread.sleep(1000);

//			Select EventExtend = new Select(
//					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsExtendedReason")))));
//			EventExtend.selectByVisibleText(AcceptanceSuite.props.getProperty("FleetReservationsExtendedData"));
			//Thread.sleep(2000);
			fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsExendedButton"))));
			fleetSubmitbuttonElem.click();
			// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EventFinalDeleteXPath"))).click();
		}
	}
	
	public void fleetReservationsinvalidDelete() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(2000);
	/*	AdminElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Transparent")));
		AdminElem.click();*/

		//Thread.sleep(2000);
//		usersLinkElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Events"))));
//		usersLinkElem.click();
//		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsBanner"))));

		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("FleetReservationEditXpaths");
		String valuesString = AcceptanceSuite.props.getProperty("FleetReservationeditValues");

		for (int i = 0; i < xpathsString.split(",").length; i++) {
			xpaths.add(xpathsString.split(",")[i]);
			values.add(valuesString.split(",")[i]);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("FleetReservationsDelete");
		String nextPageXPath = AcceptanceSuite.props.getProperty("FleetReservationNextButton");

		String searchXPath = AcceptanceSuite.props.getProperty("FleetReservationsearchButton");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("FleetReservationsearchClick");

		//Thread.sleep(5000);

		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		//Thread.sleep(1000);
		if (!action.equalsIgnoreCase("No Match")) {
			Thread.sleep(1000);
			//Thread.sleep(2000);

//			MobilidElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventName"))));
//			MobilidElem.clear();
//			//Thread.sleep(1000);
//			MobilidElem.sendKeys(AcceptanceSuite.props.getProperty("EventsEditData"));

			//Thread.sleep(2000);
			fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsFinalDelete"))));
			fleetSubmitbuttonElem.click();
			// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EventFinalDeleteXPath"))).click();
		}
	}
	
	public void fleetReservationsinvalidCheckOut() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsBanner"))));

		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("FleetReservationEditXpaths");
		String valuesString = AcceptanceSuite.props.getProperty("FleetReservationeditValues");

		for (int i = 0; i < xpathsString.split(",").length; i++) {
			xpaths.add(xpathsString.split(",")[i]);
			values.add(valuesString.split(",")[i]);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("FleetReservationcheckOut");
		String nextPageXPath = AcceptanceSuite.props.getProperty("FleetReservationNextButton");

		String searchXPath = AcceptanceSuite.props.getProperty("FleetReservationsearchButton");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("FleetReservationsearchClick");

		//Thread.sleep(1000);

		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		//Thread.sleep(1000);
		if (!action.equalsIgnoreCase("No Match")) {
			Thread.sleep(1000);
			//System.out.println("llllllllllllll");
			//Thread.sleep(2000);


			//Thread.sleep(2000);
			fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsCheckOutSubmit"))));
			fleetSubmitbuttonElem.click();
			// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EventFinalDeleteXPath"))).click();
		}
	}
	public void ValidationsInvalidEditReservations() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsBanner"))));

		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("FleetReservationEditXpaths");
		String valuesString = AcceptanceSuite.props.getProperty("FleetReservationeditValues");

		for (int i = 0; i < xpathsString.split(",").length; i++) {
			xpaths.add(xpathsString.split(",")[i]);
			values.add(valuesString.split(",")[i]);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("FleetReservationEditButton");
		String nextPageXPath = AcceptanceSuite.props.getProperty("FleetReservationNextButton");

		String searchXPath = AcceptanceSuite.props.getProperty("FleetReservationsearchButton");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("FleetReservationsearchClick");

		//Thread.sleep(1000);

		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		
	}
	public void ValidationsEditReservations(String Fleet,String StartDate,String EndDate) throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
	
		if(!StartDate.isEmpty()){
	        CalenderElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleerReservationsEditStartdate"))));

			CalenderElem.click();

			//Thread.sleep(2000);
			monthElm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleerReservationsEditStartMonthXpath"))));
			yearelm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleerReservationsEditStartYearXpath"))));
			// columnelm =
			// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("columnsXPath")));
			minituesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleerReservationsEditStartMiniutesXpath"))));

			nextbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleerReservationsEditnextXpath"))));
			timenelm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleerReservationsEditTimeXpath"))));
			HoursElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleerReservationsEditHoursXpath"))));
			
			String column = AcceptanceSuite.props.getProperty("fleerReservationsEditStartColumnXpathdate");
			Thread.sleep(1000);
			
			// System.out.println("kkkkkkkkkkk"+sss1);

			
			Thread.sleep(2000);

			getUserDate(this.getDriver(), StartDate, CalenderElem, monthElm, yearelm, column, nextbuttonElem, timenelm,
					HoursElem, minituesElem);
			}
		if(!EndDate.isEmpty()){
			closeCalenderElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleerReservationsEditEnddate"))));

			Thread.sleep(2000);
		
		closeCalenderElem.click();
		//Thread.sleep(2000);

		closemonthElm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleerReservationsEditEndMonthXpath"))));
		closeyearelm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleerReservationsEditEndYearXpath"))));
		// columnelm =
		// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("columnsXPath")));
		closeminituesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleerReservationsEditEndMiniutesXpath"))));

		closenextbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleerReservationsEditEndnextXpath"))));
		closetimenelm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleerReservationsEditEndTimeXpath"))));
		closeHoursElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("fleerReservationsEditEndHoursXpath"))));
		// WebElement sring =
		// driver.findElement(By.xpath("html/body/app-dashboard/div[2]/main/div/ng-component/app-events-popup/div/div/div/div[2]/div/div[10]/p-calendar/span/input"));

//		 String closeuserDate =
//		 AcceptanceSuite.props.getProperty("fleerReservationEnddateuser");
		String closecolumn = AcceptanceSuite.props.getProperty("fleerReservationsEditEndColumnXpathdate");
		
		Thread.sleep(1000);
		getUserDate(this.getDriver(), EndDate, closeCalenderElem, closemonthElm, closeyearelm, closecolumn,
				closenextbuttonElem, closetimenelm, closeHoursElem, closeminituesElem);
		}
		//Thread.sleep(1000);
		//if (!action.equalsIgnoreCase("No Match")) {
			Thread.sleep(1000);
			System.out.println("llllllllllllll");
			//Thread.sleep(2000);


			//Thread.sleep(2000);
			fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsCheckOutSubmit"))));
			fleetSubmitbuttonElem.click();
			
		//}
	}
	
	
	public void openGuidedCreatePopup(){
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
    	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsBanner"))));
		useraaddButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsGuidedCreate"))));
		useraaddButtonElem.click();
	}
	
    public void GuidedCreateValidations(String enterprise, String fleetType, String country, String startDate, String endDate) throws InterruptedException{
    	
    	WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
    	
    	
		
    	if (!enterprise.isEmpty()){
    		Select Enterprise = new Select(
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationEnterprise")))));
    		Enterprise.selectByVisibleText(enterprise);
    	}
		
    	Thread.sleep(7000);
    	if (!fleetType.isEmpty()){
    		Select fleetTypeElem = new Select(
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsFleetType")))));
    		fleetTypeElem.selectByVisibleText(fleetType);
    	}
		
    	if (!country.isEmpty()){
    		Select Country = new Select(
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationscountrySelect")))));
    		Country.selectByVisibleText(country);
    	}
    	
    	if (!(startDate.isEmpty() || endDate.isEmpty())){
    		fleetReservationsGuidedCreateDate(startDate, endDate);
        }
    	
    	WebElement Guidedsubmit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReseravtionssubmitguided"))));
		Guidedsubmit.click();
		
    	
    }
    
    
    
    
    
    public void fleetReservationsGuidedCreateDate(String startDate, String endDate) throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		Thread.sleep(5000);
				
		CalenderElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsGuidedCreateStartDate"))));
		Thread.sleep(2000);
		CalenderElem.click();

		//Thread.sleep(2000);
		monthElm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsGuidedCreateStartMonthXpath"))));
		yearelm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsGuidedCreateStartYearXpath"))));
		// columnelm =
		// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("columnsXPath")));
		minituesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsGuidedCreateStartMinutesXpath"))));

		nextbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsGuidedCreateStartNextXpath"))));
		timenelm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsGuidedCreateStartTimeXpath"))));
		HoursElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsGuidedCreateStartHoursXpath"))));
		// List<WebElement> columns =
		// this.getDriver().findElements(By.xpath(AcceptanceSuite.props.getProperty("columnsXPath")));
		String userDate = startDate;
		String column = AcceptanceSuite.props.getProperty("FleetReservationsGuidedCreateStartColumn");
		Thread.sleep(1000);

		getUserDate(this.getDriver(), userDate, CalenderElem, monthElm, yearelm, column, nextbuttonElem, timenelm,
				HoursElem, minituesElem);
		
		Thread.sleep(5000);
		closeCalenderElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsGuidedCreateEndDate"))));
		
		closeCalenderElem.click();
		//Thread.sleep(2000);

		closemonthElm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsGuidedCreateEndMonthXpath"))));
		closeyearelm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsGuidedCreateEndYearXpath"))));
		// columnelm =
		// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("columnsXPath")));
		closeminituesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsGuidedCreateEndMinutesXpath"))));

		closenextbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsGuidedCreateEndNextXpath"))));
		closetimenelm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsGuidedCreateEndTimeXpath"))));
		closeHoursElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsGuidedCreateEndHoursXpath"))));
		// WebElement sring =
		// driver.findElement(By.xpath("html/body/app-dashboard/div[2]/main/div/ng-component/app-events-popup/div/div/div/div[2]/div/div[10]/p-calendar/span/input"));

		 String closeuserDate = endDate;
		String closecolumn = AcceptanceSuite.props.getProperty("FleetReservationsGuidedCreateEndColumn");
		
		Thread.sleep(1000);
		getUserDate(this.getDriver(), closeuserDate, closeCalenderElem, closemonthElm, closeyearelm, closecolumn,
				closenextbuttonElem, closetimenelm, closeHoursElem, closeminituesElem);
}

    
    
    

	

}
