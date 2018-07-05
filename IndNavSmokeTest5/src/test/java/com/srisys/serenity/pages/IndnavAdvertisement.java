package com.srisys.serenity.pages;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.srisys.serenity.AcceptanceSuite;

import net.thucydides.core.pages.PageObject;



public class IndnavAdvertisement extends PageObject {
	
	
	Properties prop;
	WebElement usernameElem;
	WebElement passwordElem;
	String defaultURL;
	
	WebElement loginButtonElem;
	WebElement lookupsElem;
	WebElement lookupsElem2;
	WebElement Descript;
	WebDriver driver;
	
	
	public void openPage(){
		//this.open();
		try {
			//x();
			prop = new Properties();
			prop.load(new FileInputStream("serenity.properties"));
			//System.out.println("Properties Keyset size="+prop.keySet().size());
			defaultURL = prop.getProperty("defaultURL");
			this.getDriver().navigate().to(defaultURL);
			System.out.println("Initial Default URLxxxxxxxxxxxxxxx"+defaultURL);

			
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

		 
		


			public void Addspage() throws InterruptedException {
				
				WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);

				WebElement adminElem;
				adminElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Admin_Block"))));
				adminElem.click();
				
				
				WebElement advsElem;
				advsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Advertisement"))));
				advsElem.click();
			}


			public void AdvtAddpage() throws InterruptedException {
				WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);	
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementBanner"))));
				
				WebElement addsaddElem;
				addsaddElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Add_Click"))));
				addsaddElem.click();
				
			}


			public void AddsCreate() throws InterruptedException {
				WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
				Select Feature = new Select(
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementAdd_Enterprise")))));
				Feature.selectByVisibleText(AcceptanceSuite.props.getProperty("AdvertisementAdd_EnterpriseData"));
				Thread.sleep(500);
				WebElement Question;
				Question = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementAdd_AdName"))));
				Question.sendKeys(AcceptanceSuite.props.getProperty("AdvertisementAdd_AdNameData"));
				Thread.sleep(500);

			
				Select Feature1 = new Select(
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementAdd_AdType")))));
				Feature1.selectByVisibleText(AcceptanceSuite.props.getProperty("AdvertisementAdd_AdTypeData"));
				Thread.sleep(1000);
				
				Descript = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementAdd_Description"))));
				Descript.sendKeys(AcceptanceSuite.props.getProperty("AdvertisementEdit_DescriptionData"));
				Thread.sleep(1000);
				WebElement addsaddElem;
				addsaddElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementAdd_UploadImage")));
				addsaddElem.click();
				Thread.sleep(1000);
				try {
					String userData	=AcceptanceSuite.props.getProperty("universamImagesuploaddata");
			    	  StringSelection ss = new StringSelection(userData);
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
				Thread.sleep(1000);
				WebElement addsadd1Elem;
				addsadd1Elem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementAdd_Submit"))));
				addsadd1Elem.click();

				
			}
			
			public void helppageaddsubmit() {
			
			WebElement addsadd2Elem;
			WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
			addsadd2Elem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("AdvertisementAdd_Submit"))));
			addsadd2Elem.click();
			}


			public void addssearchpage() {
				
				WebElement serach;
				serach = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Search")));
				serach.sendKeys(AcceptanceSuite.props.getProperty("UniversalImage_Serach"));
				
				WebElement clicksearch;
				clicksearch = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Search_Click")));
				clicksearch.click();
	
				
			}


			public void addsviewpage() throws InterruptedException {
				
				 WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
					
		            
	        	  WebElement adminElem;
				  adminElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Admin_Block"))));
				  adminElem.click();
				
				
				 WebElement advsElem;
				 advsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Advertisement"))));
				 advsElem.click();
					
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementBanner"))));
					ArrayList<String> xpaths = new ArrayList<String>();
					ArrayList<String> values = new ArrayList<String>();

					String xpathsString = AcceptanceSuite.props.getProperty("AdvertisementEdit");
					String valuesString = AcceptanceSuite.props.getProperty("AdvertisementViewValue");

					for (int i = 0; i < xpathsString.split(",").length; i++) {

						xpaths.add(xpathsString.split(",")[i]);
						System.out.println("lllllllllll" + xpaths);
						values.add(valuesString.split(",")[i]);
						System.out.println("lllllllllll" + values);
					}

					String actionXPath = AcceptanceSuite.props.getProperty("AdvertisementViewRecord");
					String nextPageXPath = AcceptanceSuite.props.getProperty("Advertisementpagenationnextbutton");

					String searchXPath = AcceptanceSuite.props.getProperty("Advertisementsearchbox");
					String searchButtonXPath = AcceptanceSuite.props.getProperty("Advertisementsearchbutton");

					//Thread.sleep(2000);
					String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
							searchXPath, searchButtonXPath);
					System.out.println("action============" + action);
				    Thread.sleep(2000);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
					WebElement Question1;
					Question1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Advertisementclose"))));
					Question1.click();
					//Question1.sendKeys(AcceptanceSuite.props.getProperty("AdvertisementEdit_AdNameData"));
					
					
					
				
			}


			public void AdvtDeletepage() throws InterruptedException {
				
				WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
				
	            
	        	  WebElement adminElem;
				  adminElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Admin_Block"))));
				  adminElem.click();
				
				
				 WebElement advsElem;
				 advsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Advertisement"))));
				 advsElem.click();
					
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementBanner"))));
					ArrayList<String> xpaths = new ArrayList<String>();
					ArrayList<String> values = new ArrayList<String>();

					String xpathsString = AcceptanceSuite.props.getProperty("AdvertisementEdit");
					String valuesString = AcceptanceSuite.props.getProperty("AdvertisementViewValue");

					for (int i = 0; i < xpathsString.split(",").length; i++) {

						xpaths.add(xpathsString.split(",")[i]);
						System.out.println("lllllllllll" + xpaths);
						values.add(valuesString.split(",")[i]);
						System.out.println("lllllllllll" + values);
					}

					String actionXPath = AcceptanceSuite.props.getProperty("AdvertisementDeleteRecord");
					String nextPageXPath = AcceptanceSuite.props.getProperty("Advertisementpagenationnextbutton");

					String searchXPath = AcceptanceSuite.props.getProperty("Advertisementsearchbox");
					String searchButtonXPath = AcceptanceSuite.props.getProperty("Advertisementsearchbutton");

					//Thread.sleep(2000);
					String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
							searchXPath, searchButtonXPath);
					System.out.println("action============" + action);
				    Thread.sleep(2000);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
					 Thread.sleep(500);
					WebElement Question1;
					Question1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementDeleteButton"))));
					Question1.click();

				
			}
			
		/*	public void addsEditRecord1() {
				
				WebElement clickviewrec;
				clickviewrec = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementEdit_AdNameData")));
				clickviewrec.click();

				
			}*/

			
			
			

			public void AddseditRecord() throws InterruptedException {
				
				
              WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
				
            
        	  WebElement adminElem;
			  adminElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Admin_Block"))));
			  adminElem.click();
			
			
			 WebElement advsElem;
			 advsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Advertisement"))));
			 advsElem.click();
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementBanner"))));
				Thread.sleep(1000);
				ArrayList<String> xpaths = new ArrayList<String>();
				ArrayList<String> values = new ArrayList<String>();

				String xpathsString = AcceptanceSuite.props.getProperty("AdvertisementEdit");
				String valuesString = AcceptanceSuite.props.getProperty("AdvertisementEditValue");

				for (int i = 0; i < xpathsString.split(",").length; i++) {

					xpaths.add(xpathsString.split(",")[i]);
					System.out.println("lllllllllll" + xpaths);
					values.add(valuesString.split(",")[i]);
					System.out.println("lllllllllll" + values);
				}

				String actionXPath = AcceptanceSuite.props.getProperty("AdvertisementEditRecord");
				String nextPageXPath = AcceptanceSuite.props.getProperty("Advertisementpagenationnextbutton");

				String searchXPath = AcceptanceSuite.props.getProperty("Advertisementsearchbox");
				String searchButtonXPath = AcceptanceSuite.props.getProperty("Advertisementsearchbutton");

				//Thread.sleep(2000);
				String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
						searchXPath, searchButtonXPath);
				System.out.println("action============" + action);
			    Thread.sleep(2000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
				WebElement Question;
				Question = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementseditAddname"))));
				Question.clear();
				Question.sendKeys(AcceptanceSuite.props.getProperty("AdvertisementEdit_AdNameData"));
				
				
//				Select Feature1 = new Select(
//						this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementAdd_AdType"))));
//				Feature1.selectByVisibleText(AcceptanceSuite.props.getProperty("AdvertisementEdit_AdTypeData"));
//				
				WebElement Question1;
				Question1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementAdd_Description"))));
				Question1.clear();
				Question1.sendKeys(AcceptanceSuite.props.getProperty("AdvertisementEdit_DescriptionData"));
				
//				WebElement addsaddElem;
//				addsaddElem = this.getDriver().findElement(By.xpath(prop.getProperty("AdvertisementAdd_UploadImage")));
//				addsaddElem.click();
//				
//				try {
//			    	  StringSelection ss = new StringSelection("/home/Mamatha.Erla/Desktop/vedic logo.png");
//					  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//					  Robot robot = new Robot();
//					  robot.keyPress(KeyEvent.VK_ENTER);
//					  robot.keyRelease(KeyEvent.VK_ENTER);
//					  robot.keyPress(KeyEvent.VK_CONTROL);
//					  robot.keyPress(KeyEvent.VK_V);
//					  robot.keyRelease(KeyEvent.VK_V);
//					  robot.keyRelease(KeyEvent.VK_CONTROL);
//					  robot.keyPress(KeyEvent.VK_ENTER);
//					  robot.keyRelease(KeyEvent.VK_ENTER);
//			
//			        } catch (AWTException e) {
//			            e.printStackTrace();
//			        }
		        
				WebElement addsadd1Elem;
				addsadd1Elem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementAdd_Submit"))));
				addsadd1Elem.click();
				
			}


			public void AddsDeletesubmit() {
				
				WebElement addsadd1Elem;
				addsadd1Elem = this.getDriver().findElement(By.xpath(prop.getProperty("AdvertisementAdd_Submit")));
				addsadd1Elem.click();
				
			}


			public void addssearchdeldeppage() {
				
				WebElement serach;
				serach = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Search")));
				serach.sendKeys(AcceptanceSuite.props.getProperty("AdvertisementDelete_DependencySearch"));
				
				WebElement clicksearch;
				clicksearch = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Search_Click")));
				clicksearch.click();

	
				
			}
			
			
			public void Advtsearchpage() throws InterruptedException {
				WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
				
				WebElement adminElem;
				  adminElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Admin_Block"))));
				  adminElem.click();
				
				
				 WebElement advsElem;
				 advsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Advertisement"))));
				 advsElem.click();
				
				WebElement uieditElem;
				uieditElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Advertisementadavnce"))));
				uieditElem.click();
				
				  WebElement SearchElm;
			        SearchElm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Advertisementaddnameadvance"))));
			        SearchElm.sendKeys(AcceptanceSuite.props.getProperty("AdvetisementadNameAdvancesearchImage"));
			        
			        WebElement searchsubmitElem;
			        searchsubmitElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Advetisementadvancesubmit"))));
			        searchsubmitElem.click();
				
			}
			
			
			
		
			
			
			
			// Create  Advertisement record validation Check Start
			  public void CreateAdertisement_ValidationCheck(String Enterprise, String AdName, String AdType, String AdvertisementDescription, String AdvertisementImageAdd) {
			  
			   WebDriverWait wait = new WebDriverWait(this.getDriver(),20);
			   
			   if(!Enterprise.isEmpty()) {
			    Select Feature = new Select(
			      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementAdd_Enterprise")))));
			    Feature.selectByVisibleText(Enterprise);
			    }
			   WebElement Question;
			   WebElement addsaddElem;
			   if(!AdName.isEmpty()) {
			    Question = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementAdd_AdName"))));
			    Question.sendKeys(Keys.CONTROL, "a");
			    Question.sendKeys(Keys.DELETE);
			    Question.sendKeys(AdName);
			    
			   }else {
			    Question = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementAdd_AdName"))));
			    Question.sendKeys(Keys.CONTROL, "a");
			    Question.sendKeys(Keys.DELETE);
			   }
			   
			   if(!AdType.isEmpty()) {
			    Select Feature1 = new Select(
			      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementAdd_AdType")))));
			    Feature1.selectByVisibleText(AdType);
//			    Thread.sleep(1000); 
			   }
			   
			   if(!AdvertisementDescription.isEmpty()) {
			    Descript = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementAdd_Description"))));
			    Descript.sendKeys(Keys.CONTROL, "a");
			    Descript.sendKeys(Keys.DELETE);
			    Descript.sendKeys(AdvertisementDescription);
			   }else {
			    Descript = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementAdd_Description"))));
			    Descript.sendKeys(Keys.CONTROL, "a");
			    Descript.sendKeys(Keys.DELETE);
			   }
			  
			   if(!AdvertisementImageAdd.isEmpty()) {
			    addsaddElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementAdd_UploadImage")));
			    addsaddElem.sendKeys(Keys.CONTROL, "a");
			    addsaddElem.sendKeys(Keys.DELETE);
			    addsaddElem.sendKeys(AdvertisementImageAdd);
			   }else {
			    addsaddElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementAdd_UploadImage")));
//			    addsaddElem.sendKeys(Keys.CONTROL, "a");
//			    addsaddElem.sendKeys(Keys.DELETE);
			    }
			   
			   WebElement addsadd1Elem;
			   addsadd1Elem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementAdd_Submit"))));
			   addsadd1Elem.click();
			   }
			   
			   public void VerifyAdvertisementCreateValidationMessage() {
			    
			   }
			// Create Advertisement record validation Check End 
			// Edit Advertisement recod Validation Check Start

			 public void editAdertisementrecodaddssearchpage() {
			    
			  WebDriverWait wait = new WebDriverWait(this.getDriver(),20);
			    WebElement serach1;
			    serach1 =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Search")))); 
//			      this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Search")));
			    serach1.sendKeys(AcceptanceSuite.props.getProperty("UniversalImageAdd_EnterpriseData"));
			    
			    WebElement clicksearch;
			    clicksearch = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Search_Click"))));
//			      this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Search_Click")));
			    clicksearch.click();  
			   }

			 public void ClickonAdvertisementsEditButtonInListing() {
			  WebDriverWait wait = new WebDriverWait(this.getDriver(),20);
			  WebElement AdvertisementEditButton;
			  AdvertisementEditButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementEdit_Record"))));
			  AdvertisementEditButton.click();  
			 }
			   
			 public void VerifyAdvertisements_Edit_RecordValidationCheck(String AdName, String AdType, String AdvertisementDescription) {
			  WebDriverWait wait = new WebDriverWait(this.getDriver(),20);
			  WebElement Question;
			  if(!AdName.isEmpty()) {
			   Question = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementAdd_AdName"))));
			   Question.sendKeys(Keys.CONTROL, "a");
			   Question.sendKeys(Keys.DELETE);
			   Question.sendKeys(AdName);
			   
			  }else {
			   Question = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementAdd_AdName"))));
			   Question.sendKeys(Keys.CONTROL, "a");
			   Question.sendKeys(Keys.DELETE);
			  }
			  
			  if(!AdType.isEmpty()) {
			   Select Feature1 = new Select(
			     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementAdd_AdType")))));
			   Feature1.selectByVisibleText(AdType);
			//   Thread.sleep(1000); 
			  }
			  
			  if(!AdvertisementDescription.isEmpty()) {
			   Descript = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementAdd_Description"))));
			   Descript.sendKeys(Keys.CONTROL, "a");
			   Descript.sendKeys(Keys.DELETE);
			   Descript.sendKeys(AdvertisementDescription);
			  }else {
			   Descript = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementAdd_Description"))));
			   Descript.sendKeys(Keys.CONTROL, "a");
			   Descript.sendKeys(Keys.DELETE);
			  }
			  WebElement addsadd1Elem;
			  addsadd1Elem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementAdd_Submit"))));
			  addsadd1Elem.click(); 
			  
			 }
			 
			   
			// Edit Advertisement record Validation Check End

			
			
			
			
			 public void advertisementsAdvancedSearch() throws InterruptedException {
					WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
					Thread.sleep(5000);
					
					WebElement adminElem;
					adminElem = wait.until(ExpectedConditions
							.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Admin_Block"))));
					adminElem.click();
					
					WebElement usersLinkElem = wait.until(
							ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Advertisement"))));
					usersLinkElem.click();
					wait.until(ExpectedConditions
							.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementBanner"))));
					Thread.sleep(2000);

					WebElement NotificationAdvanceButtonElem = wait.until(ExpectedConditions
							.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Advertisementadavnce"))));
					NotificationAdvanceButtonElem.click();

					WebElement CalenderElem = wait.until(ExpectedConditions.visibilityOfElementLocated(
							By.xpath(AcceptanceSuite.props.getProperty("AdvertisementsAdsStartDate"))));

					Thread.sleep(6000);
					CalenderElem.click();

					WebElement	monthElm = wait.until(ExpectedConditions
							.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementsAdsStartMonth"))));
					WebElement	yearelm = wait.until(ExpectedConditions
							.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementsAdsStartYear"))));
					WebElement minituesElem = wait.until(ExpectedConditions
							.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementsStarrtMin"))));

					WebElement nextbuttonElem = wait.until(ExpectedConditions
							.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementsNextMonth"))));
					WebElement timenelm = wait.until(ExpectedConditions
							.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementsTime"))));
					WebElement HoursElem = wait.until(ExpectedConditions
							.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementsHours"))));
					String userDate = AcceptanceSuite.props.getProperty("AdvertisementsStartDate");
					String column = AcceptanceSuite.props.getProperty("AdvertisementsStartColumnDate");
					Thread.sleep(1000);

					getUserDate(this.getDriver(), userDate, CalenderElem, monthElm, yearelm, column, nextbuttonElem, timenelm,
							HoursElem, minituesElem);

					Thread.sleep(2000);
					WebElement closeCalenderElem = wait.until(ExpectedConditions
							.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementsEndDate"))));

					closeCalenderElem.click();

					WebElement	closemonthElm = wait.until(ExpectedConditions
							.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementsEndMonth"))));
					WebElement closeyearelm = wait.until(ExpectedConditions
							.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementsEndYear"))));
					WebElement closeminituesElem = wait.until(ExpectedConditions
							.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementsEndMins"))));

					WebElement closenextbuttonElem = wait.until(ExpectedConditions
							.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementsEndNext"))));
					WebElement closetimenelm = wait.until(ExpectedConditions
							.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementsEndTime"))));
					WebElement closeHoursElem = wait.until(ExpectedConditions
							.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementsEndHours"))));

					String closeuserDate = AcceptanceSuite.props.getProperty("AdvertisementsEndDate1");
					String closecolumn = AcceptanceSuite.props.getProperty("AdvertisementsEndColumn");

					Thread.sleep(1000);
					getUserDate(this.getDriver(), closeuserDate, closeCalenderElem, closemonthElm, closeyearelm, closecolumn,
							closenextbuttonElem, closetimenelm, closeHoursElem, closeminituesElem);
					WebElement NotificationAdvanceSubmitElem = wait.until(ExpectedConditions
							.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementsSubmitButton"))));
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


			
			
			
			
		
		
	