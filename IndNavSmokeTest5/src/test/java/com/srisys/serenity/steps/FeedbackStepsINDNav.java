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
import org.openqa.selenium.WebElement;

import com.srisys.serenity.AcceptanceSuite;
import com.srisys.serenity.pages.IndNavEventsRegistrationspage;
import com.srisys.serenity.pages.IndNavEventspage;
import com.srisys.serenity.pages.IndNavFeedback;
import com.srisys.serenity.pages.IndNavFleetpage;
import com.srisys.serenity.pages.IndNavFunfactspage;
import com.srisys.serenity.pages.IndNavLoginpage;
import com.srisys.serenity.pages.IndNavLookupspage;
import com.srisys.serenity.pages.IndNavUserspage;

import net.thucydides.core.steps.ScenarioSteps;

public class FeedbackStepsINDNav extends ScenarioSteps{

	IndNavLoginpage homePage;
	IndNavFeedback feedback;
	IndNavFleetpage fleetpage;
	IndNavUserspage usesrpage;
	IndNavLookupspage lookupspage;
	IndNavEventspage eventspage;
	WebElement loginButtonElem;
	WebElement usernameElem;
	WebElement passwordElem;
	WebElement submitButtonElem;
	WebElement facebookElem;
	IndNavEventsRegistrationspage registration;
	IndNavFunfactspage funfacts;
	

	// Scenario 1
	@Given("The End User is on Feedback page")
	public void The_Visitor_is_on_IndNav_Home_page() throws FileNotFoundException, IOException, InterruptedException{
		homePage.openPage();	
		homePage.getDriver().manage().window().maximize();
		feedback.clickOnLoginButton();
	}
	
	@When("The End User clicks on Create Feedback button and Enters valid data in the popup and Clicks on Submit Button")
	public void The_Visitor_selects_or_Clicks_on_login_Button() throws InterruptedException{
		System.out.println("About to click Login Button");
		feedback.feedBackcreate();
	}
	
	@Then("Feedback Record should be created and should be displayed in the listing and it should be sent to the Enterprise Admin")
	public void Login_Popup_must_be_Displayed(){
		//Assert.assertTrue(homePage.element(By.xpath(AcceptanceSuite.props.getProperty("Admin"))).isCurrentlyVisible());
		//Assert.assertTrue(homePage.element(By.xpath(AcceptanceSuite.props.getProperty("Dashboard"))).isCurrentlyVisible());
		//homePage.getDriver().close();
	}
	
	
	@Given("The User is on Feedback page to View")
	public void The_User_is_on_Funfacts_View_Pop_Up() throws InterruptedException {
		//homePage.openPage();	
		//homePage.getDriver().manage().window().maximize();
		//''homePage.clickOnLoginButton();
		
	}
	 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
	@When("The User clicks on View button of any specific Feedback record")
	public void The_User_Enters_Valid_FunfactsView_data_and_Clicks_on_Submit_Button() throws InterruptedException {
		feedback.feedbackView();
	}
	
	@Then("Feedback Record specific details should be displayed in the popup")
	public void The_User_Enters_Valid_FunfactsView_data_and_Clicks_on_Submit_Button_Edit() throws FileNotFoundException, IOException {
		//Assert.assertTrue(fleetpage.element(By.xpath(AcceptanceSuite.props.getProperty("FleetsAdd"))).isCurrentlyVisible());
		
	}
	
	
	@Given("The User is on Feedback page to Search")
	public void The_User_is_on_Funfacts_Advancesearch_Pop_Up() throws InterruptedException {
		//homePage.openPage();	
		//homePage.getDriver().manage().window().maximize();
		//''homePage.clickOnLoginButton();
		
	}
	 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
	@When("The User enters valid Feedback record Search data and Clicks on Submit Button")
	public void The_User_Enters_Valid_advancesearch_data_and_Clicks_on_Submit_Button() throws InterruptedException {
		feedback.feedbackAdvancesearch();
	}
	
	@Then("Appropriate search results for Feedback should be displayed in the listing")
	public void The_User_Enters_Valid_FunfactsAdvancesearch_data_data_and_Clicks_on_Submit_Button_Edit() throws FileNotFoundException, IOException {
		//Assert.assertTrue(fleetpage.element(By.xpath(AcceptanceSuite.props.getProperty("FleetsAdd"))).isCurrentlyVisible());
		
	}
	
	@Given("The User is on Bill Feedback page to Delete")
	public void The_User_is_on_Funfacts_Delete_Pop_Up() throws InterruptedException {
		//homePage.openPage();	
		//homePage.getDriver().manage().window().maximize();
		//homePage.clickOnLoginButton();
		
	}
	 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
	@When("The User clicks on Delete button of any specific Feedback record")
	public void The_User_Enters_Valid_FunfactsDelete_data_and_Clicks_on_Submit_Button() throws InterruptedException {
		feedback.feedbackDelete();
		
		
	}
	@Then("That specific Feedback record should be deleted from the list")
	public void The_User_Enters_Valid_FunfactsDelete_data_and_Clicks_on_Submit_Button_Edit() throws FileNotFoundException, IOException {
		//Assert.assertTrue(fleetpage.element(By.xpath(AcceptanceSuite.props.getProperty("FleetsAdd"))).isCurrentlyVisible());
	}
	
	@Given ("The Enterprise Admin User is on Feedback page to Edit")
	public void EnterpriseAdminIsOnFeedbackPage() throws InterruptedException{
		homePage.openPage();	
		homePage.getDriver().manage().window().maximize();
		feedback.clickOnLoginButton_EntAdmin();
		
	}
	
	@When ("The Enterprise Admin User clicks on Edit button and modifies data in the Feedback Edit popup")
	public void EnterpriseAdminEditsFeedbackRecord() throws InterruptedException{
		feedback.feedbackEdit();
		
	}
	
	@Then ("Feedback Record should be updated and should be displayed in the listing")
	public void FeedbackRecordShouldBeupdated(){
		
	}
	
	
	
	
	
	
	
	
	
//	Create Feedback Validation Check Start
	
	@Given("The User is on IndNav Application Feedback page/Create Feedback Pop Up")
	public void CreateFeedbackValidation_CheckStart() throws InterruptedException {
		homePage.openPage();	
		homePage.getDriver().manage().window().maximize();
		feedback.clickOnLoginButton();	
		feedback.ClickonCreateFeedbackButtoinFeedbackPage();
		
	}
	@When("The User Missed Values for any Mandatory fields in Feedback create Popup and clicks on Submit Button $table")
	public void CreateFeedbackValidationCHeckWhen(ExamplesTable table) throws FileNotFoundException, IOException, InterruptedException {		
		for (Map<String, String> row : table.getRows()){
			feedback.Create_Feedback_Page_ValidationCheck(row.get("FeedbackType"), row.get("ObjectType"), row.get("ObjectName"), row.get("FeedbackDescription"));
			String ActualvalidationMessage = homePage.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("FeedbackCreateValidationMessagePath"))).getText();
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$"+ActualvalidationMessage);
		   String ExpectedValidation=row.get("Expected Error Message");
			System.out.println("###############################"+ExpectedValidation);
			Assert.assertTrue(ActualvalidationMessage.equalsIgnoreCase(ExpectedValidation));		
		}
	}

	@Then("Appropriate Validation messages should be Displayed in create Feedback popup for each combination")
	public void createFeedbackValidationCheckSucces() {
		
	}
//  Create Feedback Validation Check End

//	Edit Feedback Validation Check Start
	@Given("The User is on IndNav Application Feedback page/Edit Feedback Pop Up")
	public void EditFeedbackValidationCheck() throws InterruptedException {
		homePage.openPage();	
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
				
	}
	@When("The User Missed Values for any Mandatory fields in Feedback Edit Popup and clicks on Submit Button")
	public void EditFeedbackValidationCheckVerify() {
		feedback.CLickonFeedbackPageLink();
		feedback.EditFeedbackValidationCheck();
		feedback.ClickOnFeedbackEditButton();
	}
	@Then("Appropriate Validation messages should be Displayed in Edit Feedback popup for each combination")
	public void FeedbackEditValidationCheckSuccess() throws InterruptedException, FileNotFoundException, IOException {
		feedback.VerifyFeedbackValidationCheck();
	}
//	Edit Feedback Validation Check End
}

	
	
	
	
	
	
	
	
  


