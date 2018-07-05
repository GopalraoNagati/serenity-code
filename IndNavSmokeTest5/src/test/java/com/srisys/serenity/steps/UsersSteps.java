package com.srisys.serenity.steps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.srisys.serenity.AcceptanceSuite;
import com.srisys.serenity.pages.UsersPage;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.steps.ScenarioSteps;

public class UsersSteps extends ScenarioSteps {
	WebDriver driver;
	UsersPage users;
	WebElement ToastMessageElem;

	

	// Scenario 1
		@Given("The User is on Pigeon Application Users page/Create Users Pop Up")
		public void The_User_is_on_IndNav_Userspage_Create_or_Add_User_PopUp() throws FileNotFoundException, IOException, InterruptedException{
			users.openPage();
			users.getDriver().manage().window().maximize();
			users.clickOnLoginButton();
			users.Click_ON_Users_Header();
			//Assert.assertTrue(users.element(By.xpath(AcceptanceSuite.props.getProperty("usersAdd_Button"))).isCurrentlyVisible());
			users.click_On_UsersAddAction();
			users.waitForUserNameField();
			//Assert.assertTrue(users.element(By.xpath(AcceptanceSuite.props.getProperty("UsersAdd_Enterprise"))).isCurrentlyVisible());
			//Assert.assertTrue(users.element(By.xpath(AcceptanceSuite.props.getProperty("Users_EnterpriseResources"))).isCurrentlyVisible());
			//Assert.assertTrue(users.element(By.xpath(AcceptanceSuite.props.getProperty("UsersAdd_RoleName"))).isCurrentlyVisible());
			//Assert.assertTrue(users.element(By.xpath(AcceptanceSuite.props.getProperty("UsersAdd_userName"))).isCurrentlyVisible());
			//Assert.assertTrue(users.element(By.xpath(AcceptanceSuite.props.getProperty("usersAdd_SubmitButton"))).isCurrentlyVisible());
		}
		@When("The User Enters invalid values or empty values  for the Mandatory fields and unique fields(Enterprise and EnterpriseResources and UserName and RoleName)Combinations $table")
		public void The_User_Enters_invalid_values_or_empty_values_for_the_Mandatory_fields_and_unique_fields_Combinations(ExamplesTable table) throws InterruptedException{
			for (Map<String, String> row : table.getRows()) {
				users.select_Enterprise_EnterpriseResource_RoleName_Enter_UserName_ClickON_SubmitBtn(row.get("Enterprise"), row.get("EnterpriseResources"), row.get("UserName"), row.get("RoleName"));
				Thread.sleep(5000);
				Serenity.setSessionVariable("result").to("fail");
				String str = users.getErrorMessage();
				System.out.println("page"+str);
				System.out.println("Story"+row.get("Expected Error Message"));
				if(str.equalsIgnoreCase(row.get("Expected Error Message"))){
					Serenity.setSessionVariable("result").to("pass");
					Serenity.setSessionVariable("status").to(row.get("Expected Error Message"));
			}
		  }
	   }
	   @Then("Appropriate Validation messages should be Displayed to the User for each combination in Users Page")
		public void Appropriate_Validation_messages_should_be_Displayed_to_the_User_for_each_combination(){
		  // String str = users.getErrorMessage();
		  // Assert.assertTrue(str.equalsIgnoreCase(Serenity.sessionVariableCalled("status").toString()));
		  // Assert.assertTrue(Serenity.sessionVariableCalled("result").toString().equalsIgnoreCase("pass"));
	   }
	   
	   
	   
	 //Scenario 2
	   @Given("The User is on IndNav Application Users page/Create Users Pop Up")
		public void The_User_is_on_IndNav_Application_UserRoles_page_CreateRole_PopUp() throws FileNotFoundException, IOException, InterruptedException{
		    users.openPage();
			users.getDriver().manage().window().maximize();
			users.clickOnLoginButton();
			users.Click_ON_Users_Header();
			//Assert.assertTrue(users.element(By.xpath(AcceptanceSuite.props.getProperty("usersAdd_Button"))).isCurrentlyVisible());
			users.click_On_UsersAddAction();
			users.waitForUserNameField();
			//Assert.assertTrue(users.element(By.xpath(AcceptanceSuite.props.getProperty("UsersAdd_Enterprise"))).isCurrentlyVisible());
			//Assert.assertTrue(users.element(By.xpath(AcceptanceSuite.props.getProperty("Users_EnterpriseResources"))).isCurrentlyVisible());
			//Assert.assertTrue(users.element(By.xpath(AcceptanceSuite.props.getProperty("UsersAdd_RoleName"))).isCurrentlyVisible());
			//Assert.assertTrue(users.element(By.xpath(AcceptanceSuite.props.getProperty("UsersAdd_userName"))).isCurrentlyVisible());
			//Assert.assertTrue(users.element(By.xpath(AcceptanceSuite.props.getProperty("usersAdd_SubmitButton"))).isCurrentlyVisible());
		}
	   @When("The User Enters valid or Appropriate Values for all the Mandatory fields Enterprise '$Enterprise' EnterpriseResources '$EnterpriseResources' UserName '$UserName' RoleName '$RoleName' and clicks on Submit Button")
		public void The_User_Enters_valid_or_Appropriate_Values_for_all_the_Mandatory_fields_clicks_on_Submit_Button(String Enterprise, String EnterpriseResources, String UserName, String RoleName) throws InterruptedException{
		   users.enterValidDataIn_Enterprise_EnterpriseResources_UserName_RoleNameFields(Enterprise, EnterpriseResources, UserName, RoleName);
		   users.clickonUsersSubmitButton();
	   }
	   @Then("A Conformation message should display and created UserName '$UserName' should display in Users Listing page")
	   public void Conformation_message_should_display_and_created_UserName_should_display_in_Users_Listing_page(String UserName) throws InterruptedException{
		  // WebDriverWait wait=new WebDriverWait(users.getDriver(), 20);
		  // ToastMessageElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ToastMessage"))));
 		  // Assert.assertTrue(users.element(By.xpath(AcceptanceSuite.props.getProperty("ToastMessage"))).isCurrentlyVisible());
	       //String expResult = users.search(UserName);
		   //System.out.println(expResult);
	      // String ActResult = "Created User Displayed in Listing";
	      // Assert.assertTrue(expResult.equalsIgnoreCase(ActResult));
	   }
	   
	   
	 //Scenario 3 
	   @When("Select Enterprise '$Enterprise' from Enterprise list field and check Enterprise Resources list field")
		public void Select_Enterprise_from_Enterprise_list_field_and_check_Enterprise_Resources_list_field(String Enterprise) throws InterruptedException{
		   users.selectEnterprise(Enterprise); 
	   }
	   @Then("EnterpriseResources '$EnterpriseResources' which is used should not display in Enterprise Resources List field")
	   public void EnterpriseResources_which_is_used_should_not_display_in_Enterprise_Resources_List_field(String EnterpriseResources) throws InterruptedException{
		  // String expResult = users.check_EnterpriseResourceListField_ForUsedResource(EnterpriseResources);
		  // System.out.println(expResult);
	      // String ActResult = "Used Enterprise Resources Not Displayed in Listing";
	      // Assert.assertTrue(expResult.equalsIgnoreCase(ActResult));
	   }
	   
	 
	   
	 //Scenario 4
	   @Given("The User is on Pigeon Application Users page/Edit Users Pop Up by clicking Edit button on corresponding record with UserName '$UserName'")
		public void The_User_is_on_IndNav_Application_Users_page_Edit_Users_Pop_Up_by_clicking_Edit_button_on_corresponding_record_with_UserName(String UserName) throws InterruptedException{
		    //users.openPage();
		  // Thread.sleep(1000);
			//users.getDriver().manage().window().maximize();
			//users.clickOnLoginButton();
			//users.Click_ON_Users_Header();
			users.clickON_EditBtn_CorrespondingToUserName();
	   }
	   @When("The user changes RoleName '$RoleName' from Role Name List Field and clicks on Submit button")
		public void The_user_changes_RoleName_from_Role_Name_List_Field_and_clicks_on_Submit_button(String RoleName) throws InterruptedException{
		   users.selectRoleName_EditPage(RoleName);
		   users.clickonEditSubmitBtn();
	   }
	   @Then("A Conformation message should display and Changed RoleName '$RoleName' should update and display in Users Listing page")
	   public void Conformation_message_should_display_and_Changed_RoleName_should_update_and_display_in_Users_Listing_page(String RoleName) throws InterruptedException{
		  // WebDriverWait wait=new WebDriverWait(users.getDriver(), 20);
		  // ToastMessageElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ToastMessage"))));
 		  // Assert.assertTrue(users.element(By.xpath(AcceptanceSuite.props.getProperty("ToastMessage"))).isCurrentlyVisible());
	       //String expResult = users.checkWheatherChangedRoleName_UpdatedInListing();
	       //Assert.assertTrue(RoleName.equalsIgnoreCase(expResult));
	   }
	   
	 //Scenario 5
	   @Given("The User is on IndNav Application Users page/Block Users Pop Up by clicking Block button on corresponding record with UserName")
		public void The_User_is_on_IndNav_Application_Users_pageBlock_Users_Pop_Up_by_clicking_Block_button_on_corresponding_record_with_UserName() throws InterruptedException{
		   users.openPage();
			users.getDriver().manage().window().maximize();
			users.clickOnLoginButton();
			users.Click_ON_Users_Header();
			users.clickON_BlockBtn_CorrespondingToUserName();
	   }
	   @When("The user selets BlockReson from Block Reason List Field and clicks on Submit button")
		public void The_user_selets_BlockReson_from_Block_Reason_List_Field_and_clicks_on_Submit_button() throws InterruptedException{
		   users.selectsBlockReson_ClicksOnBlockBtn();
	   }
	   @Then("A Conformation message should display and user should not login in to application")
	   public void Conformation_message_should_display_and_user_should_not_login_in_to_application() throws InterruptedException{
		   //WebDriverWait wait=new WebDriverWait(users.getDriver(), 20);
		   //ToastMessageElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ToastMessage"))));
		   //Assert.assertTrue(users.element(By.xpath(AcceptanceSuite.props.getProperty("usersAdd_Button"))).isCurrentlyVisible());
	   }
	   
	   
    //Scenario 6
	   @Given("The User is on IndNav Application Users page")
		public void The_User_is_on_IndNav_Application_Users_page() throws InterruptedException{
		    users.openPage();
			users.getDriver().manage().window().maximize();
			users.clickOnLoginButton();
			users.Click_ON_Users_Header();
	   }
	   @When("The user clicks on View Action button corresponding to record with UserName")
		public void The_user_clicks_on_View_Action_button_corresponding_to_record_with_UserName() throws InterruptedException{
		   users.clickON_ViewBtn_CorrespondingToUserName();
	   }
	   @Then("Corresponding User Record View Page should display1")
	   public void Corresponding_User_Record_View_Page_should_display() throws InterruptedException{
		  // Assert.assertTrue(users.element(By.xpath(AcceptanceSuite.props.getProperty("usersAdd_Button"))).isCurrentlyVisible());
	   }
	   
	   
	   
	   
	   //Scenario 7
	   @Given("The User is on IndNav Application Users page/Delete Users Pop Up by clicking Delete button on corresponding record with UserName")
		public void The_User_is_on_IndNav_Application_Users_page_Delete_Users_Pop_Up_by_clicking_Delete_button_on_corresponding_record_with_UserName() throws InterruptedException{
		    users.openPage();
			users.getDriver().manage().window().maximize();
			users.clickOnLoginButton();
			users.Click_ON_Users_Header();
			users.clickON_DeleteBtn_CorrespondingToUserName();
	   }
	   
	   
	   @When("The User clicks on Delete Button on Users Delete Popup")
		public void The_user_clicks_on_View_Action_button_corresponding_to_record_with_UserName1() throws InterruptedException{
		   users.Click_ON_UsersDeleteBtn();
	   }
	   
	   @Then("A User with no dependencies should be deletable and Conformation message should display")
	   public void User_with_no_dependencies_should_be_deletable_and_Conformation_message_should_display() throws InterruptedException{
		  // WebDriverWait wait=new WebDriverWait(users.getDriver(), 20);
		  // ToastMessageElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ToastMessage"))));
		  // Assert.assertTrue(users.element(By.xpath(AcceptanceSuite.props.getProperty("usersAdd_Button"))).isCurrentlyVisible());
	   }
	   
	   
	   @Given("The User is on Users page")
		public void TheUserisonUserspage() throws InterruptedException{
		   // users.openPage();
			//users.getDriver().manage().window().maximize();
			//users.clickOnLoginButton();
			//users.Click_ON_Users_Header();
			
	   }
	   
	   
	   @When("The User clicks on users ‘Message’ button of any of the record and enters details in the popup and clicks on submit")
		public void Theuserclicks_on_View_Action_button_corresponding_to_record_with_UserName1() throws InterruptedException{
		  // users.Click_ON_UsersDeleteBtn();
		   users.clickON_DeleteBtn_CorrespondingToMessageName();
	   }
	   
	   @Then("The message should be delivered to the respective users user")
	   public void Themessageshouldbedeliveredtotherespectiveusersuser() throws InterruptedException{
		  // WebDriverWait wait=new WebDriverWait(users.getDriver(), 20);
		  // ToastMessageElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ToastMessage"))));
		  // Assert.assertTrue(users.element(By.xpath(AcceptanceSuite.props.getProperty("usersAdd_Button"))).isCurrentlyVisible());
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   Properties prop;
//		 Users Create Validation Check ---------------------------------------------
		   @Given("The User is on IndNav Application Users page/Create Users Pop Up1")
			public void The_User_create_validation() throws FileNotFoundException, IOException, InterruptedException{
			    users.openPage();
				users.getDriver().manage().window().maximize();
				users.clickOnLoginButton();
				users.Click_ON_Users_Header();
				//Assert.assertTrue(users.element(By.xpath(AcceptanceSuite.props.getProperty("usersAdd_Button"))).isCurrentlyVisible());
				users.click_On_UsersAddAction();
				users.waitForUserNameField();
		   }
		   @When("The User Missed Values for any Mandatory fields and clicks on Submit Button $table")
			public void enter_usercreate_validationcheck(ExamplesTable table) throws InterruptedException, FileNotFoundException, IOException{		   
			   prop = new Properties();
			   prop.load(new FileInputStream("serenity.properties"));
//			   System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%3");
			
			   for (Map<String, String> row : table.getRows()){
			   users.enter_usercreate_validation(row.get("Enterprise"), row.get("EnterpriseResource"), row.get("UserName"), row.get("RoleName"));
			   users.clickonUsersSubmitButton();
			   Thread.sleep(2000);
//					actualMessage = users.getDriver().findElement(By.xpath(prop.getProperty("usersvalidation"))).getText();
				
			   String ActualvalidationMessage = users.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("usersAdd_ErrorMessage"))).getText();
				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$"+ActualvalidationMessage);
			   String ExpectedValidation=row.get("Expected Error Message");
				System.out.println("###############################"+ExpectedValidation);
				Assert.assertTrue(ActualvalidationMessage.equalsIgnoreCase(ExpectedValidation));
			}
		   }
		   @Then("Appropriate Validation messages should be Displayed to the User for each combination1")
		   public void UserAdd_validation_Check() throws InterruptedException{
			   users.Users_AddCloseButton();
		   }
		     
		   
//		   -------------------------------------------+--+---++-------
//			-----------DeleteValidationCheckStart
		   @Given("The User is in Users listing page")
		   
		  public void DeleteUserValition() throws InterruptedException {
			   
			    users.openPage();
				users.getDriver().manage().window().maximize();
				users.clickOnLoginButton();
			   
			   users.Delete_ValidationCheck();
			   
		   }
		   
		   @When("The User clicks on delete button")
		   
		   public void Users_Delete_Validation_Check() {
			   System.out.println("Delete Validatin-------------1");
		   }
		   
		   @Then("The User should not be deleted if any dependency exists on Delete popup")
		   public void Users_Delete_Validation_Should_Display() {
			   System.out.println("Delete Validatin-------------2");
	  
		   }
		   
//		---------------------------------------------------DeleteValidationCheckEnd
//		--------Users - Block Validation Check Start
		 @Given("The User is on IndNav Application Users page/Block Pop Up") 
		 public void Users_Block_ValidationCheck() throws InterruptedException {
			   users.openPage();
			   users.getDriver().manage().window().maximize();
			   users.clickOnLoginButton();
			   users.Click_ON_Users_Header();
			   users.verify_block_user_page_validation_check();		
			 
		 }
		 @When("The User Missed Values for any Mandatory fields in Users Block popup") 
		 public void Users_Block_ValidationVerify() {
			 users.Verify_Block_Page_Validation_NewMessage();
		 }
		 @Then("Appropriate Validation messages should be Displayed to the User for each combination in Users Block popup")
		 public void Users_Block_ValidationCompleted() {
//			 System.out.println("Passed--------------------------------------------");
			 users.UserBlock_PopupCloseButton();
		 } 
//		 --------Users - Block Validation Check End 
//		 -------Users  - Unblock Validation Start
		 @Given("The User is on IndNav Application Users page/UnBlock Pop Up") 
		 public void Users_UnBlock_ValidationCheck() throws InterruptedException {
			 Thread.sleep(1000);
			 //  users.Click_ON_Users_Header();
			   users.verify_Unblock_user_page_validation_check();		
			 
		 }
		 @When("The User Missed Values for any Mandatory fields in Users UnBlock popup") 
		 public void Users_UnBlock_ValidationVerify() {
			 users.Verify_UnBlock_Page_Validation_NewMessage();
		 }
		 @Then("Appropriate Validation messages should be Displayed to the User for each combination in Users UnBlock popup")
		 public void Users_UnBlock_ValidationCompleted() {
//			 System.out.println("Passed--------------------------------------------");
			 users.UserBlock_PopupCloseButton();
		 
		 }
		 
//		 -------Users  - Unblock Validation End
		 
  
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
}


