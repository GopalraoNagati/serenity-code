package com.srisys.serenity.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.srisys.serenity.AcceptanceSuite;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;


public class IndNavEnterprisespage extends PageObject {
	
	WebDriver driver;
	
	WebElement adminLinkElem;
	WebElement enterpriseAddBtnElem;
	WebElement enterprisesHeaderElem;
	WebElement enterprisesCreateElem;
	WebElement enterpriseFieldElem;
	WebElement websitefieldElem;
	WebElement employerIDNumberFieldElem;
	WebElement descriptionFieldElem;
	WebElement enterpriseSubmitBtnElem;
	WebElement enterprisesErrormessageElem;
	WebElement contactDetailsBlockElem;
	WebElement workNumberFieldElem;
	WebElement EmailIDFieldElem;
	WebElement advancedEmailIDFieldElem;
	WebElement addressDetailsBlockElem;
	WebElement addressLine1FieldElem;
	WebElement cityFieldElem;
	WebElement CountryListFieldElem;
	WebElement StateListFieldElem;
	WebElement zipFieldElem;
	WebElement biltoDetailsBlockElem;
	WebElement creditCardTypeListFieldElem;
	WebElement creaditCardFieldElem;
	WebElement creaditCardNameFieldElem;
	WebElement creditCardMonthListFieldElem;
	WebElement creditCardYearListFieldElem;
	WebElement CVVFieldElem;
	WebElement ChooseImageElem;
	WebElement enterpriseSearchBoxElem;
	WebElement enterpriseSearchBtnElem;
	WebElement EnterpriseListingElem;
	WebElement entWebsiteEditElem;
	WebElement entContactDetailsBlockEditElem;
	WebElement entEmployerIdEditElem;
	WebElement entDescriptionEditElem;
	WebElement entWorkNumberEditElem;
	WebElement entEmailIDEditElem;
	WebElement entAdminEmailIDEditElem;
	WebElement entAddressDetailsBlockEditElem;
	WebElement entAddressLine1EditElem;
	WebElement entAddressLine2EditElem;
	WebElement entCityEditElem;
	WebElement entZipCodeEditElem;
	WebElement entSubmitBtnEditElem;
	WebElement entViewCloseBtnEditElem;
	WebElement entViewCloseBtnElem;
	WebElement InactiveResonElem;
	WebElement InactivateBtnElem;
	WebElement EnterpriseStatusElem;
	WebElement EnterpriseStatusElem1;
	String result;
	String result1;
	

	WebElement EnterprisesAdvancedSearchButtonElem;
	WebElement EnterprisesAdvancedEnterpriseElem;
	WebElement EnterprisesAdvancedSubmitBtnElem;
	WebElement EnterprisesAdvancedSearchEnterpriseInListingElem;

public void enterprisesAdvanceSearch() throws Exception {
			WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
			
			Thread.sleep(3000);
		
				EnterprisesAdvancedSearchButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdvancedSearch_AdvancedButton"))));
				EnterprisesAdvancedSearchButtonElem.click();
			
			
			
			EnterprisesAdvancedEnterpriseElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdvancedSearch_Enterprise"))));
			EnterprisesAdvancedEnterpriseElem.sendKeys(AcceptanceSuite.props.getProperty("EnterprisesAdvancedSearch_EnterpriseData"));
			
			
			EnterprisesAdvancedSubmitBtnElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdvancedSearch_SubmitButton"))));
			EnterprisesAdvancedSubmitBtnElem.click();
			Thread.sleep(2000);
			
			
		}

		public void clickOnEnterprisesHeader() {
			WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
			
			
			adminLinkElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdminLink"))));
			adminLinkElem.click();
			enterprisesHeaderElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprisesheader"))));
			enterprisesHeaderElem.click();
		}

		public String checkWeather_SearchEnterpriseDispalyedInListing() throws InterruptedException {
			WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
			
			EnterprisesAdvancedSearchEnterpriseInListingElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdvancedSearch_EnterpriseInListing"))));
			EnterprisesAdvancedSearchEnterpriseInListingElem.isDisplayed();
			Thread.sleep(1000);
			String a = EnterprisesAdvancedSearchEnterpriseInListingElem.getText();
			System.out.println(a);
			return a;
		}
	
	

	public void clickONEnterprisesHeader() throws Exception {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		Thread.sleep(1000);
		adminLinkElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdminLink"))));
		adminLinkElem.click();
		Thread.sleep(1000);
		try{
			enterprisesHeaderElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprisesheader"))));
			enterprisesHeaderElem.click();
		} 
		
		catch (Exception Ex){
			Ex.printStackTrace();
			throw new Exception("Page did not load properly"+Ex.getMessage());
		}
		

	}
    
	public void clickONAddAction() {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesBanner"))));
		enterpriseAddBtnElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprises_AddBtn"))));
		enterpriseAddBtnElem.click();
	}
	
	public void enter_Enterprise_Website_EmplyrIDNumber_Description_And_ClickON_SubmitBtn(
			String Enterprise, String Website, String EmployerIDNumber,String Description) throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		enterpriseFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_Enterprise"))));
		websitefieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_Website"))));
		employerIDNumberFieldElem =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_EmployerIDNumber"))));
		descriptionFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_Description"))));
		
		enterpriseFieldElem.clear();
		enterpriseFieldElem.sendKeys(Enterprise);
		Thread.sleep(1000);
		websitefieldElem.clear();
		websitefieldElem.sendKeys(Website);
		Thread.sleep(1000);
		employerIDNumberFieldElem.clear();
		employerIDNumberFieldElem.sendKeys(EmployerIDNumber);
		Thread.sleep(1000);
		descriptionFieldElem.clear();
		descriptionFieldElem.sendKeys(Description);
		Thread.sleep(1000);
		enterpriseSubmitBtnElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_SubmitButton"))));
		enterpriseSubmitBtnElem.click();
		
	}

	@SuppressWarnings("rawtypes")
	public ExpectedCondition enterpriseFiledIsVisible() {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		enterpriseFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_Enterprise"))));
	        return new ExpectedCondition<Boolean>() {
	            public Boolean apply(WebDriver driver) {
	                return (enterpriseFieldElem.isDisplayed());
	            }
	        };
	    }

	    @SuppressWarnings("unchecked")
		public void waitForEnterprisesFirstNameField() {
	        waitForCondition().until(enterpriseFiledIsVisible());
	    }
	    
	    public String getErrorMessage() {
			enterprisesErrormessageElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_ErrorMsg")));
			String a = enterprisesErrormessageElem.getText();
			return a;
		}

		public void enterprisesCreate() throws InterruptedException {
			WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
			
			enterpriseFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_Enterprise"))));
			enterpriseFieldElem.clear();
			enterpriseFieldElem.sendKeys(AcceptanceSuite.props.getProperty("EnterpriseData"));
			
			websitefieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_Website"))));
			websitefieldElem.clear();
			websitefieldElem.sendKeys(AcceptanceSuite.props.getProperty("EnterprisewebsiteData"));
			Thread.sleep(2000);
			
			employerIDNumberFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_EmployerIDNumber"))));
			employerIDNumberFieldElem.clear();
			employerIDNumberFieldElem.sendKeys(AcceptanceSuite.props.getProperty("EnterpriseEmployerIdNumberData"));
			
			descriptionFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_Description"))));
			descriptionFieldElem.clear();
			descriptionFieldElem.sendKeys(AcceptanceSuite.props.getProperty("EnterpriseDescriptionData"));
			
			
			ChooseImageElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_ImageUpload")));
			ChooseImageElem.click();
			
			 try {
		    	  StringSelection ss = new StringSelection(AcceptanceSuite.props.getProperty("EnterpriseAdd_Image"));
				  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
				  Robot robot = new Robot();
				  robot.keyPress(KeyEvent.VK_ENTER);
				  robot.keyRelease(KeyEvent.VK_ENTER);
				  Thread.sleep(2000);
				  robot.keyPress(KeyEvent.VK_CONTROL);
				  robot.keyPress(KeyEvent.VK_V);
				  robot.keyRelease(KeyEvent.VK_V);
				  robot.keyRelease(KeyEvent.VK_CONTROL);
				  Thread.sleep(2000);
				  robot.keyPress(KeyEvent.VK_ENTER);
				  robot.keyRelease(KeyEvent.VK_ENTER);
		        } catch (AWTException e) {
		            e.printStackTrace();
		        }
			 
			contactDetailsBlockElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseAdd_ContactDetailsBlock"))));
			contactDetailsBlockElem.click();
			
			workNumberFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_WorkNumber"))));
			workNumberFieldElem.sendKeys(AcceptanceSuite.props.getProperty("EnterpriseWorkNumberData"));
			
			EmailIDFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_EmailID"))));
			EmailIDFieldElem.clear();
			EmailIDFieldElem.sendKeys(AcceptanceSuite.props.getProperty("EnterpriseEmialIDData"));
			
			advancedEmailIDFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_AdvancedEmail"))));
			advancedEmailIDFieldElem.clear();
			advancedEmailIDFieldElem.sendKeys(AcceptanceSuite.props.getProperty("EnterpriseAdvancedEmailIDData"));
			
			
			addressDetailsBlockElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_AddressDetailsBlock"))));
			addressDetailsBlockElem.click();
			
			
			addressLine1FieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_AddressLine1"))));
			addressLine1FieldElem.sendKeys(AcceptanceSuite.props.getProperty("EnterpriseAddressLine1Data"));
			
			cityFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_City"))));
			cityFieldElem.sendKeys(AcceptanceSuite.props.getProperty("EnterpriseCityData"));
			
			Thread.sleep(1000);
			CountryListFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_Country"))));	
			Select countryListfield = new Select(CountryListFieldElem); 		
			countryListfield.selectByVisibleText(AcceptanceSuite.props.getProperty("EnterpriseCountryData"));
			
			Thread.sleep(1000);
			StateListFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_State"))));	
			Select stateListfield = new Select(StateListFieldElem); 		
			stateListfield.selectByVisibleText(AcceptanceSuite.props.getProperty("EnterpriseStateData"));
			
			zipFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_ZipCode"))));
			zipFieldElem.sendKeys(AcceptanceSuite.props.getProperty("EnterpriseZipCodeData"));
			
			biltoDetailsBlockElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_BillToDetailsBlock"))));
			biltoDetailsBlockElem.click();
			
			
			//creditCardTypeListFieldElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("entCreditCardType")));	
			creditCardTypeListFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_CreditCardType"))));;
			Select creditCardTypeListfield = new Select(creditCardTypeListFieldElem); 		
			creditCardTypeListfield.selectByVisibleText(AcceptanceSuite.props.getProperty("EnterpriseCreditCardTypeData"));
			
			creaditCardFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_CreaditCard"))));
			creaditCardFieldElem.sendKeys(AcceptanceSuite.props.getProperty("EnterpriseCreaditCardData"));
			
			creaditCardNameFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_creaditCardName"))));
			creaditCardNameFieldElem.sendKeys(AcceptanceSuite.props.getProperty("EnterpriseCreaditCardNameData"));
			
			
			creditCardMonthListFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_CreaditCardMonth"))));	
			Select creditCardMnthListfield = new Select(creditCardMonthListFieldElem); 		
			creditCardMnthListfield.selectByVisibleText(AcceptanceSuite.props.getProperty("EnterpriseCreaditMonthData"));
			
			creditCardYearListFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_CreaditCardYear"))));	
			Select creditCardYearListfield = new Select(creditCardYearListFieldElem); 		
			creditCardYearListfield.selectByVisibleText(AcceptanceSuite.props.getProperty("EnterpriseCreaditCardYearValue"));
			
			CVVFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_CVVNumber"))));
			CVVFieldElem.sendKeys(AcceptanceSuite.props.getProperty("EnterpriseCVVNumberData"));
			
			enterpriseSubmitBtnElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_SubmitButton"))));
			enterpriseSubmitBtnElem.click();
			
			try{
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseAdd_CloseButton")))).click();
			} catch (Exception Ex){
				Ex.printStackTrace();
			}
		}

		public String search() throws InterruptedException {
			WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
			enterpriseSearchBoxElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprises_SearchBox"))));
			enterpriseSearchBoxElem.sendKeys(AcceptanceSuite.props.getProperty("EnterpriseData"));
			enterpriseSearchBtnElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprises_SearchButton"))));
			enterpriseSearchBtnElem.click();
			Thread.sleep(2000);
			EnterpriseListingElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseNames_Listing"))));
			String txt = EnterpriseListingElem.getText();
			System.out.println(txt);
			if(txt.equalsIgnoreCase(AcceptanceSuite.props.getProperty("EnterpriseData"))){
				result = "Created Enterprise Displayed in Listing";
			}else{
				result = "Created Enterprise not Displayed in Listing";
			}
			return result;
		}

		public void clickON_EditBtn_CorrespondingToEnterpriseName() throws InterruptedException {
			WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesBanner"))));
			
			ArrayList<String> xpaths = new ArrayList<String>();
			ArrayList<String> values = new ArrayList<String>();
			
			String xpathsString = AcceptanceSuite.props.getProperty("EnterprisesEdit_Xpaths");
			String valuesString = AcceptanceSuite.props.getProperty("EnterpriseData");
			
			for (int i=0; i<xpathsString.split(",").length; i++){
				
				xpaths.add(xpathsString.split(",")[i]);
				System.out.println("lllllllllll"+xpaths);
				values.add(valuesString.split(",")[i]);
				System.out.println("lllllllllll"+values);
			}
			
			String actionXPath = AcceptanceSuite.props.getProperty("EnterprisesEdit_ActionXpath");
			String nextPageXPath = AcceptanceSuite.props.getProperty("EnterprisesNextPagePath");
			
			String searchXPath = AcceptanceSuite.props.getProperty("Enterprises_SearchBox");
			String searchButtonXPath = AcceptanceSuite.props.getProperty("Enterprises_SearchButton");
			
			String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(), searchXPath, searchButtonXPath);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
			
			if (!action.equalsIgnoreCase("No Match")){
				entWebsiteEditElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesEdit_Website"))));
				entWebsiteEditElem.clear();
				Thread.sleep(1000);
				entWebsiteEditElem.sendKeys(AcceptanceSuite.props.getProperty("EnterpriseEditWebsiteData"));
				Thread.sleep(4000);
				
				entEmployerIdEditElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesEdit_EmployerId"))));
				entEmployerIdEditElem.clear();
				entEmployerIdEditElem.sendKeys(AcceptanceSuite.props.getProperty("EnterpriseEditEmployerIdData"));
				
				entDescriptionEditElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesEdit_Description"))));
				entDescriptionEditElem.clear();
				entDescriptionEditElem.sendKeys(AcceptanceSuite.props.getProperty("EnterpriseEditDescriptionData"));
				
				entContactDetailsBlockEditElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesEdit_ContactDetailsBlock"))));
				entContactDetailsBlockEditElem.click();
				
				//entWorkNumberEditElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesEdit_WorkNumber")));
				entWorkNumberEditElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesEdit_WorkNumber"))));;
				entWorkNumberEditElem.clear();
				entWorkNumberEditElem.sendKeys(AcceptanceSuite.props.getProperty("EnterpriseEditWorkNumberData"));
				
				entEmailIDEditElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesEdit_EmailID"))));
				entEmailIDEditElem.clear();
				entEmailIDEditElem.sendKeys(AcceptanceSuite.props.getProperty("EnterpriseEditEmailIDData"));
				
				entAdminEmailIDEditElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesEdit_AdminEmailID"))));
				entAdminEmailIDEditElem.clear();
				entAdminEmailIDEditElem.sendKeys(AcceptanceSuite.props.getProperty("EnterpriseEditAdminEmailIDData"));
				
				entAddressDetailsBlockEditElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesEdit_AddressDetailsBlock")));
				entAddressDetailsBlockEditElem.click();
				
				//entAddressLine1EditElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesEdit_AddressLine1")));
				entAddressLine1EditElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesEdit_AddressLine1"))));
				entAddressLine1EditElem.clear();
				entAddressLine1EditElem.sendKeys(AcceptanceSuite.props.getProperty("EnterpriseEditAddressLine1Data"));
				
				entAddressLine2EditElem =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesEdit_AddressLine2"))));
				entAddressLine2EditElem.clear();
				entAddressLine2EditElem.sendKeys(AcceptanceSuite.props.getProperty("EnterpriseEditAddressLine2Data"));
				
				entCityEditElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesEdit_City"))));
				entCityEditElem.clear();
				entCityEditElem.sendKeys(AcceptanceSuite.props.getProperty("EnterpriseEditCityEditData"));
				
				entZipCodeEditElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesEdit_ZipCode"))));
				entZipCodeEditElem.clear();
				entZipCodeEditElem.sendKeys(AcceptanceSuite.props.getProperty("EnterpriseEditZipCodeData"));
				
				
				entSubmitBtnEditElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesEdit_SubmitButton"))));
				entSubmitBtnEditElem.click();	
			}
		}

		public void clickON_View_Btn_CorrespondingToEnterpriseName() throws InterruptedException {
			
			WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesBanner"))));
			
			ArrayList<String> xpaths = new ArrayList<String>();
			ArrayList<String> values = new ArrayList<String>();
			
			String xpathsString = AcceptanceSuite.props.getProperty("EnterprisesView_Xpaths");
			String valuesString = AcceptanceSuite.props.getProperty("EnterpriseData");
			
			for (int i=0; i<xpathsString.split(",").length; i++){
				
				xpaths.add(xpathsString.split(",")[i]);
				System.out.println("lllllllllll"+xpaths);
				values.add(valuesString.split(",")[i]);
				System.out.println("lllllllllll"+values);
			}
			
			String actionXPath = AcceptanceSuite.props.getProperty("EnterprisesView_ActionXpath");
			String nextPageXPath = AcceptanceSuite.props.getProperty("EnterprisesNextPagePath");
			
			String searchXPath = AcceptanceSuite.props.getProperty("Enterprises_SearchBox");
			String searchButtonXPath = AcceptanceSuite.props.getProperty("Enterprises_SearchButton");
			
			String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(), searchXPath, searchButtonXPath);
			Thread.sleep(1000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
			
			if (!action.equalsIgnoreCase("No Match")){
				Thread.sleep(2000);
				entViewCloseBtnElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesView_CloseButton"))));
				entViewCloseBtnElem.click();	
				
			}
		}

		public void clickON_InActivate_Btn_CorrespondingToEnterpriseName() throws InterruptedException {
			WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
			ArrayList<String> xpaths = new ArrayList<String>();
			ArrayList<String> values = new ArrayList<String>();
			
			String xpathsString = AcceptanceSuite.props.getProperty("EnterprisesView_Xpaths");
			String valuesString = AcceptanceSuite.props.getProperty("EnterpriseData");
			
			for (int i=0; i<xpathsString.split(",").length; i++){
				
				xpaths.add(xpathsString.split(",")[i]);
				System.out.println("lllllllllll"+xpaths);
				values.add(valuesString.split(",")[i]);
				System.out.println("lllllllllll"+values);
			}
			
			String actionXPath = AcceptanceSuite.props.getProperty("EnterpriseInactivateActionXpath");
			String nextPageXPath = AcceptanceSuite.props.getProperty("EnterprisesNextPagePath");
			
			String searchXPath = AcceptanceSuite.props.getProperty("Enterprises_SearchBox");
			String searchButtonXPath = AcceptanceSuite.props.getProperty("Enterprises_SearchButton");
			
			String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(), searchXPath, searchButtonXPath);
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
			
			if (!action.equalsIgnoreCase("No Match")){
				
				Thread.sleep(3000);
				InactiveResonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprises_InactiveReson"))));;	
				Select InactiveResonList = new Select(InactiveResonElem); 		
				InactiveResonList.selectByVisibleText(AcceptanceSuite.props.getProperty("EnterpriseInactiveResonData"));
				
				InactivateBtnElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprises_InactivateButton"))));
				InactivateBtnElem.click();
			}
		}

		public String status() {
			WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
			enterpriseSearchBoxElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprises_SearchBox"))));
			enterpriseSearchBoxElem.clear();
			enterpriseSearchBoxElem.sendKeys(AcceptanceSuite.props.getProperty("EnterpriseData"));
			enterpriseSearchBtnElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprises_SearchButton"))));
			enterpriseSearchBtnElem.click();
			/*EnterpriseStatusElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesStatusListing")));*/
			EnterpriseStatusElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesStatusListing"))));
			String txt = EnterpriseStatusElem.getText();
			System.out.println(txt);
			if(txt.equalsIgnoreCase(AcceptanceSuite.props.getProperty("EnterpriseStatusData"))){
				result = "Enterprise Status Changed to INActivate";
			}else{
				result = "Enterprise Status Not Changed to INActivate";
			}
			return result;
		}

		public String status_Active() {
			WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
			enterpriseSearchBoxElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprises_SearchBox"))));
			enterpriseSearchBoxElem.clear();
			enterpriseSearchBoxElem.sendKeys(AcceptanceSuite.props.getProperty("EnterpriseData"));
			enterpriseSearchBtnElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprises_SearchButton"))));
			enterpriseSearchBtnElem.click();
			/*EnterpriseStatusElem1 = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesStatusListing")));*/
			EnterpriseStatusElem1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesStatusListing"))));
			String txt = EnterpriseStatusElem1.getText();
			System.out.println(txt);
			if(txt.equalsIgnoreCase(AcceptanceSuite.props.getProperty("EnterpriseStatusActiveData"))){
				result1 = "Enterprise Status Changed to Activate";
			}else{
				result1 = "Enterprise Status Not Changed to Activate";
			}
			return result1;
		}

		public void clickON_Activate_Btn_CorrespondingToEnterpriseName() throws InterruptedException {
			WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
			
			ArrayList<String> xpaths = new ArrayList<String>();
			ArrayList<String> values = new ArrayList<String>();
			
			String xpathsString = AcceptanceSuite.props.getProperty("EnterprisesView_Xpaths");
			String valuesString = AcceptanceSuite.props.getProperty("EnterpriseData");
			
			for (int i=0; i<xpathsString.split(",").length; i++){
				
				xpaths.add(xpathsString.split(",")[i]);
				System.out.println("lllllllllll"+xpaths);
				values.add(valuesString.split(",")[i]);
				System.out.println("lllllllllll"+values);
			}
			
			String actionXPath = AcceptanceSuite.props.getProperty("EnterpriseInactivateActionXpath");
			String nextPageXPath = AcceptanceSuite.props.getProperty("EnterprisesNextPagePath");
			
			String searchXPath = AcceptanceSuite.props.getProperty("Enterprises_SearchBox");
			String searchButtonXPath = AcceptanceSuite.props.getProperty("Enterprises_SearchButton");
			
			String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(), searchXPath, searchButtonXPath);
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
			Thread.sleep(2000);
			
			if (!action.equalsIgnoreCase("No Match")){
				InactiveResonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprises_InactiveReson"))));;	
				Select InactiveResonList = new Select(InactiveResonElem); 		
				InactiveResonList.selectByVisibleText(AcceptanceSuite.props.getProperty("Enterprises_ActiveResonData"));
				
				InactivateBtnElem =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprises_InactivateButton"))));
				InactivateBtnElem.click();
			}
			
		}
		
		
		
		
		
		
		
		//Enterprises_Add/Create Validation Check Start
		public void Enterprise_Create_ValidationCheckMainBlock(String EnterpriseName, String EnterpriseWebsite, 
				String EnterpriseEmployerIDNumber, String EnterpriseDescription, String EnterpriseCreateValidationImage, String EnterpriseWorkNumber, 
				String EnterpriseEmailID, String EnterpriseAdminEmailID, String EnterpriseAddressLine1, 
				String EnterpriseCity, String EnterpriseZipCode, String EnterpriseLatitude, String EnterpriseLongitude,
				String EnterpriseAppTitle, String EnterpriseFleetCommonName, String EnterpriseMaxLimitActiveReservationsPerUser,
				String EnterpriseAdvancedReservationWindowinDays, String EnterpriseMaxReservationsWindowInHours,
				String EnterpriseReservationReminderWindowInMinutes, String EnterpriseFleetReservationAutoExpiryInHours,
				String EnterpriseGracePeriodInMinutes, String EnterpriseInActiveTimeoutInMinutes,
				String EnterpriseCheckInWindowInMinutes, String EnterpriseBillToDetailsAddressLine1, String EnterpriseBillToDetailsCity,
				String EnterpriseBillToDetailsZipCode, String creditCardTypeList, String creaditCardField, String creaditCardNameField,
				String creditCardMonthListField, String creditCardYearListField, String CVVField) throws InterruptedException {
		
			Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);	
		
		websitefieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_Website"))));
//		websitefieldElem.clear();
		websitefieldElem.sendKeys(Keys.CONTROL, "a");
		websitefieldElem.sendKeys(Keys.DELETE);
		if(!EnterpriseName.isEmpty()) {
		enterpriseFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_Enterprise"))));
//		enterpriseFieldElem.clear();
		enterpriseFieldElem.sendKeys(Keys.CONTROL, "a");
		enterpriseFieldElem.sendKeys(Keys.DELETE);
		enterpriseFieldElem.sendKeys(EnterpriseName);
		 	}
		if(!EnterpriseWebsite.isEmpty()) {
			websitefieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_Website"))));
//			websitefieldElem.clear();
			websitefieldElem.sendKeys(Keys.CONTROL, "a");
			websitefieldElem.sendKeys(Keys.DELETE);
			websitefieldElem.sendKeys(EnterpriseWebsite);
			 	}	
		employerIDNumberFieldElem =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_EmployerIDNumber"))));
//		employerIDNumberFieldElem.clear();
		employerIDNumberFieldElem.sendKeys(Keys.CONTROL, "a");
		employerIDNumberFieldElem.sendKeys(Keys.DELETE);
		if(!EnterpriseEmployerIDNumber.isEmpty()) {
			employerIDNumberFieldElem =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_EmployerIDNumber"))));
//			employerIDNumberFieldElem.clear();
			employerIDNumberFieldElem.sendKeys(Keys.CONTROL, "a");
			employerIDNumberFieldElem.sendKeys(Keys.DELETE);
			employerIDNumberFieldElem.sendKeys(EnterpriseEmployerIDNumber);
			 	}		
		descriptionFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_Description"))));
//		descriptionFieldElem.clear();
		descriptionFieldElem.sendKeys(Keys.CONTROL, "a");
		descriptionFieldElem.sendKeys(Keys.DELETE);
		if(!EnterpriseDescription.isEmpty()) {
			descriptionFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_Description"))));
//			descriptionFieldElem.clear();
			descriptionFieldElem.sendKeys(Keys.CONTROL, "a");
			descriptionFieldElem.sendKeys(Keys.DELETE);
			descriptionFieldElem.sendKeys(EnterpriseDescription);
			 	}	
		
		if(!EnterpriseCreateValidationImage.isEmpty()) {
			Thread.sleep(2000);
		ChooseImageElem = this.getDriver().findElement(By.xpath(EnterpriseCreateValidationImage));
		ChooseImageElem.click();
		Thread.sleep(2000);
		 try {
	    	  StringSelection ss = new StringSelection(AcceptanceSuite.props.getProperty("EnterpriseCreateValidationImagePath"));
			  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			  Robot robot = new Robot();
			  robot.keyPress(KeyEvent.VK_ENTER);
			  robot.keyRelease(KeyEvent.VK_ENTER);
			  Thread.sleep(2000);
			  robot.keyPress(KeyEvent.VK_CONTROL);
			  robot.keyPress(KeyEvent.VK_V);
			  robot.keyRelease(KeyEvent.VK_V);
			  robot.keyRelease(KeyEvent.VK_CONTROL);
			  Thread.sleep(2000);
			  robot.keyPress(KeyEvent.VK_ENTER);
			  robot.keyRelease(KeyEvent.VK_ENTER);
	        } catch (AWTException e) {
	            e.printStackTrace();
	        }

		}
		contactDetailsBlockElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseAdd_ContactDetailsBlock"))));
		contactDetailsBlockElem.click();
		Thread.sleep(2000);
		if(!EnterpriseWorkNumber.isEmpty()) {
		workNumberFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_WorkNumber"))));
//		workNumberFieldElem.clear();
		workNumberFieldElem.sendKeys(Keys.CONTROL, "a");
		workNumberFieldElem.sendKeys(Keys.DELETE);
		workNumberFieldElem.sendKeys(EnterpriseWorkNumber);
		 	}else {
		 		workNumberFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_WorkNumber"))));
//		 		workNumberFieldElem.clear();
		 		workNumberFieldElem.sendKeys(Keys.CONTROL, "a");
		 		workNumberFieldElem.sendKeys(Keys.DELETE);
		 	}

	if(!EnterpriseEmailID.isEmpty()) {
		EmailIDFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_EmailID"))));
//		EmailIDFieldElem.clear();
		EmailIDFieldElem.sendKeys(Keys.CONTROL, "a");
		EmailIDFieldElem.sendKeys(Keys.DELETE);
		EmailIDFieldElem.sendKeys(EnterpriseEmailID);
		 	}else {
		EmailIDFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_EmailID"))));
//		EmailIDFieldElem.clear();	 		
		EmailIDFieldElem.sendKeys(Keys.CONTROL, "a");
		EmailIDFieldElem.sendKeys(Keys.DELETE);
		 	}

	if(!EnterpriseAdminEmailID.isEmpty()) {
		advancedEmailIDFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_AdvancedEmail"))));
//		advancedEmailIDFieldElem.clear();
		advancedEmailIDFieldElem.sendKeys(Keys.CONTROL, "a");
		advancedEmailIDFieldElem.sendKeys(Keys.DELETE);
		advancedEmailIDFieldElem.sendKeys(EnterpriseAdminEmailID);
		 	}else {
		advancedEmailIDFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_AdvancedEmail"))));
//		advancedEmailIDFieldElem.clear();	 		
		advancedEmailIDFieldElem.sendKeys(Keys.CONTROL, "a");
		advancedEmailIDFieldElem.sendKeys(Keys.DELETE);
		 	}

		addressDetailsBlockElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_AddressDetailsBlock"))));
		addressDetailsBlockElem.click();
		
	if(!EnterpriseAddressLine1.isEmpty()) {
		addressLine1FieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_AddressLine1"))));
//		addressLine1FieldElem.clear();
		addressLine1FieldElem.sendKeys(Keys.CONTROL, "a");
		addressLine1FieldElem.sendKeys(Keys.DELETE);
		addressLine1FieldElem.sendKeys(EnterpriseAddressLine1);
		 	}else {
		 		addressLine1FieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_AddressLine1"))));
//		 		addressLine1FieldElem.clear();
		 		addressLine1FieldElem.sendKeys(Keys.CONTROL, "a");
		 		addressLine1FieldElem.sendKeys(Keys.DELETE);
		 	}

	if(!EnterpriseCity.isEmpty()) {
		cityFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_City"))));
//		cityFieldElem.clear();
		cityFieldElem.sendKeys(Keys.CONTROL, "a");
		cityFieldElem.sendKeys(Keys.DELETE);
		cityFieldElem.sendKeys(EnterpriseCity);
		 	}else {
		 		cityFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_City"))));
//		 		cityFieldElem.clear();
		 		cityFieldElem.sendKeys(Keys.CONTROL, "a");
		 		cityFieldElem.sendKeys(Keys.DELETE);
		 	}

	if(!EnterpriseZipCode.isEmpty()) {
		zipFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_ZipCode"))));
//		zipFieldElem.clear();
		zipFieldElem.sendKeys(Keys.CONTROL, "a");
		zipFieldElem.sendKeys(Keys.DELETE);
		zipFieldElem.sendKeys(EnterpriseZipCode);
		 	}else {
		 		zipFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_ZipCode"))));
//		 		zipFieldElem.clear();
		 		zipFieldElem.sendKeys(Keys.CONTROL, "a");
		 		zipFieldElem.sendKeys(Keys.DELETE);
		 	}

	WebElement EnterpriseLatitudePathElem;
	WebElement EnterpriseLongitudePathElem;
	WebElement EnterpriseSettingsBlockButtonElem;
	if(!EnterpriseLatitude.isEmpty()) {
		EnterpriseLatitudePathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseLatitudePath"))));
//		EnterpriseLatitudePathElem.clear();
		EnterpriseLatitudePathElem.sendKeys(Keys.CONTROL, "a");
		EnterpriseLatitudePathElem.sendKeys(Keys.DELETE);
		EnterpriseLatitudePathElem.sendKeys(EnterpriseLatitude);
		 	}else {
		 		EnterpriseLatitudePathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseLatitudePath"))));
//		 		EnterpriseLatitudePathElem.clear();
		 		EnterpriseLatitudePathElem.sendKeys(Keys.CONTROL, "a");
		 		EnterpriseLatitudePathElem.sendKeys(Keys.DELETE);
		 	}
	if(!EnterpriseLongitude.isEmpty()) {
		EnterpriseLongitudePathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseLongitudePath"))));
//		EnterpriseLongitudePathElem.clear();
		EnterpriseLongitudePathElem.sendKeys(Keys.CONTROL, "a");
		EnterpriseLongitudePathElem.sendKeys(Keys.DELETE);
		EnterpriseLongitudePathElem.sendKeys(EnterpriseLongitude);
		 	}else {
		 		EnterpriseLongitudePathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseLongitudePath"))));
//		 		EnterpriseLongitudePathElem.clear();
		 		EnterpriseLongitudePathElem.sendKeys(Keys.CONTROL, "a");
		 		EnterpriseLongitudePathElem.sendKeys(Keys.DELETE);
		 	}

	EnterpriseSettingsBlockButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseSettingsBlockButton"))));
	Thread.sleep(1000);
	EnterpriseSettingsBlockButtonElem.click();

	WebElement EnterpriseAppTitlePathElem;
	WebElement EnterpriseFleetCommonNamePathElem;
	WebElement EnterpriseMaxLimitActiveReservationsPerUserPathElem;
	WebElement EnterpriseAdvancedReservationWindowinDaysPathElem;
	WebElement EnterpriseMaxReservationsWindowInHoursPathElem;
	WebElement EnterpriseReservationReminderWindowInMinutesPathElem;
	WebElement EnterpriseFleetReservationAutoExpiryInHoursPathElem;
	WebElement EnterpriseGracePeriodInMinutesPathElem;
	WebElement EnterpriseInActiveTimeoutInMinutesPathElem;
	WebElement EnterpriseCheckInWindowInMinutesPathElem;

	if(!EnterpriseAppTitle.isEmpty()) {
		EnterpriseAppTitlePathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseAppTitlePath"))));
//		EnterpriseAppTitlePathElem.clear();
		EnterpriseAppTitlePathElem.sendKeys(Keys.CONTROL, "a");
		EnterpriseAppTitlePathElem.sendKeys(Keys.DELETE);
		EnterpriseAppTitlePathElem.sendKeys(EnterpriseAppTitle);
		 	}else {
		 		EnterpriseAppTitlePathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseAppTitlePath"))));
//		 		EnterpriseAppTitlePathElem.clear(); 		
		 		EnterpriseAppTitlePathElem.sendKeys(Keys.CONTROL, "a");
		 		EnterpriseAppTitlePathElem.sendKeys(Keys.DELETE);
		 	}
	if(!EnterpriseFleetCommonName.isEmpty()) {
		EnterpriseFleetCommonNamePathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseFleetCommonNamePath"))));
//		EnterpriseFleetCommonNamePathElem.clear();
		EnterpriseFleetCommonNamePathElem.sendKeys(Keys.CONTROL, "a");
		EnterpriseFleetCommonNamePathElem.sendKeys(Keys.DELETE);
		EnterpriseFleetCommonNamePathElem.sendKeys(EnterpriseFleetCommonName);
		 	}else {
		 		EnterpriseFleetCommonNamePathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseFleetCommonNamePath"))));
//		 		EnterpriseFleetCommonNamePathElem.clear();
		 		EnterpriseFleetCommonNamePathElem.sendKeys(Keys.CONTROL, "a");
		 		EnterpriseFleetCommonNamePathElem.sendKeys(Keys.DELETE);
		 	}
	if(!EnterpriseMaxLimitActiveReservationsPerUser.isEmpty()) {
		EnterpriseMaxLimitActiveReservationsPerUserPathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseMaxLimitActiveReservationsPerUserPath"))));
//		EnterpriseMaxLimitActiveReservationsPerUserPathElem.clear();
		EnterpriseMaxLimitActiveReservationsPerUserPathElem.sendKeys(Keys.CONTROL, "a");
		EnterpriseMaxLimitActiveReservationsPerUserPathElem.sendKeys(Keys.DELETE);
		EnterpriseMaxLimitActiveReservationsPerUserPathElem.sendKeys(EnterpriseMaxLimitActiveReservationsPerUser);
		 	}else {
		 		EnterpriseMaxLimitActiveReservationsPerUserPathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseMaxLimitActiveReservationsPerUserPath"))));
//		 		EnterpriseMaxLimitActiveReservationsPerUserPathElem.clear();
		 		EnterpriseMaxLimitActiveReservationsPerUserPathElem.sendKeys(Keys.CONTROL, "a");
		 		EnterpriseMaxLimitActiveReservationsPerUserPathElem.sendKeys(Keys.DELETE);
		 	}
	if(!EnterpriseAdvancedReservationWindowinDays.isEmpty()) {
		EnterpriseAdvancedReservationWindowinDaysPathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseAdvancedReservationWindowinDaysPath"))));
//		EnterpriseAdvancedReservationWindowinDaysPathElem.clear();
		EnterpriseAdvancedReservationWindowinDaysPathElem.sendKeys(Keys.CONTROL, "a");
		EnterpriseAdvancedReservationWindowinDaysPathElem.sendKeys(Keys.DELETE);
		EnterpriseAdvancedReservationWindowinDaysPathElem.sendKeys(EnterpriseAdvancedReservationWindowinDays);
		 	}else {
		 		EnterpriseAdvancedReservationWindowinDaysPathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseAdvancedReservationWindowinDaysPath"))));
//		 		EnterpriseAdvancedReservationWindowinDaysPathElem.clear();
		 		EnterpriseAdvancedReservationWindowinDaysPathElem.sendKeys(Keys.CONTROL, "a");
		 		EnterpriseAdvancedReservationWindowinDaysPathElem.sendKeys(Keys.DELETE);
		 	}
	if(!EnterpriseMaxReservationsWindowInHours.isEmpty()) {
		EnterpriseMaxReservationsWindowInHoursPathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseMaxReservationsWindowInHoursPath"))));
//		EnterpriseMaxReservationsWindowInHoursPathElem.clear();
		EnterpriseMaxReservationsWindowInHoursPathElem.sendKeys(Keys.CONTROL, "a");
		EnterpriseMaxReservationsWindowInHoursPathElem.sendKeys(Keys.DELETE);
		EnterpriseMaxReservationsWindowInHoursPathElem.sendKeys(EnterpriseMaxReservationsWindowInHours);
		 	}else {
		 		EnterpriseMaxReservationsWindowInHoursPathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseMaxReservationsWindowInHoursPath"))));
//		 		EnterpriseMaxReservationsWindowInHoursPathElem.clear();
		 		EnterpriseMaxReservationsWindowInHoursPathElem.sendKeys(Keys.CONTROL, "a");
		 		EnterpriseMaxReservationsWindowInHoursPathElem.sendKeys(Keys.DELETE);
		 	}
	if(!EnterpriseReservationReminderWindowInMinutes.isEmpty()) {
		EnterpriseReservationReminderWindowInMinutesPathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseReservationReminderWindowInMinutesPath"))));
//		EnterpriseReservationReminderWindowInMinutesPathElem.clear();
		EnterpriseReservationReminderWindowInMinutesPathElem.sendKeys(Keys.CONTROL, "a");
		EnterpriseReservationReminderWindowInMinutesPathElem.sendKeys(Keys.DELETE);
		EnterpriseReservationReminderWindowInMinutesPathElem.sendKeys(EnterpriseReservationReminderWindowInMinutes);
		 	}else {
		 		EnterpriseReservationReminderWindowInMinutesPathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseReservationReminderWindowInMinutesPath"))));
//		 		EnterpriseReservationReminderWindowInMinutesPathElem.clear();
		 		EnterpriseReservationReminderWindowInMinutesPathElem.sendKeys(Keys.CONTROL, "a");
		 		EnterpriseReservationReminderWindowInMinutesPathElem.sendKeys(Keys.DELETE);
		 	}
	if(!EnterpriseFleetReservationAutoExpiryInHours.isEmpty()) {
		EnterpriseFleetReservationAutoExpiryInHoursPathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseFleetReservationAutoExpiryInHoursPath"))));
//		EnterpriseFleetReservationAutoExpiryInHoursPathElem.clear();
		EnterpriseFleetReservationAutoExpiryInHoursPathElem.sendKeys(Keys.CONTROL, "a");
		EnterpriseFleetReservationAutoExpiryInHoursPathElem.sendKeys(Keys.DELETE);
		EnterpriseFleetReservationAutoExpiryInHoursPathElem.sendKeys(EnterpriseFleetReservationAutoExpiryInHours);
		 	}else {
		 		EnterpriseFleetReservationAutoExpiryInHoursPathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseFleetReservationAutoExpiryInHoursPath"))));
//		 		EnterpriseFleetReservationAutoExpiryInHoursPathElem.clear();
		 		EnterpriseFleetReservationAutoExpiryInHoursPathElem.sendKeys(Keys.CONTROL, "a");
		 		EnterpriseFleetReservationAutoExpiryInHoursPathElem.sendKeys(Keys.DELETE);
		 	}
	if(!EnterpriseGracePeriodInMinutes.isEmpty()) {
		EnterpriseGracePeriodInMinutesPathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseGracePeriodInMinutesPath"))));
//		EnterpriseGracePeriodInMinutesPathElem.clear();
		EnterpriseGracePeriodInMinutesPathElem.sendKeys(Keys.CONTROL, "a");
		EnterpriseGracePeriodInMinutesPathElem.sendKeys(Keys.DELETE);
		EnterpriseGracePeriodInMinutesPathElem.sendKeys(EnterpriseGracePeriodInMinutes);
		 	}else {
		 		EnterpriseGracePeriodInMinutesPathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseGracePeriodInMinutesPath"))));
//		 		EnterpriseGracePeriodInMinutesPathElem.clear();
		 		EnterpriseGracePeriodInMinutesPathElem.sendKeys(Keys.CONTROL, "a");
		 		EnterpriseGracePeriodInMinutesPathElem.sendKeys(Keys.DELETE);
		 	}
	if(!EnterpriseInActiveTimeoutInMinutes.isEmpty()) {
		EnterpriseInActiveTimeoutInMinutesPathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseInActiveTimeoutInMinutesPath"))));
//		EnterpriseInActiveTimeoutInMinutesPathElem.clear();
		EnterpriseInActiveTimeoutInMinutesPathElem.sendKeys(Keys.CONTROL, "a");
		EnterpriseInActiveTimeoutInMinutesPathElem.sendKeys(Keys.DELETE);
		EnterpriseInActiveTimeoutInMinutesPathElem.sendKeys(EnterpriseInActiveTimeoutInMinutes);
		 	}else {
		 		EnterpriseInActiveTimeoutInMinutesPathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseInActiveTimeoutInMinutesPath"))));
//		 		EnterpriseInActiveTimeoutInMinutesPathElem.clear();
		 		EnterpriseInActiveTimeoutInMinutesPathElem.sendKeys(Keys.CONTROL, "a");
		 		EnterpriseInActiveTimeoutInMinutesPathElem.sendKeys(Keys.DELETE);
		 	}
	if(!EnterpriseCheckInWindowInMinutes.isEmpty()) {
		EnterpriseCheckInWindowInMinutesPathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseCheckInWindowInMinutesPath"))));
//		EnterpriseCheckInWindowInMinutesPathElem.clear();
		EnterpriseCheckInWindowInMinutesPathElem.sendKeys(Keys.CONTROL, "a");
		EnterpriseCheckInWindowInMinutesPathElem.sendKeys(Keys.DELETE);
		EnterpriseCheckInWindowInMinutesPathElem.sendKeys(EnterpriseCheckInWindowInMinutes);
		 	}else {
		 		EnterpriseCheckInWindowInMinutesPathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseCheckInWindowInMinutesPath"))));
//		 		EnterpriseCheckInWindowInMinutesPathElem.clear();
		 		EnterpriseCheckInWindowInMinutesPathElem.sendKeys(Keys.CONTROL, "a");
		 		EnterpriseCheckInWindowInMinutesPathElem.sendKeys(Keys.DELETE);
		 	}
		
	biltoDetailsBlockElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_BillToDetailsBlock"))));
	biltoDetailsBlockElem.click();

	WebElement EnterpriseBillToDetailsAddressLine1PathElem;
	WebElement EnterpriseBillToDetailsCityPathElem;
	WebElement EnterpriseBillToDetailsZipCodePathElem;

	if(!EnterpriseBillToDetailsAddressLine1.isEmpty()) {
		EnterpriseBillToDetailsAddressLine1PathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseBillToDetailsAddressLine1Path"))));
//		EnterpriseBillToDetailsAddressLine1PathElem.clear();
		EnterpriseBillToDetailsAddressLine1PathElem.sendKeys(Keys.CONTROL, "a");
		EnterpriseBillToDetailsAddressLine1PathElem.sendKeys(Keys.DELETE);
		EnterpriseBillToDetailsAddressLine1PathElem.sendKeys(EnterpriseBillToDetailsAddressLine1);
		 	}else {
		 		EnterpriseBillToDetailsAddressLine1PathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseBillToDetailsAddressLine1Path"))));
//		 		EnterpriseBillToDetailsAddressLine1PathElem.clear();
		 		EnterpriseBillToDetailsAddressLine1PathElem.sendKeys(Keys.CONTROL, "a");
		 		EnterpriseBillToDetailsAddressLine1PathElem.sendKeys(Keys.DELETE);
		 	}
	if(!EnterpriseBillToDetailsCity.isEmpty()) {
		EnterpriseBillToDetailsCityPathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseBillToDetailsCityPath"))));
//		EnterpriseBillToDetailsCityPathElem.clear();
		EnterpriseBillToDetailsCityPathElem.sendKeys(Keys.CONTROL, "a");
		EnterpriseBillToDetailsCityPathElem.sendKeys(Keys.DELETE);

		EnterpriseBillToDetailsCityPathElem.sendKeys(EnterpriseBillToDetailsCity);
		 	}else {
		 		EnterpriseBillToDetailsCityPathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseBillToDetailsCityPath"))));
//		 		EnterpriseBillToDetailsCityPathElem.clear();
		 		EnterpriseBillToDetailsCityPathElem.sendKeys(Keys.CONTROL, "a");
		 		EnterpriseBillToDetailsCityPathElem.sendKeys(Keys.DELETE);
		 	}
	if(!EnterpriseBillToDetailsZipCode.isEmpty()) {
		EnterpriseBillToDetailsZipCodePathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseBillToDetailsZipCodePath"))));
//		EnterpriseBillToDetailsZipCodePathElem.clear();
		EnterpriseBillToDetailsZipCodePathElem.sendKeys(Keys.CONTROL, "a");
		EnterpriseBillToDetailsZipCodePathElem.sendKeys(Keys.DELETE);
		EnterpriseBillToDetailsZipCodePathElem.sendKeys(EnterpriseBillToDetailsZipCode);
		 	}else {
		 		EnterpriseBillToDetailsZipCodePathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseBillToDetailsZipCodePath"))));
//		 		EnterpriseBillToDetailsZipCodePathElem.clear();
		 		EnterpriseBillToDetailsZipCodePathElem.sendKeys(Keys.CONTROL, "a");
		 		EnterpriseBillToDetailsZipCodePathElem.sendKeys(Keys.DELETE);
		 	}

	if(!creditCardTypeList.isEmpty()) {
		creditCardTypeListFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_CreditCardType"))));;
		Select creditCardTypeListfield = new Select(creditCardTypeListFieldElem); 		
		creditCardTypeListfield.selectByVisibleText(creditCardTypeList);
		 	}

	if(!creaditCardField.isEmpty()) {
		creaditCardFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_CreaditCard"))));
//		creaditCardFieldElem.clear();
		creaditCardFieldElem.sendKeys(Keys.CONTROL, "a");
		creaditCardFieldElem.sendKeys(Keys.DELETE);
		creaditCardFieldElem.sendKeys(creaditCardField);
		 	}else {
		 		creaditCardFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_CreaditCard"))));
//		 		creaditCardFieldElem.clear();
		 		creaditCardFieldElem.sendKeys(Keys.CONTROL, "a");
		 		creaditCardFieldElem.sendKeys(Keys.DELETE);
		 	}
	if(!creaditCardNameField.isEmpty()) {
		creaditCardNameFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_creaditCardName"))));
//		creaditCardNameFieldElem.clear();
		creaditCardNameFieldElem.sendKeys(Keys.CONTROL, "a");
		creaditCardNameFieldElem.sendKeys(Keys.DELETE);
		creaditCardNameFieldElem.sendKeys(creaditCardNameField);
		 	}else {
		 		creaditCardNameFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_creaditCardName"))));
		 		creaditCardNameFieldElem.sendKeys(Keys.CONTROL, "a");
		 		creaditCardNameFieldElem.sendKeys(Keys.DELETE); 		
		 	}

	if(!creditCardMonthListField.isEmpty()) {
		creditCardMonthListFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_CreaditCardMonth"))));	
		Select creditCardMnthListfield = new Select(creditCardMonthListFieldElem); 		
		creditCardMnthListfield.selectByVisibleText(creditCardMonthListField);
	 	}
	if(!creditCardYearListField.isEmpty()) {
		creditCardYearListFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_CreaditCardYear"))));	
		Select creditCardYearListfield = new Select(creditCardYearListFieldElem); 		
		creditCardYearListfield.selectByVisibleText(creditCardYearListField);
		}

	if(!CVVField.isEmpty()) {
		CVVFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_CVVNumber"))));
//		CVVFieldElem.clear();
		CVVFieldElem.sendKeys(Keys.CONTROL, "a");
		CVVFieldElem.sendKeys(Keys.DELETE);
		CVVFieldElem.sendKeys(CVVField);
		 	}else {
		 		CVVFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_CVVNumber"))));
//		 		CVVFieldElem.clear();
		 		CVVFieldElem.sendKeys(Keys.CONTROL, "a");
		 		CVVFieldElem.sendKeys(Keys.DELETE);	 		
		 	}
		Thread.sleep(2000);
	enterpriseSubmitBtnElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_SubmitButton"))));
	enterpriseSubmitBtnElem.click();
		 	}
		
	public void Enterprise_Create_CloseBotton_Validation_Check() {
		WebElement EnterpriseCreateCloseButtonElem;
		
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);					
		EnterpriseCreateCloseButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseAdd_CloseButton"))));
		EnterpriseCreateCloseButtonElem.click();

	}
	//Enterprises_Add/Create Validation Check End

	//Enterprise_Edit Validation Check Start

	Properties prop;
	public void EnterpriseEdit_SearchEnterprise() throws FileNotFoundException, IOException, InterruptedException {
		
		prop = new Properties();
	    prop.load(new FileInputStream("serenity.properties"));
		WebDriverWait wait = new WebDriverWait(this.getDriver(),20);
		WebElement SearchEnterpriseFieldPathElem;
		WebElement Search_ClickElem;
		Thread.sleep(2000);
		SearchEnterpriseFieldPathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Search"))));
		SearchEnterpriseFieldPathElem.sendKeys(prop.getProperty("SearchEnterpriseEditValidationRecodData"));
		Search_ClickElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Search_Click"))));
		Search_ClickElem.click();
	}

	public void CLickonEnterpriseEditButton() {
		
		WebElement EnterpsriseEditButtonValidationElem;
		WebDriverWait wait = new WebDriverWait(this.getDriver(),20);
		EnterpsriseEditButtonValidationElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpsriseEditButtonValidation"))));
		EnterpsriseEditButtonValidationElem.click();

	}

	public void Enterprise_Edit_ValidationCheckMainBlock(String EnterpriseWebsite, 
			String EnterpriseEmployerIDNumber, String EnterpriseDescription, String EnterpriseWorkNumber, 
			String EnterpriseEmailID, String EnterpriseAdminEmailID, String EnterpriseAddressLine1, 
			String EnterpriseCity, String EnterpriseZipCode, String EnterpriseLatitude, String EnterpriseLongitude,
			String EnterpriseAppTitle, String EnterpriseFleetCommonName, String EnterpriseMaxLimitActiveReservationsPerUser,
			String EnterpriseAdvancedReservationWindowinDays, String EnterpriseMaxReservationsWindowInHours,
			String EnterpriseReservationReminderWindowInMinutes, String EnterpriseFleetReservationAutoExpiryInHours,
			String EnterpriseGracePeriodInMinutes, String EnterpriseInActiveTimeoutInMinutes,
			String EnterpriseCheckInWindowInMinutes, String EnterpriseBillToDetailsAddressLine1, String EnterpriseBillToDetailsCity,
			String EnterpriseBillToDetailsZipCode, String creditCardTypeList, String creaditCardField, String creaditCardNameField,
			String creditCardMonthListField, String creditCardYearListField, String CVVField) throws InterruptedException {

		Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);					
	if(!EnterpriseWebsite.isEmpty()) {
		websitefieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesEdit_Website"))));
//		websitefieldElem.clear();
		websitefieldElem.sendKeys(Keys.CONTROL, "a");
		websitefieldElem.sendKeys(Keys.DELETE);
		websitefieldElem.sendKeys(EnterpriseWebsite);
		 	}else {
		 		websitefieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesEdit_Website"))));
//		 		websitefieldElem.clear(); 		
		 		websitefieldElem.sendKeys(Keys.CONTROL, "a");
		 		websitefieldElem.sendKeys(Keys.DELETE);
		 	}
	if(!EnterpriseEmployerIDNumber.isEmpty()) {
		employerIDNumberFieldElem =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesEdit_EmployerId"))));
//		employerIDNumberFieldElem.clear();
		employerIDNumberFieldElem.sendKeys(Keys.CONTROL, "a");
		employerIDNumberFieldElem.sendKeys(Keys.DELETE);
		employerIDNumberFieldElem.sendKeys(EnterpriseEmployerIDNumber);
		 	}else {
		 		employerIDNumberFieldElem =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesEdit_EmployerId"))));
//		 		employerIDNumberFieldElem.clear(); 		
		 		employerIDNumberFieldElem.sendKeys(Keys.CONTROL, "a");
		 		employerIDNumberFieldElem.sendKeys(Keys.DELETE);
		 		
		 	}

	if(!EnterpriseDescription.isEmpty()) {
		descriptionFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesEdit_Description"))));
//		descriptionFieldElem.clear();
		descriptionFieldElem.sendKeys(Keys.CONTROL, "a");
		descriptionFieldElem.sendKeys(Keys.DELETE);
		
		descriptionFieldElem.sendKeys(EnterpriseDescription);
		 	}else {
		 		descriptionFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesEdit_Description"))));
//		 		descriptionFieldElem.clear();
		 		descriptionFieldElem.sendKeys(Keys.CONTROL, "a");
		 		descriptionFieldElem.sendKeys(Keys.DELETE);
		 		
		 	}


	contactDetailsBlockElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesEdit_ContactDetailsBlock"))));
	contactDetailsBlockElem.click();
	Thread.sleep(2000);

	if(!EnterpriseWorkNumber.isEmpty()) {
	workNumberFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesEdit_WorkNumber"))));
	workNumberFieldElem.sendKeys(Keys.CONTROL, "a");
	workNumberFieldElem.sendKeys(Keys.DELETE);
		
	//workNumberFieldElem.clear();
	workNumberFieldElem.sendKeys(EnterpriseWorkNumber);
	 	}else {
	 		workNumberFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesEdit_WorkNumber"))));
//	 		workNumberFieldElem.clear();
	 		workNumberFieldElem.sendKeys(Keys.CONTROL, "a");
	 		workNumberFieldElem.sendKeys(Keys.DELETE);
	 	}

	if(!EnterpriseEmailID.isEmpty()) {
	EmailIDFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesEdit_EmailID"))));
	//EmailIDFieldElem.clear();
	EmailIDFieldElem.sendKeys(Keys.CONTROL, "a");
	EmailIDFieldElem.sendKeys(Keys.DELETE);
	EmailIDFieldElem.sendKeys(EnterpriseEmailID);
	 	}else {
	EmailIDFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesEdit_EmailID"))));
	//EmailIDFieldElem.clear();	 		
	EmailIDFieldElem.sendKeys(Keys.CONTROL, "a");
	EmailIDFieldElem.sendKeys(Keys.DELETE);
	 	}

	if(!EnterpriseAdminEmailID.isEmpty()) {
	advancedEmailIDFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesEdit_AdminEmailID"))));
	//advancedEmailIDFieldElem.clear();
	advancedEmailIDFieldElem.sendKeys(Keys.CONTROL, "a");
	advancedEmailIDFieldElem.sendKeys(Keys.DELETE);
	advancedEmailIDFieldElem.sendKeys(EnterpriseAdminEmailID);
	 	}else {
	advancedEmailIDFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesEdit_AdminEmailID"))));
	//advancedEmailIDFieldElem.clear();	 		
	advancedEmailIDFieldElem.sendKeys(Keys.CONTROL, "a");
	advancedEmailIDFieldElem.sendKeys(Keys.DELETE);
	 	}

	addressDetailsBlockElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesEdit_AddressDetailsBlock"))));
	addressDetailsBlockElem.click();

	if(!EnterpriseAddressLine1.isEmpty()) {
	addressLine1FieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesEdit_AddressLine1"))));
	//addressLine1FieldElem.clear();
	addressLine1FieldElem.sendKeys(Keys.CONTROL, "a");
	addressLine1FieldElem.sendKeys(Keys.DELETE);
	addressLine1FieldElem.sendKeys(EnterpriseAddressLine1);
	 	}else {
	 		addressLine1FieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesEdit_AddressLine1"))));
//	 		addressLine1FieldElem.clear();
	 		addressLine1FieldElem.sendKeys(Keys.CONTROL, "a");
	 		addressLine1FieldElem.sendKeys(Keys.DELETE);
	 		}

	if(!EnterpriseCity.isEmpty()) {
	cityFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesEdit_City"))));
	//cityFieldElem.clear();
	cityFieldElem.sendKeys(Keys.CONTROL, "a");
	cityFieldElem.sendKeys(Keys.DELETE);
	cityFieldElem.sendKeys(EnterpriseCity);
	 	}else {
	 		cityFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesEdit_City"))));
//	 		cityFieldElem.clear();
	 		cityFieldElem.sendKeys(Keys.CONTROL, "a");
	 		cityFieldElem.sendKeys(Keys.DELETE);
	 	}

	if(!EnterpriseZipCode.isEmpty()) {
	zipFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesEdit_ZipCode"))));
	//zipFieldElem.clear();
	zipFieldElem.sendKeys(Keys.CONTROL, "a");
	zipFieldElem.sendKeys(Keys.DELETE);
	zipFieldElem.sendKeys(EnterpriseZipCode);
	 	}else {
	 		zipFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesEdit_ZipCode"))));
//	 		zipFieldElem.clear();
	 		zipFieldElem.sendKeys(Keys.CONTROL, "a");
	 		zipFieldElem.sendKeys(Keys.DELETE);
	 	}

	WebElement EnterpriseLatitudePathElem;
	WebElement EnterpriseLongitudePathElem;
	WebElement EnterpriseSettingsBlockButtonElem;

	if(!EnterpriseLatitude.isEmpty()) {
	EnterpriseLatitudePathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseEditValidation_Latitude"))));
	//EnterpriseLatitudePathElem.clear();
	EnterpriseLatitudePathElem.sendKeys(Keys.CONTROL, "a");
	EnterpriseLatitudePathElem.sendKeys(Keys.DELETE);
	EnterpriseLatitudePathElem.sendKeys(EnterpriseLatitude);
	 	}else {
	 		EnterpriseLatitudePathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseEditValidation_Latitude"))));
//	 		EnterpriseLatitudePathElem.clear();
	 		EnterpriseLatitudePathElem.sendKeys(Keys.CONTROL, "a");
	 		EnterpriseLatitudePathElem.sendKeys(Keys.DELETE);
	 	}
	if(!EnterpriseLongitude.isEmpty()) {
	EnterpriseLongitudePathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseEditValidation_Longitude"))));
	//EnterpriseLongitudePathElem.clear();
	EnterpriseLongitudePathElem.sendKeys(Keys.CONTROL, "a");
	EnterpriseLongitudePathElem.sendKeys(Keys.DELETE);
	EnterpriseLongitudePathElem.sendKeys(EnterpriseLongitude);
	 	}else {
	 		EnterpriseLongitudePathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseEditValidation_Longitude"))));
//	 		EnterpriseLongitudePathElem.clear();
	 		EnterpriseLongitudePathElem.sendKeys(Keys.CONTROL, "a");
	 		EnterpriseLongitudePathElem.sendKeys(Keys.DELETE);
	 	}

	EnterpriseSettingsBlockButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseEditValidationSettingsBlock"))));
	Thread.sleep(1000);
	EnterpriseSettingsBlockButtonElem.click();

	WebElement EnterpriseAppTitlePathElem;
	WebElement EnterpriseFleetCommonNamePathElem;
	WebElement EnterpriseMaxLimitActiveReservationsPerUserPathElem;
	WebElement EnterpriseAdvancedReservationWindowinDaysPathElem;
	WebElement EnterpriseMaxReservationsWindowInHoursPathElem;
	WebElement EnterpriseReservationReminderWindowInMinutesPathElem;
	WebElement EnterpriseFleetReservationAutoExpiryInHoursPathElem;
	WebElement EnterpriseGracePeriodInMinutesPathElem;
	WebElement EnterpriseInActiveTimeoutInMinutesPathElem;
	WebElement EnterpriseCheckInWindowInMinutesPathElem;

	if(!EnterpriseAppTitle.isEmpty()) {
	EnterpriseAppTitlePathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseEditValidationAppTitle"))));
	//EnterpriseAppTitlePathElem.clear();
	EnterpriseAppTitlePathElem.sendKeys(Keys.CONTROL, "a");
	EnterpriseAppTitlePathElem.sendKeys(Keys.DELETE);
	EnterpriseAppTitlePathElem.sendKeys(EnterpriseAppTitle);
	 	}else {
	 		EnterpriseAppTitlePathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseEditValidationAppTitle"))));
//	 		EnterpriseAppTitlePathElem.clear(); 		
	 		EnterpriseAppTitlePathElem.sendKeys(Keys.CONTROL, "a");
	 		EnterpriseAppTitlePathElem.sendKeys(Keys.DELETE);
	 	}
	if(!EnterpriseFleetCommonName.isEmpty()) {
	EnterpriseFleetCommonNamePathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseEditValidationCommonFleet"))));
	//EnterpriseFleetCommonNamePathElem.clear();
	EnterpriseFleetCommonNamePathElem.sendKeys(Keys.CONTROL, "a");
	EnterpriseFleetCommonNamePathElem.sendKeys(Keys.DELETE);
	EnterpriseFleetCommonNamePathElem.sendKeys(EnterpriseFleetCommonName);
	 	}else {
	 		EnterpriseFleetCommonNamePathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseEditValidationCommonFleet"))));
//	 		EnterpriseFleetCommonNamePathElem.clear();
	 		EnterpriseFleetCommonNamePathElem.sendKeys(Keys.CONTROL, "a");
	 		EnterpriseFleetCommonNamePathElem.sendKeys(Keys.DELETE);
	 	}
	if(!EnterpriseMaxLimitActiveReservationsPerUser.isEmpty()) {
	EnterpriseMaxLimitActiveReservationsPerUserPathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseEditValidationMaxLimitActiveReservationsPerUser"))));
	//EnterpriseMaxLimitActiveReservationsPerUserPathElem.clear();
	EnterpriseMaxLimitActiveReservationsPerUserPathElem.sendKeys(Keys.CONTROL, "a");
	EnterpriseMaxLimitActiveReservationsPerUserPathElem.sendKeys(Keys.DELETE);
	EnterpriseMaxLimitActiveReservationsPerUserPathElem.sendKeys(EnterpriseMaxLimitActiveReservationsPerUser);
	 	}else {
	 		EnterpriseMaxLimitActiveReservationsPerUserPathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseEditValidationMaxLimitActiveReservationsPerUser"))));
//	 		EnterpriseMaxLimitActiveReservationsPerUserPathElem.clear();
	 		EnterpriseMaxLimitActiveReservationsPerUserPathElem.sendKeys(Keys.CONTROL, "a");
	 		EnterpriseMaxLimitActiveReservationsPerUserPathElem.sendKeys(Keys.DELETE);
	 	}
	if(!EnterpriseAdvancedReservationWindowinDays.isEmpty()) {
	EnterpriseAdvancedReservationWindowinDaysPathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseEditValidationAdvancedReservationWindowinDays"))));
	//EnterpriseAdvancedReservationWindowinDaysPathElem.clear();
	EnterpriseAdvancedReservationWindowinDaysPathElem.sendKeys(Keys.CONTROL, "a");
	EnterpriseAdvancedReservationWindowinDaysPathElem.sendKeys(Keys.DELETE);
	EnterpriseAdvancedReservationWindowinDaysPathElem.sendKeys(EnterpriseAdvancedReservationWindowinDays);
	 	}else {
	 		EnterpriseAdvancedReservationWindowinDaysPathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseEditValidationAdvancedReservationWindowinDays"))));
//	 		EnterpriseAdvancedReservationWindowinDaysPathElem.clear();

	EnterpriseAdvancedReservationWindowinDaysPathElem.sendKeys(Keys.CONTROL, "a");
	EnterpriseAdvancedReservationWindowinDaysPathElem.sendKeys(Keys.DELETE);
	 	}
	if(!EnterpriseMaxReservationsWindowInHours.isEmpty()) {
	EnterpriseMaxReservationsWindowInHoursPathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseEditValidationMaxReservationsWindowInHours"))));
	//EnterpriseMaxReservationsWindowInHoursPathElem.clear();

	EnterpriseMaxReservationsWindowInHoursPathElem.sendKeys(Keys.CONTROL, "a");
	EnterpriseMaxReservationsWindowInHoursPathElem.sendKeys(Keys.DELETE);
	EnterpriseMaxReservationsWindowInHoursPathElem.sendKeys(EnterpriseMaxReservationsWindowInHours);
	 	}else {
	 		EnterpriseMaxReservationsWindowInHoursPathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseEditValidationMaxReservationsWindowInHours"))));
//	 		EnterpriseMaxReservationsWindowInHoursPathElem.clear();
	 		EnterpriseMaxReservationsWindowInHoursPathElem.sendKeys(Keys.CONTROL, "a");
	 		EnterpriseMaxReservationsWindowInHoursPathElem.sendKeys(Keys.DELETE);
	 	}
	if(!EnterpriseReservationReminderWindowInMinutes.isEmpty()) {
	EnterpriseReservationReminderWindowInMinutesPathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseEditValidationReservationReminderWindowInMinutes"))));
	//EnterpriseReservationReminderWindowInMinutesPathElem.clear();
	EnterpriseReservationReminderWindowInMinutesPathElem.sendKeys(Keys.CONTROL, "a");
	EnterpriseReservationReminderWindowInMinutesPathElem.sendKeys(Keys.DELETE);
	EnterpriseReservationReminderWindowInMinutesPathElem.sendKeys(EnterpriseReservationReminderWindowInMinutes);
	 	}else {
	 		EnterpriseReservationReminderWindowInMinutesPathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseEditValidationReservationReminderWindowInMinutes"))));
//	 		EnterpriseReservationReminderWindowInMinutesPathElem.clear();
	 		EnterpriseReservationReminderWindowInMinutesPathElem.sendKeys(Keys.CONTROL, "a");
	 		EnterpriseReservationReminderWindowInMinutesPathElem.sendKeys(Keys.DELETE);
	 	}
	if(!EnterpriseFleetReservationAutoExpiryInHours.isEmpty()) {
	EnterpriseFleetReservationAutoExpiryInHoursPathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseEditValidationFleetReservationAutoExpiryInHours"))));
	//EnterpriseFleetReservationAutoExpiryInHoursPathElem.clear();
	EnterpriseFleetReservationAutoExpiryInHoursPathElem.sendKeys(Keys.CONTROL, "a");
	EnterpriseFleetReservationAutoExpiryInHoursPathElem.sendKeys(Keys.DELETE);
	EnterpriseFleetReservationAutoExpiryInHoursPathElem.sendKeys(EnterpriseFleetReservationAutoExpiryInHours);
	 	}else {
	 		EnterpriseFleetReservationAutoExpiryInHoursPathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseEditValidationFleetReservationAutoExpiryInHours"))));
//	 		EnterpriseFleetReservationAutoExpiryInHoursPathElem.clear();
	 		EnterpriseFleetReservationAutoExpiryInHoursPathElem.sendKeys(Keys.CONTROL, "a");
	 		EnterpriseFleetReservationAutoExpiryInHoursPathElem.sendKeys(Keys.DELETE);
	 	}
	if(!EnterpriseGracePeriodInMinutes.isEmpty()) {
	EnterpriseGracePeriodInMinutesPathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseEditValidationGracePeriodInMinutes"))));
	//EnterpriseGracePeriodInMinutesPathElem.clear();
	EnterpriseGracePeriodInMinutesPathElem.sendKeys(Keys.CONTROL, "a");
	EnterpriseGracePeriodInMinutesPathElem.sendKeys(Keys.DELETE);
	EnterpriseGracePeriodInMinutesPathElem.sendKeys(EnterpriseGracePeriodInMinutes);
	 	}else {
	 		EnterpriseGracePeriodInMinutesPathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseEditValidationGracePeriodInMinutes"))));
//	 		EnterpriseGracePeriodInMinutesPathElem.clear();
	 		EnterpriseGracePeriodInMinutesPathElem.sendKeys(Keys.CONTROL, "a");
	 		EnterpriseGracePeriodInMinutesPathElem.sendKeys(Keys.DELETE);
	 	}
	if(!EnterpriseInActiveTimeoutInMinutes.isEmpty()) {
	EnterpriseInActiveTimeoutInMinutesPathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseEditValidationInActiveTimeoutInMinutes"))));
	//EnterpriseInActiveTimeoutInMinutesPathElem.clear();
	EnterpriseInActiveTimeoutInMinutesPathElem.sendKeys(Keys.CONTROL, "a");
	EnterpriseInActiveTimeoutInMinutesPathElem.sendKeys(Keys.DELETE);
	EnterpriseInActiveTimeoutInMinutesPathElem.sendKeys(EnterpriseInActiveTimeoutInMinutes);
	 	}else {
	 		EnterpriseInActiveTimeoutInMinutesPathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseEditValidationInActiveTimeoutInMinutes"))));
//	 		EnterpriseInActiveTimeoutInMinutesPathElem.clear();
	 		EnterpriseInActiveTimeoutInMinutesPathElem.sendKeys(Keys.CONTROL, "a");
	 		EnterpriseInActiveTimeoutInMinutesPathElem.sendKeys(Keys.DELETE);
	 	}
	if(!EnterpriseCheckInWindowInMinutes.isEmpty()) {
	EnterpriseCheckInWindowInMinutesPathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseEditValidationCheckInWindowInMinutes"))));
	//EnterpriseCheckInWindowInMinutesPathElem.clear();
	EnterpriseCheckInWindowInMinutesPathElem.sendKeys(Keys.CONTROL, "a");
	EnterpriseCheckInWindowInMinutesPathElem.sendKeys(Keys.DELETE);
	EnterpriseCheckInWindowInMinutesPathElem.sendKeys(EnterpriseCheckInWindowInMinutes);
	 	}else {
	 		EnterpriseCheckInWindowInMinutesPathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseEditValidationCheckInWindowInMinutes"))));
//	 		EnterpriseCheckInWindowInMinutesPathElem.clear();

	EnterpriseCheckInWindowInMinutesPathElem.sendKeys(Keys.CONTROL, "a");
	EnterpriseCheckInWindowInMinutesPathElem.sendKeys(Keys.DELETE);
	 	}

	biltoDetailsBlockElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseEditValidationBillToDetalsBlock"))));
	biltoDetailsBlockElem.click();

	WebElement EnterpriseBillToDetailsAddressLine1PathElem;
	WebElement EnterpriseBillToDetailsCityPathElem;
	WebElement EnterpriseBillToDetailsZipCodePathElem;

	if(!EnterpriseBillToDetailsAddressLine1.isEmpty()) {
	EnterpriseBillToDetailsAddressLine1PathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseEditValidationBillToDetailsAddressLine1"))));
	//EnterpriseBillToDetailsAddressLine1PathElem.clear();

	EnterpriseBillToDetailsAddressLine1PathElem.sendKeys(Keys.CONTROL, "a");
	EnterpriseBillToDetailsAddressLine1PathElem.sendKeys(Keys.DELETE);
	EnterpriseBillToDetailsAddressLine1PathElem.sendKeys(EnterpriseBillToDetailsAddressLine1);
	 	}else {
	 		EnterpriseBillToDetailsAddressLine1PathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseEditValidationBillToDetailsAddressLine1"))));
//	 		EnterpriseBillToDetailsAddressLine1PathElem.clear();

	EnterpriseBillToDetailsAddressLine1PathElem.sendKeys(Keys.CONTROL, "a");
	EnterpriseBillToDetailsAddressLine1PathElem.sendKeys(Keys.DELETE);
	 	}
	if(!EnterpriseBillToDetailsCity.isEmpty()) {
	EnterpriseBillToDetailsCityPathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseEditValidationBillToDetailsCity"))));
	//EnterpriseBillToDetailsCityPathElem.clear();

	EnterpriseBillToDetailsCityPathElem.sendKeys(Keys.CONTROL, "a");
	EnterpriseBillToDetailsCityPathElem.sendKeys(Keys.DELETE);
	EnterpriseBillToDetailsCityPathElem.sendKeys(EnterpriseBillToDetailsCity);
	 	}else {
	 		EnterpriseBillToDetailsCityPathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseEditValidationBillToDetailsCity"))));
//	 		EnterpriseBillToDetailsCityPathElem.clear();

	EnterpriseBillToDetailsCityPathElem.sendKeys(Keys.CONTROL, "a");
	EnterpriseBillToDetailsCityPathElem.sendKeys(Keys.DELETE);
	 	}
	if(!EnterpriseBillToDetailsZipCode.isEmpty()) {
	EnterpriseBillToDetailsZipCodePathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseEditValidationBillToDetailsZipCode"))));
	//EnterpriseBillToDetailsZipCodePathElem.clear();

	EnterpriseBillToDetailsZipCodePathElem.sendKeys(Keys.CONTROL, "a");
	EnterpriseBillToDetailsZipCodePathElem.sendKeys(Keys.DELETE);
	EnterpriseBillToDetailsZipCodePathElem.sendKeys(EnterpriseBillToDetailsZipCode);
	 	}else {
	 		EnterpriseBillToDetailsZipCodePathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseEditValidationBillToDetailsZipCode"))));
//	 		EnterpriseBillToDetailsZipCodePathElem.clear();

	EnterpriseBillToDetailsZipCodePathElem.sendKeys(Keys.CONTROL, "a");
	EnterpriseBillToDetailsZipCodePathElem.sendKeys(Keys.DELETE);
	 	}

	if(!creditCardTypeList.isEmpty()) {
	creditCardTypeListFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseEditValidationcreditCardTypeList"))));;
	Select creditCardTypeListfield = new Select(creditCardTypeListFieldElem); 		
	creditCardTypeListfield.selectByVisibleText(creditCardTypeList);
	 	}

	if(!creaditCardField.isEmpty()) {
	creaditCardFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseEditValidationcreaditCardField"))));
	//creaditCardFieldElem.clear();

	creaditCardFieldElem.sendKeys(Keys.CONTROL, "a");
	creaditCardFieldElem.sendKeys(Keys.DELETE);
	creaditCardFieldElem.sendKeys(creaditCardField);
	 	}else {
	 		creaditCardFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseEditValidationcreaditCardField"))));
//	 		creaditCardFieldElem.clear();

	creaditCardFieldElem.sendKeys(Keys.CONTROL, "a");
	creaditCardFieldElem.sendKeys(Keys.DELETE);
	 	}
	if(!creaditCardNameField.isEmpty()) {
	creaditCardNameFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseEditValidationcreaditCardNameField"))));
	//creaditCardNameFieldElem.clear();

	creaditCardNameFieldElem.sendKeys(Keys.CONTROL, "a");
	creaditCardNameFieldElem.sendKeys(Keys.DELETE);
	creaditCardNameFieldElem.sendKeys(creaditCardNameField);
	 	}else {
	 		creaditCardNameFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseEditValidationcreaditCardNameField"))));
//	 		creaditCardNameFieldElem.clear(); 		

	creaditCardNameFieldElem.sendKeys(Keys.CONTROL, "a");
	creaditCardNameFieldElem.sendKeys(Keys.DELETE);
	 	}

	if(!creditCardMonthListField.isEmpty()) {
	creditCardMonthListFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseEditValidationcreditCardMonthListField"))));	
	Select creditCardMnthListfield = new Select(creditCardMonthListFieldElem); 		
	creditCardMnthListfield.selectByVisibleText(creditCardMonthListField);
		}
	if(!creditCardYearListField.isEmpty()) {
	creditCardYearListFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseEditValidationcreditCardYearListField"))));	
	Select creditCardYearListfield = new Select(creditCardYearListFieldElem); 		
	creditCardYearListfield.selectByVisibleText(creditCardYearListField);
	}

	if(!CVVField.isEmpty()) {
	CVVFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseEditValidationCVVField"))));
	//CVVFieldElem.clear();

	CVVFieldElem.sendKeys(Keys.CONTROL, "a");
	CVVFieldElem.sendKeys(Keys.DELETE);
	CVVFieldElem.sendKeys(CVVField);
	 		}else {
	 			CVVFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseEditValidationCVVField"))));
//	 			CVVFieldElem.clear();

	CVVFieldElem.sendKeys(Keys.CONTROL, "a");
	CVVFieldElem.sendKeys(Keys.DELETE);
	 		}

	Thread.sleep(1000);
	enterpriseSubmitBtnElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseEditValidationSubmitbutton"))));
	enterpriseSubmitBtnElem.click();
	 	
		}


	//Enterprise_Edit Validation Check End
	
	///Enterprise Inactive Validation Start

	public void EnterpriseInActiveValidationButton() throws InterruptedException {
		WebElement EnterpriseInactiveValidationPathElem;
		WebDriverWait wait = new WebDriverWait(this.getDriver(),20);
		
		EnterpriseInactiveValidationPathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseInactiveValidationPath"))));
//	Thread.sleep(5000);																																
		EnterpriseInactiveValidationPathElem.click();
	}

	public void ClickOnSubmitButtonInEnterpriseInactivePage() {
		WebElement EnterpriseInactiveValidationSubmitButtonElem;
		WebDriverWait wait = new WebDriverWait(this.getDriver(),20);
		EnterpriseInactiveValidationSubmitButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseInactiveValidationSubmitButtonPath"))));
		EnterpriseInactiveValidationSubmitButtonElem.click();
	}

	public void VerifyValidationMessageInEnterpriseInactivePage() throws FileNotFoundException, IOException, InterruptedException {
		
		Properties prop;
		prop = new Properties();
		prop.load(new FileInputStream("serenity.properties"));
			
		Thread.sleep(1000);
		String ActualvalidationMessage = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseInactiveValidationErrorMessage"))).getText();
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$"+ActualvalidationMessage);
		String ExpectedValidation= prop.getProperty("EnterpriseInactiveValidationMessageValue");
		System.out.println("###############################"+ExpectedValidation);
		Assert.assertTrue(ActualvalidationMessage.equalsIgnoreCase(ExpectedValidation));
		
		
	}


// Enterprise Inactive Validation Check End

//	Enterprise Activate Validation Check Start
	
	public void InactivateEnterpriseForValidationCheck() {
		WebElement EnterpriseInactivateReasonValidationPathElem;
		WebDriverWait wait = new WebDriverWait(this.getDriver(),20);
		
		EnterpriseInactivateReasonValidationPathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseInactivateReasonValidationPath"))));	
		Select EnterpriseInactiveValuefield = new Select(EnterpriseInactivateReasonValidationPathElem); 		
		EnterpriseInactiveValuefield.selectByVisibleText(AcceptanceSuite.props.getProperty("EnterpriseInactiveReasonValidationSelectValue"));
	}

public void VerifyValidationMessageInEnterprise_ActivePage() throws FileNotFoundException, IOException, InterruptedException {
		
		Properties prop;
		prop = new Properties();
		prop.load(new FileInputStream("serenity.properties"));
			
		Thread.sleep(1000);
		String ActualvalidationMessage = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseInactiveValidationErrorMessage"))).getText();
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$"+ActualvalidationMessage);
		String ExpectedValidation= prop.getProperty("EnterpriseInactiveValidationMessageValue");
		System.out.println("###############################"+ExpectedValidation);
		Assert.assertTrue(ActualvalidationMessage.equalsIgnoreCase(ExpectedValidation));
		
		
	}
public void Activate_EnterpriseForValidationCheck() {
	WebElement EnterpriseActivateReasonValidationPathElem;
	WebDriverWait wait = new WebDriverWait(this.getDriver(),20);
	
	EnterpriseActivateReasonValidationPathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseInactivateReasonValidationPath"))));	
	Select EnterpriseInactiveValuefield = new Select(EnterpriseActivateReasonValidationPathElem); 		
	EnterpriseInactiveValuefield.selectByVisibleText(AcceptanceSuite.props.getProperty("EnterpriseActiveReasonValidationSelectValue"));

}
	
// Enterprise Activate Validation check End

			
		}








