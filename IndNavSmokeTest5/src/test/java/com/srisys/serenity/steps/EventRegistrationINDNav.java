package com.srisys.serenity.steps;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebElement;

import com.srisys.serenity.pages.IndNavEnterpriseResourcespage;
import com.srisys.serenity.pages.IndNavEventsRegistrationspage;
import com.srisys.serenity.pages.IndNavEventspage;
import com.srisys.serenity.pages.IndNavFleetpage;
import com.srisys.serenity.pages.IndNavLoginpage;
import com.srisys.serenity.pages.IndNavLookupspage;
import com.srisys.serenity.pages.IndNavUserspage;

import net.thucydides.core.steps.ScenarioSteps;

public class EventRegistrationINDNav extends ScenarioSteps{

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
	

	
	
	
	
	@Given("The User is on Event Registrations Create page")
	public void TheUserIsOnEventsRegistrationCreationPopUp() throws InterruptedException {
		homePage.openPage();	
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		
	}
	 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
	@When("The User clicks on Direct Create button and searches for scheduled Events against a Fleet and selects the Event and then clicks on Submit Button")
	
	
	public void TheUserIsOnEventsRgistrationCreationPopUpClicksonSignUpButton() throws InterruptedException {
		registration.eventsRegistrationCreate();
		
		
	}
	@Then("User gets registered to the Event successfully and the record gets displayed in the listing")
	public void AppropriatesEventsRegistraionshouldbeDisplayedinthelisting() throws FileNotFoundException, IOException {
		//Assert.assertTrue(registration.element(By.xpath(AcceptanceSuite.props.getProperty("EventRegistationAdd"))).isCurrentlyVisible());
		
	}
	@Given("The User is on Event Registrations Check-In page")
	public void TheUserIsOnEventsRegistrationCheckINPopUp() throws InterruptedException {
		//homePage.openPage();	
		//homePage.getDriver().manage().window().maximize();
		//homePage.clickOnLoginButton();
		homePage.getDriver().navigate().refresh();
		
	}
	 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
	@When("The User clicks on Check-In button of a Record and verifies the Event Registration details in the popup and then clicks on Check-In button in popup")
	
	
	public void TheEventsRegistrationsdata_Valid_data_and_Clicks_on_Check() throws InterruptedException {
		registration.checkIN();
		
		
	}
	@Then("User should be able to Check-In successfully and the Event registration status should be updated in the listing")
	public void EventsRegistration_checkIN_successfully_should_be_Displayed_in_the_listing() throws FileNotFoundException, IOException {
		
		
	}
	@Given ("The User is on Event Registrations Delete page")
	public void The_User_is_on_EventsRegistration_Delete_page() throws InterruptedException{
		//homePage.openPage();	
		//homePage.getDriver().manage().window().maximize();
		//homePage.clickOnLoginButton();		
	}
	
	@When ("The User clicks on Event Registrations Delete button of any specific record")
	public void User_is_click_on_EventsRegistration_Delete_action() throws InterruptedException{
		
		//registration.eventRegistrationDelete();
		//eventspage.eventDelete();
		registration.eventRegistrationDelete();
		
		//usesrpage.usersDelete();
		//resourcepage.enterpriseResourcesDelete();
	}
	
	@Then ("The Event Registration delete popup should display and by clicking on delete button in the popup, the record should get deleted from the listing, provided the Event is cancelled or closed")
	public void corresponding_EventsRegistration_should_be_deleted(){
		
	}
	
	@Given ("The User is on Event Registrations View page")
	public void The_User_is_on_EventsRegistration_View_page() throws InterruptedException{
		homePage.openPage();	
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();		
	}
	
	@When ("The User clicks on Event Registrations View button of any specific record")
	public void The_User_is_click_on_EventsRegistration_View_action() throws InterruptedException{
		
		//registration.eventRegistrationDelete();
		//eventspage.eventDelete();
		registration.eventRegistrationView();
		
		
	}
	
	@Then ("Event Registration details should get displayed in the popup")
	public void The_corresponding_EventsRegistration_should_be_Viewed(){
		
	}
	
	@Given ("The User is on Event Registrations Cancel page")
	public void The_User_is_on_EventsRegistration_Canceled() throws InterruptedException{
		homePage.openPage();	
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();		
	}
	
	@When ("The User clicks on Cancel button of a Record and verifies the Event registration details in the popup and then clicks on Cancel button in popup")
	public void The_User_is_click_on_EventsRegistration_Canceled() throws InterruptedException{
		
		//registration.eventRegistrationDelete();
		//eventspage.eventDelete();
		registration.eventRegistrationCancel();
		
		
	}
	
	@Then ("User should be able unregister to an Event and the status should be updated in the listing")
	public void The_corresponding_EventsRegistration_should_be_Canceled(){
		
	}
	
	
	
	
	
	
	
	
	
	@Given("The user is on Event Registration create page to check invalid combinations")
	public void TheUserIsOnEventRegistrationCreatePageToCheckInvalidCombinations() throws InterruptedException {
		homePage.openPage();
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		registration.invalidHeader();

	}

	@When("The User enters (Enterprise, Fleet, EventName, UserName) invalid combinations in Event Registration create popup and clicks on submit button $table")
	public void TheUserEntersInvalidCombinationsInEventRegistrationCreatePopupAndClicksOnSubmitButton(
			ExamplesTable table) throws InterruptedException {
		for (Map<String, String> row : table.getRows()) {
			registration.invalidCombinationsAdd(row.get("Enterprise"), row.get("Fleet"), row.get("EventName"),
					row.get("UserName"));
		}

	}

	@Then("Appropriate validation message should get displayed for Create Event Registration")
	public void AppropriateValidationMessageShouldGetDisplayedForCreateEventRegistration() {

	}

	@Given("The User is on Event Registration Check-in page to check invalid combinations")
	public void TheUserIsOnEventRegistrationCheckinPageToCheckInvalidCombinations() throws InterruptedException {

		homePage.openPage();
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		registration.invalidHeaderCheckin();

	}

	@When("The User tries to check-in the event registration without check-in the event")
	public void TheUserTriesToCheckinTheEventRegistrationWithoutCheckinTheEvent() {

	}

	@Then("Appropriate validation message should get displayed for Check-in page")
	public void AppropriateValidationMessageShouldGetDisplayedForCheckinPage() {

	}

	@Given("The User is on Event Registration Cancel page to check invalid combinations")
	public void TheUserIsOnEventRegistrationCancelPageToCheckInvalidCombinations() throws InterruptedException {
		homePage.openPage();
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		registration.invalidCancelHeader();	

	}

	@When("The User tries to unregister (UnregisterReason) an Event Registration $table")
	public void TheUserTriesToUnregisterAnEventRegistration(ExamplesTable table) throws InterruptedException {
		for (Map<String, String> row : table.getRows()) {
			registration.invalidCombinationsCancel(row.get("UnregisterReason"));
		}
	}

	@Then("Appropriate validation message should get displayed for Unregister Event Registration")
	public void AppropriateValidationMessageShouldGetDisplayedForUnregisterEventRegistration() {

	}
	
	@Given("The User is on Event Registration Advanced Search page")
	public void TheUserIsOnEventRegistrationAdvancedSearchPage() throws InterruptedException{
		homePage.openPage();
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		
	}
	
	@When("The User Enters Event Registration Search invaild data and Clicks on Submit Button")
	public void TheUserEntersEventRegistrationSearchInvaildDataAndClicksOnSubmitButton() throws InterruptedException{
		registration.eventRegistrationAdvancedSearch();
		
	}
	
	@Then("Appropriate Vaidations should be displayed on Event Registration Advanced Search page")
	public void AppropriateVaidationsShouldbeDisplayedOnEventRegistrationAdvancedSearchPage(){
		
	}
	
	
	
  
}

