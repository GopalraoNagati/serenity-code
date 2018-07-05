package com.srisys.serenity.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.srisys.serenity.AcceptanceSuite;

import net.thucydides.core.pages.PageObject;



public class IndnavHelp extends PageObject {
	
	
	Properties prop;
	WebElement usernameElem;
	WebElement passwordElem;
	String defaultURL;
	
	WebElement loginButtonElem;
	WebElement lookupsElem;
	WebElement lookupsElem2;
	
	
	
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

		 
			public void clickOnHelppage() throws InterruptedException{
				
				WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
				
				lookupsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Help"))));
				lookupsElem.click();

				
			}
			

			public void helpaddpage() throws InterruptedException {
				
				WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
				WebElement helpaddElem;
				helpaddElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Add_Click"))));
				helpaddElem.click();
				
			}
			

			public void helpCreate() throws InterruptedException {
				WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
				
				Select Help = new Select(
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("HelpAdd_Page")))));
				Help.selectByVisibleText(AcceptanceSuite.props.getProperty("HelpAdd_PageData"));

				Select Feature = new Select(
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("HelpAdd_Feature")))));
				Feature.selectByVisibleText(AcceptanceSuite.props.getProperty("HelpAdd_FeatureData"));
				
				WebElement Question;
				Question = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("HelpAdd_Question"))));
				Question.sendKeys(AcceptanceSuite.props.getProperty("HelpAdd_QuestionData"));
		        
		        
		        WebElement Answer;
		        Answer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("HelpAdd_Answer"))));
		        Answer.sendKeys(AcceptanceSuite.props.getProperty("HelpAdd_AnswerData"));
		        
		        WebElement Notes;
		        Notes = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("HelpAdd_Notes"))));
		        Notes.sendKeys(AcceptanceSuite.props.getProperty("HelpAdd_NotesData"));

				
		        WebElement Helpubmit1Elem;
		        Helpubmit1Elem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("HelpAdd_Submit"))));
		        Helpubmit1Elem.click();

			}


			public void helpeditpage() throws InterruptedException {
				
				
				WebDriverWait wait=new WebDriverWait(this.getDriver(), 2000);
				WebElement helpeditElem;
				helpeditElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("HelpEdit"))));
				helpeditElem.click();

				
			}
			
			
			public void helpaddsubmitpage() throws InterruptedException {
				
				WebDriverWait wait=new WebDriverWait(this.getDriver(), 2000);
				WebElement HelpubmitElem;
				HelpubmitElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("HelpAdd_Submit"))));
				HelpubmitElem.click();
			}


			public void helpsearchpage() throws InterruptedException {
				
		        WebElement SearchElm;
		        SearchElm = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Search")));
		        SearchElm.sendKeys(AcceptanceSuite.props.getProperty("SearchData"));
		        
		        WebElement SearchclickElm;
		        SearchclickElm = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Search_Click")));
		        SearchclickElm.click();
				
			}
			
			
			public void helpsearchpage1() throws InterruptedException {
				
		        WebElement SearchElm;
		        SearchElm = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Search")));
		        SearchElm.clear();
		        SearchElm.sendKeys(AcceptanceSuite.props.getProperty("SearchviewData"));
		        
		        WebElement SearchclickElm;
		        SearchclickElm = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Search_Click")));
		        SearchclickElm.click();
				
			}
			
			

			public void HelpeditRecord() throws InterruptedException {
				WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);

				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("HelpBanner"))));
				ArrayList<String> xpaths = new ArrayList<String>();
				ArrayList<String> values = new ArrayList<String>();

				String xpathsString = AcceptanceSuite.props.getProperty("HelpEditXpath");
				String valuesString = AcceptanceSuite.props.getProperty("HelpEditValue");

				for (int i = 0; i < xpathsString.split(",").length; i++) {

					xpaths.add(xpathsString.split(",")[i]);
					System.out.println("lllllllllll" + xpaths);
					values.add(valuesString.split(",")[i]);
					System.out.println("lllllllllll" + values);
				}

				String actionXPath = AcceptanceSuite.props.getProperty("HelpEditRecord");
				String nextPageXPath = AcceptanceSuite.props.getProperty("Helppagenext");

				String searchXPath = AcceptanceSuite.props.getProperty("Helpsearchbutton");
				String searchButtonXPath = AcceptanceSuite.props.getProperty("Helpsearchclick");

				//Thread.sleep(2000);
				String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
						searchXPath, searchButtonXPath);
				System.out.println("action============" + action);
			    Thread.sleep(2000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
				 Thread.sleep(500);
				
		        WebElement AnswereditElem;
		        AnswereditElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("HelpEdit_Answer"))));
		        AnswereditElem.clear();
		        AnswereditElem.sendKeys(AcceptanceSuite.props.getProperty("HelpEdit_AnswerData"));

		        
		        WebElement NotedEdit;
		        NotedEdit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("HelpEdit_Notes"))));
		        NotedEdit.clear();
		        NotedEdit.sendKeys(AcceptanceSuite.props.getProperty("HelpEdit_NotesData"));
		        
		        WebElement SubmitEdit;
		        SubmitEdit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("HelpEdit_Submit"))));
		        SubmitEdit.click();

			}


			public void Helpviewpage() throws InterruptedException {
				
				WebDriverWait wait=new WebDriverWait(this.getDriver(), 2000);


				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("HelpBanner"))));
				ArrayList<String> xpaths = new ArrayList<String>();
				ArrayList<String> values = new ArrayList<String>();

				String xpathsString = AcceptanceSuite.props.getProperty("HelpEditXpath");
				String valuesString = AcceptanceSuite.props.getProperty("HelpViewValue");

				for (int i = 0; i < xpathsString.split(",").length; i++) {

					xpaths.add(xpathsString.split(",")[i]);
					System.out.println("lllllllllll" + xpaths);
					values.add(valuesString.split(",")[i]);
					System.out.println("lllllllllll" + values);
				}

				String actionXPath = AcceptanceSuite.props.getProperty("HelpViewRecord");
				String nextPageXPath = AcceptanceSuite.props.getProperty("Helppagenext");

				String searchXPath = AcceptanceSuite.props.getProperty("Helpsearchbutton");
				String searchButtonXPath = AcceptanceSuite.props.getProperty("Helpsearchclick");

				//Thread.sleep(2000);
				String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
						searchXPath, searchButtonXPath);
				System.out.println("action============" + action);
			    Thread.sleep(2000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
				 Thread.sleep(500);
				
		        WebElement AnswereditElem;
		        AnswereditElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("HelpViewclose"))));
		        AnswereditElem.click();
		        
				
			}

			public void HelpAdvancesearch() throws InterruptedException {
				WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
				
				lookupsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Help"))));
				lookupsElem.click();

				
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("HelpBanner"))));
				
				WebElement uieditElem;
				uieditElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Helpadvancesearch"))));
				uieditElem.click();
				
				  WebElement SearchElm;
			        SearchElm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("HelpAdvancesearchinputbuuton"))));
			        SearchElm.sendKeys(AcceptanceSuite.props.getProperty("HelpAdvancesearchinput"));
			        
			        WebElement searchsubmitElem;
			        searchsubmitElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Helpadvancesearchsubmit"))));
			        searchsubmitElem.click();
				
			}

			public void HelpDeletepage() throws InterruptedException {
				
				WebDriverWait wait=new WebDriverWait(this.getDriver(), 2000);
//WebDriverWait wait=new WebDriverWait(this.getDriver(), 2000);


				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("HelpBanner"))));
				ArrayList<String> xpaths = new ArrayList<String>();
				ArrayList<String> values = new ArrayList<String>();

				String xpathsString = AcceptanceSuite.props.getProperty("HelpEditXpath");
				String valuesString = AcceptanceSuite.props.getProperty("HelpViewValue");

				for (int i = 0; i < xpathsString.split(",").length; i++) {

					xpaths.add(xpathsString.split(",")[i]);
					System.out.println("lllllllllll" + xpaths);
					values.add(valuesString.split(",")[i]);
					System.out.println("lllllllllll" + values);
				}

				String actionXPath = AcceptanceSuite.props.getProperty("Helpdeleterecord");
				String nextPageXPath = AcceptanceSuite.props.getProperty("Helppagenext");

				String searchXPath = AcceptanceSuite.props.getProperty("Helpsearchbutton");
				String searchButtonXPath = AcceptanceSuite.props.getProperty("Helpsearchclick");

				//Thread.sleep(2000);
				String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
						searchXPath, searchButtonXPath);
				System.out.println("action============" + action);
			    Thread.sleep(2000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
				 Thread.sleep(500);
				
		        WebElement AnswereditElem;
		        AnswereditElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("HelpfinalDelete"))));
		        AnswereditElem.click();

			}


			public void HelpDeletesubmit() throws InterruptedException {
				
				WebDriverWait wait=new WebDriverWait(this.getDriver(), 2000);
				WebElement helpDelElem1;
				helpDelElem1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("HelpEdit_Submit"))));
				helpDelElem1.click();
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			// Create_Help_Validation_Check_Start
			
			public void Create_Help_Validation_Check1(String SelectPage, String SelectFeature, String HelpQuestion, String HelpAnswer) throws FileNotFoundException, IOException {
				WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
				prop = new Properties();
				prop.load(new FileInputStream("serenity.properties"));
			
				if(!SelectPage.isEmpty()) {
					Select Help1 = new Select(
							wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("HelpAdd_Page")))));
					Help1.selectByVisibleText(SelectPage);	
				}

				if(!SelectFeature.isEmpty()) {
					Select Feature = new Select(
							wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("HelpAdd_Feature")))));
					Feature.selectByVisibleText(SelectFeature);

				}
				WebElement Question1=null;
				if(!HelpQuestion.isEmpty()) {
					
					Question1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("HelpAdd_Question"))));
					Question1.clear();
					Question1.sendKeys(HelpQuestion);	
				}else {
					Question1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("HelpAdd_Question"))));
					Question1.clear();
				}
		        WebElement Answer1=null;
		        if(!HelpAnswer.isEmpty()) {
		        	Answer1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("HelpAdd_Answer"))));
			        Answer1.clear();
		        	Answer1.sendKeys(HelpAnswer);
		        }else {
		        	Answer1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("HelpAdd_Answer"))));
			        Answer1.clear();	        	
		        }
		        
			}
		
			public void CreateValidation_ClickOn_Submit_Button() {
				WebElement Helpubmit1Elem;
				WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
			
				Helpubmit1Elem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("HelpAdd_Submit"))));
		        Helpubmit1Elem.click();		
			}
			
//				Creat_Help_Validation_END	
			
//				Edit_Help_ Record Validation Check Start
			public void Click_On_Edit_Help_Record_Button_For_ValidationCheck() {
				WebElement EditButtonOfHelpPageFirstRecordElem;
				WebDriverWait wait = new WebDriverWait(this.getDriver(),20);
				EditButtonOfHelpPageFirstRecordElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EditButtonOfHelpPageFirstRecord"))));
				EditButtonOfHelpPageFirstRecordElem.click();
			}
			
			public void Clear_Answer_Field_Data_In_Edit_Help_Record_Page() {
				WebElement EditHelpPopupAnswerFieldPathElem;
				WebDriverWait wait = new WebDriverWait(this.getDriver(),20);
				EditHelpPopupAnswerFieldPathElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EditHelpPopupAnswerFieldPath"))));
//				EditHelpPopupAnswerFieldPathElem.clear();
				EditHelpPopupAnswerFieldPathElem.sendKeys(Keys.CONTROL, "a");
				EditHelpPopupAnswerFieldPathElem.sendKeys(Keys.DELETE);
				
			}
			
			public void Click_On_HelpEdit_Page_SubmitButton() throws InterruptedException {
				WebElement HelpEdit_SubmitElem1;
				WebDriverWait wait = new WebDriverWait(this.getDriver(),20);
				HelpEdit_SubmitElem1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("HelpEdit_Submit"))));
//				Thread.sleep(5000);
				HelpEdit_SubmitElem1.click();	
//				Thread.sleep(1000);
			}
			
			public void Verify_Help_Edit_Popup_validation_Message() throws InterruptedException {
			
//				WebDriverWait wait = new WebDriverWait(this.getDriver(),20);
//				Thread.sleep(1000);
				String ActualvalidationMessage = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EditHelpValidationMessagePath"))).getText();
				String ExpectedValidation = AcceptanceSuite.props.getProperty("EditHelpPopupValidationData");
				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$"+ActualvalidationMessage);
					System.out.println("###############################"+ExpectedValidation);
					Assert.assertTrue(ActualvalidationMessage.equalsIgnoreCase(ExpectedValidation));
			}
			
			
			
//				Edit Help Record Validation Check End		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

		}