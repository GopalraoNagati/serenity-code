package com.srisys.serenity.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.srisys.serenity.AcceptanceSuite;

import net.thucydides.core.pages.PageObject;



public class IndnavEnterpriseSettings extends PageObject {
	
	
	Properties prop;
	WebElement usernameElem;
	WebElement passwordElem;
	WebElement submitButtonElem;
	String defaultURL;
	WebElement userNameElem;
	WebElement loginButtonElem;
	WebElement lookupsElem;
	WebElement lookupsElem1;
	WebElement lookupsElem2;
	WebElement aa;
	WebElement aa1;
	WebElement lastNameElem1;
	WebElement lastNameElem2;
	WebElement lastNameElem3;
	
	
	public void openPage(){
		//this.open();
		try {
			//x();
			prop = new Properties();
			prop.load(new FileInputStream("serenity.properties"));
			//System.out.println("Properties Keyset size="+prop.keySet().size());
			defaultURL = prop.getProperty("defaultURL");
			this.getDriver().navigate().to(defaultURL);
			System.out.println("Initial Default URL"+defaultURL);

			
		} catch (Exception ex){
			System.out.println("Exception Message="+ex.getMessage());
		}
		
	}
	
	
	
	    	 public void clickOnLoginButton() throws InterruptedException{
				usernameElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Indnavlogin")));
				passwordElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Indnavpassword")));
				loginButtonElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("IndnavSubmitbutton")));
				usernameElem.sendKeys(AcceptanceSuite.props.getProperty("userNameValue"));
				passwordElem.sendKeys(AcceptanceSuite.props.getProperty("passwordValue"));
				loginButtonElem.click();
			}
	    	 

		 
		     public void EnterpriseSettingspage() throws InterruptedException{
		    	 WebDriverWait wait=new WebDriverWait(this.getDriver(), 50);
				
				lookupsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprise_Block"))));
				lookupsElem.click();
				
				
				lookupsElem1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseSettings"))));
				lookupsElem1.click();

			}
		     
		     
		     
			public void Lookupsaddpage() throws InterruptedException{
				WebDriverWait wait=new WebDriverWait(this.getDriver(), 50);
				
				lookupsElem2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Add_Click"))));
				lookupsElem2.click();

				
			}

		

			public void EnterpriseSettingsviewpage() throws FileNotFoundException, IOException, InterruptedException {
				prop = new Properties();
		        prop.load(new FileInputStream("serenity.properties"));
		        WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		        
		        WebElement lookupsupviewElem;
		        lookupsupviewElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseSettingsView_Record"))));
		        lookupsupviewElem.click();

			}
			

			public void Lookupseditpage() throws InterruptedException {
				WebElement lookupsupeditElem;
				lookupsupeditElem = this.getDriver().findElement(By.xpath(prop.getProperty("LookupsEdit_Record")));
				lookupsupeditElem.click();
				
				
				WebElement lookupsupeditenbledElem;
				lookupsupeditenbledElem = this.getDriver().findElement(By.xpath(prop.getProperty("LookupsEdit_Header")));
				lookupsupeditenbledElem.click();
				
				WebElement lookupsupeditsubmitElem;
				lookupsupeditsubmitElem = this.getDriver().findElement(By.xpath(prop.getProperty("LookupsAdd_SubmitButton")));
				lookupsupeditsubmitElem.click();
				
			}

			public void cretelookup_record(String lookupValue,
					String description) throws InterruptedException, FileNotFoundException, IOException {
				
				prop = new Properties();
				prop.load(new FileInputStream("serenity.properties"));
				
				Select select1 = new Select(this.getDriver().findElement(By.xpath(prop.getProperty("LookupsAdd_Enterprise"))));
				select1.selectByVisibleText("Srisys Corp");
				
				Select select2 = new Select(this.getDriver().findElement(By.xpath(prop.getProperty("LookupsAdd_LookupType"))));
				select2.selectByVisibleText("ADVERTISE_TYPES");
				
				WebElement lokupValuefieldElem;
				lokupValuefieldElem = this.getDriver().findElement(By.xpath(prop.getProperty("LookupsAdd_LookupValue")));
				lokupValuefieldElem.clear();
				lokupValuefieldElem.sendKeys(lookupValue);
				
				WebElement descfieldElem;
				descfieldElem = this.getDriver().findElement(By.xpath(prop.getProperty("LookupsAdd_Description")));
				descfieldElem.clear();
				descfieldElem.sendKeys(description);
				
				WebElement signUpElem;
				signUpElem = this.getDriver().findElement(By.xpath(prop.getProperty("LookupsAdd_SubmitButton")));
				signUpElem.click();
				
			}


			public void Lookupsaddsubmit() {
				WebElement signUpElem1;
				signUpElem1 = this.getDriver().findElement(By.xpath(prop.getProperty("LookupsAdd_SubmitButton")));
				signUpElem1.click();
				
			}
			

			public void lookupsCreate() throws InterruptedException{

				Select Enterprice = new Select(
						this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("LookupsAdd_Enterprise"))));
				Enterprice.selectByVisibleText(AcceptanceSuite.props.getProperty("LookupsAdd_EnterpriseData"));

				Select EnterpriceresourcesType = new Select(
						this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("LookupsAdd_LookupType"))));
				EnterpriceresourcesType.selectByVisibleText(AcceptanceSuite.props.getProperty("LookupsAdd_LookupTypeData"));
				
				WebElement lookupvalueElem;
				lookupvalueElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("LookupsAdd_LookupValue")));
				lookupvalueElem.sendKeys(AcceptanceSuite.props.getProperty("LookupsAdd_LookupValueData"));
		        
		        
		        WebElement commentElem;
		        commentElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("LookupsAdd_Description")));
		        commentElem.sendKeys(AcceptanceSuite.props.getProperty("LookupsAdd_DescriptionData"));

				
		        WebElement LookupsubmitElem;
				LookupsubmitElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("LookupsAdd_SubmitButton")));
				LookupsubmitElem.click();
			}


			public void lookupsSearch() throws InterruptedException {
				WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
				
				
				WebElement serachElem;
				serachElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Search"))));
				serachElem.sendKeys(AcceptanceSuite.props.getProperty("EnterpriseSettings_Search_Data"));

				WebElement LookupserachElem;
				LookupserachElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Search_Click"))));
				LookupserachElem.click();

			}
			
			
			
			
			
			public void AdvSearch() {
				
				WebDriverWait wait=new WebDriverWait(this.getDriver(), 5000);
				
				WebElement AdvSearch;
				AdvSearch = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdvancedSearch_Click"))));
				AdvSearch.click();
				
			}

			public void AdvSearchFields() {
			
				WebDriverWait wait=new WebDriverWait(this.getDriver(), 5000);
				
				WebElement AdvSearchEntpse;
				AdvSearchEntpse = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("LookupsAdvancedSearch_Enterprise"))));
				AdvSearchEntpse.sendKeys(AcceptanceSuite.props.getProperty("EnterpriseSettingsAdvancedSearch_EnterpriseSettingsData"));

				Select AdvSearchAvailableFleetColor = new Select(
						this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseSettingsAdvancedSearch_AvailableFleetColor"))));
				//AdvSearchAvailableFleetColor.selectByVisibleText(AcceptanceSuite.props.getProperty("EnterpriseSettingsAdvancedSearch_AvailableFleetColorData"));


				Select AdvSearchAvailableFleetColor1 = new Select(
						this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseSettingsAdvancedSearch_ReservedFleetColor"))));
				//AdvSearchAvailableFleetColor1.selectByVisibleText(AcceptanceSuite.props.getProperty("EnterpriseSettingsAdvancedSearch_ReservedFleetColorData"));

				Select AdvSearchAvailableFleetColor2 = new Select(
						this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseSettingsAdvancedSearch_InactiveFleetColor"))));
				//AdvSearchAvailableFleetColor2.selectByVisibleText(AcceptanceSuite.props.getProperty("EnterpriseSettingsAdvancedSearch_InactiveFleetColorData"));

				Select AdvSearchAvailableFleetColor3 = new Select(
						this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseSettingsAdvancedSearch_CheckinFleetColor"))));
				//AdvSearchAvailableFleetColor3.selectByVisibleText(AcceptanceSuite.props.getProperty("EnterpriseSettingsAdvancedSearch_CheckinFleetColorData"));

//				WebElement AdvSearchClearData;
//				AdvSearchClearData = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdvancedSearch_ClearData"))));
//				AdvSearchClearData.click();
				
				WebElement AdvSearchSubmit;
				AdvSearchSubmit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdvancedSearch_Submit"))));
				AdvSearchSubmit.click();

			}


			public void Pagination() {
				
				WebDriverWait wait=new WebDriverWait(this.getDriver(), 200);
				
				WebElement Nextpage;
				Nextpage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ClickNextPage"))));
				Nextpage.click();
				
				WebElement Nextbutton;
				Nextbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ClickNextButton"))));
				Nextbutton.click();

				WebElement Lastbutton;
				Lastbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ClickLastButton"))));
				Lastbutton.click();

				
				WebElement Lastbeforpage;
				Lastbeforpage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ClickBeforePage"))));
				Lastbeforpage.click();

				WebElement Previousbutton;
				Previousbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ClickPreviousButton"))));
				Previousbutton.click();

				WebElement Firstbutton;
				Firstbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ClickFirstButton"))));
				Firstbutton.click();

				
			}
			
			public void clickOnLastButton() {
				
				WebDriverWait wait=new WebDriverWait(this.getDriver(), 200);
				
				WebElement Lastbutton;
				Lastbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ClickLastButton"))));
				Lastbutton.click();

				
			}



			public void clickOnFirstPage() {
				
				WebDriverWait wait=new WebDriverWait(this.getDriver(), 200);
				WebElement Firstbutton;
				Firstbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ClickFirstButton"))));
				Firstbutton.click();

				
			}



			public void clickOnNextButton() {
				WebDriverWait wait=new WebDriverWait(this.getDriver(), 200);
				WebElement Nextbutton;
				Nextbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ClickNextButton"))));
				Nextbutton.click();

				
			}
			
			
			public void enterpriseSettingsseditRecord() throws InterruptedException {
				
				WebDriverWait wait=new WebDriverWait(this.getDriver(), 200);
				
				WebElement Nextbutton;
				Nextbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseSettingEdit_Record"))));
				Nextbutton.click();

				Select Feature1 = new Select(
				this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseSettingEdit_AvailableFleetColor"))));
	        	Feature1.selectByVisibleText(AcceptanceSuite.props.getProperty("EnterpriseSettingEdit_AvailableFleetColorData"));

				Select Feature2 = new Select(
				this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseSettingEdit_ReservedFleetColor"))));
				Feature2.selectByVisibleText(AcceptanceSuite.props.getProperty("EnterpriseSettingEdit_ReservedFleetColorData"));

				Select Feature3 = new Select(
				this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseSettingEdit_InactiveFleetColor"))));
				Feature3.selectByVisibleText(AcceptanceSuite.props.getProperty("EnterpriseSettingEdit_InactiveFleetColorData"));

				Select Feature4 = new Select(
				this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseSettingEdit_CheckinFleetColor"))));
				Feature4.selectByVisibleText(AcceptanceSuite.props.getProperty("EnterpriseSettingEdit_CheckinFleetColorData"));

		        WebElement LookupsubmitElem;
				LookupsubmitElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseSettingEdit_SubmitButton")));
				LookupsubmitElem.click();

				
//				Select Feature1 = new Select(
//						this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementAdd_AdType"))));
//				Feature1.selectByVisibleText(AcceptanceSuite.props.getProperty("AdvertisementEdit_AdTypeData"));
//				
//				}
	
			}
		
		}