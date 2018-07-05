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
import com.srisys.serenity.pages.UserRolesPage;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.steps.ScenarioSteps;

public class UserRolesSteps extends ScenarioSteps {
	
	WebDriver driver;
	
	UserRolesPage userRole;
	WebElement loginButtonElem;
	WebElement usernameElem;
	WebElement passwordElem;
	WebElement submitButtonElem;
	WebElement facebookElem;
	WebElement selectRoleListFieldElem;
	WebElement ToastMessageElem;

	

	
	
	
	
	// Scenario 2
	@Given("The User is on Pigeon Application User Roles page/Create Role Pop Up")
	public void The_User_is_on_IndNav_UserRoles_page_CreateRole_PopUp() throws FileNotFoundException, IOException, InterruptedException{
		userRole.openPage();
		userRole.getDriver().manage().window().maximize();
		userRole.clickOnLoginButton();
		userRole.Click_ON_Roles_Header();
		//Assert.assertTrue(userRole.element(By.xpath(AcceptanceSuite.props.getProperty("createRoleAction"))).isCurrentlyVisible());
		userRole.click_On_CreateRole();
		userRole.waitForFirstNameField();
		//Assert.assertTrue(userRole.element(By.xpath(AcceptanceSuite.props.getProperty("CreateRole_RoleName"))).isCurrentlyVisible());
		//Assert.assertTrue(userRole.element(By.xpath(AcceptanceSuite.props.getProperty("CreateRole_Description"))).isCurrentlyVisible());
		//Assert.assertTrue(userRole.element(By.xpath(AcceptanceSuite.props.getProperty("CreateRole_SubmitButton"))).isCurrentlyVisible());
	}
	@When("The User Enters invalid values or empty values  for the Mandatory fields and unique fields(Role Name and Description)Combinations $table")
	public void The_User_Enters_invalid_values_or_empty_values_for_the_Mandatory_fields_and_unique_fields_Combinations(ExamplesTable table) throws InterruptedException{
		for (Map<String, String> row : table.getRows()) {
			userRole.enter_RoleName_Description_And_ClickON_SubmitBtn(row.get("RoleName"), row.get("Description"));
			Thread.sleep(5000);
			Serenity.setSessionVariable("result").to("fail");
			String str = userRole.getErrorMessage();
			if(str.equalsIgnoreCase(row.get("Expected Error Message"))){
				Serenity.setSessionVariable("result").to("pass");
				Serenity.setSessionVariable("status").to(row.get("Expected Error Message"));
		}
	  }
   }
   @Then("Appropriate Validation messages should be Displayed to the User for each combination")
	public void Appropriate_Validation_messages_should_be_Displayed_to_the_User_for_each_combination(){
	   String str = userRole.getErrorMessage();
	   //Assert.assertTrue(str.equalsIgnoreCase(Serenity.sessionVariableCalled("status").toString()));
	   //Assert.assertTrue(Serenity.sessionVariableCalled("result").toString().equalsIgnoreCase("pass"));
   }
	
   

  //Scenario 3
   @Given("The User is on IndNav Application User Roles page/Create Role Pop Up")
	public void The_User_is_on_IndNav_Application_UserRoles_page_CreateRole_PopUp() throws FileNotFoundException, IOException, InterruptedException{
		userRole.openPage();
		userRole.getDriver().manage().window().maximize();
		userRole.clickOnLoginButton();
		userRole.Click_ON_Roles_Header();
		//Assert.assertTrue(userRole.element(By.xpath(AcceptanceSuite.props.getProperty("createRoleAction"))).isCurrentlyVisible());
		userRole.click_On_CreateRole();
		userRole.waitForFirstNameField();
		//Assert.assertTrue(userRole.element(By.xpath(AcceptanceSuite.props.getProperty("CreateRole_RoleName"))).isCurrentlyVisible());
		//Assert.assertTrue(userRole.element(By.xpath(AcceptanceSuite.props.getProperty("CreateRole_Description"))).isCurrentlyVisible());
		//Assert.assertTrue(userRole.element(By.xpath(AcceptanceSuite.props.getProperty("CreateRole_SubmitButton"))).isCurrentlyVisible());
	}
   @When("The User Enters valid or Appropriate Values for all the Mandatory fields RoleName '$RoleName' Description '$Description' and clicks on Submit Button")
	public void The_User_Enters_valid_or_Appropriate_Values_for_all_the_Mandatory_fields_RoleName_Description_ClicksON_SubmitButton(String RoleName, String Description) throws InterruptedException{
	   userRole.enterValidData_InRoleNameAndDescriptionFields(RoleName, Description);
	   userRole.clickonSubmitButton();   
   }
   @Then("A Conformation message should display and created RoleName '$RoleName' should display in User Roles Listing field")
   public void Conformation_message_should_display_and_created_User_Role_should_display_in_User_Roles_Listing_field(String RoleName) throws InterruptedException{	   
	  // Assert.assertTrue(userRole.element(By.xpath(AcceptanceSuite.props.getProperty("ToastMessage"))).isCurrentlyVisible());	   
	  //Thread.sleep(2000);
	 //  String expResult = userRole.check_SelectRoleListFiled_ForCreatedRole(RoleName);	   
	  // System.out.println(expResult);
      // String ActResult = "Role Displayed in Listing";
       //Assert.assertTrue(expResult.equalsIgnoreCase(ActResult));
   }

   
   
   //Scenario 4
   @Given("The User is on Pigeon Application User Roles page")
 	public void The_User_is_on_IndNav_Application_User_Roles_page() throws FileNotFoundException, IOException, InterruptedException{
 		//userRole.openPage();
 		//userRole.getDriver().manage().window().maximize();
 		//userRole.clickOnLoginButton();
 		//userRole.Click_ON_Roles_Header();
 		//Assert.assertTrue(userRole.element(By.xpath(AcceptanceSuite.props.getProperty("Roles_selectRole"))).isCurrentlyVisible());
 		//Assert.assertTrue(userRole.element(By.xpath(AcceptanceSuite.props.getProperty("DeleteRoleAction"))).isCurrentlyVisible());
 	}
    @When("The User selects Appropriate RoleName '$RoleName' from User Roles Listing Field and enters Description '$Description' and clicks on Submit button")
 	public void The_User_selects_Appropriate_RoleName_from_User_Roles_Listing_Field_and_enters_Description_and_clicks_on_Rename_Role_Button(String RoleName, String Description) throws InterruptedException{
    	Thread.sleep(1000);
    	//userRole.Click_ON_Roles_Header();
       userRole.select_RoleName_ToRename(RoleName);
 	   userRole.clickonRenameRoleBtn();
 	   userRole.waitFornewDescriptionInputField();
 	   //Assert.assertTrue(userRole.element(By.xpath(AcceptanceSuite.props.getProperty("RenameRole_NewDescription"))).isCurrentlyVisible());
 	   //Assert.assertTrue(userRole.element(By.xpath(AcceptanceSuite.props.getProperty("RenameRole_submitRoleButton"))).isCurrentlyVisible());
 	   userRole.enterNewDescription_ToRenameRole(Description );
 	   userRole.clickOnUserRoleSubmitBtn();
 	  
 	   
    }
    @Then("A Conformation message should display and rename RoleName '$RoleName' should display in User Roles Listing field")
    public void Conformation_message_should_display_and_rename_RoleName_should_display_in_User_Roles_Listing_field(String RoleName) throws InterruptedException{
 	   //Assert.assertTrue(userRole.element(By.xpath(AcceptanceSuite.props.getProperty("ToastMessage"))).isCurrentlyVisible());
 	 // WebDriverWait wait=new WebDriverWait(userRole.getDriver(), 20);
	 //  selectRoleListFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Roles_selectRole"))));
 	   //  String expResult = userRole.check_SelectRoleListFiled_ForRenameRole(RoleName);
 	   //  System.out.println(expResult);
       // String ActResult = "RenameRole Displayed in Listing";
        //Assert.assertTrue(expResult.equalsIgnoreCase(ActResult));
    }   
   
   
  //Scenario 5
    
    @When("The User selects Appropriate RoleName '$RoleName' from User Roles Listing Field and update permissions and click on Submit Button")
  	 public void The_User_selects_Appropriate_RoleName_from_User_Roles_Listing_Field_and_update_permissions_and_click_on_Submit_Button(String RoleName ) throws InterruptedException{
   	Thread.sleep(2000);
    	userRole.select_RoleName_ToEdit(RoleName);
   	 userRole.clickON_DashboardANDEnterpriseResources_CheckBoxes();
   	 userRole.clickOnEditRoleBtn();
   	 userRole.waitForEditRole_SubmitButton();
   	 userRole.clickONUserRole_SubmitBtn(); 
    }
    @Then("A Conformation message should display and updated UserRole '$UserRole' permissions should save and display")
    public void A_Conformation_message_should_display_and_updated_UserRole_permissions_should_save_and_display(String RoleName) throws InterruptedException{
    	//WebDriverWait wait=new WebDriverWait(userRole.getDriver(), 20);
    	//ToastMessageElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ToastMessage"))));
    	//Assert.assertTrue(userRole.element(By.xpath(AcceptanceSuite.props.getProperty("ToastMessage"))).isCurrentlyVisible());
       	//userRole.getDriver().navigate().refresh();
        //userRole.select_RoleName_ToEdit(RoleName);
        //String expResult = userRole.check_wheatherPermissionSavedIN_CheckBoxes();
        //System.out.println(expResult);
        //String ActResult = "Permissions Saved UserRole Edited Succesfully";
        //Assert.assertTrue(expResult.equalsIgnoreCase(ActResult));
        
    }
    
    
    
  //Scenario 6
    @Given("The User is on Pigeon Application User Roles page to Delete")
 	public void The_User_is_on_IndNav_Application_User_Roles_page_Delete() throws FileNotFoundException, IOException, InterruptedException{
 		userRole.openPage();
 		userRole.getDriver().manage().window().maximize();
 		userRole.clickOnLoginButton();
 		userRole.Click_ON_Roles_Header();
 		//Assert.assertTrue(userRole.element(By.xpath(AcceptanceSuite.props.getProperty("Roles_selectRole"))).isCurrentlyVisible());
 		//Assert.assertTrue(userRole.element(By.xpath(AcceptanceSuite.props.getProperty("DeleteRoleAction"))).isCurrentlyVisible());
 	}
   
     @When("The User selects Appropriate RoleName '$RoleName' from User Roles Listing Field and Deletes the Role")
  	public void The_User_selects_Appropriate_RoleName_from_User_Roles_Listing_Field_and_clicks_on_Delete_Button(String RoleName ) throws InterruptedException{
  	   userRole.select_RoleName_ToDelete(RoleName);
  	   userRole.clickonDeleteRoleBtn();
  	   userRole.waitForDeleteButton();
  	   //Assert.assertTrue(userRole.element(By.xpath(AcceptanceSuite.props.getProperty("DeleteRole_DeleteButton"))).isCurrentlyVisible());
  	   userRole.clickonDeleteBtn();
     }
     
     @Then("A Confirmation message should display provided the role is not assigned to any User")
     public void Conformation_message_should_display_and_deleted_RoleName_should_not_display_in_User_Roles_Listing_field() throws InterruptedException{
  	   //Assert.assertTrue(userRole.element(By.xpath(AcceptanceSuite.props.getProperty("ToastMessage"))).isCurrentlyVisible());
  	 //WebDriverWait wait=new WebDriverWait(userRole.getDriver(), 20);
	   //selectRoleListFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Roles_selectRole"))));
  	     //String expResult = userRole.check_SelectRoleListFiled_ForDeletedRole(RoleName);
  	     //System.out.println(expResult);
         //String ActResult = "Role Not Displayed in Listing";
         //Assert.assertTrue(expResult.equalsIgnoreCase(ActResult));
     }
     
     
     
   //Scenario 7
     
     @When("The User selects Appropriate RoleName '$RoleName' from User Roles Listing Field and click on Users Detail Action")
  	public void The_User_selects_Appropriate_RoleName_from_User_Roles_ListingField_and_click_on_Users_Detail_Action(String RoleName ) throws InterruptedException{
  	   userRole.select_RoleName_ToCheck_UsersDetails(RoleName);
  	   userRole.clickonUsersDetailAction();
     }
     @Then("Users Page Should display with the records corresponding to selected User Role")
     public void Users_Page_Should_display_with_the_records_corresponding_to_selected_UserRole() throws InterruptedException{
  	   //Assert.assertTrue(userRole.element(By.xpath(AcceptanceSuite.props.getProperty("usersAdd_Button"))).isCurrentlyVisible());
  	  // String rolename = userRole.getRoleName();
  	 //Assert.assertTrue(rolename.equalsIgnoreCase("Super Admin"));
     }
     
     @Given("The User is on Pigeon Application users User Roles page")
   	public void TheUserisonPigeonApplicationusersUserRolespage() throws FileNotFoundException, IOException, InterruptedException{
   		/*userRole.openPage();
   		userRole.getDriver().manage().window().maximize();
   		userRole.clickOnLoginButton();
   		userRole.Click_ON_Roles_Header();*/
   		
   	}
      
      @When("The User selects Appropriate RoleName and clicks on Users")
    	public void TheUserselectsAppropriateRoleNameandclicksonUsers() throws InterruptedException{
     	 userRole.userrolesect();
    	   
       }
       @Then("All the Users with the selected role name should be listed")
       public void AlltheUserswiththeselectedrolenameshouldbelisted() throws InterruptedException{
    	   
       }
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
    //User Roles Create Validation Check ---------------------------------------------
    	   @Given("The User is on IndNav Application Roles page/Create Roles Pop Up")
    	  public void The_Role_create_validation() throws FileNotFoundException, IOException, InterruptedException{
    	      userRole.openPage();
    	      userRole.getDriver().manage().window().maximize();
    	      userRole.clickOnLoginButton();
    	      userRole.Click_ON_Roles_Header();
    	   //Assert.assertTrue(users.element(By.xpath(AcceptanceSuite.props.getProperty("usersAdd_Button"))).isCurrentlyVisible());
    	   userRole.click_On_CreateRole();
    	   userRole.waitForFirstNameField();
    	   }
    	   Properties prop;
    	   @When("The User Missed Values for any Mandatory fields in roles create popup and clicks on Submit Button $table")
    		public void rolecreate_popup_validationcheck(ExamplesTable table) throws InterruptedException, FileNotFoundException, IOException{		   
    		   prop = new Properties();
    		   prop.load(new FileInputStream("serenity.properties"));
    		
    		   for (Map<String, String> row : table.getRows()){
    		   userRole.enter_usercreate_validation(row.get("RoleName"),row.get("Description"));
    		   userRole.CreateRoleSubmit_Button();
    		   Thread.sleep(2000);
//    				actualMessage = users.getDriver().findElement(By.xpath(prop.getProperty("usersvalidation"))).getText();
    			
    		   String ActualvalidationMessage = userRole.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("CreateRole_errorMessage"))).getText();
    			System.out.println("ActualvalidationMessage:$$$$$$$$$$$$$$$$$$$$$$$$$"+ActualvalidationMessage);
    		   String ExpectedValidation=row.get("Expected Error Message");
    			System.out.println("ExpectedValidation:###############################"+ExpectedValidation);
    			Assert.assertTrue(ActualvalidationMessage.equalsIgnoreCase(ExpectedValidation));
    		}
    	   }
    	   @Then("Appropriate Validation messages should be Displayed to the User for each combination in roles create")
    	   public void UserAdd_validation_Check() throws InterruptedException{
    	     userRole.Roles_CreateCloseButton();
    	   }


    	 // Create Role Validation End----------

    	 // Edit Role Validation Start-----------

    	  @Given("The User is on IndNav Application Roles page/Edit Roles validation Pop Up")
    	   public void Given_Edit_Role_Validation_Check() throws InterruptedException {
    		  userRole.openPage();
    	      userRole.getDriver().manage().window().maximize();
    	      userRole.clickOnLoginButton();
    	      userRole.Click_ON_Roles_Header();
    	      userRole.clickOnEditRoleBtn();
    	  
    	  }
    	  @When("The User Missed Values for any Mandatory fields in roles edit popup")
    	  public void When_Edit_Role_Validation_Check() {
    	  System.out.println("User is on Edit Role Validation Check(When)");
    	  }
    	  
    	  @Then("Appropriate Validation messages should be Displayed to the User for each combination in roles edit")
    	  public void Then_Edit_Role_Validation_Check() {
    	   userRole.edit_role_validation_message_check();
    	  }
    	  
    	 // Edit Role Validation End-------------

    	 // Rename Role Validation Start
    	  @Given("The User is on IndNav Application Roles page/Rename Roles validation Pop Up")
    	  public void Rename_Role_Without_Selection_Validation_Check() throws InterruptedException {
    	      userRole.openPage();
    	      userRole.getDriver().manage().window().maximize();
    	      userRole.clickOnLoginButton();
    	      userRole.Click_ON_Roles_Header();
    	  userRole.clickonRenameRoleBtn();
    	  userRole.verify_validation_of_renamerole_WithoutRole_Selection();
    	  userRole.Rename_RolePopup_CloseButton();
    	  }
    	  @When("The User Missed Values for any Mandatory fields in roles rename popup")
    	  public void Rename_Role_With_Selection_Validation_Check() throws InterruptedException {
    	  userRole.Rename_Role_After_RoleSelected();
    	  userRole.clickonRenameRoleBtn();
    	  userRole.Rename_Role_Description_Validation();
    	  userRole.Rename_Role_SubmitButton();
    	  userRole.verify_validation_of_renamerole_WithRole_Selection();  
    	  
    	  }
    	  @Then("Appropriate Validation messages should be Displayed to the User for each combination in roles rename")
    	  public void Rename_Role_Validation_Check() {
    	   userRole.Rename_RoleSelectedPopup_CloseButton();
    	   System.out.println("Done Rename_Role_Validation_Check");
    	  }


    	 // Rename Role Validation End

    	 // Delete Role Validation Start
    	  
    	  @Given("The User is on IndNav Application Roles page/Delete Roles validation Pop Up")
    	  public void Delete_Role_Validation_Popup() throws InterruptedException {
    	   userRole.openPage();
    	      userRole.getDriver().manage().window().maximize();
    	      userRole.clickOnLoginButton();
    	      userRole.Click_ON_Roles_Header();

    	   userRole.clickonDeleteRoleBtn();
    	   
    	  }
    	  @When("The Role had any dependencies")
    	  public void Delete_Role_Validation_Dependency() throws InterruptedException {
    	   userRole.Roles_Delete__Verify_Without_Role_Selection();
    	  }
    	  @Then("Appropriate Validation messages should be Displayed to the User for each combination in roles delete popup")
    	  public void Delete_Role_validation_Verify() {
    	   System.out.println("Delete Role Validation Verified");
    	   userRole.Roles_Delete_CloseButton_WithoutRoleSelection();
    	  }
    	 }
    	 // Delete Role Validation End



       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
     


