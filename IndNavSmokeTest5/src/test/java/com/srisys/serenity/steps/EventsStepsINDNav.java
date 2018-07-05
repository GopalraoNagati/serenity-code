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
import com.srisys.serenity.pages.IndNavLoginpage;
import com.srisys.serenity.pages.IndNavLookupspage;
import com.srisys.serenity.pages.IndNavUserspage;

import net.thucydides.core.steps.ScenarioSteps;

public class EventsStepsINDNav extends ScenarioSteps{

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
	

	
	
	
	
	@Given("The User is on Events Create page")
	public void TheUserIsOnEventsCreationPopUp() throws InterruptedException {
		homePage.openPage();	
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		
	}
	 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
	@When("The User clicks on Direct Create button and Enters valid Event data and clicks on Submit Button")
	
	
	public void TheUserIsOnEventsCreationPopUpClicksonSignUpButton() throws InterruptedException, ParseException {
		eventspage.eventsCreate();
		
		
	}
	@Then("Event should be created and display in the listing")
	public void AppropriatesEventsshouldbeDisplayedinthelisting() throws FileNotFoundException, IOException {
		//Assert.assertTrue(lookupspage.element(By.xpath(AcceptanceSuite.props.getProperty("lookupsAdd"))).isCurrentlyVisible());
		
	}
	@Given("The User is on Events Edit page")
	public void TheUserIsOnEventsEditPopUp() throws InterruptedException {
		//homePage.openPage();	
		//homePage.getDriver().manage().window().maximize();
		//homePage.clickOnLoginButton();
		
	}
	 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
	@When("The User clicks on Edit button and modifies the Event data and clicks on Submit button")
	
	
	public void TheUserIsOnEventsEditPopUpClicksonSignUpButton() throws InterruptedException {
		eventspage.eventsEdit();
		
		
	}
	@Then("Event should get updated and should be displayed in the listing")
	public void AppropriatesEventEditsshouldbeDisplayedinthelisting() throws FileNotFoundException, IOException {
		//Assert.assertTrue(lookupspage.element(By.xpath(AcceptanceSuite.props.getProperty("lookupsAdd"))).isCurrentlyVisible());
		
	}
	
	@Given("The User is on Events View page")
	public void TheUserIsOnEventsViewPopUp() throws InterruptedException {
		//homePage.openPage();	
		//homePage.getDriver().manage().window().maximize();
		//homePage.clickOnLoginButton();
		
	}
	 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
	@When("The User clicks on Events View button of any specific record")
	
	
	public void TheUserIsOnEventsViewPopUpClicksonSignUpButton() throws InterruptedException {
		eventspage.eventsView();
		
		
	}
	@Then("Event details should get displayed in the popup")
	public void AppropriatesEventViewsshouldbeDisplayedinthelisting() throws FileNotFoundException, IOException {
		//Assert.assertTrue(lookupspage.element(By.xpath(AcceptanceSuite.props.getProperty("lookupsAdd"))).isCurrentlyVisible());
		
	}
	
	@Given("The User is on Events Check-In page")
	public void TheUserIsOnEventsCheckInPopUp() throws InterruptedException {
//		homePage.openPage();	
//		homePage.getDriver().manage().window().maximize();
//		homePage.clickOnLoginButton();
		
	}
	 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
	@When("The User clicks on Check-In button of a Record and verifies the Event details in the popup and then clicks on Check-In button in popup")
	
	
	public void TheUserIsOnEventsCheckInPopUpClicksonSignUpButton() throws InterruptedException {
		eventspage.eventsCheckIn();
		
		
	}
	@Then("User should be able to Check-In successfully and the Event status should be updated in the listing")
	public void AppropriatesEventChecKInshouldbeDisplayedinthelisting() throws FileNotFoundException, IOException {
		//Assert.assertTrue(lookupspage.element(By.xpath(AcceptanceSuite.props.getProperty("lookupsAdd"))).isCurrentlyVisible());
		
	}
	
	@Given("The User is on Events Check-Out page")
	public void TheUserIsOnEventsCheckOutPopUp() throws InterruptedException {
		//homePage.openPage();	
		//homePage.getDriver().manage().window().maximize();
		//homePage.clickOnLoginButton();
		
	}
	 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
	@When("The User clicks on Check-Out button of a Record and verifies the Event details in the popup and then clicks on Check-Out button in popup")
	
	
	public void TheUserIsOnEventsCheckOutPopUpClicksonSignUpButton() throws InterruptedException {
		eventspage.eventsCheckOut();
		
		
	}
	@Then("User should be able to Check-Out successfully and the Event details should be updated in the listing")
	public void AppropriatesEventChecKOutshouldbeDisplayedinthelisting() throws FileNotFoundException, IOException {
		//Assert.assertTrue(lookupspage.element(By.xpath(AcceptanceSuite.props.getProperty("lookupsAdd"))).isCurrentlyVisible());
		
	}
	
	
	@Given("The User is on Events Extend page")
	public void TheUserIsOnEventsExtendPopUp() throws InterruptedException {
		homePage.openPage();	
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		
	}
	 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
	@When("The User clicks on Extend button of a Record and increases the total duration in the Event Extend popup and then clicks on Extend button in popup")
	
	
	public void TheUserIsOnEventsExtendPopUpClicksonSignUpButton() throws InterruptedException {
		eventspage.eventsExtend();
		
		
	}
	@Then("User should be able to extend the Event and the listing should be updated")
	public void AppropriatesEventExtendshouldbeDisplayedinthelisting() throws FileNotFoundException, IOException {
		//Assert.assertTrue(lookupspage.element(By.xpath(AcceptanceSuite.props.getProperty("lookupsAdd"))).isCurrentlyVisible());
		
	}
	
	@Given("The User is on Events Delete page")
	public void TheUserIsOnEventsDeletePopUp() throws InterruptedException {
		//homePage.openPage();	
		//homePage.getDriver().manage().window().maximize();
		//homePage.clickOnLoginButton();
		
	}
	 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
	@When("The User clicks on Events Delete button of any specific record")
	
	
	public void TheUserIsOnEventsDeletePopUpClicksonSignUpButton() throws InterruptedException {
		eventspage.eventDelete();
		
		
	}
	@Then("The Event delete popup should display and by clicking on delete button in the popup, the record should get deleted from the listing, provided the Event is not currently active")
	public void AppropriatesEventdeleteshouldbeDisplayedinthelisting() throws FileNotFoundException, IOException {
		//Assert.assertTrue(lookupspage.element(By.xpath(AcceptanceSuite.props.getProperty("lookupsAdd"))).isCurrentlyVisible());
		
	}
	
	@Given("The User is on Events Cancel page")
	public void TheUserIsOnEventsCanceledPopUp() throws InterruptedException {
		homePage.openPage();	
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		
	}
	 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
	@When("The User clicks on Cancel button of a Record and verifies the Event details in the popup and then clicks on Cancel button in popup")
	
	
	public void TheUserIsOnEventsCanceldPopUpClicksonSignUpButton() throws InterruptedException {
		eventspage.eventCancel();
		
		
	}
	@Then("User should be able to Cancel the Event and the status should be updated in the listing")
	public void AppropriatesEventCanceledhouldbeDisplayedinthelisting() throws FileNotFoundException, IOException {
		//Assert.assertTrue(lookupspage.element(By.xpath(AcceptanceSuite.props.getProperty("lookupsAdd"))).isCurrentlyVisible());
		
	}
	
	@Given("The User is on Events page")
	public void TheUserisonEventspage() throws InterruptedException {
		//homePage.openPage();	
		//homePage.getDriver().manage().window().maximize();
		//homePage.clickOnLoginButton();
		
	}
	 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
	@When("The User clicks on List button of any specific record")
	
	
	public void TheUserclicksonListbuttonofanyspecificrecord() throws InterruptedException {
		eventspage.eventRegistrationList();
		
		
	}
	@Then("The User should be redirected to Event Registrations page and the list of Users registered to the Event should be displayed")
	public void TheRegistrationspageandthelistofUsersregisteredtotheEventshouldbedisplayed() throws FileNotFoundException, IOException {
		//Assert.assertTrue(lookupspage.element(By.xpath(AcceptanceSuite.props.getProperty("lookupsAdd"))).isCurrentlyVisible());
		
	}
	
	@Given("The User is on Events Guided Create page")
	public void TheUserisonEventsGuidedCreatepage() throws InterruptedException {
		homePage.openPage();	
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		
	}
	 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
	@When("The User clicks on Guided Create button and Enters valid Event data and clicks on Submit Button and selects the required available fleet and clicks on Submit and completes the Event creation process through Direct Create popup")
	public void TheUserclicksonGuidedCreatebuttonandEntersvalidEventdataandclicksonSubmitButton() throws InterruptedException, ParseException {
		eventspage.events1GuidedCreate();
		eventspage.eventsGuidedCreate();
		
		
		
	}
	@Then("Event should be Giuded created and display in the listing")
	public void EventshouldbeGiudedcreatedanddisplayinthelisting() throws FileNotFoundException, IOException {
		//Assert.assertTrue(lookupspage.element(By.xpath(AcceptanceSuite.props.getProperty("lookupsAdd"))).isCurrentlyVisible());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Given("The User is on Events Advanced Search page")
	public void TheUserIsOnEventsAdvancedSearchPage() throws InterruptedException {
		homePage.openPage();
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();

	}

	@When("The User Enters Events Search invaild data and Clicks on Submit Button")
	public void TheUserEntersEventsSearchInvaildDataAndClicksOnSubmitButton() throws InterruptedException {
		eventspage.eventsAdvancedSearch();

	}

	@Then("Appropriate Vaidations should be displayed on Events Advanced Search page")
	public void AppropriateVaidationsShouldbeDisplayedOnEventsAdvancedSearchPage() {

	}

	@Given("The user is on Events create page to check invalid combinations")
	public void TheUserIsOnEventsCreatePageToCheckInvalidCombinations() throws InterruptedException {
		homePage.openPage();
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		eventspage.invalidCombinationsCreateHeader();

	}

	@When("The User enters (Enterprise, Fleet, EventName, EventOwner, EventType, EventSeatLimit, StartDate, EndDate, EventPurpose) invalid combinations in Event create popup and clicks on submit button $table")
	public void TheUserEntersInvalidCombinationsInEventCreatePopupAndClicksOnSubmitButton(ExamplesTable table)
			throws InterruptedException {
		for (Map<String, String> row : table.getRows()) {
			eventspage.invalidCombinationsCreate(row.get("Enterprise"), row.get("Fleet"), row.get("EventName"),
					row.get("EventOwner"), row.get("EventType"), row.get("EventSeatLimit"), row.get("StartDate"),
					row.get("EndDate"), row.get("EventPurpose"));
		}
	}

	@Then("Appropriate validation message should get displayed to Create an Event")
	public void AppropriateValidationMessageShouldGetDisplayedToCreateAnEvent() {

	}

	@Given("The User is on Events Edit page to check invalid combinations")
	public void TheUserIsOnEventsEditPageToCheckInvalidCombinations() throws InterruptedException {
		homePage.openPage();
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		eventspage.invalidCombinationsEditHeader();

	}

	@When("The User enters (Fleet, EventName, EventType, EventSeatLimit, StartDate, EndDate, EventPurpose) invalid combinations in Event create popup and clicks on submit button $table")
	public void TheUserEntersInvalidCombinationsInEventEditPopupAndClicksOnSubmitButton(ExamplesTable table)
			throws InterruptedException {
		for (Map<String, String> row : table.getRows()) {
			eventspage.invalidCombinationsEdit(row.get("Fleet"), row.get("EventName"), row.get("EventType"),
					row.get("EventSeatLimit"), row.get("StartDate"), row.get("EndDate"), row.get("EventPurpose"));
		}
	}

	@Then("Appropriate validation message should get displayed to Edit an Event")
	public void AppropriateValidationMessageShouldGetDisplayedToEditAnEvent() {

	}

	@Given("The User is on Events check in page to check invalid combinations")
	public void TheUserIsOnEventsCheckInPageToCheckInvalidCombinations() throws InterruptedException {
		homePage.openPage();
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
	}

	@When("The User tries to check in the event before event start date and time")
	public void TheUserTriesToCheckInTheEventBeforeEventStartDateAndTime() throws InterruptedException {
		eventspage.invalidCombinationsCheckInHeader();
	}

	@Then("Appropriate validation message should get displayed to check in an Event")
	public void AppropriateValidationMessageShouldGetDisplayedToCheckInAnEvent() {

	}
	
	@Given("The User is on Events Extend page to check invalid combinations")
	public void TheUserIsOnEventsExtendPageToCheckInvalidCombinations() throws InterruptedException{
		homePage.openPage();
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		eventspage.invalidCombinationsExtendHeader();
	}
	
	@When("The User tries (EndDate, ExtendReason) to Extend an event $table")
	public void TheUserTriesToExtendAnEvent(ExamplesTable table) throws InterruptedException{
		for (Map<String, String> row : table.getRows()) {
			eventspage.invalidCombinationsExtend(row.get("EndDate"), row.get("ExtendReason"));
		}
		
	}
	
	@Then("Appropriate validation message should get displayed on Extend Event page")
	public void AppropriateValidationMessageShouldGetDisplayedOnExtendEventPage(){
		
	}
	
	@Given("The User is on Event Cancel page to check invalid combinations")
	public void TheUserIsOnEventCancelPageToCheckInvalidCombinations() throws InterruptedException{
		homePage.openPage();
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		eventspage.invalidCombinationsCancelHeader();
	}
	
	@When("The User tries (CancelReason) to Cancel an event $table")
	public void TheUserTriesToCancelAnEvent(ExamplesTable table) throws InterruptedException{
		for (Map<String, String> row : table.getRows()) {
			eventspage.invalidCombinationsCancel(row.get("CancelReason"));
		}
		
	}
	
	@Then("Appropriate validation message should get displayed for Canceled Event action")
	public void AppropriateValidationMessageShouldGetDisplayedForCanceledEventAction(){
		
	}
	
  
}

