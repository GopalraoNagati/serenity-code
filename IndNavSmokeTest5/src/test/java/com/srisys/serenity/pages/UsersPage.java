package com.srisys.serenity.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.srisys.serenity.AcceptanceSuite;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class UsersPage extends PageObject{
	
	WebDriver driver;
	String defaultURL;
	WebElement loginButtonElem;
	WebElement usernameElem;
	WebElement passwordElem;
	WebElement submitButtonElem;
	WebElement adminLinkElem;
	WebElement userHeaderElem;
	WebElement usersAddElem;
	WebElement userNameInputFieldElem;
	WebElement enterpriseListFieldElem;
	WebElement enterpriseResourcesListFieldElem;
	WebElement RoleNameListFieldElem;
	WebElement userSubmitElem;
	WebElement errormessageElem;
	WebElement userSearchBoxElem;
	WebElement userSearchBtnElem;
	WebElement userListingElem;
	WebElement userNameEditPageElem;
	WebElement editRoleNameElem;
	WebElement editPageSubmitElem;
	WebElement roleNameListingElem;
	WebElement usersViewCloseBtnElem;
	WebElement usersDeleteBtnElem;
	WebElement BlockResonListFieldElem;
	WebElement BlockBtnElem;
	String result;
	String match;
	 WebElement FleetAdvanceElem;
		WebElement FleetsAdvanceSubmitElem;
		WebElement FleetsAdvanceButtonElem;
	public void UsersAdvanceSearch() throws InterruptedException{
				WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);

				//Thread.sleep(1000);
				adminLinkElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdminLink"))));
				adminLinkElem.click();
				
				userHeaderElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("userHeader"))));
				userHeaderElem.click();
				
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("userBanner"))));
				//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetBanner"))));
				FleetsAdvanceButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprsesAdvancedsearch"))));
				FleetsAdvanceButtonElem.click();
				
				FleetAdvanceElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Usernamesearch"))));

				FleetAdvanceElem.sendKeys(AcceptanceSuite.props.getProperty("UsernamesearchData"));
				//Thread.sleep(1000);
				FleetsAdvanceSubmitElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetAdvanceSearchsubmiButton"))));
				FleetsAdvanceSubmitElem.click();
			}

	
	
	public void openPage() {
		try 
		{
			defaultURL = AcceptanceSuite.props.getProperty("defaultURL");
			this.getDriver().navigate().to(defaultURL);
			System.out.println("Initial Default URL"+defaultURL);
		} catch (Exception ex){
			System.out.println("Exception Message="+ex.getMessage());
		}
		
	}
	
	public void clickOnLoginButton() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		usernameElem =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("userName"))));
		passwordElem =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("passWord"))));
		loginButtonElem =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("loginButton"))));
		usernameElem.sendKeys(AcceptanceSuite.props.getProperty("userNameValue"));
		passwordElem.sendKeys(AcceptanceSuite.props.getProperty("passwordValue"));
		loginButtonElem.click();
	}

	public void Click_ON_Users_Header() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		Thread.sleep(1000);
		adminLinkElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdminLink"))));
		adminLinkElem.click();
		Thread.sleep(1000);
		userHeaderElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("userHeader"))));
		userHeaderElem.click();
		
	}

	public void click_On_UsersAddAction() {
		  WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("userBanner"))));
		usersAddElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("usersAdd_Button"))));
		usersAddElem.click();
	}
    
	@SuppressWarnings("rawtypes")
	public ExpectedCondition userNameIsVisible() {
		 WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
	 userNameInputFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("UsersAdd_userName")))); 
	        return new ExpectedCondition<Boolean>() {
	            public Boolean apply(WebDriver driver) {
	                return (userNameInputFieldElem.isDisplayed());
	            }
	        };
	    }

		public void waitForUserNameField() {
	        waitForCondition().until(userNameIsVisible());
	    }

		public void select_Enterprise_EnterpriseResource_RoleName_Enter_UserName_ClickON_SubmitBtn(
				String Enterprise, String EnterpriseResources, String UserName, String RoleName) throws InterruptedException {
			WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
			enterpriseListFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("UsersAdd_Enterprise"))));	
			Select enterpriseListField = new Select(enterpriseListFieldElem);		
			enterpriseListField.selectByVisibleText(Enterprise);
			enterpriseResourcesListFieldElem =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Users_EnterpriseResources"))));	
			Select enterpriseResourcesListField = new Select(enterpriseResourcesListFieldElem);		
			enterpriseResourcesListField.selectByVisibleText(EnterpriseResources);
			userNameInputFieldElem =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("UsersAdd_userName"))));
			userNameInputFieldElem.clear();
			userNameInputFieldElem.sendKeys(UserName);
			Thread.sleep(1000);
			RoleNameListFieldElem =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("UsersAdd_RoleName"))));
			Select roleNameListField = new Select(RoleNameListFieldElem);		
			roleNameListField.selectByVisibleText(RoleName);
			userSubmitElem =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("usersAdd_SubmitButton"))));
			userSubmitElem.click();
			
		}
	
		public String getErrorMessage() {
			WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
			errormessageElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("usersAdd_ErrorMessage"))));
			String a = errormessageElem.getText();
			return a;
		}

		public void enterValidDataIn_Enterprise_EnterpriseResources_UserName_RoleNameFields(
				String Enterprise, String EnterpriseResources, String UserName,
				String RoleName) throws InterruptedException {
			
			WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);			
			enterpriseListFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("UsersAdd_Enterprise"))));	
			Select enterpriseListField = new Select(enterpriseListFieldElem);		
			enterpriseListField.selectByVisibleText(Enterprise);
			enterpriseResourcesListFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Users_EnterpriseResources"))));	
			Thread.sleep(2000);
			Select enterpriseResourcesListField = new Select(enterpriseResourcesListFieldElem);		
			enterpriseResourcesListField.selectByVisibleText(EnterpriseResources);
			userNameInputFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("UsersAdd_userName"))));
			userNameInputFieldElem.sendKeys(UserName);
			RoleNameListFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("UsersAdd_RoleName"))));
			Select roleNameListField = new Select(RoleNameListFieldElem);		
			roleNameListField.selectByVisibleText(RoleName);
		}

		public void clickonUsersSubmitButton() throws InterruptedException {
			WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);	
			userSubmitElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("usersAdd_SubmitButton"))));
			userSubmitElem.click();
			Thread.sleep(7000);
			
		}

		public void selectEnterprise(String Enterprise) {
			WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);	
			enterpriseListFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("UsersAdd_Enterprise"))));	
			Select enterpriseListField = new Select(enterpriseListFieldElem);		
			enterpriseListField.selectByVisibleText(Enterprise);
			
		}

		public String check_EnterpriseResourceListField_ForUsedResource(
				String EnterpriseResources) {
			WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);	
			enterpriseResourcesListFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Users_EnterpriseResources"))));	
			Select select = new Select(enterpriseResourcesListFieldElem);
			List<WebElement> allOptions = select.getOptions();
			for(WebElement option : allOptions){
				if(option.getText().equals(EnterpriseResources)) {
					match = "Used Enterprise Resources Displayed in Listing";
		            break;
		        }
				else{
					match = "Used Enterprise Resources Not Displayed in Listing";
		    }
					
				}
			return match;
		}

		public void clickON_EditBtn_CorrespondingToUserName() throws InterruptedException {
			
			WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
			Thread.sleep(2000);
//			adminLinkElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdminLink"))));
//			adminLinkElem.click();
//			
//			userHeaderElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("userHeader"))));
//			userHeaderElem.click();
			
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("userBanner"))));
			
			
			ArrayList<String> xpaths = new ArrayList<String>();
			ArrayList<String> values = new ArrayList<String>();
			
			String xpathsString = AcceptanceSuite.props.getProperty("usersEdit_Xpaths");
			String valuesString = AcceptanceSuite.props.getProperty("usersEditValue");
			
			for (int i=0; i<xpathsString.split(",").length; i++){
				
				xpaths.add(xpathsString.split(",")[i]);
				System.out.println("lllllllllll"+xpaths);
				values.add(valuesString.split(",")[i]);
				System.out.println("lllllllllll"+values);
			}
			
			String actionXPath = AcceptanceSuite.props.getProperty("usersEdit_ActionXPath");
			String nextPageXPath = AcceptanceSuite.props.getProperty("usersNextPagePath");
			
			String searchXPath = AcceptanceSuite.props.getProperty("Users_SearchBox");
			String searchButtonXPath = AcceptanceSuite.props.getProperty("Users_SearchButton");
			

			String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(), searchXPath, searchButtonXPath);
			Thread.sleep(1000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
			
			if (!action.equalsIgnoreCase("No Match")){
				
				System.out.println("Edit Page Opened");
			}
		}

		public String search(String UserName) throws InterruptedException {
			WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
			userSearchBoxElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Users_SearchBox"))));
			userSearchBtnElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Users_SearchButton"))));
			userSearchBoxElem.sendKeys(UserName);
			userSearchBtnElem.click();
			Thread.sleep(2000);
			userListingElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("userNamesInListing"))));
			String txt = userListingElem.getText();
			System.out.println(txt);
			if(txt.equalsIgnoreCase(UserName)){
				result = "Created User Displayed in Listing";
			}else{
				result = "Created User not Displayed in Listing";
			}
			return result;
		}

		public String verifyRequiredOn_EditPage() {
			WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
			userNameEditPageElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("usersEdit_userName"))));
			String verifyUser = userNameEditPageElem.getText();
			System.out.println(verifyUser);
			return verifyUser;
		}

		public void selectRoleName_EditPage(String roleName) {
			WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
			editRoleNameElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("usersEdit_RoleName"))));	
			Select rolenameListField = new Select(editRoleNameElem);		
			rolenameListField.selectByVisibleText(roleName);
			
		}

		public void clickonEditSubmitBtn() {
			WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
			editPageSubmitElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("usersEdit_SubmitButton"))));
			editPageSubmitElem.click();
		}

		public String checkWheatherChangedRoleName_UpdatedInListing() {
			WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
			roleNameListingElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Users_RoleNameListing"))));
			String rolenameListing =  roleNameListingElem.getText();
			return rolenameListing;
		}

		public void clickON_ViewBtn_CorrespondingToUserName() throws InterruptedException {
			WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
			ArrayList<String> xpaths = new ArrayList<String>();
			ArrayList<String> values = new ArrayList<String>();
			
			String xpathsString = AcceptanceSuite.props.getProperty("UsersView_Xpaths");
			String valuesString = AcceptanceSuite.props.getProperty("usersViewValue");
			
			for (int i=0; i<xpathsString.split(",").length; i++){
				
				xpaths.add(xpathsString.split(",")[i]);
				System.out.println("lllllllllll"+xpaths);
				values.add(valuesString.split(",")[i]);
				System.out.println("lllllllllll"+values);
			}
			
			String actionXPath = AcceptanceSuite.props.getProperty("UsersView_ActionXPath");
			String nextPageXPath = AcceptanceSuite.props.getProperty("usersNextPagePath");
			
			String searchXPath = AcceptanceSuite.props.getProperty("Users_SearchBox");
			String searchButtonXPath = AcceptanceSuite.props.getProperty("Users_SearchButton");
			

			String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(), searchXPath, searchButtonXPath);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
			
			if (!action.equalsIgnoreCase("No Match")){
				usersViewCloseBtnElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("usersView_CloseButton"))));;
			    usersViewCloseBtnElem.click();
				
			}
		}

		public void clickON_DeleteBtn_CorrespondingToUserName() throws InterruptedException {
			WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
			ArrayList<String> xpaths = new ArrayList<String>();
			ArrayList<String> values = new ArrayList<String>();
			
			String xpathsString = AcceptanceSuite.props.getProperty("usersDelete_Xpaths");
			String valuesString = AcceptanceSuite.props.getProperty("usersDeleteValue");
			
			for (int i=0; i<xpathsString.split(",").length; i++){
				
				xpaths.add(xpathsString.split(",")[i]);
				System.out.println("lllllllllll"+xpaths);
				values.add(valuesString.split(",")[i]);
				System.out.println("lllllllllll"+values);
			}
			
			String actionXPath = AcceptanceSuite.props.getProperty("usersDelete_ActionXPath");
			String nextPageXPath = AcceptanceSuite.props.getProperty("usersNextPagePath");
			
			String searchXPath = AcceptanceSuite.props.getProperty("Users_SearchBox");
			String searchButtonXPath = AcceptanceSuite.props.getProperty("Users_SearchButton");
			
			Thread.sleep(2000);
			String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(), searchXPath, searchButtonXPath);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
			
			if (!action.equalsIgnoreCase("No Match")){
				System.out.println("Delete page Opened");
			}
			
			
		}

		public void Click_ON_UsersDeleteBtn() throws InterruptedException {
			WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
			 usersDeleteBtnElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("usersDelete_DeleteButton"))));
			 usersDeleteBtnElem.click();
			
			
		}

		public void clickON_BlockBtn_CorrespondingToUserName() throws InterruptedException {
			WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
			ArrayList<String> xpaths = new ArrayList<String>();
			ArrayList<String> values = new ArrayList<String>();
			
			String xpathsString = AcceptanceSuite.props.getProperty("usersBlock_Xpaths");
			String valuesString = AcceptanceSuite.props.getProperty("usersBloValue");
			
			for (int i=0; i<xpathsString.split(",").length; i++){
				
				xpaths.add(xpathsString.split(",")[i]);
				System.out.println("lllllllllll"+xpaths);
				values.add(valuesString.split(",")[i]);
				System.out.println("lllllllllll"+values);
			}
			
			String actionXPath = AcceptanceSuite.props.getProperty("usersBlock_ActionXPath");
			String nextPageXPath = AcceptanceSuite.props.getProperty("usersNextPagePath");
			
			String searchXPath = AcceptanceSuite.props.getProperty("Users_SearchBox");
			String searchButtonXPath = AcceptanceSuite.props.getProperty("Users_SearchButton");
			

			String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(), searchXPath, searchButtonXPath);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
			
			if (!action.equalsIgnoreCase("No Match")){
				System.out.println("Block Page Opend");
			}
		}

		public void selectsBlockReson_ClicksOnBlockBtn() {
			WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
			BlockResonListFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("usersBlock_BlockReson"))));	
			Select blockResonListField = new Select(BlockResonListFieldElem);	
			blockResonListField.selectByVisibleText(AcceptanceSuite.props.getProperty("usersBlock_BlockResonData"));
			
			BlockBtnElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("usersBlock_BlockButton"))));
			BlockBtnElem.click();
		}
		
		public void clickON_DeleteBtn_CorrespondingToMessageName() throws InterruptedException {
			WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
			ArrayList<String> xpaths = new ArrayList<String>();
			ArrayList<String> values = new ArrayList<String>();
			
			String xpathsString = AcceptanceSuite.props.getProperty("usersDelete_Xpaths");
			String valuesString = AcceptanceSuite.props.getProperty("usersDeleteValue");
			
			for (int i=0; i<xpathsString.split(",").length; i++){
				
				xpaths.add(xpathsString.split(",")[i]);
				System.out.println("lllllllllll"+xpaths);
				values.add(valuesString.split(",")[i]);
				System.out.println("lllllllllll"+values);
			}
			
			String actionXPath = AcceptanceSuite.props.getProperty("usersmessgexpath");
			String nextPageXPath = AcceptanceSuite.props.getProperty("usersNextPagePath");
			
			String searchXPath = AcceptanceSuite.props.getProperty("Users_SearchBox");
			String searchButtonXPath = AcceptanceSuite.props.getProperty("Users_SearchButton");
			
			Thread.sleep(2000);
			String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(), searchXPath, searchButtonXPath);
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
			
			if (!action.equalsIgnoreCase("No Match")){
				System.out.println("Delete page Opened");
			}
			Thread.sleep(1000);
			
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
			Thread.sleep(1000);
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Users Create Validation Check 
		//Start  --------------------------------------------------------
		   
		  Properties prop;
		  WebElement EnterprisenameElem;
		  WebElement userscreateSubmitButtonElem;
		  
		  public void enter_usercreate_validation(String Enterprise,String EnterpriseResource,String UserName,String RoleName) throws InterruptedException, FileNotFoundException, IOException{
		   prop = new Properties();
		   prop.load(new FileInputStream("serenity.properties"));
		  
		   WebDriverWait wait=new WebDriverWait(this.getDriver(), 20); 
		   if(!Enterprise.isEmpty()) {
		   EnterprisenameElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("UsersAdd_Enterprise"))));
		   Select Enterprisename = new Select(EnterprisenameElem);
		  
		   
		   Enterprisename.selectByVisibleText(Enterprise);
		   }

		   
		   
		   Thread.sleep(5000);
		   
		   if(!EnterpriseResource.isEmpty()) {
		   Select EnterpriseResourcename = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("userEnterpriceresources")))));
		   EnterpriseResourcename.selectByVisibleText(EnterpriseResource);
		   }
		   
		   
		   if(!UserName.isEmpty()) {
		   userNameInputFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("UsersAdd_userName"))));
		   userNameInputFieldElem.clear();
		   userNameInputFieldElem.sendKeys(UserName);
		   }
		   
		   if(!RoleName.isEmpty()) {
		   RoleNameListFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("UsersAdd_RoleName"))));
		   Select roleNameListField = new Select(RoleNameListFieldElem);  
		   roleNameListField.selectByVisibleText(RoleName);
		   }
		//   userscreateSubmitButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty(""))));
		//   userscreateSubmitButtonElem.click();
		   
		   Thread.sleep(3000);
		 //  System.out.println("Wait Executed 11111================================");
		   
		   }
		  
		  public void Users_AddCloseButton() {
		   WebElement UsersaddCloseElem;
		   WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		   UsersaddCloseElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("UsersaddClose"))));
		   UsersaddCloseElem.click();
		   
		  }
		  
		//Validation Check END----------------------------------------------------

		//Delete Validation Start----------------------------
		  
		 public void Delete_ValidationCheck() throws InterruptedException {
		  WebElement UsersDeleteButtonInPopUpElem;
		  WebElement UsersListingDeleteButtonElem;
		  
		  WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);

		  //Thread.sleep(1000);
		  adminLinkElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdminLink"))));
		  adminLinkElem.click();
		  
		  userHeaderElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("userHeader"))));
		  userHeaderElem.click();
		  
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("userBanner"))));
		  //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetBanner"))));
		  FleetsAdvanceButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterprsesAdvancedsearch"))));
		  FleetsAdvanceButtonElem.click();
		  
		  FleetAdvanceElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Usernamesearch"))));
          FleetAdvanceElem.sendKeys(AcceptanceSuite.props.getProperty("UsernamesearchData"));
		  Thread.sleep(1000);
		  FleetsAdvanceSubmitElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetAdvanceSearchsubmiButton"))));
		  FleetsAdvanceSubmitElem.click();
		  Thread.sleep(1000);
		  UsersListingDeleteButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("UsersListingDeleteButtonXpath"))));
		  UsersListingDeleteButtonElem.click();
		  Thread.sleep(1000);

		  UsersDeleteButtonInPopUpElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("UsersDeleteButtonInPopUpXpath"))));
		  UsersDeleteButtonInPopUpElem.click();
		   
		 } 
		  
		//  Delete Validation Check END--------------------

		//  Block Validation Start
		  
		 public void verify_block_user_page_validation_check() throws InterruptedException {
		 
		  WebElement UsersBlockButtonAfterSearchValidationElem;
		  WebElement UsersBlockPageBlockButtonValidationElem;
		  
		  WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		  userSearchBoxElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Users_SearchBox"))));
		  userSearchBtnElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Users_SearchButton"))));
		  Thread.sleep(2000);
		  userSearchBoxElem.clear();
		  userSearchBoxElem.sendKeys(AcceptanceSuite.props.getProperty("UsersBlockSearchboxUserNameValidation"));
		  userSearchBtnElem.click(); 
		  Thread.sleep(1000);
		  UsersBlockButtonAfterSearchValidationElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("UsersBlockButtonAfterSearchValidation"))));
		  UsersBlockButtonAfterSearchValidationElem.click();
		  Thread.sleep(1000);
		  UsersBlockPageBlockButtonValidationElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("UsersBlockPageBlockButtonValidation"))));
		  UsersBlockPageBlockButtonValidationElem.click();
		  Thread.sleep(5000);
		 }
		 

		 public void Verify_Block_Page_Validation_NewMessage() {
		  
		  String ActualBlockValidationMessageElem;
		  String ExpectedBlockValidationMessageElem;
		  WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
		  
		  System.out.println("AfterWhen@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		  ActualBlockValidationMessageElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("UsersBlockValidationMessagepath")))).getText();
		  System.out.println("ActualvalidationMessage:!!!!!!!!!!!!!!!!!!!!!!!!!!!"+ActualBlockValidationMessageElem);
		  ExpectedBlockValidationMessageElem = AcceptanceSuite.props.getProperty("UsersBlockValidationMessageValue");
		  System.out.println("ExpectedValidation:"+ExpectedBlockValidationMessageElem);
		  Assert.assertTrue((ActualBlockValidationMessageElem).equalsIgnoreCase(ExpectedBlockValidationMessageElem));
		 }
		 public void UserBlock_PopupCloseButton() {
		  WebElement UserBlockCloseButtonElem;
		  WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
		  
		  UserBlockCloseButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("UserBlockCloseButton"))));
		  UserBlockCloseButtonElem.click();
		 }
		 
		//-------Block Validation End
		 
		//--------UnblockValidation Start
		 public void verify_Unblock_user_page_validation_check() throws InterruptedException {
			 WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		        
		        
				userHeaderElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("userHeader"))));
				userHeaderElem.click();
		  
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("userBanner"))));
		  WebElement UsersBlockButtonAfterSearchValidationElem;
		  WebElement UsersBlockPageBlockButtonValidationElem;
		  
		  //WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		  userSearchBoxElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Users_SearchBox"))));
		  userSearchBtnElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Users_SearchButton"))));
		  userSearchBoxElem.clear();
		  userSearchBoxElem.sendKeys(AcceptanceSuite.props.getProperty("UsersBlockSearchboxUserNameValidation"));
		  userSearchBtnElem.click(); 
		 
		  UsersBlockButtonAfterSearchValidationElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("UsersBlockButtonAfterSearchValidation"))));
		  UsersBlockButtonAfterSearchValidationElem.click();
		  UsersBlockPageBlockButtonValidationElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("UsersBlockPageBlockButtonValidation"))));
		  UsersBlockPageBlockButtonValidationElem.click();
		  Thread.sleep(3000);
		 }
		 

		 public void Verify_UnBlock_Page_Validation_NewMessage() {
		  
		  String ActualBlockValidationMessageElem;
		  String ExpectedBlockValidationMessageElem;
		  WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
		  
		  System.out.println("AfterWhen@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		  ActualBlockValidationMessageElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("UsersBlockValidationMessagepath")))).getText();
		  System.out.println("ActualvalidationMessage:!!!!!!!!!!!!!!!!!!!!!!!!!!!"+ActualBlockValidationMessageElem);
		  ExpectedBlockValidationMessageElem = AcceptanceSuite.props.getProperty("UsersBlockValidationMessageValue");
		  System.out.println("ExpectedValidation:"+ExpectedBlockValidationMessageElem);
		  Assert.assertTrue((ActualBlockValidationMessageElem).equalsIgnoreCase(ExpectedBlockValidationMessageElem));
		 } 
		 
		//--------Unblock Validation End

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
}
