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
import com.srisys.serenity.pages.IndNavEnterpriseResourcespage;
import com.srisys.serenity.pages.IndNavEventsRegistrationspage;
import com.srisys.serenity.pages.IndNavEventspage;
import com.srisys.serenity.pages.IndNavFleetpage;
import com.srisys.serenity.pages.IndNavLoginpage;
import com.srisys.serenity.pages.IndNavLookupspage;
import com.srisys.serenity.pages.IndNavUserspage;

import net.thucydides.core.steps.ScenarioSteps;

public class FleetsStepsINDNav extends ScenarioSteps {

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

	@Given("The User is on Fleets page")
	public void TheUserIsOnFleetCreationPopUp() throws InterruptedException {
		homePage.openPage();
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();

	}

	// The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype
	// 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation
	// 'Consultant', Department 'Quality', Gender 'Male', MobileNumber
	// '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City
	// 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381',
	// Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
	@When("The User clicks on create button and enters valid data and clicks on Submit Button")

	public void TheUserIsOnFleetCreationPopUpClicksonSignUpButton() throws InterruptedException {
		Thread.sleep(20000);
		fleetpage.fleetCreate();

	}

	@Then("The created Fleet should be displayed in the listing")
	public void AppropriatesFleetshouldbeDisplayedinthelisting() throws FileNotFoundException, IOException {
		// Assert.assertTrue(fleetpage.element(By.xpath(AcceptanceSuite.props.getProperty("FleetsAdd"))).isCurrentlyVisible());

	}

	@Given("The User is on Fleets Edit page")
	public void TheUserIsOnFleetCreationEditUp() throws InterruptedException {
		// homePage.openPage();
		// homePage.getDriver().manage().window().maximize();
		// homePage.clickOnLoginButton();
		Thread.sleep(1000);

	}

	@When("The User clicks on Edit button and modifies the data and clicks on Submit Button")
	public void The_User_Enters_Valid_Fleet_Edit_data_and_Clicks_on_Submit_Up_Button() throws InterruptedException {
		fleetpage.fleetEdit();
		Thread.sleep(1000);
		fleetpage.fleetEditCreation();
	}

	@Then("The modified Fleet should be displayed in the listing")
	public void ModifiedFleeetDatashould() throws FileNotFoundException, IOException {
		// Assert.assertTrue(fleetpage.element(By.xpath(AcceptanceSuite.props.getProperty("FleetsAdd"))).isCurrentlyVisible());

	}

	@Given("The User is on Fleets View page")
	public void TheUserisonFleetView() throws InterruptedException {
		// homePage.openPage();
		// homePage.getDriver().manage().window().maximize();
		// homePage.clickOnLoginButton();
	}

	@When("The User clicks on View button of any specific record")
	public void The_User_is_click_on_View_action() throws InterruptedException {

		// registration.eventRegistrationDelete();
		// eventspage.eventDelete();
		fleetpage.fleetView();

		// usesrpage.usersDelete();
		// resourcepage.enterpriseResourcesDelete();
	}

	@Then("The Fleet data of that record should display in the popup")
	public void The_corresponding_entities_should_be_viewed() {
		String fleetfleettype = fleetpage.getDriver()
				.findElement(By.xpath(AcceptanceSuite.props.getProperty("fleetfleetType"))).getAttribute("value");
		System.out.println("fleettype==============" + fleetfleettype);
		String fleetTypeMessage = AcceptanceSuite.props.getProperty("FleetTypeData");
		System.out.println("fleettype==============----------" + fleetTypeMessage);
		Assert.assertTrue(fleetfleettype.equalsIgnoreCase(fleetTypeMessage));

		String fleetvalue = fleetpage.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("fleetView")))
				.getAttribute("value");
		String fleetMessage = AcceptanceSuite.props.getProperty("fleetViewData");
		Assert.assertTrue(fleetMessage.equalsIgnoreCase(fleetvalue));
		fleetpage.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("fleetFinalViewXPath"))).click();

	}

	@Given("The User is on Fleets Active page")
	public void The_User_is_on_Funfacts_Inactive_Pop_Up() throws InterruptedException {
		// homePage.openPage();
		// homePage.getDriver().manage().window().maximize();
		// homePage.clickOnLoginButton();

	}

	@When("The User clicks on Activate/Inactivate button of any specific record")

	public void The_User_Enters_Valid_FunfactsInactive_data_and_Clicks_on_Submit_Button() throws InterruptedException {
		fleetpage.fleetsInactive();
		Thread.sleep(2000);
		fleetpage.fleetsactive();

	}

	@Then("That specific Fleet should get Inactivated/Activated, provided the fleet is NOT in use")
	public void The_User_Enters_Valid_FunfactsInactive_data_and_Clicks_on_Submit_Button_Edit()
			throws FileNotFoundException, IOException {
		// Assert.assertTrue(fleetpage.element(By.xpath(AcceptanceSuite.props.getProperty("FleetsAdd"))).isCurrentlyVisible());

	}

	@Given("The User is on Fleet active Pop Up")
	public void The_User_is_on_Funfacts_active_Pop_Up() throws InterruptedException {
		homePage.openPage();
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();

	}

	// The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype
	// 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation
	// 'Consultant', Department 'Quality', Gender 'Male', MobileNumber
	// '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City
	// 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381',
	// Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
	@When("The User Enters Fleet activet Button")

	public void The_User_Enters_Valid_Funfactsactive_data_and_Clicks_on_Submit_Button() throws InterruptedException {
		fleetpage.fleetsactive();

	}

	@Then("Appropriates Fleet should be activated")
	public void The_User_Enters_Valid_Funfactsactive_data_and_Clicks_on_Submit_Button_Edit()
			throws FileNotFoundException, IOException {
		// Assert.assertTrue(fleetpage.element(By.xpath(AcceptanceSuite.props.getProperty("FleetsAdd"))).isCurrentlyVisible());

	}

	@Given("The User is on Fleets Delete page")
	public void TheUserHasCreatedAllFleetsForSmokeTest() throws InterruptedException {
		homePage.openPage();
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
	}

	@When("The User clicks on Fleets Delete button of any specific record")
	public void TheUserDeletesAllFleetCreatedDuringSmokeTest() throws InterruptedException {
		Thread.sleep(20000);
		// registration.eventRegistrationDelete();
		// eventspage.eventDelete();
		fleetpage.fleetDelete();

		// usesrpage.usersDelete();
		// resourcepage.enterpriseResourcesDelete();
	}

	@Then("The Fleet delete popup should display and by clicking on delete button in the popup, the record should get deleted from the listing, provided the Fleet is NOT in use")
	public void TheCorrespondingFleetShouldBeDeleted() {

	}

	@Given("The User is on Fleets Child page")
	public void TheChildFleet() throws InterruptedException {
		         homePage.openPage();
				 homePage.getDriver().manage().window().maximize();
				 homePage.clickOnLoginButton();

	}

	@When("The User clicks on create Child Fleet button and enters valid data and clicks on Submit Button")

	public void The_User_Enters_Valid_Child_fleet_data_and_Clicks_on_Submit_Button() throws InterruptedException {
		fleetpage.fleetChildCreate();

	}

	@Then("The created Child Fleet should be displayed in the listing")
	public void TheChildFleetShouldbeDisplayed() {

	}

	@Given("The User is on Fleets Search Pop Up")
	public void TheUserisonFleetSearchPopUp() throws InterruptedException {
		// homePage.openPage();
		// homePage.getDriver().manage().window().maximize();
		// homePage.clickOnLoginButton();
	}

	@When("The User Enters valid search Fleets data and Clicks on Submit Button")
	public void TheUserEntersValidFleetsearchdataandClicksonSubmitUpButton() throws InterruptedException {

		// registration.eventRegistrationDelete();
		// eventspage.eventDelete();
		fleetpage.fleetAdvancedSearch();

		// usesrpage.usersDelete();
		// resourcepage.enterpriseResourcesDelete();
	}

	@Then("Appropriate Fleets search data should be displayed in the listing")
	public void AppropriatesFleetsearchdatashouldbeDisplayedinthelisting() {

	}

	// Validations

	@Given("The user is on login screen")
	public void The_Visitor_is_on_IndNav_Home_page() throws FileNotFoundException, IOException {
		homePage.openPage();
		homePage.getDriver().manage().window().maximize();
	}

	@When("The User keys in valid username and password")
	public void The_Visitor_selects_or_Clicks_on_login_Button() throws InterruptedException {
		System.out.println("About to click Login Button");
		homePage.clickOnLoginButton();
	}

	@Then("Pigeon Home/fleet reservations page will be displayed")
	public void Login_Popup_must_be_Displayed() {
		// Assert.assertTrue(homePage.element(By.xpath(AcceptanceSuite.props.getProperty("Admin"))).isCurrentlyVisible());
		// Assert.assertTrue(homePage.element(By.xpath(AcceptanceSuite.props.getProperty("Dashboard"))).isCurrentlyVisible());
		homePage.getDriver().close();
	}

	@Given("The user is on Fleets page to check invalid combinations")
	public void TheUserIsOnFleetCreationPopUp1() throws InterruptedException {
		homePage.openPage();
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		fleetpage.fleetCreatenegative();
	}

	@When("The User enters invalid combinations(Enterprise, FleetType, FleetName, WorkNumber, Email, Add1, City, Country, State, ZIPCode, Latitude and Longitude) in fleet create popup and clicks on submit button $table")
	public void TheUserIsOnFleetCreationPopUpClicksonSignUpButton(ExamplesTable table) throws InterruptedException {
		for (Map<String, String> row : table.getRows()) {

			fleetpage.FleetsNegativeCases(row.get("Enterprise"), row.get("FleetType"),
					row.get("FleetName"), row.get("WorkNumber"), row.get("Email"), row.get("Add1"), row.get("City"), row.get("Country"),
					row.get("State"), row.get("ZIPCode"), row.get("Latitude"), row.get("Longitude"));
		

//System.out.println("emailId============"+table.getRows().size());
			
		}
		
	}
	@Then("Appropriate validation message should be displayed on Fleet Create popup")
	public void AppropriatesFleetshouldbeDisplayedinthelisting2() throws FileNotFoundException, IOException {
		// Assert.assertTrue(fleetpage.element(By.xpath(AcceptanceSuite.props.getProperty("FleetsAdd"))).isCurrentlyVisible());

	}

	@Then("Appropriates Fleet should be Displayed in the listing")
	public void AppropriatesFleetshouldbeDisplayedinthelisting1() throws FileNotFoundException, IOException {
		// Assert.assertTrue(fleetpage.element(By.xpath(AcceptanceSuite.props.getProperty("FleetsAdd"))).isCurrentlyVisible());

	}

	@Given("The user is on Fleets page Edit popup")
	public void TheUserIsOnFleetsPageEditPopup() throws InterruptedException {
		homePage.openPage();
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		fleetpage.clickOnFleetEdtHeader();
		fleetpage.clickOnFleetsEdit();
	}

	// The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype
	// 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation
	// 'Consultant', Department 'Quality', Gender 'Male', MobileNumber
	// '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City
	// 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381',
	// Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
	@When("The User enters invalid details(FleetName, WorkNumber, Email, Add1, City, Country, ZIPCode, Latitude and Longitude) in fleets edit popup and clicks on submit button  $table")
	public void TheUserEntersInvalidDetailsAndClicksonSignUpButton(ExamplesTable table) throws InterruptedException {
		for (Map<String, String> row : table.getRows()) {

			fleetpage.clickOnFleetsEditPopup(
					row.get("FleetName"), row.get("WorkNumber"), row.get("Email"), row.get("Add1"), row.get("City"),
					row.get("ZIPCode"), row.get("Latitude"), row.get("Longitude"));
		


			
		}
	}
		
		
		@Then("Appropriate validation message should be displayed on Fleet Edit popup")
		public void AppropriatevalidationmessageshouldbedisplayedonFleetEditpopu() throws FileNotFoundException, IOException {
			// Assert.assertTrue(fleetpage.element(By.xpath(AcceptanceSuite.props.getProperty("FleetsAdd"))).isCurrentlyVisible());

		}
		
	

	@Given("The User is on Fleets page Inactivate popup")
	public void TheUserIsOnFleetssPageInactivatePopup() throws InterruptedException {
		homePage.openPage();
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		// Fleets.clickOnFleetEdtHeader();
		fleetpage.clickOnFleetInactivateHeader();
		fleetpage.clickOnFleetInactivate();
	}

	@When("The User clicks on submit button(Inactive) without selecting Inactivate Reason $table")
	public void TheUserClicksOnSubmitButtonWithoutSelectingInactivateReason(ExamplesTable table) throws InterruptedException {
		for (Map<String, String> row : table.getRows()) {

			fleetpage.clickOnFleetsEditPopup(row.get("Inactive"));
		//for (Map<String, String> row : table.getRows()) {



//System.out.println("emailId============"+table.getRows().size());
			
		}
	}
	
	
	@Then("Appropriate validation message should be displayed on Fleets page Inactivate popup")
	public void AppropriatevalidationmessageshouldbedisplayedonFleetspageInactivatepopup() throws FileNotFoundException, IOException {
		// Assert.assertTrue(fleetpage.element(By.xpath(AcceptanceSuite.props.getProperty("FleetsAdd"))).isCurrentlyVisible());

	}

	@Given("The User is on Fleets page Activate popup")
	public void TheUserIsOnFleetssPageActivatePopup() throws InterruptedException {
		homePage.openPage();
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		// Fleets.clickOnFleetEdtHeader();
		fleetpage.clickOnFleetInactivateHeader();
	}

	@When("The User clicks on submit button(Activate) without selecting Activate Reason $table")
	public void TheUserClicksOnSubmitButtonWithoutSelectingActivateReason(ExamplesTable table) throws InterruptedException {
		for (Map<String, String> row : table.getRows()) {

			fleetpage.clickOnFleetsEditPopup(row.get("Active"));
		//for (Map<String, String> row : table.getRows()) {


		}
}
	@Then("Appropriate validation message should be displayed on Fleets page Activate popup")
	public void AppropriatevalidationmessageshouldbedisplayedonFleetspageActivatepopup() throws FileNotFoundException, IOException {
		// Assert.assertTrue(fleetpage.element(By.xpath(AcceptanceSuite.props.getProperty("FleetsAdd"))).isCurrentlyVisible());

	}
	
	
	@Given("The User is on Fleets page Add Child popup")
	public void TheUserIsOnFleetssPageAddChildPopup() throws InterruptedException {
		homePage.openPage();
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		fleetpage.clickOnFleetCreateChildHeader();
		fleetpage.clickOnFleetsCreateChild();

	}

	@When("The User enters invalid details(FleetType, Fleet, WorkNumber, Email, Add1, City, Zip, Latitude and Longitude) in create child fleet popup and clicks on submit button $table")
	public void TheUserEntersInvalidDetailsInCreateFleetPopupAndClicksOnSubmitButton(ExamplesTable table) throws InterruptedException {
		for (Map<String, String> row : table.getRows()) {

			fleetpage.clickOnFleetsCreateChildPopup(
								row.get("FleetType"), row.get("Fleet"), row.get("WorkNumber"), row.get("Email"), row.get("Add1"), row.get("City"),
								row.get("Zip"), row.get("Latitude"), row.get("Longitude"));
					
		//for (Map<String, String> row : table.getRows()) {
}
}
	
	@Then("Appropriate validation message should be displayed on Fleets page Add Child popup")
	public void AppropriatevalidationmessageshouldbedisplayedonFleetspageAddChildpopup() throws FileNotFoundException, IOException {
		// Assert.assertTrue(fleetpage.element(By.xpath(AcceptanceSuite.props.getProperty("FleetsAdd"))).isCurrentlyVisible());

	}

	@Given("The User is on Fleets page Delete popup to check Delete Dependency")
	public void TheUserisonEnterpriseResourcesPageDeletePopuptoCheckDeleteDependency() throws InterruptedException {
		homePage.openPage();
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		fleetpage.clickOnFleetCreateChildHeader();

		// enterpriseresource.clickOnEnterpriseResourcesDelete();

	}

	@When("The User clicks on Delete button in Fleets delete popup")
	public void TheUserClicksOnDeleteButtonInEnterpriseResourceDeletePopup() throws InterruptedException {
		fleetpage.clickOnFleetsDelete();

	}
	
	
	@Then("Appropriate validation message should be displayed on Fleets page Delete popup")
	public void AppropriatevalidationmessageshouldbedisplayedonFleetspageDeletepopup() throws FileNotFoundException, IOException {
		// Assert.assertTrue(fleetpage.element(By.xpath(AcceptanceSuite.props.getProperty("FleetsAdd"))).isCurrentlyVisible());

	}

}
