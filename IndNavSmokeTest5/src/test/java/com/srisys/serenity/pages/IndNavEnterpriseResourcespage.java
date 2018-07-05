package com.srisys.serenity.pages;

import java.util.ArrayList;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.srisys.serenity.AcceptanceSuite;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class IndNavEnterpriseResourcespage extends PageObject{
	WebDriver driver;
	
	WebElement submitButtonElem;
	WebElement EnterpriceElem;
	WebElement EnterpricesElem;
	WebElement EnterpriceResourcesElem;
	WebElement EnterpriceResourcesAddElem;
	WebElement FnameElem;
	WebElement LnameElem;
	WebElement DesignationElem;
	WebElement mobilenumberElem;
	WebElement contactDetailsElem;
	WebElement addressDetailsElem;
	WebElement emailElem;
	WebElement addressLine1Elem;
	WebElement cityElem;
	WebElement zipElem;
	WebElement LattitudeElem;
	WebElement LongitudeElem;
	WebElement SubmitbuttonElem;
    WebElement FleetAdvanceElem;
	WebElement FleetsAdvanceSubmitElem;
	WebElement FleetsAdvanceButtonElem;
	WebElement DepartmentElem;
	WebElement GenderElem;
	public void EnterpriseResourcesAdvanceSearch() throws InterruptedException{
			WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);

			Thread.sleep(1000);
			EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResources_EnterpriseHeader"))));
			EnterpricesElem.click();
		
			EnterpriceResourcesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResources_EnterpriseResourcesLink"))));
			EnterpriceResourcesElem.click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesBanner"))));
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetBanner"))));
			FleetsAdvanceButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprsesAdvancedsearch"))));
			FleetsAdvanceButtonElem.click();
			
			WebElementFacade banner;
			//System.out.println("Banner Displayed="+this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesBanner"))).isEnabled());
			FleetAdvanceElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprisesearch"))));

			FleetAdvanceElem.sendKeys(AcceptanceSuite.props.getProperty("EnterprisesearchData"));
			Thread.sleep(2000);
			FleetsAdvanceSubmitElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistrationsubmitButton"))));
			FleetsAdvanceSubmitElem.click();
			Thread.sleep(500);
			
			Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesBanner")))).isEnabled());
			//System.out.println("Banner Displayed="+wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesBanner")))).getText());
		}
	
	public void enter_firstname_lastname_username__email_password_confirmpassword_mobilenumber(String Enterprise, String ResourceType, String FirstName, String LastName,String Designation,
			String Department, String Gender, String MobileNumber,String EMailID, String AddressLine1, String City, String Country,String State,
			String ZIPCode, String Latitude, String Longitude) throws InterruptedException{
		//log("Enterprise="+Enterprise);
		//log("AddressLine="+AddressLine1);
		
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);

		EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResources_EnterpriseHeader"))));
		EnterpricesElem.click();
	
		EnterpriceResourcesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResources_EnterpriseResourcesLink"))));
		EnterpriceResourcesElem.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesBanner"))));
		EnterpriceResourcesAddElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_AddButton"))));
		EnterpriceResourcesAddElem.click();
		
		Select Enterprice = new
		 Select( wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_Enterprise")))));
		 Enterprice.selectByVisibleText(Enterprise);
		 
		Select Resource = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_ResourceType")))));
		Resource.selectByVisibleText(ResourceType);
			
		FnameElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_FirstName"))));
		FnameElem.sendKeys(FirstName);
		
		LnameElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_LastName"))));
		LnameElem.sendKeys(LastName);

		DesignationElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_Designation"))));
		DesignationElem.sendKeys(Designation);

		Select Departments = new Select(
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_Department")))));
		Departments.selectByVisibleText(Department);

		Select gender = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_Gender")))));
		gender.selectByVisibleText(Gender);

		contactDetailsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_ContactDetailsTab"))));
		contactDetailsElem.click();
		
		mobilenumberElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_MobileId"))));
		mobilenumberElem.sendKeys(MobileNumber);

		emailElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_Email"))));
		emailElem.clear();
		emailElem.sendKeys(EMailID);
		
		addressDetailsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_AddressDetailsTab"))));
		addressDetailsElem.click();
		
		addressLine1Elem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_AddressLine1"))));
		addressLine1Elem.clear();
		addressLine1Elem.sendKeys(AddressLine1);

		cityElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_City"))));
		cityElem.clear();
		cityElem.sendKeys(City);
		Thread.sleep(4000);
		Select country = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_Country")))));
		country.selectByVisibleText(Country);
		
		Thread.sleep(4000);
		Select state = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_StateId")))));
		state.selectByVisibleText(State);

		zipElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_Zip"))));
		zipElem.clear();
		zipElem.sendKeys(ZIPCode);
		
		LattitudeElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_Latitude"))));
		LattitudeElem.clear();
		LattitudeElem.sendKeys(Latitude);
		
		LongitudeElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_Longitude"))));
		LongitudeElem.clear();
		LongitudeElem.sendKeys(Longitude);
		
		SubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_Submit"))));
		SubmitbuttonElem.click();
		
		try{
			this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesaddClose"))).click();
		} catch (Exception Ex){
			Ex.printStackTrace();
		}
	}
	

	public void enterpriseResourcesEdit() throws InterruptedException{		
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResources_EnterpriseHeader"))));
		EnterpricesElem.click();
	
		EnterpriceResourcesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResources_EnterpriseResourcesLink"))));
		EnterpriceResourcesElem.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesBanner"))));
		
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();
		
		String xpathsString = AcceptanceSuite.props.getProperty("EnterpriseResourcesEdit_EditXPaths");
		String valuesString = AcceptanceSuite.props.getProperty("EnterpriseResourcesEdit_EditValues");
		
		log("xpathstr="+xpathsString);
		
		for (int i=0; i<xpathsString.split(",").length; i++){
			xpaths.add(xpathsString.split(",")[i]);
			values.add(valuesString.split(",")[i]);
		}
		
		String actionXPath = AcceptanceSuite.props.getProperty("EnterpriseResourcesEdit_EditActionXPath");
		String nextPageXPath = AcceptanceSuite.props.getProperty("EnterpriseResourcesEdit_NextPagePath");
		
		String searchXPath = AcceptanceSuite.props.getProperty("EnterpriseResourcesEdit_SearchXPath");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("EnterpriseResourcesEdit_SearchButtonXPath");
		
		
		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(), searchXPath, searchButtonXPath);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath((action)))).click();
		
		WebElement EnterpriseResourceEditFirstNameElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourceEdit_FirstName"))));		
		EnterpriseResourceEditFirstNameElem.clear();
		Thread.sleep(500);
		EnterpriseResourceEditFirstNameElem.sendKeys(AcceptanceSuite.props.getProperty("EnterpriseResourceEdit_FirstNameValue"));
		ExpectedConditions.textToBePresentInElementValue(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourceEdit_FirstName")), AcceptanceSuite.props.getProperty("EnterpriseResourceEdit_FirstNameValue"));
		
		WebElement EnterpriseResourceEditLastNameElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourceEdit_LastName"))));		
		EnterpriseResourceEditLastNameElem.clear();
		EnterpriseResourceEditLastNameElem.sendKeys(AcceptanceSuite.props.getProperty("EnterpriseResourceEdit_LastNameValue"));
		ExpectedConditions.textToBePresentInElementValue(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourceEdit_LastName")), AcceptanceSuite.props.getProperty("EnterpriseResourceEdit_LastNameValue"));
		
		
		WebElement EnterpriseResourceSubmitButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourceEdit_SubmitButton"))));
		EnterpriseResourceSubmitButtonElem.click();
	}
	
	public void blockAndUnblock() throws InterruptedException{
	
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		
		EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResources_EnterpriseHeader"))));
		EnterpricesElem.click();
	
		EnterpriceResourcesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResources_EnterpriseResourcesLink"))));
		EnterpriceResourcesElem.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesBanner"))));
		
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();
		
		String xpathsString = AcceptanceSuite.props.getProperty("EnterpriseResourcesBlockUnblock_BlockXPaths");
		String valuesString = AcceptanceSuite.props.getProperty("EnterpriseResourcesBlockUnblock_BlockValues");
		
		for (int i=0; i<xpathsString.split(",").length; i++){
			xpaths.add(xpathsString.split(",")[i]);
			values.add(valuesString.split(",")[i]);
		}
		
		String actionXPath = AcceptanceSuite.props.getProperty("EnterpriseResourceBlockUnblock");
		String nextPageXPath = AcceptanceSuite.props.getProperty("EnterpriseResourcesNextPagePath");
		
		String searchXPath = AcceptanceSuite.props.getProperty("EnterpriseResourcesearchXPath");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("EnterpriseResourcesearchButtonXPath");
				
		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(), searchXPath, searchButtonXPath);
		this.getDriver().findElement(By.xpath(action)).click();
				
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourceBlockUnblockReason"))));
		Select blockUnblockReason = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourceBlockUnblockReason")))));
		blockUnblockReason.selectByVisibleText(AcceptanceSuite.props.getProperty("EnterpriseResourceBlockReasonValue"));
		
		WebElement EnterpriseResourceSubmitButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourceBlock_SubmitButton"))));
		EnterpriseResourceSubmitButtonElem.click();

		//This time for Unblock record
		action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(), searchXPath, searchButtonXPath);
		Thread.sleep(1000);
		this.getDriver().findElement(By.xpath(action)).click();
		
		
		blockUnblockReason = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourceBlockUnblockReason")))));
		blockUnblockReason.selectByVisibleText(AcceptanceSuite.props.getProperty("EnterpriseResourceUnblockReasonValue"));
		
		EnterpriseResourceSubmitButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourceBlock_SubmitButton"))));
		EnterpriseResourceSubmitButtonElem.click();
	}
	
	public void enterpriseResourcesDelete() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
				
		EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResources_EnterpriseHeader"))));
		EnterpricesElem.click();
	
		EnterpriceResourcesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResources_EnterpriseResourcesLink"))));
		EnterpriceResourcesElem.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesBanner"))));
		
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();
		
		String xpathsString = AcceptanceSuite.props.getProperty("EnterpriseResourcesDeleteXPaths");
		String valuesString = AcceptanceSuite.props.getProperty("EnterpriseResourcesDeleteValues");
		
		for (int i=0; i<xpathsString.split(",").length; i++){
			xpaths.add(xpathsString.split(",")[i]);
			values.add(valuesString.split(",")[i]);
		}
		
		String actionXPath = AcceptanceSuite.props.getProperty("EnterpriseResourcesDeleteActionXPath");
		String nextPageXPath = AcceptanceSuite.props.getProperty("EnterpriseResourcesNextPagePath");
		
		String searchXPath = AcceptanceSuite.props.getProperty("EnterpriseResourcesearchXPath");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("EnterpriseResourcesearchButtonXPath");
		

		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(), searchXPath, searchButtonXPath);
		this.getDriver().findElement(By.xpath(action)).click();
		
		if (!action.equalsIgnoreCase("No Match")){
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesFinalDeleteXPath")))).click();
		}
	}
	
	public void log(String message){
		System.out.println(message);
	}
	
	public void enterpriseResourcesView() throws InterruptedException{		
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		Thread.sleep(2000);
		EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResources_EnterpriseHeader"))));
		EnterpricesElem.click();
	
		EnterpriceResourcesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResources_EnterpriseResourcesLink"))));
		EnterpriceResourcesElem.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesBanner"))));
		
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();
		
		String xpathsString = AcceptanceSuite.props.getProperty("EnterpriseResourcesEdit_EditXPaths");
		String valuesString = AcceptanceSuite.props.getProperty("EnterpriseResourcesEdit_EditValues");
		
		log("xpathstr="+xpathsString);
		
		for (int i=0; i<xpathsString.split(",").length; i++){
			xpaths.add(xpathsString.split(",")[i]);
			values.add(valuesString.split(",")[i]);
		}
		
		String actionXPath = AcceptanceSuite.props.getProperty("EnterpriseresourcesViewButton");
		String nextPageXPath = AcceptanceSuite.props.getProperty("EnterpriseResourcesEdit_NextPagePath");
		
		String searchXPath = AcceptanceSuite.props.getProperty("EnterpriseResourcesEdit_SearchXPath");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("EnterpriseResourcesEdit_SearchButtonXPath");
		
		
		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(), searchXPath, searchButtonXPath);
		this.getDriver().findElement(By.xpath(action)).click();
		
		WebElement EnterpriceResourcesVieElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseresourcescloseButton"))));
		EnterpriceResourcesVieElem.click();
		
		
	}
	
	
	public void enterpriseResourcesMessage() throws InterruptedException{		
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResources_EnterpriseHeader"))));
		EnterpricesElem.click();
	
		EnterpriceResourcesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResources_EnterpriseResourcesLink"))));
		EnterpriceResourcesElem.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesBanner"))));
		
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();
		
		String xpathsString = AcceptanceSuite.props.getProperty("EnterpriseResourcesEdit_EditXPaths");
		String valuesString = AcceptanceSuite.props.getProperty("EnterpriseResourcesEdit_EditValues");
		
		log("xpathstr="+xpathsString);
		
		for (int i=0; i<xpathsString.split(",").length; i++){
			xpaths.add(xpathsString.split(",")[i]);
			values.add(valuesString.split(",")[i]);
		}
		
		String actionXPath = AcceptanceSuite.props.getProperty("EnterpriseMessage");
		String nextPageXPath = AcceptanceSuite.props.getProperty("EnterpriseResourcesEdit_NextPagePath");
		
		String searchXPath = AcceptanceSuite.props.getProperty("EnterpriseResourcesEdit_SearchXPath");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("EnterpriseResourcesEdit_SearchButtonXPath");
		
		
		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(), searchXPath, searchButtonXPath);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		Thread.sleep(6000);
		
		Select messageText = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseMessageText")))));
		messageText.selectByVisibleText(AcceptanceSuite.props.getProperty("EnterpriseMessageTextValue"));
		Thread.sleep(500);
		WebElement EnterpriseResourcemessageComment= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnteriseResourcesComment"))));		
		//EnterpriseResourceEditLastNameElem.clear();
		EnterpriseResourcemessageComment.sendKeys(AcceptanceSuite.props.getProperty("EnteriseResourcesCommentText"));
		Thread.sleep(500);
		WebElement EnterpriseResourcemessagesubmit= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnteriseResourcesmessageSubmibutton"))));		
		//EnterpriseResourceEditLastNameElem.clear();
		EnterpriseResourcemessagesubmit.click();
		
		
		
		
	}
	
	//Validations
	public void clickOnEnterpriseHeader() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResources_EnterpriseHeader"))));
		EnterpricesElem.click();
		//System.out.println("-------"+EnterpricesElem+"qqqqqqqqqqqqqqqqqqqqqq"+EnterpricesElem);
		EnterpriceResourcesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResources_EnterpriseResourcesLink"))));
		EnterpriceResourcesElem.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesBanner"))));
		EnterpriceElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_AddButton"))));
		EnterpriceElem.click();
	}
	
	 public void enterpriseResourcesNegativeCases(String Enterprise, String ResourceType, String FirstName, String LastName,String Designation,
			   String Department, String Gender, String MobileNumber,String Email, String Add1, String City, String Country, String State,
			   String ZIPCode, String Latitude, String Longitude) throws InterruptedException{
			  
			  //System.out.println("=========="+EMailId+"kkkkkkkkkkkk"+EMailId);
			  WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);

			  
			  //System.out.println("-------"+EnterpriceResourcesElem+"22222222222"+EnterpriceResourcesElem);
			  if(!Enterprise.isEmpty()){
			  Select Enterprice = new
			   Select( wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_Enterprise")))));
			   Enterprice.selectByVisibleText(Enterprise);
			  }
			   if(!ResourceType.isEmpty()){
			  Select Resource = new Select(
			    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_ResourceType")))));
			  Resource.selectByVisibleText(ResourceType);
			   }
			   if(!FirstName.isEmpty()){
			  FnameElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_FirstName"))));
			  FnameElem.clear();
			  FnameElem.sendKeys(FirstName);
			   }
			   if(!LastName.isEmpty()){
			    LnameElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_LastName"))));
			    LnameElem.clear();
			    LnameElem.sendKeys(LastName);
			     }
			   if(!Designation.isEmpty()){
			    DesignationElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_Designation"))));
			    DesignationElem.clear();
			    DesignationElem.sendKeys(FirstName);
			     }
			   if(!Department.isEmpty()){
			    DepartmentElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_Department"))));
			    DepartmentElem.sendKeys(Department);
			     }
			   if(!Gender.isEmpty()){
			    GenderElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_Gender"))));
			    GenderElem.sendKeys(Gender);
			     } 
			   
			 //  System.out.println("wwwwwwwwwwwwww============"+MobileNumber);
			   if(!MobileNumber.isEmpty()){
			    Thread.sleep(1000);
			 //   System.out.println("wwwwwwwwwwwwww"+MobileNumber);
			    contactDetailsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_ContactDetailsTab"))));
			    contactDetailsElem.click();
			   
			    mobilenumberElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_MobileId"))));
			    mobilenumberElem.clear();
			    mobilenumberElem.sendKeys(MobileNumber);
			    Thread.sleep(1000);
			    
			    Thread.sleep(5000);
			    
			     }
			   contactDetailsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_ContactDetailsTab"))));
			   contactDetailsElem.click();
			   emailElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_Email"))));
			   
			   emailElem.sendKeys(Keys.CONTROL, "a");
			   emailElem.sendKeys(Keys.DELETE);
			  // System.out.println("wwwwwwwwwwwwww"+MobileNumber+"8888888888"+MobileNumber);
			  // System.out.println("lllllllllllllllll"+Email);
			   if(!Email.isEmpty()){
			    Thread.sleep(1000);
			  //  System.out.println("llllllllllllllll=======================l"+Email);
			    
			    
			    contactDetailsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_ContactDetailsTab"))));
			    contactDetailsElem.click();
			    emailElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_Email"))));
			    //emailElem.clear();
			    emailElem.sendKeys(Email);
			    Thread.sleep(4000);
			    addressDetailsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_AddressDetailsTab"))));
			    addressDetailsElem.click();
			    Thread.sleep(1000);
			    addressLine1Elem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_AddressLine1"))));
			    addressLine1Elem.sendKeys(Keys.CONTROL, "a");
			    addressLine1Elem.sendKeys(Keys.DELETE);
			    
			     }
			  
			   if(!Add1.isEmpty()){
			    Thread.sleep(1000);

			    
			    addressLine1Elem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_AddressLine1"))));
			    addressLine1Elem.clear();
			    addressLine1Elem.sendKeys(Add1);
			    cityElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_City"))));
			    cityElem.sendKeys(Keys.CONTROL, "a");
			    cityElem.sendKeys(Keys.DELETE);
			     }
			   if(!City.isEmpty()){
			    cityElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_City"))));
			    cityElem.clear();
			    cityElem.sendKeys(City);
			    zipElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_Zip"))));
			    zipElem.sendKeys(Keys.CONTROL, "a");
			    zipElem.sendKeys(Keys.DELETE);
			     }
			   if(!Country.isEmpty()){
			   // countryElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_Country"))));
			   // countryElem.sendKeys(Country);
			    Select country = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_Country")))));
			    country.selectByVisibleText(Country);
			     }
			   if(!State.isEmpty()){
			   // stateElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_State"))));
			   // stateElem.sendKeys(State);
			    Select state = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_StateId")))));
			    state.selectByVisibleText(State);
			     }
			   if(!ZIPCode.isEmpty()){
			    zipElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_Zip"))));
			    zipElem.clear();
			    zipElem.sendKeys(ZIPCode);
			    LattitudeElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_Latitude"))));

			    LattitudeElem.sendKeys(Keys.CONTROL, "a");
			    LattitudeElem.sendKeys(Keys.DELETE);
			     }
			   if(!Latitude.isEmpty()){
			    LattitudeElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_Latitude"))));
			    LattitudeElem.clear();
			    LattitudeElem.sendKeys(Latitude);
			    LongitudeElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_Longitude"))));
			    LongitudeElem.sendKeys(Keys.CONTROL, "a");
			    LongitudeElem.sendKeys(Keys.DELETE);
			     }
			   if(!Longitude.isEmpty()){
			    LongitudeElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_Longitude"))));
			    LongitudeElem.clear();
			    LongitudeElem.sendKeys(Longitude);
			     }

			  SubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_Submit"))));
			  SubmitbuttonElem.click();
		
			 }
	 
	 public void clickOnEnterpriseEdtHeader() throws InterruptedException{
			WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResources_EnterpriseHeader"))));
		EnterpricesElem.click();

		EnterpriceResourcesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResources_EnterpriseResourcesLink"))));
		EnterpriceResourcesElem.click();
		}
		public void clickOnEnterpriseResourcesEdit() throws InterruptedException{
			WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
			
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesBanner"))));
			
			ArrayList<String> xpaths = new ArrayList<String>();
			ArrayList<String> values = new ArrayList<String>();
			
			String xpathsString = AcceptanceSuite.props.getProperty("EnterpriseResourcesEdit_EditXPaths");
			String valuesString = AcceptanceSuite.props.getProperty("EnterpriseResourcesEdit_EditValues");
			
			log("xpathstr="+xpathsString);
			
			for (int i=0; i<xpathsString.split(",").length; i++){
				xpaths.add(xpathsString.split(",")[i]);
				values.add(valuesString.split(",")[i]);
			}
			
			String actionXPath = AcceptanceSuite.props.getProperty("EnterpriseResourcesEdit_EditActionXPath");
			String nextPageXPath = AcceptanceSuite.props.getProperty("EnterpriseResourcesEdit_NextPagePath");
			
			String searchXPath = AcceptanceSuite.props.getProperty("EnterpriseResourcesEdit_SearchXPath");
			String searchButtonXPath = AcceptanceSuite.props.getProperty("EnterpriseResourcesEdit_SearchButtonXPath");
			
			
			String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(), searchXPath, searchButtonXPath);
			this.getDriver().findElement(By.xpath(action)).click();
		}
		
		public void clickOnEnterpriseDeleteHeader() throws InterruptedException{
			WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResources_EnterpriseHeader"))));
		EnterpricesElem.click();

		EnterpriceResourcesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResources_EnterpriseResourcesLink"))));
		EnterpriceResourcesElem.click();
		}
		public void clickOnEnterpriseResourcesDelete() throws InterruptedException{
			WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
			
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesBanner"))));
			
			ArrayList<String> xpaths = new ArrayList<String>();
			ArrayList<String> values = new ArrayList<String>();
			
			String xpathsString = AcceptanceSuite.props.getProperty("EnterpriseResourcesDeleteXPaths");
			String valuesString = AcceptanceSuite.props.getProperty("EnterpriseResourcesDeleteValues");
			
			log("xpathstr="+xpathsString);
			
			for (int i=0; i<xpathsString.split(",").length; i++){
				xpaths.add(xpathsString.split(",")[i]);
				values.add(valuesString.split(",")[i]);
			}
			
			String actionXPath = AcceptanceSuite.props.getProperty("EnterpriseResourcesDeleteActionXPath");
			String nextPageXPath = AcceptanceSuite.props.getProperty("EnterpriseResourcesNextPagePath");
			
			String searchXPath = AcceptanceSuite.props.getProperty("EnterpriseResourcesearchXPath");
		    String searchButtonXPath = AcceptanceSuite.props.getProperty("EnterpriseResourcesearchButtonXPath");
			
			
			String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(), searchXPath, searchButtonXPath);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
			Thread.sleep(2000);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesFinalDeleteXPath")))).click();
		}
		public void enterpriseResourcesDeletenegative() throws InterruptedException{
			WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
					
			EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResources_EnterpriseHeader"))));
			EnterpricesElem.click();
		
			EnterpriceResourcesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResources_EnterpriseResourcesLink"))));
			EnterpriceResourcesElem.click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesBanner"))));
			
			ArrayList<String> xpaths = new ArrayList<String>();
			ArrayList<String> values = new ArrayList<String>();
			
			String xpathsString = AcceptanceSuite.props.getProperty("EnterpriseResourcesDeleteXPaths");
			String valuesString = AcceptanceSuite.props.getProperty("EnterpriseResourcesDeleteValues");
			
			for (int i=0; i<xpathsString.split(",").length; i++){
				xpaths.add(xpathsString.split(",")[i]);
				values.add(valuesString.split(",")[i]);
			}
			
			String actionXPath = AcceptanceSuite.props.getProperty("EnterpriseResourcesDeleteActionXPath");
			String nextPageXPath = AcceptanceSuite.props.getProperty("EnterpriseResourcesNextPagePath");
			
			String searchXPath = AcceptanceSuite.props.getProperty("EnterpriseResourcesearchXPath");
			String searchButtonXPath = AcceptanceSuite.props.getProperty("EnterpriseResourcesearchButtonXPath");
			

			String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(), searchXPath, searchButtonXPath);
			this.getDriver().findElement(By.xpath(action)).click();
			
			if (!action.equalsIgnoreCase("No Match")){
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesFinalDeleteXPath")))).click();
			}
		}
		
		public void clickOnEnterpriseResourcesEditPopup(String ResourceType, String FirstName, String LastName,String Designation,
				   String Department, String Gender, String MobileNumber,String Email, String Add1, String City, String Country, String State,
				   String ZIPCode, String Latitude, String Longitude) throws InterruptedException{
				  WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
				  
				    if(!ResourceType.isEmpty()){
				   Select Resource = new Select(
				     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_ResourceType")))));
				   Resource.selectByVisibleText(ResourceType);
				    }
				   // if(!FirstName.isEmpty()){
				   FnameElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourceEdit_FirstName"))));
				   FnameElem.sendKeys(Keys.CONTROL, "a");
				   FnameElem.sendKeys(Keys.DELETE);
				  // FnameElem.sendKeys(FirstName);
				  // }
				   
				    if(!FirstName.isEmpty()){
				      FnameElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourceEdit_FirstName"))));
				      FnameElem.sendKeys(Keys.CONTROL, "a");
				      FnameElem.sendKeys(Keys.DELETE);
				      FnameElem.sendKeys(FirstName);
				     }
				    LnameElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourceEdit_LastName"))));
				    LnameElem.sendKeys(Keys.CONTROL, "a");
				    LnameElem.sendKeys(Keys.DELETE);
				    
				  if(!LastName.isEmpty()){
				     LnameElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourceEdit_LastName"))));
				     LnameElem.sendKeys(Keys.CONTROL, "a");
				     LnameElem.sendKeys(Keys.DELETE);
				     LnameElem.sendKeys(LastName);
				      }
				  DesignationElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourceEdit_Designation"))));
				  DesignationElem.sendKeys(Keys.CONTROL, "a");
				  DesignationElem.sendKeys(Keys.DELETE);
				    if(!Designation.isEmpty()){
				     DesignationElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourceEdit_Designation"))));
				     DesignationElem.sendKeys(Keys.CONTROL, "a");
				     DesignationElem.sendKeys(Keys.DELETE);
				     DesignationElem.sendKeys(FirstName);
				      }
				    
				    if(!Department.isEmpty()){
				     DepartmentElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourceEdit_Department"))));
				     DepartmentElem.sendKeys(Keys.CONTROL, "a");
				     DepartmentElem.sendKeys(Keys.DELETE);
				     DepartmentElem.sendKeys(Department);
				      }
				    
				    if(!Gender.isEmpty()){
				     GenderElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourceEdit_Gender"))));
				     GenderElem.sendKeys(Keys.CONTROL, "a");
				     GenderElem.sendKeys(Keys.DELETE);
				     GenderElem.sendKeys(Gender);
				      } 
				    contactDetailsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_ContactDetailsTab"))));
				    contactDetailsElem.click();
				    mobilenumberElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourceEdit_MobileNumber"))));
				     mobilenumberElem.sendKeys(Keys.CONTROL, "a");
				     mobilenumberElem.sendKeys(Keys.DELETE);
				   
				  //  System.out.println("wwwwwwwwwwwwww============"+MobileNumber);
				    if(!MobileNumber.isEmpty()){
				     Thread.sleep(1000);
				  //   System.out.println("wwwwwwwwwwwwww"+MobileNumber);
				     contactDetailsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_ContactDetailsTab"))));
				     contactDetailsElem.click();
				    
				     mobilenumberElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourceEdit_MobileNumber"))));
				     mobilenumberElem.sendKeys(Keys.CONTROL, "a");
				     mobilenumberElem.sendKeys(Keys.DELETE);
				     mobilenumberElem.sendKeys(MobileNumber);
				    // Thread.sleep(1000);
				     
				     Thread.sleep(5000);
				     
				      }
				    contactDetailsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_ContactDetailsTab"))));
				    contactDetailsElem.click();
				     emailElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_Email"))));
				     emailElem.sendKeys(Keys.CONTROL, "a");
				     emailElem.sendKeys(Keys.DELETE);
				    if(!Email.isEmpty()){
				     Thread.sleep(1000);
				   //  System.out.println("llllllllllllllll=======================l"+Email);
				     
				     
				     contactDetailsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_ContactDetailsTab"))));
				     contactDetailsElem.click();
				     emailElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_Email"))));
				     //emailElem.clear();
				     emailElem.sendKeys(Keys.CONTROL, "a");
				     emailElem.sendKeys(Keys.DELETE);
				     emailElem.sendKeys(Email);
				     Thread.sleep(4000);
				     addressDetailsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_AddressDetailsTab"))));
				     addressDetailsElem.click();
				     Thread.sleep(1000);
				     addressLine1Elem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_AddressLine1"))));
				     addressLine1Elem.sendKeys(Keys.CONTROL, "a");
				     addressLine1Elem.sendKeys(Keys.DELETE);
				     
				      }
//				    addressLine1Elem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_AddressLine1"))));
//				    addressLine1Elem.clear();
//				    addressLine1Elem.sendKeys(Keys.CONTROL, "a");
//				    addressLine1Elem.sendKeys(Keys.DELETE);
				    if(!Add1.isEmpty()){
				     Thread.sleep(1000);

				     
				     addressLine1Elem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_AddressLine1"))));
				     //addressLine1Elem.clear();
				     addressLine1Elem.sendKeys(Keys.CONTROL, "a");
				     addressLine1Elem.sendKeys(Keys.DELETE);
				     addressLine1Elem.sendKeys(Add1);
				     cityElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_City"))));
				     cityElem.sendKeys(Keys.CONTROL, "a");
				     cityElem.sendKeys(Keys.DELETE);
				      }
				    if(!City.isEmpty()){
				     cityElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_City"))));
				     cityElem.clear();
				     cityElem.sendKeys(City);
				     zipElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_Zip"))));
				     zipElem.sendKeys(Keys.CONTROL, "a");
				     zipElem.sendKeys(Keys.DELETE);
				      }
				    if(!Country.isEmpty()){
				    // countryElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_Country"))));
				    // countryElem.sendKeys(Country);
				     Select country = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_Country")))));
				     country.selectByVisibleText(Country);
				      }
				    if(!State.isEmpty()){
				    // stateElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_State"))));
				    // stateElem.sendKeys(State);
				     Select state = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_StateId")))));
				     state.selectByVisibleText(State);
				      }
				    if(!ZIPCode.isEmpty()){
				     zipElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_Zip"))));
				     zipElem.clear();
				     zipElem.sendKeys(ZIPCode);
				     LattitudeElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_Latitude"))));

				     LattitudeElem.sendKeys(Keys.CONTROL, "a");
				     LattitudeElem.sendKeys(Keys.DELETE);
				      }
				    if(!Latitude.isEmpty()){
				     LattitudeElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_Latitude"))));
				     LattitudeElem.clear();
				     LattitudeElem.sendKeys(Latitude);
				     LongitudeElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_Longitude"))));
				     LongitudeElem.sendKeys(Keys.CONTROL, "a");
				     LongitudeElem.sendKeys(Keys.DELETE);
				      }
				    if(!Longitude.isEmpty()){
				     LongitudeElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesAdd_Longitude"))));
				     LongitudeElem.clear();
				     LongitudeElem.sendKeys(Longitude);
				      }

				  Thread.sleep(500);
				  
				  WebElement EnterpriseResourceSubmitButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourceEdit_SubmitButton"))));
				  EnterpriseResourceSubmitButtonElem.click();
				 }
		
		
		public void blockAndUnblockPopup(){
			WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
					
					EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResources_EnterpriseHeader"))));
					EnterpricesElem.click();
				
					EnterpriceResourcesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResources_EnterpriseResourcesLink"))));
					EnterpriceResourcesElem.click();
					
					
					
				}
				public void blockAndUnblockNegative() throws InterruptedException{
					
					WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesBanner"))));
					ArrayList<String> xpaths = new ArrayList<String>();
					ArrayList<String> values = new ArrayList<String>();
					
					String xpathsString = AcceptanceSuite.props.getProperty("EnterpriseResourcesBlockUnblock_BlockXPaths");
					String valuesString = AcceptanceSuite.props.getProperty("EnterpriseResourcesBlockUnblock_BlockValues");
					
					for (int i=0; i<xpathsString.split(",").length; i++){
						xpaths.add(xpathsString.split(",")[i]);
						values.add(valuesString.split(",")[i]);
					}
					
					String actionXPath = AcceptanceSuite.props.getProperty("EnterpriseResourceBlockUnblock");
					String nextPageXPath = AcceptanceSuite.props.getProperty("EnterpriseResourcesNextPagePath");
					
					String searchXPath = AcceptanceSuite.props.getProperty("EnterpriseResourcesearchXPath");
					String searchButtonXPath = AcceptanceSuite.props.getProperty("EnterpriseResourcesearchButtonXPath");
							
					String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(), searchXPath, searchButtonXPath);
					Thread.sleep(2000);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
							
					//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourceBlockUnblockReason"))));
					
							Thread.sleep(2000);
					WebElement EnterpriseResourceSubmitButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourceBlock_SubmitButton"))));
					EnterpriseResourceSubmitButtonElem.click();
					Thread.sleep(5000);
					Select	blockUnblockReason = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourceBlockUnblockReason")))));
					blockUnblockReason.selectByVisibleText(AcceptanceSuite.props.getProperty("EnterpriseResourceBlockReasonValue"));
					Thread.sleep(2000);
					//WebElement EnterpriseResourceSubmitButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourceBlock_SubmitButton"))));
					EnterpriseResourceSubmitButtonElem.click();
					
//					EnterpriseresblockclosebuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourceBlock_CloseButton"))));
//					EnterpriseresblockclosebuttonElem.click();
					Thread.sleep(2000);
					
					
				}
			public void blockAndUnblockNegative1() throws InterruptedException{
					
					WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesBanner"))));
					ArrayList<String> xpaths = new ArrayList<String>();
					ArrayList<String> values = new ArrayList<String>();
					
					String xpathsString = AcceptanceSuite.props.getProperty("EnterpriseResourcesBlockUnblock_BlockXPaths");
					String valuesString = AcceptanceSuite.props.getProperty("EnterpriseResourcesBlockUnblock_BlockValues");
					
					for (int i=0; i<xpathsString.split(",").length; i++){
						xpaths.add(xpathsString.split(",")[i]);
						values.add(valuesString.split(",")[i]);
					}
					
					String actionXPath = AcceptanceSuite.props.getProperty("EnterpriseResourceBlockUnblock");
					String nextPageXPath = AcceptanceSuite.props.getProperty("EnterpriseResourcesNextPagePath");
					
					String searchXPath = AcceptanceSuite.props.getProperty("EnterpriseResourcesearchXPath");
					String searchButtonXPath = AcceptanceSuite.props.getProperty("EnterpriseResourcesearchButtonXPath");
							
					String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(), searchXPath, searchButtonXPath);
					this.getDriver().findElement(By.xpath(action)).click();
							Thread.sleep(2000);
					//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourceBlockUnblockReason"))));
					
							Thread.sleep(2000);
					WebElement EnterpriseResourceSubmitButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourceBlock_SubmitButton"))));
					EnterpriseResourceSubmitButtonElem.click();
					Thread.sleep(2000);
					/*Thread.sleep(5000);
					Select	blockUnblockReason = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourceBlockUnblockReason")))));
					blockUnblockReason.selectByVisibleText(AcceptanceSuite.props.getProperty("EnterpriseResourceBlockReasonValue"));
					Thread.sleep(2000);*/
					//WebElement EnterpriseResourceSubmitButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourceBlock_SubmitButton"))));
					Select	blockUnblockReason = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourceBlockUnblockReason")))));
					blockUnblockReason.selectByVisibleText(AcceptanceSuite.props.getProperty("EnterpriseResourceBlockReasonValue"));
					Thread.sleep(2000);
					
					EnterpriseResourceSubmitButtonElem.click();
					
//					EnterpriseresblockclosebuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourceBlock_CloseButton"))));
//					EnterpriseresblockclosebuttonElem.click();
					Thread.sleep(2000);	
				}
}
