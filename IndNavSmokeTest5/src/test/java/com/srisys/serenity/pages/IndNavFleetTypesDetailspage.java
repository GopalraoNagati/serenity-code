package com.srisys.serenity.pages;

import java.awt.AWTException;
import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.srisys.serenity.AcceptanceSuite;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class IndNavFleetTypesDetailspage extends PageObject {

	WebElement EnterpriceElem;
	WebElement EnterpricesElem;
	WebElement FleetsElem;
	WebElement FunfactsElem;
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

	WebElement closeCalenderElem;
	WebElement closeHoursElem;
	WebElement closeminituesElem;
	WebElement closenextbuttonElem;
	WebElement closemonthElm;
	WebElement closeyearelm;
	WebElement closecolumnelm;
	WebElement closetimenelm;
	WebElement staticElem;
	WebElement FleetTypesElem;
	WebElement FleetTypesAddElem;
	WebElement DisplayColorElem;
	WebElement DisplayIconElem;

	public void FleetTypesCreation() throws InterruptedException, AWTException {
		WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);

		EnterpricesElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprices"))));
		EnterpricesElem.click();

		FleetsElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypes"))));
		FleetsElem.click();
        wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypesBanner"))));
		FleetsAddElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypesAdd"))));
		FleetsAddElem.click();
		
		Thread.sleep(2000);
		Select Enterprice = new Select(wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypesEnterprise")))));

		Enterprice.selectByVisibleText(AcceptanceSuite.props.getProperty("FleetTypesEnterpriseData"));

		Thread.sleep(2000);
		FunfactsElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypesId"))));

		FunfactsElem.sendKeys(AcceptanceSuite.props.getProperty("FleetTypesData"));
		Select parentfleetType = new Select(wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("DisplayColour")))));
		parentfleetType.selectByVisibleText(AcceptanceSuite.props.getProperty("DisplayColourData"));
        Select PaymentType = new Select(wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("DisplayIcon")))));
		PaymentType.selectByVisibleText(AcceptanceSuite.props.getProperty("DisplayIconData"));
		fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(AcceptanceSuite.props.getProperty("FleetTypesSettingsaccordianclick"))));
		fleetSubmitbuttonElem.click();

		Select Image = new Select(wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AvailableFleetcolour")))));
		Image.selectByVisibleText(AcceptanceSuite.props.getProperty("AvailableFleetcolourData"));

		Select Image1 = new Select(wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ReserverFleetcolour")))));
		Image1.selectByVisibleText(AcceptanceSuite.props.getProperty("ReserverFleetcolourData"));

		Select Image2 = new Select(wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("NonTrasctable")))));
		Image2.selectByVisibleText(AcceptanceSuite.props.getProperty("NonTrasctableData"));

		Select Image3 = new Select(wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("CheckInFleetcolour")))));
		Image3.selectByVisibleText(AcceptanceSuite.props.getProperty("CheckInFleetcolourData"));

		Thread.sleep(2000);
		staticElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("SubmitButton"))));
		staticElem.click();

	}
public void FleetTypesEdit() throws InterruptedException {
		
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		
        
    	  WebElement adminElem;
		  adminElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprices"))));
		  adminElem.click();
		
		
		   WebElement advsElem;
		    advsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypes"))));
		    advsElem.click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypesBanner"))));
			ArrayList<String> xpaths = new ArrayList<String>();
			ArrayList<String> values = new ArrayList<String>();

			String xpathsString = AcceptanceSuite.props.getProperty("FleetTypeDeleteXpath");
			String valuesString = AcceptanceSuite.props.getProperty("FleetTypeDeleteValue");

			for (int i = 0; i < xpathsString.split(",").length; i++) {

				xpaths.add(xpathsString.split(",")[i]);
				//System.out.println("lllllllllll" + xpaths);
				values.add(valuesString.split(",")[i]);
				//System.out.println("lllllllllll" + values);
			}

			String actionXPath = AcceptanceSuite.props.getProperty("FleetTypeEditRecord");
			String nextPageXPath = AcceptanceSuite.props.getProperty("FleetTypepagenext");

			String searchXPath = AcceptanceSuite.props.getProperty("FleetTypesearchbutton");
			String searchButtonXPath = AcceptanceSuite.props.getProperty("FleetTypesearchclick");

			//Thread.sleep(2000);
			String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
					searchXPath, searchButtonXPath);
			System.out.println("action============" + action);
		    Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
			 Thread.sleep(1000);
			WebElement Question1;
			Question1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleeTypeEditSubmit"))));
			Question1.click();

		
	}
public void FleetTypesView() throws InterruptedException {
	
	WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
	
    
	  WebElement adminElem;
	  adminElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprices"))));
	  adminElem.click();
	
	
	   WebElement advsElem;
	    advsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypes"))));
	    advsElem.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypesBanner"))));
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("FleetTypeDeleteXpath");
		String valuesString = AcceptanceSuite.props.getProperty("FleetTypeDeleteValue");

		for (int i = 0; i < xpathsString.split(",").length; i++) {

			xpaths.add(xpathsString.split(",")[i]);
			//System.out.println("lllllllllll" + xpaths);
			values.add(valuesString.split(",")[i]);
			//System.out.println("lllllllllll" + values);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("FleetTypeViewRecord");
		String nextPageXPath = AcceptanceSuite.props.getProperty("FleetTypepagenext");

		String searchXPath = AcceptanceSuite.props.getProperty("FleetTypesearchbutton");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("FleetTypesearchclick");

		//Thread.sleep(2000);
		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);
		System.out.println("action============" + action);
	    Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		 Thread.sleep(1000);
		WebElement Question1;
		Question1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeViewClose"))));
		Question1.click();

	
}

public void FleetTypesDelete() throws InterruptedException {
		
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		
        
    	  WebElement adminElem;
		  adminElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprices"))));
		  adminElem.click();
		
		
		   WebElement advsElem;
		    advsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypes"))));
		    advsElem.click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypesBanner"))));
			ArrayList<String> xpaths = new ArrayList<String>();
			ArrayList<String> values = new ArrayList<String>();

			String xpathsString = AcceptanceSuite.props.getProperty("FleetTypeDeleteXpath");
			String valuesString = AcceptanceSuite.props.getProperty("FleetTypeDeleteValue");

			for (int i = 0; i < xpathsString.split(",").length; i++) {

				xpaths.add(xpathsString.split(",")[i]);
				System.out.println("lllllllllll" + xpaths);
				values.add(valuesString.split(",")[i]);
				System.out.println("lllllllllll" + values);
			}

			String actionXPath = AcceptanceSuite.props.getProperty("FleetTypeDeleteRecord");
			String nextPageXPath = AcceptanceSuite.props.getProperty("FleetTypepagenext");

			String searchXPath = AcceptanceSuite.props.getProperty("FleetTypesearchbutton");
			String searchButtonXPath = AcceptanceSuite.props.getProperty("FleetTypesearchclick");

			//Thread.sleep(2000);
			String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
					searchXPath, searchButtonXPath);
			System.out.println("action============" + action);
		    Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
			 Thread.sleep(500);
			WebElement Question1;
			Question1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypefinalDeletebutton"))));
			Question1.click();
}

public void FleetTypesAdvance() throws InterruptedException {

	WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);

	WebElement adminElem;
	adminElem = wait.until(ExpectedConditions
			.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprices"))));
	adminElem.click();

	WebElement advsElem;
	advsElem = wait.until(ExpectedConditions
			.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypes"))));
	advsElem.click();

	wait.until(ExpectedConditions
			.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypesBanner"))));

	WebElement fleetTypeAdvanceButton = wait.until(ExpectedConditions
			.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAdvanceButton"))));
	fleetTypeAdvanceButton.click();

	WebElement EnterprisesAdvancedEnterpriseElem = wait.until(ExpectedConditions
			.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeEnterpriseAdvnce"))));
	EnterprisesAdvancedEnterpriseElem.sendKeys(AcceptanceSuite.props.getProperty("FleetTypeEnterpriseAdvanceData"));
	Thread.sleep(1000);

	WebElement EnterprisesAdvancedSubmitBtnElem = wait.until(ExpectedConditions.visibilityOfElementLocated(
			By.xpath(AcceptanceSuite.props.getProperty("FleeetTypeAdvancesubmitButton"))));
	EnterprisesAdvancedSubmitBtnElem.click();

}


//Validations





  public void fleetTypesnegativeCreate() throws InterruptedException{


	  WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
	  EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprices"))));
	  EnterpricesElem.click();

	  //Thread.sleep(1000);
	  FleetTypesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypes"))));
	  FleetTypesElem.click();

	  Thread.sleep(1000);
	  
	  //this.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypesBanner"))));
	  FleetTypesAddElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypesAdd"))));
	        FleetTypesAddElem.click();
	  
	  Thread.sleep(2000);
	  /*fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Submitbutton"))));
	  fleetSubmitbuttonElem.click();*/
	 }
	// DisplayColor, DisplayIcon, AvailableFleetColor, ReserverdFleetColor, NonTransactableFleetColor, CheckInFleetColor 
	 public void FleetTypesNegativeCases(String Enterprise, String FleetType, String DisplayColor, String DisplayIcon,
	   String AvailableFleetColor, String ReservedFleetColor, String NonTransactableFleetColor, String ChekedInFleetColor) throws InterruptedException{
	  
	  System.out.println("=========="+DisplayIcon+"kkkkkkkkkkkk"+DisplayIcon);
	  WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);

	  
	  //System.out.println("-------"+EnterpriceResourcesElem+"22222222222"+EnterpriceResourcesElem);
	  if(!Enterprise.isEmpty()){
	  Select Enterprice = new
	   Select( wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypesEnterprise")))));
	   Enterprice.selectByVisibleText(Enterprise);
	  }
	   if(!FleetType.isEmpty()){
	  /*Select Resource = new Select(
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypesId")))));
	  Resource.selectByVisibleText(FleetType);*/
	    Thread.sleep(2000);
	    FleetTypesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypesId"))));
	  FleetTypesElem.clear();
	  FleetTypesElem.sendKeys(Keys.CONTROL, "a");
	  FleetTypesElem.sendKeys(Keys.DELETE);
	  FleetTypesElem.sendKeys(FleetType);
	   }
	   if(!DisplayColor.isEmpty()){
	    Thread.sleep(2000);
	    
	  Select DisplayColorElem = new Select(
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("DisplayColour")))));
	  DisplayColorElem.selectByVisibleText(DisplayColor);
	   }
	   
	 //  System.out.println("wwwwwwwwwwwwww============"+MobileNumber);
	   if(!DisplayIcon.isEmpty()){
	    Thread.sleep(2000);
	   Select DisplayIconElem = new Select(
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("DisplayIcon")))));
	   DisplayIconElem.selectByVisibleText(DisplayIcon);    
	     }
	  WebElement fleetTypesSettingsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypesSettingsaccordianclick"))));
	   fleetTypesSettingsElem.click();
	   Thread.sleep(1000);

	  // System.out.println("wwwwwwwwwwwwww"+MobileNumber+"8888888888"+MobileNumber);
	  // System.out.println("lllllllllllllllll"+Email);
	   if(!AvailableFleetColor.isEmpty()){
	    Thread.sleep(1000);
	  //  System.out.println("llllllllllllllll=======================l"+Email);
	    
	    Select AvailableFleetColor1 = new
	      Select( wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AvailableFleetcolour")))));
	    AvailableFleetColor1.selectByVisibleText(AvailableFleetColor);
	     }
	  
	   if(!ReservedFleetColor.isEmpty()){
	    Thread.sleep(1000);
	    Select ReservedFleetColor1 = new
	      Select( wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ReserverFleetcolour")))));
	    ReservedFleetColor1.selectByVisibleText(ReservedFleetColor);
	    
	     }
	   if(!NonTransactableFleetColor.isEmpty()){
	    
	    Select NonTransactableFleetColor1 = new
	      Select( wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("NonTrasctable")))));
	    NonTransactableFleetColor1.selectByVisibleText(NonTransactableFleetColor);
	     }
	   
	   if(!ChekedInFleetColor.isEmpty()){
	    Select CheckInFleetColor1 = new
	      Select( wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("CheckInFleetcolour")))));
	    CheckInFleetColor1.selectByVisibleText(ChekedInFleetColor);
	     }
	   WebElement submitButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("SubmitButton"))));
	   submitButtonElem.click();
	 }
	public void FleetTypesDeleteNegative() throws InterruptedException {
	  
	  WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
	  
	        
	       WebElement adminElem;
	    adminElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprices"))));
	    adminElem.click();
	  
	  
	     WebElement advsElem;
	      advsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypes"))));
	      advsElem.click();
	   
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypesBanner"))));
	   ArrayList xpaths = new ArrayList();
	   ArrayList values = new ArrayList();

	   String xpathsString = AcceptanceSuite.props.getProperty("FleetTypeDeleteXpath");
	   String valuesString = AcceptanceSuite.props.getProperty("FleetTypeDeleteValue");

	   for (int i = 0; i < xpathsString.split(",").length; i++) {

	    xpaths.add(xpathsString.split(",")[i]);
	    System.out.println("lllllllllll" + xpaths);
	    values.add(valuesString.split(",")[i]);
	    System.out.println("lllllllllll" + values);
	   }

	   String actionXPath = AcceptanceSuite.props.getProperty("FleetTypeDeleteRecord");
	   String nextPageXPath = AcceptanceSuite.props.getProperty("FleetTypepagenext");

	   String searchXPath = AcceptanceSuite.props.getProperty("FleetTypesearchbutton");
	   String searchButtonXPath = AcceptanceSuite.props.getProperty("FleetTypesearchclick");

	   //Thread.sleep(2000);
	   String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
	     searchXPath, searchButtonXPath);
	   System.out.println("action============" + action);
	      Thread.sleep(2000);
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
	    Thread.sleep(500);
	   WebElement Question1;
	   Question1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypefinalDeletebutton"))));
	   Question1.click();

	  
	 }

}
