package com.srisys.serenity.pages;

import java.util.ArrayList;
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

public class IndNavFunfactspage extends PageObject{
	
	
	WebElement EnterpriceElem;
	WebElement EnterpricesElem;
    WebElement FleetsElem;
    WebElement  FunfactsElem;
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
public void funAdvancesearch() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);

		//Thread.sleep(1000);
		EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprices"))));
		EnterpricesElem.click();

		//Thread.sleep(1000);
		FleetsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FunFacts"))));
		FleetsElem.click();

		//Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FunFactsBanner"))));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetBanner"))));
		FleetsAdvanceButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetAdvancedSearch"))));
		FleetsAdvanceButtonElem.click();
		
		FleetAdvanceElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FunfactsAdvancesearchAdd"))));

		FleetAdvanceElem.sendKeys(AcceptanceSuite.props.getProperty("FunfactsAdvancesearchAddData"));
		//Thread.sleep(1000);
		FleetsAdvanceSubmitElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistrationsubmitButton"))));
		FleetsAdvanceSubmitElem.click();
	}
	
	
	public void funCreate() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);

		//Thread.sleep(1000);
		EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprices"))));
		EnterpricesElem.click();

		//Thread.sleep(1000);
		FleetsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FunFacts"))));
		FleetsElem.click();

		//Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FunFactsBanner"))));
		FleetsAddElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("funfactsAdd"))));
		//this.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
		FleetsAddElem.click();
		//Thread.sleep(2000);
		Select Enterprice = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("funfactsEnterprise")))));
		
		Enterprice.selectByVisibleText(AcceptanceSuite.props.getProperty("EnterpriceData"));
		//Thread.sleep(2000);
	

		FunfactsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("funfactsName"))));

		FunfactsElem.sendKeys(AcceptanceSuite.props.getProperty("FunfactsData"));
		
//		Select parentfleetType = new Select(
//				this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("ParentFleet"))));
//		parentfleetType.selectByVisibleText(AcceptanceSuite.props.getProperty("ParentFleetdata"));
		 
		 //Thread.sleep(1000);
		
		fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("funfactsSubmitButton"))));
		fleetSubmitbuttonElem.click();
	}
	public void funEdit() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(3000);
		EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprices"))));
		EnterpricesElem.click();
		//Thread.sleep(2000);
		FleetsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FunFacts"))));
		FleetsElem.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FunFactsBanner"))));
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("funfactsEdit");
		String valuesString = AcceptanceSuite.props.getProperty("funfactsteditValue");

		for (int i = 0; i < xpathsString.split(",").length; i++) {

			xpaths.add(xpathsString.split(",")[i]);
			System.out.println("lllllllllll" + xpaths);
			values.add(valuesString.split(",")[i]);
			System.out.println("lllllllllll" + values);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("funfactsEditButton");
		String nextPageXPath = AcceptanceSuite.props.getProperty("funfactsNextButton");

		String searchXPath = AcceptanceSuite.props.getProperty("funfactssearchButton");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("funfactssearchClick");

		//Thread.sleep(2000);
		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		//Thread.sleep(2000);
		
		MobilidElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("funfactsName"))));
		MobilidElem.clear();
		MobilidElem.sendKeys(AcceptanceSuite.props.getProperty("funfactsEditData"));
		//Thread.sleep(2000);
		fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("funfactsEditSubmit"))));
		fleetSubmitbuttonElem.click();
		
		

		
	}
	
	public void funView() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(3000);
		EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprices"))));
		EnterpricesElem.click();
		//Thread.sleep(2000);
		FleetsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FunFacts"))));
		FleetsElem.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FunFactsBanner"))));
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("funfactsViewXpaths");
		String valuesString = AcceptanceSuite.props.getProperty("funfactstViewValue");

		for (int i = 0; i < xpathsString.split(",").length; i++) {

			xpaths.add(xpathsString.split(",")[i]);
			System.out.println("lllllllllll" + xpaths);
			values.add(valuesString.split(",")[i]);
			System.out.println("lllllllllll" + values);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("funfactsViewButton");
		String nextPageXPath = AcceptanceSuite.props.getProperty("funfactsNextButton");

		String searchXPath = AcceptanceSuite.props.getProperty("funfactssearchButton");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("funfactssearchClick");

		//Thread.sleep(2000);
		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		//Thread.sleep(2000);
		
		
		
		fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("funfactsClose"))));
		fleetSubmitbuttonElem.click();
		
		

		
	}
	public void funDelete() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(5000);
		EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprices"))));
		EnterpricesElem.click();
	
		//Thread.sleep(1000);
		FleetsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FunFacts"))));
		FleetsElem.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FunFactsBanner"))));
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();
		
		String xpathsString = AcceptanceSuite.props.getProperty("funfactsDeleteXpaths");
		String valuesString = AcceptanceSuite.props.getProperty("funfactstDeleteValue");
		
		for (int i=0; i<xpathsString.split(",").length; i++){
			
			xpaths.add(xpathsString.split(",")[i]);
			System.out.println("lllllllllll"+xpaths);
			values.add(valuesString.split(",")[i]);
			System.out.println("lllllllllll"+values);
		}
		
		String actionXPath = AcceptanceSuite.props.getProperty("funfactsDelete");
		String nextPageXPath = AcceptanceSuite.props.getProperty("funfactsNextButton");
		
		String searchXPath = AcceptanceSuite.props.getProperty("funfactssearchButton");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("funfactssearchClick");
		
		//Thread.sleep(1000);
		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(), searchXPath, searchButtonXPath);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		
		if (!action.equalsIgnoreCase("No Match")){
			//Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("finalDelete")))).click();
		}
	}
	
	
	
	public void Header() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(5000);
		EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprices"))));
		EnterpricesElem.click();
	
		//Thread.sleep(1000);
		FleetsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FunFacts"))));
		FleetsElem.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FunFactsBanner"))));
		FleetsAddElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("funfactsAdd"))));
		//this.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
		FleetsAddElem.click();
	
		}
		
	
	public void Validations(String firstname,String lastname) throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
	
		if(!firstname.isEmpty()){
        Select Enterprice = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("funfactsEnterprise")))));
		
		Enterprice.selectByVisibleText(firstname);
		}
		//Thread.sleep(2000);
		FunfactsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("funfactsName"))));
		FunfactsElem.sendKeys(Keys.CONTROL, "a");
		FunfactsElem.sendKeys(Keys.DELETE);
		if(!lastname.isEmpty()){
		
		
		FunfactsElem.sendKeys(lastname);
		}
		
//		Select parentfleetType = new Select(
//				this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("ParentFleet"))));
//		parentfleetType.selectByVisibleText(AcceptanceSuite.props.getProperty("ParentFleetdata"));
		 
		 Thread.sleep(4000);
		
		fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("funfactsSubmitButton"))));
		fleetSubmitbuttonElem.click();
	}
	
	public void ValidationsEdit(String funfacts) throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
	
		
		Thread.sleep(2000);
		FunfactsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("funfactsName"))));
		FunfactsElem.sendKeys(Keys.CONTROL, "a");
		FunfactsElem.sendKeys(Keys.DELETE);
		
		
//		Select parentfleetType = new Select(
//				this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("ParentFleet"))));
//		parentfleetType.selectByVisibleText(AcceptanceSuite.props.getProperty("ParentFleetdata"));
		 
		 Thread.sleep(4000);
		
		fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("funfactsEditSubmit"))));
		fleetSubmitbuttonElem.click();
	}
	
	public void funEditVaildations() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(3000);
		EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprices"))));
		EnterpricesElem.click();
		//Thread.sleep(2000);
		FleetsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FunFacts"))));
		FleetsElem.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FunFactsBanner"))));
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("funfactsEdit");
		String valuesString = AcceptanceSuite.props.getProperty("funfactsteditValue");

		for (int i = 0; i < xpathsString.split(",").length; i++) {

			xpaths.add(xpathsString.split(",")[i]);
			System.out.println("lllllllllll" + xpaths);
			values.add(valuesString.split(",")[i]);
			System.out.println("lllllllllll" + values);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("funfactsEditButton");
		String nextPageXPath = AcceptanceSuite.props.getProperty("funfactsNextButton");

		String searchXPath = AcceptanceSuite.props.getProperty("funfactssearchButton");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("funfactssearchClick");

		//Thread.sleep(2000);
		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		//Thread.sleep(2000);
		
		
		
		

		
	}
	public void funfactsAdvanceddata() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		

		//Thread.sleep(1000);
		EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprices"))));
		EnterpricesElem.click();

		//Thread.sleep(1000);
		FleetsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FunFacts"))));
		FleetsElem.click();

		//Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FunFactsBanner"))));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetBanner"))));
		FleetsAdvanceButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetAdvancedSearch"))));
		FleetsAdvanceButtonElem.click();
		
		CalenderElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("funfactsStartdate"))));

		
		Thread.sleep(6000);
		CalenderElem.click();

		//Thread.sleep(2000);
		monthElm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("funfactsStartMonthXpath"))));
		yearelm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("funfactsStartYearXpath"))));
		// columnelm =
		// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("columnsXPath")));
		minituesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("funfactsStartMiniutesXpath"))));

		nextbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("funfactsnextXpath"))));
		timenelm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("funfactsTimeXpath"))));
		HoursElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("funfactsHoursXpath"))));
		// List<WebElement> columns =
		// this.getDriver().findElements(By.xpath(AcceptanceSuite.props.getProperty("columnsXPath")));
		String userDate = AcceptanceSuite.props.getProperty("fleerReservationstartdateuser");
		String column = AcceptanceSuite.props.getProperty("funfactsStartColumnXpathdate");
		Thread.sleep(1000);

		getUserDate(this.getDriver(), userDate, CalenderElem, monthElm, yearelm, column, nextbuttonElem, timenelm,
				HoursElem, minituesElem);
		
		Thread.sleep(2000);
		closeCalenderElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("funfactsEnddate"))));
		
		closeCalenderElem.click();
		//Thread.sleep(2000);

		closemonthElm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("funfactsEndMonthXpath"))));
		closeyearelm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("funfactsEndYearXpath"))));
		// columnelm =
		// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("columnsXPath")));
		closeminituesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("funfactsEndMiniutesXpath"))));

		closenextbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("funfactsEndnextXpath"))));
		closetimenelm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("funfactsEndTimeXpath"))));
		closeHoursElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("funfactsEndHoursXpath"))));
		// WebElement sring =
		// driver.findElement(By.xpath("html/body/app-dashboard/div[2]/main/div/ng-component/app-events-popup/div/div/div/div[2]/div/div[10]/p-calendar/span/input"));

		 String closeuserDate =
		 AcceptanceSuite.props.getProperty("fleerReservationEnddateuser");
		String closecolumn = AcceptanceSuite.props.getProperty("funfactsEndColumnXpathdate");
		
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
	
}
