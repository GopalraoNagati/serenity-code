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

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.srisys.serenity.AcceptanceSuite;

import net.thucydides.core.pages.PageObject;



public class IndnavUniversalImages extends PageObject {
	
	
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
			 WebDriverWait wait=new WebDriverWait(this.getDriver(), 50);
				usernameElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Indnavlogin"))));
				passwordElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Indnavpassword"))));
				loginButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("IndnavSubmitbutton"))));
				usernameElem.sendKeys(AcceptanceSuite.props.getProperty("userNameValue"));
				passwordElem.sendKeys(AcceptanceSuite.props.getProperty("passwordValue"));
				loginButtonElem.click();
			}

		 
				public void helpsearchpage() throws InterruptedException {
					WebDriverWait wait=new WebDriverWait(this.getDriver(), 50);
					
		        WebElement SearchElm;
		        SearchElm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Search"))));
		        SearchElm.sendKeys(AcceptanceSuite.props.getProperty("SearchData"));
		        
		        WebElement SearchclickElm;
		        SearchclickElm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Search_Click"))));
		        SearchclickElm.click();
				
			}
		
				
			public void helpsearchpage1() throws InterruptedException {
				WebDriverWait wait=new WebDriverWait(this.getDriver(), 50);
				
		        WebElement SearchElm;
		        SearchElm =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Search"))));
		        SearchElm.sendKeys(AcceptanceSuite.props.getProperty("SearchviewData"));
		        
		        WebElement SearchclickElm;
		        SearchclickElm =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Search_Click"))));
		        SearchclickElm.click();
				
			}
			
			
			public void helpsearchpage2() throws InterruptedException {
				WebDriverWait wait=new WebDriverWait(this.getDriver(), 50);
				
		        WebElement SearchElm;
		        SearchElm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Search"))));
		        SearchElm.sendKeys(AcceptanceSuite.props.getProperty("Help_SearchData"));
		        
		        WebElement SearchclickElm;
		        SearchclickElm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Searchclick"))));
		        SearchclickElm.click();
				
			}


			public void clickOnUIpage() throws InterruptedException {
				
		        
				WebDriverWait wait=new WebDriverWait(this.getDriver(), 50);

				WebElement helpDelElem1;
				helpDelElem1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Admin_Block"))));
				helpDelElem1.click();
				
				
				WebElement helpDelElem;
				helpDelElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("UniversalImage"))));
				helpDelElem.click();

				
			}


			public void UIaddpage() throws InterruptedException {
				WebDriverWait wait=new WebDriverWait(this.getDriver(), 50);
				
		        WebElement helpviewElm;
		        helpviewElm =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Add_Click"))));
		        helpviewElm.click();
				
			}


			public void UIaddsbmitpage() throws InterruptedException {
				
		        

			}

			public void UTCreate() throws InterruptedException {
				WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);

				
				Select enterpse = new Select(
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("UniversalImageAdd_Enterprise")))));
				enterpse.selectByVisibleText(AcceptanceSuite.props.getProperty("UniversalImageAdd_EnterpriseData"));

				WebElement Feature;
				Feature = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("UniversalImageAdd_UniverasalImageName"))));
				Feature.sendKeys(AcceptanceSuite.props.getProperty("UniversalImageAdd_UniverasalImageNameData"));
				
				WebElement Question;
				Question = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("UniversalImageAdd_Description"))));
				Question.sendKeys(AcceptanceSuite.props.getProperty("UniversalImageAdd_DescriptionData"));
				Thread.sleep(2000);
		        WebElement addsaddElem;
				addsaddElem =this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("UniversalImageAdd_UploadImage")));
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
				
				
				
				WebElement help1viewElm;
		        help1viewElm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("UniversalImageAdd_Submit"))));
		        help1viewElm.click();
				
			}




			public void UIviewpage() throws InterruptedException {
				WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
				

				
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("UniversalImagesBanner"))));
				ArrayList<String> xpaths = new ArrayList<String>();
				ArrayList<String> values = new ArrayList<String>();

				String xpathsString = AcceptanceSuite.props.getProperty("UniveraslEdit");
				String valuesString = AcceptanceSuite.props.getProperty("UniverasViewValue");

				for (int i = 0; i < xpathsString.split(",").length; i++) {

					xpaths.add(xpathsString.split(",")[i]);
					System.out.println("lllllllllll" + xpaths);
					values.add(valuesString.split(",")[i]);
					System.out.println("lllllllllll" + values);
				}

				String actionXPath = AcceptanceSuite.props.getProperty("UniversalViewButton");
				String nextPageXPath = AcceptanceSuite.props.getProperty("UnivseralNextButton");

				String searchXPath = AcceptanceSuite.props.getProperty("UniversalcearchButton");
				String searchButtonXPath = AcceptanceSuite.props.getProperty("UniversalsearchClick");

				//Thread.sleep(2000);
				String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
						searchXPath, searchButtonXPath);
			    Thread.sleep(500);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
				
				
				WebElement addsadd1Elem;
				addsadd1Elem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("UniversalImageClose"))));
				addsadd1Elem.click();

				
			}

			public void UIDeletepage() throws InterruptedException, FileNotFoundException, IOException {
				WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
				
				
//WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
				

				
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("UniversalImagesBanner"))));
				ArrayList<String> xpaths = new ArrayList<String>();
				ArrayList<String> values = new ArrayList<String>();

				String xpathsString = AcceptanceSuite.props.getProperty("UniveraslEdit");
				String valuesString = AcceptanceSuite.props.getProperty("UniverasViewValue");

				for (int i = 0; i < xpathsString.split(",").length; i++) {

					xpaths.add(xpathsString.split(",")[i]);
					System.out.println("lllllllllll" + xpaths);
					values.add(valuesString.split(",")[i]);
					System.out.println("lllllllllll" + values);
				}

				String actionXPath = AcceptanceSuite.props.getProperty("UniversalDeleteButton");
				String nextPageXPath = AcceptanceSuite.props.getProperty("UnivseralNextButton");

				String searchXPath = AcceptanceSuite.props.getProperty("UniversalcearchButton");
				String searchButtonXPath = AcceptanceSuite.props.getProperty("UniversalsearchClick");

				//Thread.sleep(2000);
				String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
						searchXPath, searchButtonXPath);
			    Thread.sleep(500);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
				
				
				WebElement addsadd1Elem;
				addsadd1Elem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("UniversalImageDeleteButton"))));
				addsadd1Elem.click();
				
				//prop = new Properties();
		      //  prop.load(new FileInputStream("serenity.properties"));
				
			
				
			}


			public void UIDeletesubmit() throws InterruptedException {
				WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
				
				WebElement uidel1Elem;
				uidel1Elem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("UniversalImageAdd_Submit"))));
				uidel1Elem.click();
	
				
			}

			public void UIeditpagesubmit() throws InterruptedException {
				WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
				
				WebElement uieditElem;
				uieditElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("UniversalImageEdit_Record"))));
				uieditElem.click();
				
			}
			
			public void Advancesearch() throws InterruptedException {
				WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
				
				WebElement uieditElem;
				uieditElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("UniversalImageAdvancesearch"))));
				uieditElem.click();
				
				  WebElement SearchElm;
			        SearchElm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("UniversalImageAdvanceImagesearch"))));
			        SearchElm.sendKeys(AcceptanceSuite.props.getProperty("UniversalImageAdvancesearchImagename"));
			        
			        WebElement searchsubmitElem;
			        searchsubmitElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("UniversalImagesearchsubmitButton"))));
			        searchsubmitElem.click();
				
			}

			public void UIeditRecord() throws InterruptedException {
				WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
				
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("UniversalImagesBanner"))));
				ArrayList<String> xpaths = new ArrayList<String>();
				ArrayList<String> values = new ArrayList<String>();

				String xpathsString = AcceptanceSuite.props.getProperty("UniveraslEdit");
				String valuesString = AcceptanceSuite.props.getProperty("UniveraseditValue");

				for (int i = 0; i < xpathsString.split(",").length; i++) {

					xpaths.add(xpathsString.split(",")[i]);
					System.out.println("lllllllllll" + xpaths);
					values.add(valuesString.split(",")[i]);
					System.out.println("lllllllllll" + values);
				}

				String actionXPath = AcceptanceSuite.props.getProperty("UniversalEditButton");
				String nextPageXPath = AcceptanceSuite.props.getProperty("UnivseralNextButton");

				String searchXPath = AcceptanceSuite.props.getProperty("UniversalcearchButton");
				String searchButtonXPath = AcceptanceSuite.props.getProperty("UniversalsearchClick");

				//Thread.sleep(2000);
				String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
						searchXPath, searchButtonXPath);
			    Thread.sleep(2000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
				
				/*FunfactsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("StaticEditMenuButton"))));
				FunfactsElem.clear();
				FunfactsElem.sendKeys(AcceptanceSuite.props.getProperty("staticEditMenuData"));
				
				//Thread.sleep(2000);
				fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("staticEditsubmitButton"))));
				fleetSubmitbuttonElem.click();*/
				//WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
				
//				Select enterpse = new Select(
//						this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("UniversalImageAdd_Enterprise"))));
//				enterpse.selectByVisibleText(AcceptanceSuite.props.getProperty("UniversalImageAdd_EnterpriseData"));
				WebElement Feature;
				Feature = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("UniversalImageAdd_UniverasalImageName"))));
				Feature.clear();
				Feature.sendKeys(AcceptanceSuite.props.getProperty("UniversalImageEdit_UniverasalImageNameData"));
				
				WebElement Question;
				Question = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("UniversalImageAdd_Description"))));
				Question.clear();
				Question.sendKeys(AcceptanceSuite.props.getProperty("UniversalImageEdit_DescriptionData"));
				
				WebElement help1viewElm;
		        help1viewElm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("UniversalImageAdd_Submit"))));
		        help1viewElm.click();
		        
		        
		        
//		        WebElement addsaddElem;
//				addsaddElem = this.getDriver().findElement(By.xpath(prop.getProperty("UniversalImageAdd_UploadImage")));
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
		        
//				WebElement addsadd1Elem;
//				addsadd1Elem = this.getDriver().findElement(By.xpath(prop.getProperty("UniversalImageAdd_Submit")));
//				addsadd1Elem.click();
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			//Create Universal Images_Validation Check Start   
			  
			   public void UniversalImage_AddButton() {
			    WebElement UniversalImageAddButtonElem;
			    WebDriverWait wait = new WebDriverWait(this.getDriver(),20);
			    
			    UniversalImageAddButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("UniversalImageAddButtonPath"))));
			    UniversalImageAddButtonElem.click();
			   }
			   
			 public void Create_UniversalImageValidationCheck(String Enterprise, String UniversalImageName, String UniversalImageDescription, String UniversalImage) throws FileNotFoundException, IOException {
			    prop = new Properties();
			    prop.load(new FileInputStream("serenity.properties"));
			  
			    WebDriverWait wait = new WebDriverWait(this.getDriver(),20);
			      
			  if(!Enterprise.isEmpty()) {
			   Select select1 = new Select(this.getDriver().findElement(By.xpath(prop.getProperty("UniversalImageAdd_Enterprise"))));
			   select1.selectByVisibleText(Enterprise);
			  }
			  
			  WebElement UniversalImageNameElem;
			  if(!UniversalImageName.isEmpty()) {
			   
			   UniversalImageNameElem = this.getDriver().findElement(By.xpath(prop.getProperty("UniversalImageAdd_UniverasalImageName")));
			   UniversalImageNameElem.clear();
			   UniversalImageNameElem.sendKeys(UniversalImageName);
			  }else {
			   UniversalImageNameElem = this.getDriver().findElement(By.xpath(prop.getProperty("UniversalImageAdd_UniverasalImageName")));
			   UniversalImageNameElem.clear(); 
			  }
			  
			  
			  WebElement UniversalImageDescriptionElem = null;
			  if(!UniversalImageDescription.isEmpty()) {
			   
			   UniversalImageDescriptionElem = this.getDriver().findElement(By.xpath(prop.getProperty("UniversalImageAdd_Description")));
			   UniversalImageDescriptionElem.clear();
			   UniversalImageDescriptionElem.sendKeys(UniversalImageDescription);
			  }else {
			   UniversalImageDescriptionElem = this.getDriver().findElement(By.xpath(prop.getProperty("UniversalImageAdd_Description")));
			   UniversalImageDescriptionElem.clear(); 
			  }
			  WebElement UniversalImageElem = null;
			  if(!UniversalImage.isEmpty()) {

			   UniversalImageElem = this.getDriver().findElement(By.xpath(prop.getProperty("UniversalImageAdd_UploadImage")));
			//   UniversalImageElem.clear();
			   UniversalImageElem.sendKeys(UniversalImage);
			  }
			  WebElement UniversalImageCreatSubmitButton;
			  UniversalImageCreatSubmitButton = this.getDriver().findElement(By.xpath(prop.getProperty("UniversalImageAdd_Submit")));
			  UniversalImageCreatSubmitButton.click();
			 
			 }

//			     Create Universal Images_Validation Check End   

			//  Edit Universal Images Validation Check Start
			 public void UniversalImagesEditButtonValidation() {
			  
			 WebDriverWait wait = new WebDriverWait(this.getDriver(),20);
			  WebElement UniversalImageEditButtonValidationElem;
			  UniversalImageEditButtonValidationElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("UniversalImageEditButtonValidation"))));
			  UniversalImageEditButtonValidationElem.click();
			 }

			public void EditUniversalImageCheck(String UniversalImageName, String UniversalImageDescription) throws FileNotFoundException, IOException {
			   prop = new Properties();
			   prop.load(new FileInputStream("serenity.properties"));
			 
			   WebDriverWait wait = new WebDriverWait(this.getDriver(),20);

			   WebElement UniversalImageNameElem;
			   if(!UniversalImageName.isEmpty()) {
			    
			    UniversalImageNameElem = this.getDriver().findElement(By.xpath(prop.getProperty("UniversalImageAdd_UniverasalImageName")));
//			    UniversalImageNameElem.clear();
			    UniversalImageNameElem.sendKeys(Keys.CONTROL, "a");
			    UniversalImageNameElem.sendKeys(Keys.DELETE);
			    UniversalImageNameElem.sendKeys(UniversalImageName);
			   }else {
			    UniversalImageNameElem = this.getDriver().findElement(By.xpath(prop.getProperty("UniversalImageAdd_UniverasalImageName")));
//			    UniversalImageNameElem.clear(); 
			    UniversalImageNameElem.sendKeys(Keys.CONTROL, "a");
			    UniversalImageNameElem.sendKeys(Keys.DELETE);
			    
			   }

			   WebElement UniversalImageDescriptionElem = null;
			   if(!UniversalImageDescription.isEmpty()) {
			    
			    UniversalImageDescriptionElem = this.getDriver().findElement(By.xpath(prop.getProperty("UniversalImageAdd_Description")));
//			    UniversalImageDescriptionElem.clear();
			    UniversalImageDescriptionElem.sendKeys(Keys.CONTROL, "a");
			    UniversalImageDescriptionElem.sendKeys(Keys.DELETE);

			    UniversalImageDescriptionElem.sendKeys(UniversalImageDescription);
			   }else {
			    UniversalImageDescriptionElem = this.getDriver().findElement(By.xpath(prop.getProperty("UniversalImageAdd_Description")));
//			    UniversalImageDescriptionElem.clear(); 
			    UniversalImageDescriptionElem.sendKeys(Keys.CONTROL, "a");
			    UniversalImageDescriptionElem.sendKeys(Keys.DELETE);

			   }
			   WebElement help1viewElm;
			         help1viewElm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("UniversalImageAdd_Submit"))));
			         help1viewElm.click(); 
			   
			  }
			   
			   
			   
			   
			//  Edit Universal Images Validation Check End	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		}