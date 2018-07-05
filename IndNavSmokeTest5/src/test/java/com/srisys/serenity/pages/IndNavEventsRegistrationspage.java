package com.srisys.serenity.pages;

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

public class IndNavEventsRegistrationspage extends PageObject{
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



public void eventRegistrationAdvanceSearch() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		
		usersLinkElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistration"))));
		usersLinkElem.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistrationsBanner"))));
		
		
		FleetsAdvanceButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetAdvancedSearch"))));
		FleetsAdvanceButtonElem.click();
		
		FleetAdvanceElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistrationEventInput"))));

		FleetAdvanceElem.sendKeys(AcceptanceSuite.props.getProperty("Eventname"));
		
		FleetsAdvanceSubmitElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistrationsubmitButton"))));
		FleetsAdvanceSubmitElem.click();
		
		

}
	public void eventsRegistrationCreate() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);



		usersLinkElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistration"))));
		usersLinkElem.click();
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistrationsBanner"))));
		useraaddButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistationAdd"))));
		useraaddButtonElem.click();
		Thread.sleep(5000);
		
		Select Enterprice = new Select(
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Resourcetype")))));
		Enterprice.selectByVisibleText(AcceptanceSuite.props.getProperty("EnterpriceData"));

		Thread.sleep(5000);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='fleetassetId']/option[2]")));
		WebElement useButtonElem;
		useButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("eventregistrationfleet"))));
		useButtonElem.click();
		Thread.sleep(2000);
		Select EnterpriceresourcesType = new Select(
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("eventregistrationfleet")))));
		
		EnterpriceresourcesType.selectByVisibleText(AcceptanceSuite.props.getProperty("RegistrationfleetData"));
		
		Thread.sleep(2000);
		Select EventType = new Select(
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("eventRegistrationName")))));
        EventType.selectByVisibleText(AcceptanceSuite.props.getProperty("eventnameData"));
        
        Thread.sleep(2000);
        Select usename = new Select(
        		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventOwner")))));
        usename.selectByVisibleText(AcceptanceSuite.props.getProperty("usernameData"));
        
        Thread.sleep(1000);
        submitElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventsRegistrationsubmitbutton"))));
        submitElem.click();
        //Thread.sleep(3000);
}
	
	public void eventRegistrationDelete() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		
		/*AdminElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Transparent")));
		AdminElem.click();*/

		
//		usersLinkElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistration"))));
//		usersLinkElem.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistrationsBanner"))));
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();
		
		String xpathsString = AcceptanceSuite.props.getProperty("EventRegistrationDeleteXPaths");
		String valuesString = AcceptanceSuite.props.getProperty("EventRegistrationDeleteValues");
		
		for (int i=0; i<xpathsString.split(",").length; i++){
			xpaths.add(xpathsString.split(",")[i]);
			values.add(valuesString.split(",")[i]);
		}
		
		//String actionXPath = AcceptanceSuite.props.getProperty("EventRegistrationUnRegisterActionXPath");
		String nextPageXPath = AcceptanceSuite.props.getProperty("EventRegistrationNextPagePath");
		
		String searchXPath = AcceptanceSuite.props.getProperty("EventRegistrationsearchXPath");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("EventRegistrationsearchButtonXPath");
		
		
		
		String actionXPath = AcceptanceSuite.props.getProperty("EventRegistrationDeleteActionXPath");
		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(), searchXPath, searchButtonXPath);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		
		if (!action.equalsIgnoreCase("No Match")){
			Thread.sleep(1000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistrationFinalDeleteXPath")))).click();
		}
	}
	public void checkIN() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(5000);
		/*/AdminElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Transparent")));
		AdminElem.click();*/

		//Thread.sleep(1000);
		usersLinkElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistration"))));
		usersLinkElem.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistrationsBanner"))));
	
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();
		
		String xpathsString = AcceptanceSuite.props.getProperty("EventRegistrationDeleteXPaths");
		String valuesString = AcceptanceSuite.props.getProperty("EventRegistrationDeleteValues");
		
		for (int i=0; i<xpathsString.split(",").length; i++){
			xpaths.add(xpathsString.split(",")[i]);
			values.add(valuesString.split(",")[i]);
		}
		
		String actionXPath = AcceptanceSuite.props.getProperty("EventRegistrationCheckIn");
		String nextPageXPath = AcceptanceSuite.props.getProperty("EventRegistrationNextPagePath");
		
		String searchXPath = AcceptanceSuite.props.getProperty("EventRegistrationsearchXPath");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("EventRegistrationsearchButtonXPath");
		
		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(), searchXPath, searchButtonXPath);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		

		
		if (!action.equalsIgnoreCase("No Match")){
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("RecordCheckIn")))).click();
		}
		
	}
	
	public void checkOut() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(5000);
		/*/AdminElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Transparent")));
		AdminElem.click();*/

		//Thread.sleep(1000);
		usersLinkElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistration"))));
		usersLinkElem.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistrationsBanner"))));
	
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();
		
		String xpathsString = AcceptanceSuite.props.getProperty("EventRegistrationDeleteXPaths");
		String valuesString = AcceptanceSuite.props.getProperty("EventRegistrationDeleteValues");
		
		for (int i=0; i<xpathsString.split(",").length; i++){
			xpaths.add(xpathsString.split(",")[i]);
			values.add(valuesString.split(",")[i]);
		}
		
		String actionXPath = AcceptanceSuite.props.getProperty("EventRegistrationCheckIn");
		String nextPageXPath = AcceptanceSuite.props.getProperty("EventRegistrationNextPagePath");
		
		String searchXPath = AcceptanceSuite.props.getProperty("EventRegistrationsearchXPath");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("EventRegistrationsearchButtonXPath");
		
		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(), searchXPath, searchButtonXPath);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		

		
		if (!action.equalsIgnoreCase("No Match")){
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("RecordCheckIn")))).click();
		}
		
	}
	public void eventRegistrationView() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(5000);
		
		/*AdminElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Transparent")));
		AdminElem.click();*/

		//Thread.sleep(1000);
		usersLinkElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistration"))));
		usersLinkElem.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistrationsBanner"))));
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();
		
		String xpathsString = AcceptanceSuite.props.getProperty("EventRegistrationDeleteXPaths");
		String valuesString = AcceptanceSuite.props.getProperty("EventRegistrationDeleteValues");
		
		for (int i=0; i<xpathsString.split(",").length; i++){
			xpaths.add(xpathsString.split(",")[i]);
			values.add(valuesString.split(",")[i]);
		}
		
		String actionXPath = AcceptanceSuite.props.getProperty("EventRegistrationView");
		String nextPageXPath = AcceptanceSuite.props.getProperty("EventRegistrationNextPagePath");
		
		String searchXPath = AcceptanceSuite.props.getProperty("EventRegistrationsearchXPath");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("EventRegistrationsearchButtonXPath");
		
		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(), searchXPath, searchButtonXPath);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		

		
		if (!action.equalsIgnoreCase("No Match")){
			//Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistrationClosebutton")))).click();
		}
	}
	
	public void eventRegistrationCancel() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(2000);
		/*AdminElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Transparent")));
		AdminElem.click();*/

		//Thread.sleep(2000);
		usersLinkElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistration"))));
		usersLinkElem.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistrationsBanner"))));
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("EventRegistrationDeleteXPaths");
		String valuesString = AcceptanceSuite.props.getProperty("EventRegistrationDeleteValues");

		for (int i = 0; i < xpathsString.split(",").length; i++) {
			xpaths.add(xpathsString.split(",")[i]);
			values.add(valuesString.split(",")[i]);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("EventRegistraionCanceled");
		String nextPageXPath = AcceptanceSuite.props.getProperty("EventRegistrationNextPagePath");

		String searchXPath = AcceptanceSuite.props.getProperty("EventRegistrationsearchXPath");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("EventRegistrationsearchButtonXPath");

		//Thread.sleep(1000);

		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);

		//Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		Thread.sleep(1000);
		if (!action.equalsIgnoreCase("No Match")) {
			Thread.sleep(2000);

			Select EventExtend = new Select(
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventTegistraionCanceled")))));
			EventExtend.selectByVisibleText(AcceptanceSuite.props.getProperty("EventTegistraionCanceleData"));
			Thread.sleep(1000);
			fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistrationcanceledbutton"))));
			fleetSubmitbuttonElem.click();
			Thread.sleep(1000);
			// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EventFinalDeleteXPath"))).click();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void invalidHeader() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
		usersLinkElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistration"))));
		usersLinkElem.click();
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistrationsBanner"))));
		useraaddButtonElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistationAdd"))));
		useraaddButtonElem.click();
		Thread.sleep(1000);

	}

	public void invalidCombinationsAdd(String Enterprise, String Fleet, String EventName, String UserName)
			throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
		Thread.sleep(2000);

		Select enterprise = new Select(wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Resourcetype")))));
		enterprise.selectByVisibleText(Enterprise);

		Select fleet = new Select(wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("eventregistrationfleet")))));
		fleet.selectByVisibleText(Fleet);

		Select eventName = new Select(wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("eventRegistrationName")))));
		eventName.selectByVisibleText(EventName);

		Thread.sleep(2000);
		Select userName = new Select(wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventOwner")))));
		userName.selectByVisibleText(UserName);

		submitElem = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(AcceptanceSuite.props.getProperty("EventsRegistrationsubmitbutton"))));
		submitElem.click();

	}

	public void invalidHeaderCheckin() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
		usersLinkElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistration"))));
		usersLinkElem.click();
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistrationsBanner"))));
		Thread.sleep(1000);
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("EventRegistrationDeleteXPaths");
		String valuesString = AcceptanceSuite.props.getProperty("EventRegistrationDeleteValues");

		for (int i = 0; i < xpathsString.split(",").length; i++) {
			xpaths.add(xpathsString.split(",")[i]);
			values.add(valuesString.split(",")[i]);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("EventRegistrationCheckIn");
		String nextPageXPath = AcceptanceSuite.props.getProperty("EventRegistrationNextPagePath");

		String searchXPath = AcceptanceSuite.props.getProperty("EventRegistrationsearchXPath");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("EventRegistrationsearchButtonXPath");

		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();

		if (!action.equalsIgnoreCase("No Match")) {
			Thread.sleep(2000);
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("RecordCheckIn")))).click();
		}

	}

	public void invalidCombinationsCheckin() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
		Thread.sleep(2000);

		submitElem = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(AcceptanceSuite.props.getProperty("EventsRegistrationsubmitbutton"))));
		submitElem.click();

	}

	public void invalidCancelHeader() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
		usersLinkElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistration"))));
		usersLinkElem.click();
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistrationsBanner"))));
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("EventRegistrationDeleteXPaths");
		String valuesString = AcceptanceSuite.props.getProperty("EventRegistrationDeleteValues");

		for (int i = 0; i < xpathsString.split(",").length; i++) {
			xpaths.add(xpathsString.split(",")[i]);
			values.add(valuesString.split(",")[i]);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("EventRegistraionCanceled");
		String nextPageXPath = AcceptanceSuite.props.getProperty("EventRegistrationNextPagePath");

		String searchXPath = AcceptanceSuite.props.getProperty("EventRegistrationsearchXPath");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("EventRegistrationsearchButtonXPath");
		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		Thread.sleep(1000);
	}

	public void invalidCombinationsCancel(String UnregisterReason) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
		Select eventRegistrationCancel = new Select(wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("UnregisterReason")))));
		eventRegistrationCancel.selectByVisibleText(UnregisterReason);
		WebElement eventCanceledButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(AcceptanceSuite.props.getProperty("EventRegistrationcanceledbutton"))));
		eventCanceledButton.click();
	}
	
	public void eventRegistrationAdvancedSearch() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
		Thread.sleep(5000);
		usersLinkElem = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistration"))));
		usersLinkElem.click();
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistrationsBanner"))));
		Thread.sleep(2000);

		WebElement NotificationAdvanceButtonElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistrationAdvancedSearchButton"))));
		NotificationAdvanceButtonElem.click();

		WebElement CalenderElem = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(AcceptanceSuite.props.getProperty("EventRegistrationAdvancedSearchStartDate"))));

		Thread.sleep(6000);
		CalenderElem.click();

		monthElm = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistrationMonth"))));
		yearelm = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistrationYear"))));
		minituesElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistrationStartMinutes"))));

		nextbuttonElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistrationNextMonth"))));
		timenelm = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistrationTime"))));
		HoursElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistrationHours"))));
		String userDate = AcceptanceSuite.props.getProperty("EventRegistrationStartDate");
		String column = AcceptanceSuite.props.getProperty("EventRegistrationStartColumnDate");
		Thread.sleep(1000);

		getUserDate(this.getDriver(), userDate, CalenderElem, monthElm, yearelm, column, nextbuttonElem, timenelm,
				HoursElem, minituesElem);

		Thread.sleep(2000);
		WebElement closeCalenderElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistrationEndDate"))));

		closeCalenderElem.click();

		closemonthElm = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistrationEndMonth"))));
		closeyearelm = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistrationEndYear"))));
		closeminituesElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistrationEndMin"))));

		closenextbuttonElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistrationEndNext"))));
		closetimenelm = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistrationEndTime"))));
		closeHoursElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistrationEndHours"))));

		String closeuserDate = AcceptanceSuite.props.getProperty("EventRegistrationEndDate1");
		String closecolumn = AcceptanceSuite.props.getProperty("EventRegistrationEndColum");

		Thread.sleep(1000);
		getUserDate(this.getDriver(), closeuserDate, closeCalenderElem, closemonthElm, closeyearelm, closecolumn,
				closenextbuttonElem, closetimenelm, closeHoursElem, closeminituesElem);
		WebElement NotificationAdvanceSubmitElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistrationSubmitButton"))));
		NotificationAdvanceSubmitElem.click();

	}

	public static void getUserDate(WebDriver driver, String userDate, WebElement CalenderElem, WebElement monthElm,
			WebElement yearelm, String column, WebElement nextbuttonElem, WebElement timenelm, WebElement HoursElem,
			WebElement minituesElem) throws InterruptedException {

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
		System.out.println("'''''''''''''''" + userMonth);
		String hours = userDate.split(":")[1];
		String minutes = userDate.split(":")[2];
		System.out.println("hours=======" + hours);
		System.out.println("hours=======" + minutes);
		Thread.sleep(5000);
		String actualHrs = timenelm.getText();
		System.out.println("Time=" + actualHrs);
		System.out.println("Time=" + actualHrs.substring(0, 2));
		while (!actualHrs.substring(actualHrs.length() - 2, actualHrs.length()).equalsIgnoreCase(minutes)) {
			minituesElem.click();
			actualHrs = timenelm.getText();
			System.out.println("llllllllllllllllllvvvvvvvvvvvv" + actualHrs);
		}
		while (!actualHrs.substring(0, 2).equalsIgnoreCase(hours)) {
			HoursElem.click();
			actualHrs = timenelm.getText();
			System.out.println(";;;;;;;;;;;;;;;;;" + actualHrs);
		}
		while (true) {
			System.out.println("lllllllllllllllllccccccc" + yearelm);
			String year = yearelm.getText();
			System.out.println("Year=" + year);
			if (year.equals(userYear)) {
				break;
			} else {
				nextbuttonElem.click();

			}
		}
		while (2 > 1) {
			String month = monthElm.getText();
			System.out.println("Month=" + month + ";userMonth=" + userMonth);

			if (month.equalsIgnoreCase(userMonth)) {
				List<WebElement> columns = driver.findElements(By.xpath(column));
				for (int c = 0; c < columns.size();) {
					System.out.println("rrrrrrrrrrrr" + columns.size());

					String date1 = ((WebElement) columns.get(c)).getText();
					System.out.println("DATES" + date1);
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
				System.out.println("About to click next month" + nextbuttonElem);
				nextbuttonElem.click();
			}
		}
	}
	
}
