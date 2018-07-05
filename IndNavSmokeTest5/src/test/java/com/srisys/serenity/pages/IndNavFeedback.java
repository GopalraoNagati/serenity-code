package com.srisys.serenity.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.srisys.serenity.AcceptanceSuite;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class IndNavFeedback extends PageObject{
	
	
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
	WebElement loginButtonElem;
	WebElement usernameElem;
	WebElement passwordElem;
	WebElement submitButtonElem;
	
	public void clickOnLoginButton() throws InterruptedException{
		usernameElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("loginuserName")));
		passwordElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("passWord")));
		loginButtonElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("loginButton")));
		usernameElem.sendKeys(AcceptanceSuite.props.getProperty("FeedbackuserNameValue"));
		passwordElem.sendKeys(AcceptanceSuite.props.getProperty("passwordValue"));
		loginButtonElem.click();
	}
	
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
	
	
	public void feedBackcreate() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);

		//Thread.sleep(1000);
		EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Feedbacklink"))));
		
		EnterpricesElem.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleedbackBanner"))));

		//Thread.sleep(1000);
		FleetsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FeedbackCreate"))));
		FleetsElem.click();

		//Thread.sleep(1000);
		
		
		//Thread.sleep(2000);
		Select Enterprice = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FeedbackType")))));
		
		Enterprice.selectByVisibleText(AcceptanceSuite.props.getProperty("FeedbakTypeData"));
		Thread.sleep(1000);
		
        Select Enterprices = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ObjectType")))));		
		Enterprices.selectByVisibleText(AcceptanceSuite.props.getProperty("ObjectTypeData"));
		
		Thread.sleep(1000);
		
        Select Enterpriceses = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ObjectName")))));		
		Enterpriceses.selectByVisibleText(AcceptanceSuite.props.getProperty("ObjectNameData"));
		//Thread.sleep(2000);
	

		FunfactsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Feedbaknote"))));

		FunfactsElem.sendKeys(AcceptanceSuite.props.getProperty("FeedbaknoteData"));
		

		
		fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Feedbacksubmit"))));
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
	
	public void feedbackView() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleedbackBanner"))));
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("Feedbackviewxpath");
		String valuesString = AcceptanceSuite.props.getProperty("FeedbackviewData");

		for (int i = 0; i < xpathsString.split(",").length; i++) {

			xpaths.add(xpathsString.split(",")[i]);
			System.out.println("lllllllllll" + xpaths);
			values.add(valuesString.split(",")[i]);
			System.out.println("lllllllllll" + values);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("FeedbackViewButton");
		String nextPageXPath = AcceptanceSuite.props.getProperty("Feedbackpagenextbutton");

		String searchXPath = AcceptanceSuite.props.getProperty("Feebacksearchbutton");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("Feedbacksearchbuttonclick");

		//Thread.sleep(2000);
		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		//Thread.sleep(2000);
		
		
		
		fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Feedbackviewclose"))));
		fleetSubmitbuttonElem.click();
		
		

		
	}
	public void feedbackDelete() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleedbackBanner"))));
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("Feedbackviewxpath");
		String valuesString = AcceptanceSuite.props.getProperty("FeedbackviewData");

		for (int i = 0; i < xpathsString.split(",").length; i++) {

			xpaths.add(xpathsString.split(",")[i]);
			System.out.println("lllllllllll" + xpaths);
			values.add(valuesString.split(",")[i]);
			System.out.println("lllllllllll" + values);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("FeedbackDeleterecord");
		String nextPageXPath = AcceptanceSuite.props.getProperty("Feedbackpagenextbutton");

		String searchXPath = AcceptanceSuite.props.getProperty("Feebacksearchbutton");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("Feedbacksearchbuttonclick");

		//Thread.sleep(2000);
		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		//Thread.sleep(2000);
		
		
		
		fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Feedbackfinadelete"))));
		fleetSubmitbuttonElem.click();
	
}
	
	public void feedbackAdvancesearch() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleedbackBanner"))));
		
		
		
		
		WebElement uieditElem;
		uieditElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("feedbackadvancesearh"))));
		uieditElem.click();
		
		  WebElement SearchElm;
	        SearchElm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("feedbackobjectadvancesearch"))));
	        SearchElm.sendKeys(AcceptanceSuite.props.getProperty("feedbackobjectadvanceData"));
	        
	        WebElement searchsubmitElem;
	        searchsubmitElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("feedbackadvancesubmit"))));
	        searchsubmitElem.click();
		
	}
	
	public void clickOnLoginButton_EntAdmin() throws InterruptedException{
		usernameElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("loginuserName")));
		passwordElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("passWord")));
		loginButtonElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("loginButton")));
		usernameElem.sendKeys(AcceptanceSuite.props.getProperty("FeedbackEntAdminUsernameValue"));
		passwordElem.sendKeys(AcceptanceSuite.props.getProperty("FeedbackEntAdminPasswordValue"));
		loginButtonElem.click();
		
		
		
	}
	
	public void feedbackEdit()throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);

		//Thread.sleep(1000);
		EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Feedbacklink"))));
		
		EnterpricesElem.click();

		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleedbackBanner"))));
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("FeedbackEditxpath");
		String valuesString = AcceptanceSuite.props.getProperty("FeedbackEditData");

		for (int i = 0; i < xpathsString.split(",").length; i++) {

			xpaths.add(xpathsString.split(",")[i]);
			System.out.println("lllllllllll" + xpaths);
			values.add(valuesString.split(",")[i]);
			System.out.println("lllllllllll" + values);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("FeedbackEditrecord");
		String nextPageXPath = AcceptanceSuite.props.getProperty("Feedbackpagenextbutton");

		String searchXPath = AcceptanceSuite.props.getProperty("Feebacksearchbutton");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("Feedbacksearchbuttonclick");

		//Thread.sleep(2000);
		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		//Thread.sleep(2000);
		
		WebElement FeedbackActionTakenElement =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FeedbackActionTaken"))));
		FeedbackActionTakenElement.sendKeys(AcceptanceSuite.props.getProperty("FeedbackActionTakenValue"));
		
		fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FeedbackSaveButton"))));
		fleetSubmitbuttonElem.click();
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	// Create Feeback Validation Check Start
	Properties prop;
	public void ClickonCreateFeedbackButtoinFeedbackPage() {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);

		//Thread.sleep(1000);
		EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Feedbacklink"))));
		
		EnterpricesElem.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleedbackBanner"))));

		//Thread.sleep(1000);
		FleetsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FeedbackCreate"))));
		FleetsElem.click();

	}
	
	public void Create_Feedback_Page_ValidationCheck(String FeedbackType, String ObjectType, String ObjectName, String FeedbackDescription) throws FileNotFoundException, IOException, InterruptedException {
		prop = new Properties();
		prop.load(new FileInputStream("serenity.properties"));
		if(!FeedbackType.isEmpty()) {
			Select select1 = new Select(this.getDriver().findElement(By.xpath(prop.getProperty("FeedbackType"))));
			select1.selectByVisibleText(FeedbackType);
		}
		if(!ObjectType.isEmpty()) {
			Select select2 = new Select(this.getDriver().findElement(By.xpath(prop.getProperty("ObjectType"))));
			select2.selectByVisibleText(ObjectType);
		}
		if(!ObjectName.isEmpty()) {
			Select select2 = new Select(this.getDriver().findElement(By.xpath(prop.getProperty("ObjectName"))));
			select2.selectByVisibleText(ObjectName);
		}
		
		WebElement FeedbackDescriptionElem = null;
		if(!FeedbackDescription.isEmpty()) {
			
			FeedbackDescriptionElem = this.getDriver().findElement(By.xpath(prop.getProperty("Feedbaknote")));
			FeedbackDescriptionElem.clear();
			FeedbackDescriptionElem.sendKeys(FeedbackDescription);
		}else {
			FeedbackDescriptionElem = this.getDriver().findElement(By.xpath(prop.getProperty("Feedbaknote")));
			FeedbackDescriptionElem.clear();	
		}
		
		WebElement FeedbacksubmitElem;
		Thread.sleep(1000);
		FeedbacksubmitElem = this.getDriver().findElement(By.xpath(prop.getProperty("Feedbacksubmit")));
		FeedbacksubmitElem.click();
	}
//	Create Feedback Validation Check End

//	Edit Feedback Validation Check Start

	public void CLickonFeedbackPageLink() {
		
		WebDriverWait wait = new WebDriverWait(this.getDriver(),20);
		EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Feedbacklink"))));
		
		EnterpricesElem.click();

	}
	public void EditFeedbackValidationCheck() {
	
		WebElement FirstFeedbackRecordEditButtonElem;
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);

		FirstFeedbackRecordEditButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FirstFeedbackRecordEditButton"))));		
		FirstFeedbackRecordEditButtonElem.click();
		
	}
	
		
	public void VerifyFeedbackValidationCheck() throws InterruptedException, FileNotFoundException, IOException {
		Thread.sleep(1000);
		prop = new Properties();
		prop.load(new FileInputStream("serenity.properties"));
		
		String ActualvalidationMessage = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("FeedbackEditActualValidationMessagePath"))).getText();
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$"+ActualvalidationMessage);
	   String ExpectedValidation=prop.getProperty("FeedbackEditExpectedErrorMessage");
		System.out.println("###############################"+ExpectedValidation);
		Assert.assertTrue(ActualvalidationMessage.equalsIgnoreCase(ExpectedValidation));

	}
	
	public void ClickOnFeedbackEditButton() {
		WebElement EditFeedbackSubmitButton;
		WebDriverWait wait = new WebDriverWait(this.getDriver(),20);
		
		EditFeedbackSubmitButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Feedbacksubmit"))));
		EditFeedbackSubmitButton.click();
	}
	//	Edit Feedback Validation Check End
}
