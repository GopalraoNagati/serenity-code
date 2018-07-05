package com.srisys.serenity.pages;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.srisys.serenity.AcceptanceSuite;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class IndNavEventspage extends PageObject {
	WebDriver driver;
	String defaultURL;
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


public void eventAdvancesearch() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(2000);
		AdminElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Transparent"))));
		AdminElem.click();

		//Thread.sleep(2000);
		usersLinkElem =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Events"))));
		usersLinkElem.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventBanner"))));
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetBanner"))));
		FleetsAdvanceButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetAdvancedSearch"))));
		FleetsAdvanceButtonElem.click();
		Thread.sleep(2000);
		FleetAdvanceElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventsAdvanceEventSearch"))));

		FleetAdvanceElem.sendKeys(AcceptanceSuite.props.getProperty("EventsDataSearch"));
		//Thread.sleep(1000);
		FleetsAdvanceSubmitElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetAdvanceSearchsubmiButton"))));
		FleetsAdvanceSubmitElem.click();
		//Thread.sleep(2000);
		

}

	public void eventsCreate() throws InterruptedException, ParseException {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);

		/*AdminElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Transparent")));
		AdminElem.click();*/

		usersLinkElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Events"))));
		usersLinkElem.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventBanner"))));
		useraaddButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventsaddButton"))));
		useraaddButtonElem.click();
		Thread.sleep(2000);
		Select Enterprice = new Select(
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriceEvents")))));
		Enterprice.selectByVisibleText(AcceptanceSuite.props.getProperty("EnterpriceData"));

		Thread.sleep(2000);
		Select EnterpriceresourcesType = new Select(
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventsFleetType")))));
		EnterpriceresourcesType.selectByVisibleText(AcceptanceSuite.props.getProperty("EventsFleetData"));
		
		userNameElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventName"))));
		userNameElem.sendKeys(AcceptanceSuite.props.getProperty("Eventname"));

		Thread.sleep(1000);
		Select EventOwner = new Select(
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventOwner")))));
		EventOwner.selectByVisibleText(AcceptanceSuite.props.getProperty("eventOwner"));

		//Thread.sleep(3000);
		Select EventType = new Select(
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventType")))));
		EventType.selectByVisibleText(AcceptanceSuite.props.getProperty("eventType"));
		CalenderElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("calendarXPath"))));

		String CalenderStart = CalenderElem.getAttribute("value");
		//System.out.println("fffffffffff" + CalenderStart);
		// String[] sss1=sss.split("\\s+");
		// System.out.println("kkkkkkkkkkk"+sss1);

		//System.out.println("fffffffffff" + CalenderStart);
		String[] sss1 = CalenderStart.split("\\s+");
		// System.out.println("kkkkkkkkkkk"+sss1);

		SimpleDateFormat df = new SimpleDateFormat("HH:mm");
		Date d = df.parse(sss1[1]);
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.MINUTE, 30);
		String newTime = df.format(cal.getTime());
		//System.out.println("kkkkkkkkkkkdddd" + newTime);
		String space = ":";
		String newend = sss1[0].concat(space);
		String userDate = newend.concat(newTime);
		// String sss=sring.getText();
		System.out.println("kkkkkkkkkkkdddd" + userDate);
		// CalenderElem =
		// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("calendarXPath")));
		
		CalenderElem.click();

		//Thread.sleep(2000);
		monthElm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("monthXPath"))));
		yearelm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("yearXPath"))));
		// columnelm =
		// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("columnsXPath")));
		minituesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("minutesXPath"))));

		nextbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("nextButtonXPath"))));
		timenelm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("timeXPath"))));
		HoursElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("hoursXPath"))));
		// List<WebElement> columns =
		// this.getDriver().findElements(By.xpath(AcceptanceSuite.props.getProperty("columnsXPath")));
		// String userDate = AcceptanceSuite.props.getProperty("startdateuser");
		String column = AcceptanceSuite.props.getProperty("columnsXPath");
		Thread.sleep(1000);

		getUserDate(this.getDriver(), userDate, CalenderElem, monthElm, yearelm, column, nextbuttonElem, timenelm,
				HoursElem, minituesElem);
		Thread.sleep(500);
		WebElement descpElem;
		descpElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Description"))));
		descpElem.click();
		Thread.sleep(500);
		// Actions actions = new Actions(this.getDriver());
		purposeElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("purpose"))));
		purposeElem.click();
		// actions.moveToElement(purposeElem);
		purposeElem.sendKeys(AcceptanceSuite.props.getProperty("purposedata"));

		/*
		 * endCalenderElem =
		 * this.getDriver().findElement(By.xpath(AcceptanceSuite.props.
		 * getProperty("endDatecalendarXPath"))); endCalenderElem.click();
		 * Thread.sleep(3000); endmonthElm =
		 * this.getDriver().findElement(By.xpath(AcceptanceSuite.props.
		 * getProperty("endmonthXPath"))); endyearelm =
		 * this.getDriver().findElement(By.xpath(AcceptanceSuite.props.
		 * getProperty("endyearXPath"))); // columnelm =
		 * this.getDriver().findElement(By.xpath(AcceptanceSuite.props.
		 * getProperty("columnsXPath"))); endminituesElem =
		 * this.getDriver().findElement(By.xpath(AcceptanceSuite.props.
		 * getProperty("endminutesXPath")));
		 * 
		 * endnextbuttonElem =
		 * this.getDriver().findElement(By.xpath(AcceptanceSuite.props.
		 * getProperty("endnextButtonXPath"))); endtimenelm =
		 * this.getDriver().findElement(By.xpath(AcceptanceSuite.props.
		 * getProperty("endtimeXPath")));
		 * endHoursElem=this.getDriver().findElement(By.xpath(AcceptanceSuite.
		 * props.getProperty("endhoursXPath")));
		 * 
		 * String enduserDate =
		 * AcceptanceSuite.props.getProperty("endtuserDate"); String endcolumn =
		 * AcceptanceSuite.props.getProperty("enddatecolumnsXPath");
		 * 
		 * getUserDate(this.getDriver(),enduserDate, endCalenderElem,
		 * endmonthElm, endyearelm, endcolumn,endnextbuttonElem, endtimenelm,
		 * endHoursElem, endminituesElem);
		 */

		//Thread.sleep(2000);
		closeCalenderElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("closeDatecalendarXPath"))));
		String CalenderClose = closeCalenderElem.getAttribute("value");
		System.out.println("fffffffffff" + CalenderClose);
		// String[] sss1=sss.split("\\s+");
		// System.out.println("kkkkkkkkkkk"+sss1);

		System.out.println("fffffffffff" + CalenderClose);
		String[] sss2 = CalenderClose.split("\\s+");
		// System.out.println("kkkkkkkkkkk"+sss1);

		
		Date d1 = df.parse(sss2[1]);
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(d1);
		/*if (Integer.parseInt(sss2[1].split(":")[1].substring(1, 2)) <= 5){
			cal1.add(Calendar.MINUTE, 10-Integer.parseInt(sss2[1].split(":")[1].substring(1, 2)));
		} else {
			cal1.add(Calendar.MINUTE, 15-Integer.parseInt(sss2[1].split(":")[1].substring(1, 2)));
		}*/
		cal1.add(Calendar.MINUTE, -15);
		String newTime1 = df.format(cal1.getTime());
		//String[] newtime=newTime1.split(":");
		
		System.out.println("NewTime" + newTime1);
		String space1 = ":";
		String newend1 = sss2[0].concat(space1);
		String closeuserDate = newend1.concat(newTime1);

		// String sss=sring.getText();
		System.out.println("kkkkkkkkkkkddddsss" + closeuserDate);
		
		closeCalenderElem.click();
		//Thread.sleep(2000);

		closemonthElm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("closemonthXPath"))));
		closeyearelm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("closeyearXPath"))));
		// columnelm =
		// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("columnsXPath")));
		closeminituesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("closeminutesXPath"))));

		closenextbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("closenextButtonXPath"))));
		closetimenelm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("closetimeXPath"))));
		closeHoursElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("closehoursXPath"))));
		// WebElement sring =
		// driver.findElement(By.xpath("html/body/app-dashboard/div[2]/main/div/ng-component/app-events-popup/div/div/div/div[2]/div/div[10]/p-calendar/span/input"));

		// String closeuserDate =
		// AcceptanceSuite.props.getProperty("closedateuser");
		String closecolumn = AcceptanceSuite.props.getProperty("closedatecolumnsXPath");
		// // List<WebElement> columns =
		// this.getDriver().findElements(By.xpath(AcceptanceSuite.props.getProperty("columnsXPath")));
		//
		Thread.sleep(1000);
		getUserDate(this.getDriver(), closeuserDate, closeCalenderElem, closemonthElm, closeyearelm, closecolumn,
				closenextbuttonElem, closetimenelm, closeHoursElem, closeminituesElem);

		//Thread.sleep(1000);

		Thread.sleep(1000);
		WebElement seatlimit;
		seatlimit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Eventseatlimit"))));
		seatlimit.sendKeys(AcceptanceSuite.props.getProperty("seatnumber"));
		Thread.sleep(1000);
		WebElement eventitElem;
		eventitElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventmulipleRegistration"))));
		eventitElem.click();
		Thread.sleep(500);
		submitElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("submitbutton"))));
		submitElem.click();
		//Thread.sleep(2000);

		//
		//
		// LookupsubmitElem =
		// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Lookupsubmit")));
		// LookupsubmitElem.click();

	}

	public static void getUserDate(WebDriver driver, String userDate, WebElement CalenderElem, WebElement monthElm,
			WebElement yearelm, String column, WebElement nextbuttonElem, WebElement timenelm, WebElement HoursElem,
			WebElement minituesElem) throws InterruptedException {

		System.out.println("lllllllll" + userDate);
		System.out.println("lllllllllllllllllcccccccvvvvvvvvvvvvvvvvvv"+yearelm.getText());
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

	public void eventDelete() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		Thread.sleep(2000);
//		/*AdminElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Transparent")));
//		AdminElem.click();*/

		//Thread.sleep(1000);
//		usersLinkElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Events"))));
//		usersLinkElem.click();
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
			Thread.sleep(500);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventFinalDeleteXPath")))).click();
		}
	}

	public void eventsEdit() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(2000);
	/*	AdminElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Transparent")));
		AdminElem.click();*/

		Thread.sleep(2000);
		usersLinkElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Events"))));
		usersLinkElem.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventBanner"))));

		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("EventEditXPaths");
		String valuesString = AcceptanceSuite.props.getProperty("EventEditValues");

		for (int i = 0; i < xpathsString.split(",").length; i++) {
			xpaths.add(xpathsString.split(",")[i]);
			values.add(valuesString.split(",")[i]);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("EventsEditactual");
		String nextPageXPath = AcceptanceSuite.props.getProperty("EventNextPagePath");

		String searchXPath = AcceptanceSuite.props.getProperty("EventsearchXPath");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("EventsearchButtonXPath");

		//Thread.sleep(1000);

		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		//Thread.sleep(1000);
		if (!action.equalsIgnoreCase("No Match")) {
			//Thread.sleep(2000);

			MobilidElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventName"))));
			MobilidElem.clear();
			//Thread.sleep(1000);
			MobilidElem.sendKeys(AcceptanceSuite.props.getProperty("EventsEditData"));

			//Thread.sleep(2000);
			fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventsSubmit"))));
			fleetSubmitbuttonElem.click();
			// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EventFinalDeleteXPath"))).click();
		}
	}

	public void eventsView() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(2000);
		/*AdminElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Transparent")));
		AdminElem.click();*/

		Thread.sleep(2000);
		usersLinkElem =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Events"))));
		usersLinkElem.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventBanner"))));
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("EventViewXPaths");
		String valuesString = AcceptanceSuite.props.getProperty("EventViewValues");

		for (int i = 0; i < xpathsString.split(",").length; i++) {
			xpaths.add(xpathsString.split(",")[i]);
			values.add(valuesString.split(",")[i]);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("EventsViewtactual");
		String nextPageXPath = AcceptanceSuite.props.getProperty("EventNextPagePath");

		String searchXPath = AcceptanceSuite.props.getProperty("EventsearchXPath");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("EventsearchButtonXPath");

		//Thread.sleep(1000);

		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);

		//Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		//Thread.sleep(1000);
		if (!action.equalsIgnoreCase("No Match")) {
			

			Thread.sleep(1000);
			fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Eventsclose"))));
			fleetSubmitbuttonElem.click();
			// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EventFinalDeleteXPath"))).click();
		}
	}

	public void eventsCheckIn() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(2000);
		/*AdminElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Transparent")));
		AdminElem.click();*/
		this.getDriver().navigate().refresh();
		Thread.sleep(2000);
		usersLinkElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Events"))));
		usersLinkElem.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventBanner"))));
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("EventCheckInXPaths");
		String valuesString = AcceptanceSuite.props.getProperty("EventChecKInValues");

		for (int i = 0; i < xpathsString.split(",").length; i++) {
			xpaths.add(xpathsString.split(",")[i]);
			values.add(valuesString.split(",")[i]);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("CheckInactualXpath");
		String nextPageXPath = AcceptanceSuite.props.getProperty("EventNextPagePath");

		String searchXPath = AcceptanceSuite.props.getProperty("EventsearchXPath");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("EventsearchButtonXPath");

		//Thread.sleep(1000);

		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);
//
		//Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		//Thread.sleep(1000);
		if (!action.equalsIgnoreCase("No Match")) {

			Thread.sleep(2000);
			//defaultURL = AcceptanceSuite.props.getProperty("defaultURL");
			
			//Thread.sleep(2000);
			fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("CheckInClose"))));
			fleetSubmitbuttonElem.click();
			// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EventFinalDeleteXPath"))).click();
		}
	}

	public void eventsCheckOut() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(2000);
	/*	AdminElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Transparent")));
		AdminElem.click();*/

		//Thread.sleep(2000);
		usersLinkElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Events"))));
		usersLinkElem.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventBanner"))));
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("EventCheckOutXPaths");
		String valuesString = AcceptanceSuite.props.getProperty("EventChecKOutValues");

		for (int i = 0; i < xpathsString.split(",").length; i++) {
			xpaths.add(xpathsString.split(",")[i]);
			values.add(valuesString.split(",")[i]);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("CheckOutactualXpath");
		String nextPageXPath = AcceptanceSuite.props.getProperty("EventNextPagePath");

		String searchXPath = AcceptanceSuite.props.getProperty("EventsearchXPath");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("EventsearchButtonXPath");

		//Thread.sleep(1000);

		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);

		//Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		//Thread.sleep(1000);
		if (!action.equalsIgnoreCase("No Match")) {

			Thread.sleep(2000);
			fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("CheckOutClose"))));
			fleetSubmitbuttonElem.click();
			Thread.sleep(5000);
			// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EventFinalDeleteXPath"))).click();
		}
	}

	public void eventsExtend() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(2000);
		/*AdminElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Transparent")));
		AdminElem.click();*/

		//Thread.sleep(2000);
		usersLinkElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Events"))));
		usersLinkElem.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventBanner"))));
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("EventextendXPaths");
		String valuesString = AcceptanceSuite.props.getProperty("EventextendValues");

		for (int i = 0; i < xpathsString.split(",").length; i++) {
			xpaths.add(xpathsString.split(",")[i]);
			values.add(valuesString.split(",")[i]);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("Eventextend");
		String nextPageXPath = AcceptanceSuite.props.getProperty("EventNextPagePath");

		String searchXPath = AcceptanceSuite.props.getProperty("EventsearchXPath");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("EventsearchButtonXPath");

		//Thread.sleep(1000);

		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);

		//Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		//Thread.sleep(1000);
		if (!action.equalsIgnoreCase("No Match")) {
			//Thread.sleep(1000);

			Select EventExtend = new Select(
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventextendReason")))));
			EventExtend.selectByVisibleText(AcceptanceSuite.props.getProperty("EventExtendselect"));
			//Thread.sleep(2000);
			fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("CheckExtendClose"))));
			fleetSubmitbuttonElem.click();
			Thread.sleep(5000);
			// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EventFinalDeleteXPath"))).click();
		}
	}
	
	public void eventCancel() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(2000);
		/*AdminElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Transparent")));
		AdminElem.click();*/

		Thread.sleep(3000);
		usersLinkElem =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Events"))));
		usersLinkElem.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventBanner"))));

		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("EventcancelXPaths");
		String valuesString = AcceptanceSuite.props.getProperty("EventCancelValues");

		for (int i = 0; i < xpathsString.split(",").length; i++) {
			xpaths.add(xpathsString.split(",")[i]);
			values.add(valuesString.split(",")[i]);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("CancelEvent");
		String nextPageXPath = AcceptanceSuite.props.getProperty("EventNextPagePath");

		String searchXPath = AcceptanceSuite.props.getProperty("EventsearchXPath");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("EventsearchButtonXPath");

		//Thread.sleep(1000);

		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);

		//Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		//Thread.sleep(1000);
		if (!action.equalsIgnoreCase("No Match")) {
			Thread.sleep(5000);

			Select EventExtend = new Select(
					 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Cancelselect")))));
			EventExtend.selectByVisibleText(AcceptanceSuite.props.getProperty("CancelData"));
			Thread.sleep(2000);
			fleetSubmitbuttonElem =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("CancelButton"))));
			fleetSubmitbuttonElem.click();
			// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EventFinalDeleteXPath"))).click();
		}
	}

	public void eventRegistrationList() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(2000);
		/*AdminElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Transparent")));
		AdminElem.click();*/

		//Thread.sleep(2000);
		usersLinkElem =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Events"))));
		usersLinkElem.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventBanner"))));

		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("EventcancelXPaths");
		String valuesString = AcceptanceSuite.props.getProperty("EventCancelValues");

		for (int i = 0; i < xpathsString.split(",").length; i++) {
			xpaths.add(xpathsString.split(",")[i]);
			values.add(valuesString.split(",")[i]);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("EventRegistartionlist");
		String nextPageXPath = AcceptanceSuite.props.getProperty("EventNextPagePath");

		String searchXPath = AcceptanceSuite.props.getProperty("EventsearchXPath");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("EventsearchButtonXPath");

		//Thread.sleep(1000);

		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);

		//Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		//Thread.sleep(1000);
		
	}
	
	
	public void events1GuidedCreate() throws InterruptedException, ParseException {
		  WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		  
		  

		  /*AdminElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Transparent")));
		  AdminElem.click();*/
		  Thread.sleep(2000);

		  usersLinkElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Events"))));
		  usersLinkElem.click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventBanner"))));
		  useraaddButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsGuidedCreate"))));
		  useraaddButtonElem.click();
		  //Thread.sleep(1000);
		  Select Enterprice = new Select(
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationEnterprise")))));
		  Enterprice.selectByVisibleText(AcceptanceSuite.props.getProperty("leetReservationsEnterpriseData"));

		  Thread.sleep(5000);
		  Select EnterpriceresourcesType = new Select(
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsFleetType")))));
		  EnterpriceresourcesType.selectByVisibleText(AcceptanceSuite.props.getProperty("FleetReservationsFleetTypeData"));
		  
		  
//		  Select FleettpeAttributes = new Select(
//		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsFleetTypeattrbute")))));
//		  FleettpeAttributes.selectByVisibleText(AcceptanceSuite.props.getProperty("FleetReservationsFleetTypeattrbuteData"));
		  
		  Thread.sleep(5000);
		  Select Country = new Select(
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationscountrySelect")))));
		  Country.selectByVisibleText(AcceptanceSuite.props.getProperty("FleetReservationscountryData"));
		  
		  WebElement Guidedsubmit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReseravtionssubmitguided"))));
		  Guidedsubmit.click();
		  Thread.sleep(2000);
		  WebElement Guidedcheck = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleeteReservationsinputcheckbox"))));
		  Guidedcheck.click();
		  Thread.sleep(2000);
		 

		  
		  //
		  
		  //Thread.sleep(1000);
		  //Select EventOwner = new Select(
		    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsUserName")))));
		  //EventOwner.selectByVisibleText(AcceptanceSuite.props.getProperty("FleetReservationsUserNameData"));

		  
		  //Thread.sleep(1000);

		  Thread.sleep(1000);
		  submitElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventsGuidedfialsubmit"))));
		  submitElem.click();
		  Thread.sleep(2000);

		  //
		  //
		  // LookupsubmitElem =
		  // this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Lookupsubmit")));
		  // LookupsubmitElem.click();

		 }
		 
		 public void eventsGuidedCreate() throws InterruptedException, ParseException {
		  WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);

		  /*AdminElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Transparent")));
		  AdminElem.click();*/

		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventBanner"))));
		  
		  Thread.sleep(2000);
		  
		  
		  userNameElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventsGuided"))));
		  userNameElem.sendKeys(AcceptanceSuite.props.getProperty("Eventname"));

		  Thread.sleep(3000);
		  Select EventOwner = new Select(
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventsGuidedOwner")))));
		  EventOwner.selectByVisibleText(AcceptanceSuite.props.getProperty("eventOwner"));

		  Thread.sleep(3000);
		  Select EventType = new Select(
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventType")))));
		  EventType.selectByVisibleText(AcceptanceSuite.props.getProperty("eventType"));
		  
		  Thread.sleep(1000);
		  
		  WebElement descpElem;
		  descpElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Description"))));
		  descpElem.click();
		  Thread.sleep(500);
		  // Actions actions = new Actions(this.getDriver());
		  purposeElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("purpose"))));
		  purposeElem.click();
		  // actions.moveToElement(purposeElem);
		  purposeElem.sendKeys(AcceptanceSuite.props.getProperty("purposedata"));
		  Thread.sleep(1000);
		  
		  WebElement seatlimit;
		  seatlimit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Eventseatlimit"))));
		  seatlimit.sendKeys(AcceptanceSuite.props.getProperty("seatnumber"));
		  Thread.sleep(1000);
		  WebElement eventitElem;
		  eventitElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventsMulipleregister"))));
		  eventitElem.click();
		  Thread.sleep(500);
		  submitElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventsGuidedsubmit"))));
		  submitElem.click();
		  //Thread.sleep(2000);

		  //
		  //
		  // LookupsubmitElem =
		  // this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Lookupsubmit")));
		  // LookupsubmitElem.click();

		 }

		 
		 
		 public void eventsAdvancedSearch() throws InterruptedException {
				WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
				Thread.sleep(5000);
				usersLinkElem = wait.until(
						ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Events"))));
				usersLinkElem.click();
				wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventBanner"))));
				Thread.sleep(2000);

				WebElement NotificationAdvanceButtonElem = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventsAdvancedSearchButton"))));
				NotificationAdvanceButtonElem.click();

				WebElement CalenderElem = wait.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath(AcceptanceSuite.props.getProperty("EventsAdvancedSearchStartDate"))));

				Thread.sleep(6000);
				CalenderElem.click();

				monthElm = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventsMonth"))));
				yearelm = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventsYear"))));
				minituesElem = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventsStartMinutes"))));

				nextbuttonElem = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventsNextMonth"))));
				timenelm = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventsTime"))));
				HoursElem = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventsHours"))));
				String userDate = AcceptanceSuite.props.getProperty("EventsStartDate");
				String column = AcceptanceSuite.props.getProperty("EventsStartColumnDate");
				Thread.sleep(1000);

				getUserDate(this.getDriver(), userDate, CalenderElem, monthElm, yearelm, column, nextbuttonElem, timenelm,
						HoursElem, minituesElem);

				Thread.sleep(2000);
				WebElement closeCalenderElem = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventsEndDate"))));

				closeCalenderElem.click();

				closemonthElm = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventsEndMonth"))));
				closeyearelm = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventsEndYear"))));
				closeminituesElem = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventsEndMin"))));

				closenextbuttonElem = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventsEndNext"))));
				closetimenelm = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventsEndTime"))));
				closeHoursElem = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventsEndHours"))));

				String closeuserDate = AcceptanceSuite.props.getProperty("EventsEndDate1");
				String closecolumn = AcceptanceSuite.props.getProperty("EventsEndColum");

				Thread.sleep(1000);
				getUserDate(this.getDriver(), closeuserDate, closeCalenderElem, closemonthElm, closeyearelm, closecolumn,
						closenextbuttonElem, closetimenelm, closeHoursElem, closeminituesElem);
				WebElement NotificationAdvanceSubmitElem = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventsSubmitButton"))));
				NotificationAdvanceSubmitElem.click();

			}
		 
		 
		 
		 
		 
		 
		 
		 public void invalidCombinationsCreateHeader() throws InterruptedException {

				WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
				Thread.sleep(2000);

				usersLinkElem = wait.until(
						ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Events"))));
				usersLinkElem.click();
				wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventBanner"))));
				Thread.sleep(2000);

				WebElement eventAdd = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventsaddButton"))));
				eventAdd.click();

			}

			public void invalidCombinationsCreate(String Enterprise, String Fleet, String EventName, String EventOwner,
					String EventType, String EventSeatLimit, String StartDate, String EndDate, String EventPurpose)
					throws InterruptedException {

				WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
				Thread.sleep(2000);

				Select enterprise = new Select(wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriceEvents")))));
				enterprise.selectByVisibleText(Enterprise);
				
				Thread.sleep(2000);

				Select fleet = new Select(wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventsFleetType")))));
				fleet.selectByVisibleText(Fleet);

				WebElement eventName = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventName"))));
				eventName.sendKeys(Keys.CONTROL, "a");
				eventName.sendKeys(Keys.DELETE);
				eventName.sendKeys(EventName);
				
				Thread.sleep(2000);

				Select eventOwner = new Select(wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventOwner")))));
				eventOwner.selectByVisibleText(EventOwner);

				Select eventType = new Select(wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventType")))));
				eventType.selectByVisibleText(EventType);

				WebElement eventSeatLimit = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventseatLimit"))));
				eventSeatLimit.sendKeys(Keys.CONTROL, "a");
				eventSeatLimit.sendKeys(Keys.DELETE);
				eventSeatLimit.sendKeys(EventSeatLimit);

				WebElement CalenderElem = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventCreateStartDate"))));
				Thread.sleep(6000);
				CalenderElem.click();

				monthElm = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventCreateStartMonth"))));
				yearelm = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventCreateStartYear"))));
				minituesElem = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventCreateStartMin"))));

				nextbuttonElem = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventCreateNextMonth"))));
				timenelm = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventCreateTime"))));
				HoursElem = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventCreateHours"))));
				// String userDate = AcceptanceSuite.props.getProperty("StartDate");
				String column = AcceptanceSuite.props.getProperty("EventCreateStartColumnDate");
				Thread.sleep(1000);

				getUserDate(this.getDriver(), StartDate, CalenderElem, monthElm, yearelm, column, nextbuttonElem, timenelm,
						HoursElem, minituesElem);

				Thread.sleep(2000);
				WebElement closeCalenderElem = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventCreateEndDate"))));

				closeCalenderElem.click();

				closemonthElm = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventCreateEndMonth"))));
				closeyearelm = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventCreateEndYear"))));
				closeminituesElem = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventCreateEndMin"))));

				closenextbuttonElem = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventCreateEndNext"))));
				closetimenelm = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventCreateEndTime"))));
				closeHoursElem = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventCreateEndHours"))));

				// String closeuserDate = AcceptanceSuite.props.getProperty("EndDate");
				String closecolumn = AcceptanceSuite.props.getProperty("EventCreateEndColumn");

				Thread.sleep(1000);
				getUserDate(this.getDriver(), EndDate, closeCalenderElem, closemonthElm, closeyearelm, closecolumn,
						closenextbuttonElem, closetimenelm, closeHoursElem, closeminituesElem);

				WebElement eventPurpose = wait.until(
						ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("purpose"))));
				eventPurpose.sendKeys(Keys.CONTROL, "a");
				eventPurpose.sendKeys(Keys.DELETE);
				eventPurpose.sendKeys(EventPurpose);

				WebElement submitButton = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("submitbutton"))));
				submitButton.click();

			}
			
			public void invalidCombinationsEditHeader() throws InterruptedException {

				WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
				Thread.sleep(2000);

				usersLinkElem = wait.until(
						ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Events"))));
				usersLinkElem.click();
				wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventBanner"))));
				Thread.sleep(2000);
				
				ArrayList<String> xpaths = new ArrayList<String>();
				ArrayList<String> values = new ArrayList<String>();

				String xpathsString = AcceptanceSuite.props.getProperty("EventcancelXPaths");
				String valuesString = AcceptanceSuite.props.getProperty("EventCancelValues");

				for (int i = 0; i < xpathsString.split(",").length; i++) {
					xpaths.add(xpathsString.split(",")[i]);
					values.add(valuesString.split(",")[i]);
				}

				String actionXPath = AcceptanceSuite.props.getProperty("EventEditButton");
				String nextPageXPath = AcceptanceSuite.props.getProperty("EventNextPagePath");

				String searchXPath = AcceptanceSuite.props.getProperty("EventsearchXPath");
				String searchButtonXPath = AcceptanceSuite.props.getProperty("EventsearchButtonXPath");

				String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
						searchXPath, searchButtonXPath);

				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();

			}
			
			
			public void invalidCombinationsEdit(String Fleet, String EventName,
					String EventType, String EventSeatLimit, String StartDate, String EndDate, String EventPurpose)
					throws InterruptedException {

				WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
				Thread.sleep(2000);

				Select fleet = new Select(wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventsFleetType")))));
				fleet.selectByVisibleText(Fleet);

				WebElement eventName = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventName"))));
				eventName.sendKeys(Keys.CONTROL, "a");
				eventName.sendKeys(Keys.DELETE);
				eventName.sendKeys(EventName);
				
				Thread.sleep(2000);

				Select eventType = new Select(wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventType")))));
				eventType.selectByVisibleText(EventType);

				WebElement eventSeatLimit = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventseatLimit"))));
				eventSeatLimit.sendKeys(Keys.CONTROL, "a");
				eventSeatLimit.sendKeys(Keys.DELETE);
				eventSeatLimit.sendKeys(EventSeatLimit);

				WebElement CalenderElem = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventEditStartDate"))));
				Thread.sleep(6000);
				CalenderElem.click();

				monthElm = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventEditStartMonth"))));
				yearelm = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventEditStartYear"))));
				minituesElem = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventEditStartMin"))));

				nextbuttonElem = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventEditNextMonth"))));
				timenelm = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventEditTime"))));
				HoursElem = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventEditHours"))));
				// String userDate = AcceptanceSuite.props.getProperty("StartDate");
				String column = AcceptanceSuite.props.getProperty("EventEditStartColumnDate");
				Thread.sleep(1000);

				getUserDate(this.getDriver(), StartDate, CalenderElem, monthElm, yearelm, column, nextbuttonElem, timenelm,
						HoursElem, minituesElem);

				Thread.sleep(2000);
				WebElement closeCalenderElem = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventEditEndDate"))));

				closeCalenderElem.click();

				closemonthElm = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventEditEndMonth"))));
				closeyearelm = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventEditEndYear"))));
				closeminituesElem = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventEditEndMin"))));

				closenextbuttonElem = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventEditEndNext"))));
				closetimenelm = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventEditEndTime"))));
				closeHoursElem = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventEditEndHours"))));

				// String closeuserDate = AcceptanceSuite.props.getProperty("EndDate");
				String closecolumn = AcceptanceSuite.props.getProperty("EventEditEndColumn");

				Thread.sleep(1000);
				getUserDate(this.getDriver(), EndDate, closeCalenderElem, closemonthElm, closeyearelm, closecolumn,
						closenextbuttonElem, closetimenelm, closeHoursElem, closeminituesElem);

				WebElement eventPurpose = wait.until(
						ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("purpose"))));
				eventPurpose.sendKeys(Keys.CONTROL, "a");
				eventPurpose.sendKeys(Keys.DELETE);
				eventPurpose.sendKeys(EventPurpose);

				WebElement submitButton = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("submitbutton"))));
				submitButton.click();

			}
			
			public void invalidCombinationsCheckInHeader() throws InterruptedException {

				WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
				Thread.sleep(2000);

				usersLinkElem = wait.until(
						ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventsLink"))));
				usersLinkElem.click();
				wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventBanner"))));
				Thread.sleep(2000);
				
				ArrayList<String> xpaths = new ArrayList<String>();
				ArrayList<String> values = new ArrayList<String>();

				String xpathsString = AcceptanceSuite.props.getProperty("EventcancelXPaths");
				String valuesString = AcceptanceSuite.props.getProperty("EventCancelValues");

				for (int i = 0; i < xpathsString.split(",").length; i++) {
					xpaths.add(xpathsString.split(",")[i]);
					values.add(valuesString.split(",")[i]);
				}

				String actionXPath = AcceptanceSuite.props.getProperty("EventCheckInButton");
				String nextPageXPath = AcceptanceSuite.props.getProperty("EventNextPagePath");

				String searchXPath = AcceptanceSuite.props.getProperty("EventsearchXPath");
				String searchButtonXPath = AcceptanceSuite.props.getProperty("EventsearchButtonXPath");

				String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
						searchXPath, searchButtonXPath);

				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
				
				WebElement checkInButton = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("CheckInClose"))));
				checkInButton.click();

			}
			
			public void invalidCombinationsExtendHeader() throws InterruptedException {

				WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
				Thread.sleep(2000);

				usersLinkElem = wait.until(
						ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventsLink"))));
				usersLinkElem.click();
				wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventBanner"))));
				Thread.sleep(2000);
				
				ArrayList<String> xpaths = new ArrayList<String>();
				ArrayList<String> values = new ArrayList<String>();

				String xpathsString = AcceptanceSuite.props.getProperty("EventcancelXPaths");
				String valuesString = AcceptanceSuite.props.getProperty("EventCancelValues");

				for (int i = 0; i < xpathsString.split(",").length; i++) {
					xpaths.add(xpathsString.split(",")[i]);
					values.add(valuesString.split(",")[i]);
				}

				String actionXPath = AcceptanceSuite.props.getProperty("EventExtendLink");
				String nextPageXPath = AcceptanceSuite.props.getProperty("EventNextPagePath");

				String searchXPath = AcceptanceSuite.props.getProperty("EventsearchXPath");
				String searchButtonXPath = AcceptanceSuite.props.getProperty("EventsearchButtonXPath");

				String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
						searchXPath, searchButtonXPath);

				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();

			}
			
			public void invalidCombinationsExtend(String EndDate, String ExtendReason)
					throws InterruptedException {

				WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
				Thread.sleep(2000);

				WebElement closeCalenderElem = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventExtendEndDate"))));

				closeCalenderElem.click();

				closemonthElm = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventExtendMonth"))));
				closeyearelm = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventExtendYear"))));
				closeminituesElem = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventExtendEndMins"))));

				closenextbuttonElem = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventExtendEndNext"))));
				closetimenelm = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventExtendEndTime"))));
				closeHoursElem = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventExtendEndHours"))));

				String closecolumn = AcceptanceSuite.props.getProperty("EventExtendEndColumn");

				Thread.sleep(1000);
				getUserDate(this.getDriver(), EndDate, closeCalenderElem, closemonthElm, closeyearelm, closecolumn,
						closenextbuttonElem, closetimenelm, closeHoursElem, closeminituesElem);

				WebElement submitButton = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventExtendButton"))));
				submitButton.click();

			}
			
			public void invalidCombinationsCancelHeader() throws InterruptedException {

				WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
				Thread.sleep(2000);

				usersLinkElem = wait.until(
						ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventsLink"))));
				usersLinkElem.click();
				wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventBanner"))));
				Thread.sleep(2000);
				
				ArrayList<String> xpaths = new ArrayList<String>();
				ArrayList<String> values = new ArrayList<String>();

				String xpathsString = AcceptanceSuite.props.getProperty("EventcancelXPaths");
				String valuesString = AcceptanceSuite.props.getProperty("EventCancelValues");

				for (int i = 0; i < xpathsString.split(",").length; i++) {
					xpaths.add(xpathsString.split(",")[i]);
					values.add(valuesString.split(",")[i]);
				}

				String actionXPath = AcceptanceSuite.props.getProperty("EventCancelLink");
				String nextPageXPath = AcceptanceSuite.props.getProperty("EventNextPagePath");

				String searchXPath = AcceptanceSuite.props.getProperty("EventsearchXPath");
				String searchButtonXPath = AcceptanceSuite.props.getProperty("EventsearchButtonXPath");

				String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
						searchXPath, searchButtonXPath);

				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();

			}
			
			public void invalidCombinationsCancel(String CancelReason) throws InterruptedException {

				WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
				Thread.sleep(2000);
				
				Select cancelReason = new Select(wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventCancelReason")))));
				cancelReason.selectByVisibleText(CancelReason);
				
				WebElement cancelButton = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventCancelButton"))));
				cancelButton.click();
				
			}
			
			
			
			
			public void openGuidedCreatePopup(){
				 WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
			    	
				 usersLinkElem =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Events"))));
				 usersLinkElem.click();
					
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventBanner"))));
				useraaddButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventsGuided"))));
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






