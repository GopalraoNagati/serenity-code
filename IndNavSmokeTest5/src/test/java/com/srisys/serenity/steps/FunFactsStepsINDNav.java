package com.srisys.serenity.steps;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Map;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.srisys.serenity.AcceptanceSuite;
import com.srisys.serenity.pages.IndNavEnterpriseResourcespage;
import com.srisys.serenity.pages.IndNavEventsRegistrationspage;
import com.srisys.serenity.pages.IndNavEventspage;
import com.srisys.serenity.pages.IndNavFleetpage;
import com.srisys.serenity.pages.IndNavFunfactspage;
import com.srisys.serenity.pages.IndNavLoginpage;
import com.srisys.serenity.pages.IndNavLookupspage;
import com.srisys.serenity.pages.IndNavUserspage;

import net.thucydides.core.steps.ScenarioSteps;

public class FunFactsStepsINDNav extends ScenarioSteps{

	IndNavLoginpage homePage;
	IndNavEnterpriseResourcespage resourcepage;
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
	@Given("The Visitor is on IndNav Home page")
	public void The_Visitor_is_on_IndNav_Home_page() throws FileNotFoundException, IOException{
		homePage.openPage();	
		homePage.getDriver().manage().window().maximize();
	}
	
	@When("The Visitor clicks on login Button")
	public void The_Visitor_selects_or_Clicks_on_login_Button() throws InterruptedException{
		System.out.println("About to click Login Button");
		homePage.clickOnLoginButton();
	}
	
	@Then("Admin Link must be Displayed")
	public void Login_Popup_must_be_Displayed(){
		Assert.assertTrue(homePage.element(By.xpath(AcceptanceSuite.props.getProperty("Admin"))).isCurrentlyVisible());
		Assert.assertTrue(homePage.element(By.xpath(AcceptanceSuite.props.getProperty("Dashboard"))).isCurrentlyVisible());
		homePage.getDriver().close();
	}
	
	
	
	//FunFacts
		@Given("The User is on Fun facts page")
		public void TheUserIsOnFunfactsCreationPopUp() throws InterruptedException {
			homePage.openPage();	
			homePage.getDriver().manage().window().maximize();
			homePage.clickOnLoginButton();
			
		}
		 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
		@When("The User clicks on create fun fact and Enters valid Fun facts data in the popup and Clicks on Submit Button")		
		public void TheUserIsOnFunfactsCreationPopUpClicksonSignUpButton() throws InterruptedException {
			funfacts.funCreate();
			
			
		}
		@Then("Fun fact should be created and should be displayed in the listing")
		public void AppropriatesFunfactshouldbeDisplayedinthelisting() throws FileNotFoundException, IOException {
			//Assert.assertTrue(fleetpage.element(By.xpath(AcceptanceSuite.props.getProperty("FleetsAdd"))).isCurrentlyVisible());
			
		}
		
		@Given("The User is on Fun facts page to Edit")
		public void The_User_is_on_Funfacts_Edit_Pop_Up() throws InterruptedException {
			homePage.openPage();	
			homePage.getDriver().manage().window().maximize();
			homePage.clickOnLoginButton();
			
		}
		 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
		@When("The User clicks on Edit button and modifies data in the Fun facts popup and Clicks on Submit Button")
		public void The_User_Enters_Valid_FunfactsEdit_data_and_Clicks_on_Submit_Button() throws InterruptedException {
			funfacts.funEdit();
		}
		
		@Then("Fun fact should be updated and should be displayed in the listing")
		public void The_User_Enters_Valid_FunfactsEdit_data_and_Clicks_on_Submit_Button_Edit() throws FileNotFoundException, IOException {
			//Assert.assertTrue(fleetpage.element(By.xpath(AcceptanceSuite.props.getProperty("FleetsAdd"))).isCurrentlyVisible());
			
		}
		
		@Given("The User is on Fun facts page to View")
		public void The_User_is_on_Funfacts_View_Pop_Up() throws InterruptedException {
			//homePage.openPage();	
			//homePage.getDriver().manage().window().maximize();
			//homePage.clickOnLoginButton();
			
		}
		 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
		@When("The User clicks on View button of any specific Fun facts record")		
		public void The_User_Enters_Valid_FunfactsView_data_and_Clicks_on_Submit_Button() throws InterruptedException {
			funfacts.funView();	
		}
		
		@Then("Fun fact details should be displayed in the popup")
		public void The_User_Enters_Valid_FunfactsView_data_and_Clicks_on_Submit_Button_Edit() throws FileNotFoundException, IOException {
			//Assert.assertTrue(fleetpage.element(By.xpath(AcceptanceSuite.props.getProperty("FleetsAdd"))).isCurrentlyVisible());
			
		}
		
		
		@Given("The User is on Fun facts page to Delete")
		public void The_User_is_on_Funfacts_Delete_Pop_Up() throws InterruptedException {
			//homePage.openPage();	
			//homePage.getDriver().manage().window().maximize();
			//homePage.clickOnLoginButton();
			
		}
		 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
		@When("The User clicks on Delete button of any specific Fun facts record")
		public void The_User_Enters_Valid_FunfactsDelete_data_and_Clicks_on_Submit_Button() throws InterruptedException {
			funfacts.funDelete();
		}
		
		@Then("That specific Fun fact record should be deleted from the list")
		public void The_User_Enters_Valid_FunfactsDelete_data_and_Clicks_on_Submit_Button_Edit() throws FileNotFoundException, IOException {
			//Assert.assertTrue(fleetpage.element(By.xpath(AcceptanceSuite.props.getProperty("FleetsAdd"))).isCurrentlyVisible());
			
		
	}
		
		
		
		
		@Given("The user is on Fun Facts page to check invalid combinations")
		public void The_user_is_on_IndNavLogin_Pop_Up() throws FileNotFoundException, IOException, InterruptedException{
			homePage.openPage();
			homePage.getDriver().manage().window().maximize();
			homePage.clickOnLoginButton();
			funfacts.Header();
			
		}
		
		@When("The User enters invalid combinations(Enterprise,FunFacts) in funfact create popup and clicks on submit button $table")
		public void The_Userenters_fields_Combinations(ExamplesTable table) throws InterruptedException{
			System.out.println("About to click Login Button");
			//homePage.clickOnLoginButton();
			
			for (Map<String, String> row : table.getRows()) {
				
				
				funfacts.Validations(row.get("Enterprise"), row.get("FunFacts"));
			
				//Serenity.setSessionVariable("result").to("fail");
				String actualMessage = homePage.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("FunfactsErrorMessgae"))).getText();
				
				String expected=row.get("Expected Error Message");
			
				Assert.assertTrue(actualMessage.equalsIgnoreCase(expected));
			}
		}
		
		@Then("appropriate validation message should be displayed")
		public void Appropriate_Validation_messages_should_be_Displayed(){
			
		}
		
		
		@Given("The user is on Fun Facts page edit popup  to check invalid combinations")
		public void The_user_is_on_Fun_Facts_page_edit_popup_to_check_invalid_combinations() throws FileNotFoundException, IOException, InterruptedException{
			homePage.openPage();
			homePage.getDriver().manage().window().maximize();
			homePage.clickOnLoginButton();
			//funfacts.Header();
			funfacts.funEditVaildations();
			
		}
		
		@When("The User enters invalid combinations(Funfacts) in Funfacts edit popup and clicks on submit button $table")
		public void The_Funfacts_edit_popup_and_clicks_on_submit_button(ExamplesTable table) throws InterruptedException{
			System.out.println("About to click Login Button");
			//homePage.clickOnLoginButton();
			
			for (Map<String, String> row : table.getRows()) {
				
				
				funfacts.ValidationsEdit(row.get(row.get("Funfacts")));
			
				//Serenity.setSessionVariable("result").to("fail");
				String actualMessage = homePage.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("FunfactsErrorMessgae"))).getText();
				
				String expected=row.get("Expected Error Message");
			
				Assert.assertTrue(actualMessage.equalsIgnoreCase(expected));
			}
		}
		
		@Then("appropriate validation message should be displayed in Funcats Edit")
		public void Appropriate_Validation_messages_should_be_Displayed_in_Edit(){
			
		}
		
		@Given("The User is on Fun Facts Advanced Search page")
		public void TheUserisonFunFactsAdvancedSearchpage() throws InterruptedException {
			homePage.openPage();	
			homePage.getDriver().manage().window().maximize();
			homePage.clickOnLoginButton();
			
		}
		
		 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
		@When("The User Enters Fun Facts Search invaild data and Clicks on Submit Button")
		public void TheUserEntersFunFactsSearchinvailddataandClicksonSubmitButton() throws InterruptedException, ParseException {
			funfacts.funfactsAdvanceddata();
		}
		
		
		@Then("Appropriate Fun Facts Vaidations should be displayed on  Advanced Search page")
		public void AppropriateFunFactsVaidationsshouldbedisplayedonAdvancedSearchpage() throws FileNotFoundException, IOException {
			//Assert.assertTrue(lookupspage.element(By.xpath(AcceptanceSuite.props.getProperty("lookupsAdd"))).isCurrentlyVisible());
			
		}
	
	
	
  
}

