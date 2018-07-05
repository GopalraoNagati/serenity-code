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



public class IndnavLookups extends PageObject {
	
	
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
	    		 WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
					
				usernameElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Indnavlogin"))));
				passwordElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Indnavpassword"))));
				loginButtonElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("IndnavSubmitbutton")));
				usernameElem.sendKeys(AcceptanceSuite.props.getProperty("userNameValue"));
				passwordElem.sendKeys(AcceptanceSuite.props.getProperty("passwordValue"));
				loginButtonElem.click();
			}
	    	 

		 
		     public void Lookupspage() throws InterruptedException{
		    	 WebDriverWait wait=new WebDriverWait(this.getDriver(), 50);
				
				lookupsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Admin_Block"))));
				lookupsElem.click();
				
				
				lookupsElem1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Lookups"))));
				lookupsElem1.click();

			}
		     
		     
		     
			public void Lookupsaddpage() throws InterruptedException{
				WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("LookupsBanner"))));
				lookupsElem2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Add_Click"))));
				lookupsElem2.click();

				
			}

		

			public void Lookupsviewpage() throws FileNotFoundException, IOException, InterruptedException {
				Thread.sleep(2000);
				prop = new Properties();
		        prop.load(new FileInputStream("serenity.properties"));
		        WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		        
		        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("LookupsBanner"))));
		        WebElement lookupsupviewElem;
		        lookupsupviewElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("LookupsView_Record"))));
		        Thread.sleep(2000);
		        lookupsupviewElem.click();

			}
			
			public void closeViewPopup(){
				 WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
				 WebElement lookupsupviewCloseElem;
			     lookupsupviewCloseElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("LookupsView_CloseButton"))));
			     lookupsupviewCloseElem.click();

			       
			}
			

			public void Lookupseditpage() throws InterruptedException {
				WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("LookupsBanner"))));
				
				WebElement lookupsupeditElem;
				lookupsupeditElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("LookupsEdit_Record"))));
				lookupsupeditElem.click();
				
				
				WebElement lookupsupeditenbledElem;
				lookupsupeditenbledElem =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("LookupsEdit_Header"))));
				lookupsupeditenbledElem.click();
//				if (!lookupsupeditenbledElem.isSelected()){
//					
//					Thread.sleep(500);
//				}
				
				
				WebElement lookupsupeditsubmitElem;
				lookupsupeditsubmitElem =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("LookupsAdd_SubmitButton"))));
				lookupsupeditsubmitElem.click();
				Thread.sleep(3000);
				
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
				WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);

				Select Enterprice = new Select(
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("LookupsAdd_Enterprise")))));
				Enterprice.selectByVisibleText(AcceptanceSuite.props.getProperty("LookupsAdd_EnterpriseData"));

				Thread.sleep(1000);
				Select EnterpriceresourcesType = new Select(
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("LookupsAdd_LookupType")))));
				EnterpriceresourcesType.selectByVisibleText(AcceptanceSuite.props.getProperty("LookupsAdd_LookupTypeData"));
				
				WebElement lookupvalueElem;
				lookupvalueElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("LookupsAdd_LookupValue"))));
				lookupvalueElem.sendKeys(AcceptanceSuite.props.getProperty("LookupsAdd_LookupValueData"));
		        
		        
		        WebElement commentElem;
		        commentElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("LookupsAdd_Description"))));
		        commentElem.sendKeys(AcceptanceSuite.props.getProperty("LookupsAdd_DescriptionData"));

				
		        WebElement LookupsubmitElem;
				LookupsubmitElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("LookupsAdd_SubmitButton"))));
				LookupsubmitElem.click();
				
				if ( wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("LookupAdd_ErrorMessage")))).isDisplayed()){
					System.out.println("DUPLICATE ENTRY");
					 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("LookupAdd_CloseButton")))).click();
				} 
				Thread.sleep(2000);
			}
			
			public void lookupsCreate1() throws InterruptedException{

				WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);

				Select Enterprice = new Select(
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("LookupsAdd_Enterprise")))));
				Enterprice.selectByVisibleText(AcceptanceSuite.props.getProperty("LookupsAdd_EnterpriseData"));

				Thread.sleep(1000);
				Select EnterpriceresourcesType = new Select(
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("LookupsAdd_LookupType")))));
				EnterpriceresourcesType.selectByVisibleText(AcceptanceSuite.props.getProperty("LookupsAdd_LookupTypeData1"));
				
				WebElement lookupvalueElem;
				lookupvalueElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("LookupsAdd_LookupValue"))));
				lookupvalueElem.sendKeys(AcceptanceSuite.props.getProperty("LookupsAdd_LookupValueData1"));
		        
		        
		        WebElement commentElem;
		        commentElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("LookupsAdd_Description"))));
		        commentElem.sendKeys(AcceptanceSuite.props.getProperty("LookupsAdd_DescriptionData1"));

				
		        WebElement LookupsubmitElem;
				LookupsubmitElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("LookupsAdd_SubmitButton"))));
				LookupsubmitElem.click();

				if ( wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("LookupAdd_ErrorMessage")))).isDisplayed()){
					System.out.println("DUPLICATE ENTRY 1");
					 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("LookupAdd_CloseButton")))).click();
				}
				Thread.sleep(2000);
			}
			
			public void lookupsCreate2() throws InterruptedException{

				WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);

				Select Enterprice = new Select(
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("LookupsAdd_Enterprise")))));
				Enterprice.selectByVisibleText(AcceptanceSuite.props.getProperty("LookupsAdd_EnterpriseData"));

				Thread.sleep(1000);
				Select EnterpriceresourcesType = new Select(
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("LookupsAdd_LookupType")))));
				EnterpriceresourcesType.selectByVisibleText(AcceptanceSuite.props.getProperty("LookupsAdd_LookupTypeData2"));
				
				WebElement lookupvalueElem;
				lookupvalueElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("LookupsAdd_LookupValue"))));
				lookupvalueElem.sendKeys(AcceptanceSuite.props.getProperty("LookupsAdd_LookupValueData2"));
		        
		        
		        WebElement commentElem;
		        commentElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("LookupsAdd_Description"))));
		        commentElem.sendKeys(AcceptanceSuite.props.getProperty("LookupsAdd_DescriptionData2"));

				
		        WebElement LookupsubmitElem;
				LookupsubmitElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("LookupsAdd_SubmitButton"))));
				LookupsubmitElem.click();

				if ( wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("LookupAdd_ErrorMessage")))).isDisplayed()){
					System.out.println("DUPLICATE ENTRY 2");
					 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("LookupAdd_CloseButton")))).click();
				}
				Thread.sleep(2000);
			}


			public void lookupsSearch() throws InterruptedException {
				WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
				
				 Thread.sleep(1000);
				WebElement serachElem;
				serachElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Search"))));
				serachElem.clear();
				serachElem.sendKeys(AcceptanceSuite.props.getProperty("Lookups_Search_Data"));
                Thread.sleep(1000);
				WebElement LookupserachElem;
				LookupserachElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Search_Click"))));
				LookupserachElem.click();

			}


			public void AdvancedSearch() throws InterruptedException{

				
				WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
				Thread.sleep(3000);
				
				WebElement EnterprisesAdvancedSearchButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("LookupsAdvancedSearchButton"))));
				EnterprisesAdvancedSearchButtonElem.click();
		
				WebElement EnterprisesAdvancedEnterpriseElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("LookupsAdvancedSearchEntName"))));
				EnterprisesAdvancedEnterpriseElem.sendKeys(AcceptanceSuite.props.getProperty("LookupsAdvancedSearchEntNameData"));
		
				Thread.sleep(1000);
				WebElement LookupsvalueElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("LookupvalueAdvance"))));
				LookupsvalueElem.sendKeys(AcceptanceSuite.props.getProperty("LookupvalueAdvanceData"));
		
				WebElement EnterprisesAdvancedSubmitBtnElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("LookupsAdvancedSearchSubmitButton"))));
				EnterprisesAdvancedSubmitBtnElem.click();
		
				Thread.sleep(1000);
		
			}
			
			
			
			
			
			
			
			
			// Lookup_Create_ValidationCheck_Start
			
			public void Create_Lookup_Valdations_Check(String Enterprise, String LookupType, String LookupValue, String LookupDescription) throws FileNotFoundException, IOException, InterruptedException {
						prop = new Properties();
						prop.load(new FileInputStream("serenity.properties"));
				
					Thread.sleep(2000);	
				if(!Enterprise.isEmpty()) {
					Select select1 = new Select(this.getDriver().findElement(By.xpath(prop.getProperty("LookupsAdd_Enterprise"))));
					select1.selectByVisibleText(Enterprise);
				}
				Thread.sleep(2000);
				if(!LookupType.isEmpty()) {
			
					Select select2 = new Select(this.getDriver().findElement(By.xpath(prop.getProperty("LookupsAdd_LookupType"))));
					select2.selectByVisibleText(LookupType);
				}
				WebElement lokupValuefieldElem = null;
				if(!LookupValue.isEmpty()) {
					
					lokupValuefieldElem = this.getDriver().findElement(By.xpath(prop.getProperty("LookupsAdd_LookupValue")));
					lokupValuefieldElem.clear();
					lokupValuefieldElem.sendKeys(LookupValue);
				}else {
					lokupValuefieldElem = this.getDriver().findElement(By.xpath(prop.getProperty("LookupsAdd_LookupValue")));
					lokupValuefieldElem.clear();	
				}
				WebElement descfieldElem = null;
				if(!LookupDescription.isEmpty()) {

					descfieldElem = this.getDriver().findElement(By.xpath(prop.getProperty("LookupsAdd_Description")));
					descfieldElem.clear();
					descfieldElem.sendKeys(LookupDescription);
				}else {
					descfieldElem = this.getDriver().findElement(By.xpath(prop.getProperty("LookupsAdd_Description")));
					descfieldElem.clear();
				}
				WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);	

				WebElement lookupsupeditsubmitElem;
				lookupsupeditsubmitElem =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("LookupsAdd_SubmitButton"))));
				lookupsupeditsubmitElem.click();
				
				
			}
		//Lookup_Create_ValidationCheck_End	
			
			
		



		
		}