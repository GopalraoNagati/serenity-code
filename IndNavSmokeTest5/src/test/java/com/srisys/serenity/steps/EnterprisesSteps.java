package com.srisys.serenity.steps;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.srisys.serenity.AcceptanceSuite;
import com.srisys.serenity.pages.IndNavEnterprisespage;
import com.srisys.serenity.pages.IndNavLoginpage;

public class EnterprisesSteps {

	WebDriver driver;
	IndNavEnterprisespage enterprisespage;
	IndNavLoginpage homePage;
	WebElement ToastMessageElem;

	/*------ Scenario 1  Enterprise Create----------*/
	@Given("The User is on Pigeon Application Enterprises page/Create Enterprises Pop Up")
	public void The_User_is_on_IndNav_Application_Enterprises_page_Create_Enterprises_Pop_Up() throws Exception {
		homePage.openPage();
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		enterprisespage.clickONEnterprisesHeader();
		enterprisespage.clickONAddAction();
		enterprisespage.waitForEnterprisesFirstNameField();
		Assert.assertTrue(
				enterprisespage.element(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_Enterprise")))
						.isCurrentlyVisible());
	}

	@When("The user Enters valid or appropriate values for all fields and clicks on Submit Button")
	public void The_user_Enters_valid_or_Appropriate_Values_for_all_fields_and_clicks_on_Submit_Button()
			throws InterruptedException {
		enterprisespage.enterprisesCreate();

	}

	@Then("A Confirmation message should display and created Enterprise should display in Enterprises Listing page")
	public void Conformation_message_should_display_and_created_Enterprise_should_display_in_Enterprises_Listing_page()
			throws InterruptedException {

	}

	/*------ Scenario 1  Edit Record ----------*/
	@Given("The User is on Pigeon Application Enterprises page/Edit Enterprises Pop Up by clicking Edit button on corresponding record")
	public void The_User_is_on_IndNav_Application_Enterprises_page_Edit_Enterprises_Pop_Up_by_clicking_Edit_button_on_corresponding_record()
			throws Exception {
		homePage.openPage();
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		enterprisespage.clickONEnterprisesHeader();
		

	}

	@When("The user Enters valid or Appropriate Values for all fields and clicks on Submit Button in Edit page")
	public void The_user_Enters_valid_or_Appropriate_Values_for_all_fields_and_clicks_on_Submit_Button_in_Edit_page()
			throws FileNotFoundException, IOException, InterruptedException {
		enterprisespage.clickON_EditBtn_CorrespondingToEnterpriseName();
	}

	@Then("A Confirmation message should display and Updated Enterprise should display in Enterprises Listing page")
	public void Conformation_message_should_display_and_Updated_Enterprise_should_display_in_Users_Listing_page()
			throws InterruptedException {

	}

	/*------ Scenario 1  View Record ----------*/

	@Given("The User is on Pigeon Application Enterprises page")
	public void The_User_is_on_IndNav_Application_Enterprises_page()
			throws FileNotFoundException, IOException, InterruptedException {

	}

	@When("The user clicks on View Action button corresponding to a record")
	public void The_user_clicks_on_View_Action_button_corresponding_to_the_corresponding_record()
			throws FileNotFoundException, IOException, InterruptedException {
		enterprisespage.clickON_View_Btn_CorrespondingToEnterpriseName();
	}

	@Then("Corresponding User Record View Page should display")
	public void Corresponding_User_Record_View_Page_should_display() throws InterruptedException {

	}

	/*------ Scenario 1  Inactive Record ----------*/

	@When("The user clicks on Inactivate Action button corresponding to the corresponding record")
	public void The_user_clicks_on_Inactivate_Action_button_corresponding_to_the_corresponding_record()
			throws FileNotFoundException, IOException, InterruptedException {

		enterprisespage.clickON_InActivate_Btn_CorrespondingToEnterpriseName();
	}

	@Then("An Enterprise should be Inactivate and Confirmation message should display")
	public void An_Enterprise_should_be_Inactivate_and_Conformation_message_should_display()
			throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(enterprisespage.getDriver(), 20);
		ToastMessageElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ToastMessage"))));

	}

	/*------ Scenario 1  Active Record ----------*/

	@When("The user clicks on Activate Action button corresponding to the corresponding record")
	public void The_user_clicks_on_Activate_Action_button_corresponding_to_the_corresponding_record()
			throws FileNotFoundException, IOException, InterruptedException {
		enterprisespage.clickON_Activate_Btn_CorrespondingToEnterpriseName();
	}

	@Then("An Enterprise should be Activate and Conformation message should display")
	public void An_Enterprise_should_be_Activate_and_Conformation_message_should_display() throws InterruptedException {

	}

	/*------ Scenario 1  Advance search Record ----------*/

	@Given("The User is on Enterprises Advanced Search Pop Up")
	public void TheUserisoEventsRegistrationSearchPopUp() throws InterruptedException {

	}

	@When("The User Enters Enterprises Search data and Clicks on Submit Button")
	public void TheUserEntersEventsRegistrationdataSearchdataandClicksonSubmitUpButton() throws Exception {

		enterprisespage.enterprisesAdvanceSearch();

	}

	@Then("Appropriate Enterprise(s) record should be displayed in the listing as per the search criteria")
	public void AppropriatesEventsRegistrationsearchrecordshouldbeDisplayedinthelisting() throws InterruptedException {

	}
	
	
	
	
//EnterpriseNegative steps
	
	
	
	
	//Enterprises_Add/Create Validation Check Start
 	
		@Given("The User is on IndNav Application Eneteprise Add/Create Pop Up")
		public void Enterprise_Create_ValidationCheck_Start() throws Exception {
			homePage.openPage();
			homePage.getDriver().manage().window().maximize();
			homePage.clickOnLoginButton();
			enterprisespage.clickONEnterprisesHeader();
			enterprisespage.clickONAddAction();
			 			
			 	}
		@When("The User Missed Values for any Mandatory fields in Enterprise Create Popup and clicks on Submit Button $table")
		public void Enterprise_Create_ValidationCheck_When(ExamplesTable table) throws InterruptedException, FileNotFoundException, IOException {
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%3");
		for (Map<String, String> row : table.getRows()){
		enterprisespage.Enterprise_Create_ValidationCheckMainBlock(row.get("EnterpriseName"), row.get("EnterpriseWebsite"), row.get("EnterpriseEmployerIDNumber"), row.get("EnterpriseDescription"),
				row.get("EnterpriseCreateValidationImage"), row.get("EnterpriseWorkNumber"), row.get("EnterpriseEmailID"),row.get("EnterpriseAdminEmailID"),row.get("EnterpriseAddressLine1"),row.get("EnterpriseCity"),row.get("EnterpriseZipCode"),row.get("EnterpriseLatitude"),row.get("EnterpriseLongitude"),
				row.get("EnterpriseAppTitle"),row.get("EnterpriseFleetCommonName"),row.get("EnterpriseMaxLimitActiveReservationsPerUser"),row.get("EnterpriseAdvancedReservationWindowinDays"),row.get("EnterpriseMaxReservationsWindowInHours"),
				row.get("EnterpriseReservationReminderWindowInMinutes"),row.get("EnterpriseFleetReservationAutoExpiryInHours"),row.get("EnterpriseGracePeriodInMinutes"),row.get("EnterpriseInActiveTimeoutInMinutes"),
				row.get("EnterpriseCheckInWindowInMinutes"),row.get("EnterpriseBillToDetailsAddressLine1"),row.get("EnterpriseBillToDetailsCity"),row.get("EnterpriseBillToDetailsZipCode"),row.get("creditCardTypeList"),row.get("creaditCardField"),row.get("creaditCardNameField"),row.get("creditCardMonthListField"),
				row.get("creditCardYearListField"),row.get("CVVField"));
//		enterprisespage.clickonUsersSubmitButton();
		Thread.sleep(1000);
//		actualMessage = users.getDriver().findElement(By.xpath(prop.getProperty("usersvalidation"))).getText();
						
		String ActualvalidationMessage = enterprisespage.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseCreateValidationPath"))).getText();
		System.out.println("ActualvalidationMessage------------------------"+ActualvalidationMessage);
		String ExpectedValidation=row.get("Expected Error Message");
		System.out.println("ExpectedValidation========="+ExpectedValidation);
//		Thread.sleep(20000);
		Assert.assertTrue(ActualvalidationMessage.equalsIgnoreCase(ExpectedValidation));
		//enterprisespage.Enterprise_Create_CloseBotton_Validation_Check();
		//enterprisespage.clickONAddAction();
		}
				   		 		
	}
			 		@Then("Appropriate Validation messages should be Displayed to the User for each combination in Enteprise Create Popup")
			 	public void Enterprise_ValidationCheck_Then() {
			 		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!Passed");	
			 		enterprisespage.Enterprise_Create_CloseBotton_Validation_Check();
			 		}
			 		
	//Enterprises_Add/Create Validation Check End


	//		 		Enterprise Edit validation Check Start
		@Given("The User is on IndNav Application Eneteprise Edit Pop Up")
		public void EnterpriseEditValidationCheckStart() throws Exception {
			homePage.openPage();
			homePage.getDriver().manage().window().maximize();
			homePage.clickOnLoginButton();
			enterprisespage.clickONEnterprisesHeader();
			enterprisespage.EnterpriseEdit_SearchEnterprise();
			enterprisespage.CLickonEnterpriseEditButton();
		}
			
		@When("The User Missed Values for any Mandatory fields in Enterprise Edit Popup and clicks on Submit Button $table")
		public void EnterpriseEditValidationCheck(ExamplesTable table) throws InterruptedException {
			for (Map<String, String> row : table.getRows()){
				enterprisespage.Enterprise_Edit_ValidationCheckMainBlock(row.get("EnterpriseWebsite"), row.get("EnterpriseEmployerIDNumber"), row.get("EnterpriseDescription"),
						row.get("EnterpriseWorkNumber"),row.get("EnterpriseEmailID"),row.get("EnterpriseAdminEmailID"),row.get("EnterpriseAddressLine1"),row.get("EnterpriseCity"),row.get("EnterpriseZipCode"),row.get("EnterpriseLatitude"),row.get("EnterpriseLongitude"),
						row.get("EnterpriseAppTitle"),row.get("EnterpriseFleetCommonName"),row.get("EnterpriseMaxLimitActiveReservationsPerUser"),row.get("EnterpriseAdvancedReservationWindowinDays"),row.get("EnterpriseMaxReservationsWindowInHours"),
						row.get("EnterpriseReservationReminderWindowInMinutes"),row.get("EnterpriseFleetReservationAutoExpiryInHours"),row.get("EnterpriseGracePeriodInMinutes"),row.get("EnterpriseInActiveTimeoutInMinutes"),
						row.get("EnterpriseCheckInWindowInMinutes"),row.get("EnterpriseBillToDetailsAddressLine1"),row.get("EnterpriseBillToDetailsCity"),row.get("EnterpriseBillToDetailsZipCode"),row.get("creditCardTypeList"),row.get("creaditCardField"),row.get("creaditCardNameField"),row.get("creditCardMonthListField"),
						row.get("creditCardYearListField"),row.get("CVVField"));
//				enterprisespage.clickonUsersSubmitButton();
				Thread.sleep(1000);
//				actualMessage = users.getDriver().findElement(By.xpath(prop.getProperty("usersvalidation"))).getText();
								
				String ActualvalidationMessage = enterprisespage.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_ErrorMsg"))).getText();
				System.out.println("ActualvalidationMessage------------"+ActualvalidationMessage);
				String ExpectedValidation=row.get("Expected Error Message");
				System.out.println("ExpectedValidation======="+ExpectedValidation);
				Assert.assertTrue(ActualvalidationMessage.equalsIgnoreCase(ExpectedValidation));
//				enterprisespage.Enterprise_Create_CloseBotton_Validation_Check();
				
//				enterprisespage.clickONAddAction();
				}	
		}
		@Then("Appropriate Validation messages should be Displayed to the User for each combination in Enteprise Edit Popup")
		public void EnterpriseEditValidationCheckEnd() {
		WebElement ActualvalidationMessage=enterprisespage.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseCloseaction")));
		ActualvalidationMessage.click();
			
		}
			 		
			 		
			 		
//			 		Enterprise Edit Validation Check End
		
		
		
		
//		Enterprise InActive Start
		
		@Given("The User is on IndNav Application Enterprise page/Inactive Pop Up")
		public void ClickonEnterpriseInactiveButton() throws Exception {
			homePage.openPage();
			homePage.getDriver().manage().window().maximize();
			homePage.clickOnLoginButton();
			enterprisespage.clickONEnterprisesHeader();
			enterprisespage.EnterpriseEdit_SearchEnterprise();
		}
		@When("The User Missed Values for any Mandatory fields in Enterprise Inactive popup")
		public void EnterpriseInactiveValidationCheck() throws InterruptedException {
			enterprisespage.EnterpriseInActiveValidationButton();
			enterprisespage.ClickOnSubmitButtonInEnterpriseInactivePage();
		}
		@Then("Appropriate Validation messages should be Displayed to the User for each combination in Enterprise Inactive popup")
		public void EnterpriseInactiveValidationVerifySuccess() throws FileNotFoundException, IOException, InterruptedException {
			enterprisespage.VerifyValidationMessageInEnterpriseInactivePage();
		}
		
//		Enterprise InActive End
		
//		Enterprise Activate Validation Start
		@Given("The User is on IndNav Application Enterprise page/Activate Pop Up")
		public void ClickOnEnterpriseActivateButton() throws Exception {
			homePage.openPage();
			homePage.getDriver().manage().window().maximize();
			homePage.clickOnLoginButton();
			enterprisespage.clickONEnterprisesHeader();
			enterprisespage.EnterpriseEdit_SearchEnterprise();
			Thread.sleep(1000);
			enterprisespage.EnterpriseInActiveValidationButton();
			
		}
		@When("The User Missed Values for any Mandatory fields in Enterprise Activate popup")
		public void EnterpriseActivateValidationMessageVerify() throws InterruptedException, FileNotFoundException, IOException {
			enterprisespage.InactivateEnterpriseForValidationCheck();
			Thread.sleep(2000);
			enterprisespage.ClickOnSubmitButtonInEnterpriseInactivePage();
			Thread.sleep(2000);
//			enterprisespage.EnterpriseEdit_SearchEnterprise();
			enterprisespage.EnterpriseInActiveValidationButton();  //here it is enterprise activate page will be opened
		
		}
		@Then("Appropriate Validation messages should be Displayed to the User for each combination in Enterprise Activate popup")
		public void Verifyenterprise_ActivateValidationMessage() throws FileNotFoundException, IOException, InterruptedException {
			enterprisespage.ClickOnSubmitButtonInEnterpriseInactivePage();
			enterprisespage.VerifyValidationMessageInEnterprise_ActivePage();
		}
		












//		Enterprise Activate Validation End

		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
