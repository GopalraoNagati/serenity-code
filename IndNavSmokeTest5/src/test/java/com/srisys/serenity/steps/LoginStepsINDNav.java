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
import com.srisys.serenity.pages.IndNavBillPaymentHistoryPage;
import com.srisys.serenity.pages.IndNavEnterpriseResourcespage;
import com.srisys.serenity.pages.IndNavEventsRegistrationspage;
import com.srisys.serenity.pages.IndNavEventspage;
import com.srisys.serenity.pages.IndNavFleetTypeAttributesPage;
import com.srisys.serenity.pages.IndNavFleetpage1;
import com.srisys.serenity.pages.IndNavLoginpage;
import com.srisys.serenity.pages.IndNavLookupspage;
import com.srisys.serenity.pages.IndNavUserspage;

import net.thucydides.core.steps.ScenarioSteps;

public class LoginStepsINDNav extends ScenarioSteps{

	IndNavLoginpage homePage;
	IndNavEnterpriseResourcespage resourcepage;
	IndNavFleetpage1 fleetpage;
	IndNavUserspage usesrpage;
	IndNavLookupspage lookupspage;
	IndNavEventspage eventspage;
	WebElement loginButtonElem;
	WebElement usernameElem;
	WebElement passwordElem;
	WebElement submitButtonElem;
	WebElement facebookElem;
	IndNavEventsRegistrationspage registration;
	IndNavFleetTypeAttributesPage fleetTypeAttributes;
	IndNavBillPaymentHistoryPage billPaymentHistoryPage;
	
	@Given("The user is on GmailLogin Pop Up")
	public void The_user_is_on_IndNavLogin_Pop_Up() throws FileNotFoundException, IOException{
		homePage.openPage();
		homePage.getDriver().manage().window().maximize();
		
	}
	
	@When("The Userenters fields Valid UserNmae and Password")
	public void The_Userenters_fields_Combinations() throws InterruptedException{
		System.out.println("About to click Login Button");
		homePage.clickOnLoginButton();
		
		
			
			
			
		}
		
	@Then("The page Redirected to Home page")
	public void Appropriate_Validation_messages_should_be_Displayed(){
		
	}

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
	
	@Given("The User is on Enterprise Resources Add Pop Up")
	public void TheVisitorIsOnTFCRegistrationPopUp() throws InterruptedException {
		OpenAndLogin();
	}
	
	//The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
	@When("The User Enters Valid Enterprise '$enterprise', Resourcetype '$ResourceType', FirstName '$FirstName', LastName '$LastName', Designation '$Designation', Department '$Department', Gender '$Gender', MobileNumber '$MobileNumber', EMailID '$EMailID', AddressLine1 '$AddressLine1', City '$City', Country '$Country', State '$State', ZIPcode '$ZIPcode', Latitude '$Latitude', Longitude '$Longitude' and Clicks on Sign Up Button")
	public void TheVisitorEntersValidFirstnameAndLastnameandEmailAndPasswordAndConfirmPasswordAndMobileNumberClicksonSignUpButton(
			String enterprise, String Resourcetype, String FirstName, String LastName,String Designation,
			String Department, String Gender, String MobileNumber,String EMailID, String AddressLine1, String City, String Country,String State,
			String ZIPCode, String Latitude, String Longitude) throws InterruptedException {
		resourcepage.enter_firstname_lastname_username__email_password_confirmpassword_mobilenumber(
				enterprise, Resourcetype, FirstName, LastName, Designation,
				 Department, Gender, MobileNumber,EMailID, AddressLine1, City, Country,State,
				ZIPCode, Latitude, Longitude);
	}
	
	@Then("The Enterprise Resource should be displayed in the listing")
	public void AppropriateValidationMessagesShouldBeDisplayedToTheVisitor() throws FileNotFoundException, IOException {
		//Assert.assertTrue(resourcepage.element(By.xpath(AcceptanceSuite.props.getProperty("Addbutton"))).isCurrentlyVisible());
	}
	
	@Given ("The User is on Enterprise Resources Edit Pop Up")
	public void TheUserIsOnEnterpriseResourcesEditPopup() throws InterruptedException{
		OpenAndLogin();
	}
	
	@When ("The User modifies values for fields of Enterprise Resources")
	public void TheUserModifiesValuesForFieldsOfEnterpriseResources() throws InterruptedException{
		resourcepage.enterpriseResourcesEdit();
	}
	
	@Then ("Enterprise Resource data should be updated with the modified values")
	public void EnterpriseResourceShouldBeUpdated(){
		
	}
	
	@Given ("The User is on Enterprise Resources Block/Unblock Pop Up")
	public void TheUserIsOnEnterpriseResourcesBlockUnblockPopup() throws InterruptedException{
		OpenAndLogin();
	}
	
	@When ("The User blocks Enterprise Resources with a reason and Unblocks with a reason")
	public void TheUserBlocksAndThenUnblocksEnterpriseResourceWithAReason() throws InterruptedException {
		resourcepage.blockAndUnblock();
	}
	
	@Then ("Enterprise Resource should be active")
	public void EnterpriseResourceShouldBeActive(){
		
	}
	
	/*FleetTypeAttributes*/

	@Given ("The User is on Fleet Type Attributes page")
	public void TheUserIsOnFleetTypeAttributesCreatePopup() throws InterruptedException{
		OpenAndLogin();
	}
	
	@When ("The User clicks on create button and enters Fleet Type Attribute valid data and clicks on Submit Button")
	public void TheUserEntersFleetTypeAttributesAndClicksSubmitButton() throws InterruptedException{
		Thread.sleep(20000);
		fleetTypeAttributes.fleetTypeAttributesCreate();
	}
	
	@Then ("Created Fleet Type Attribute for the fleet type should be displayed in the listing")
	public void FleetTypeAttributesShouldBeDisplayedInTheListing(){
		
	}
	
	@Given ("The User is on Fleet Type Attributes Edit page")
	public void TheUserIsOnFleetTypeAttributesEditPopup() throws InterruptedException{
		OpenAndLogin();		
	}
	
	@When ("The User clicks on Edit button and modifies the Fleet Type Attribute data and clicks on Submit Button")
	public void TheUserModifiesValuesOfFleetTypeAttribute() throws InterruptedException{
		fleetTypeAttributes.fleetTypeAttributesEdit();
	}
	
	@Then ("The modified Fleet Type Attribute for the fleet type should be displayed in the listing")
	public void FleetTypeAttributeShouldBeUpdated(){
		
	}
	
	
	@Given ("The User is on Fleet Type Attributes View page")
	public void The_Fleet_Type_Attributes_View_page() throws InterruptedException{
		//OpenAndLogin();		
	}
	
	@When ("The User clicks on Fleet Type Attributes View button of any specific record")
	public void Th_View_button_of_any_specific_record() throws InterruptedException{
		fleetTypeAttributes.fleetTypeAttributesView();
	}
	
	@Then ("The Fleet Type Attributes data of that record should display in the popup")
	public void FleetTypeAttributeviewdataShouldbeDisplayed(){
		
	}
	

	@Given("The User is on Fleet Create Pop Up1")
	public void TheUserIsOnFleetCreationPopUp() throws InterruptedException {
		OpenAndLogin();
	}
	 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
	@When("The User Enters Valid Fleet data and Clicks on Submit Button")
	public void TheUserIsOnFleetCreationPopUpClicksonSignUpButton() throws InterruptedException {
		fleetpage.fleetCreate();
	}
	
	@Then("Appropriate Fleet should be displayed in the listing")
	public void AppropriatesFleetshouldbeDisplayedinthelisting() throws FileNotFoundException, IOException {
		Assert.assertTrue(fleetpage.element(By.xpath(AcceptanceSuite.props.getProperty("FleetsAdd"))).isCurrentlyVisible());
	}
	
	@Given("The User is on User Create Pop Up")
	public void TheUserIsOnUsersCreationPopUp() throws InterruptedException {
		OpenAndLogin();
		
	}
	 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
	@When("The User Enters Valid data and Clicks on Submit Button")	
	public void TheUserIsOnUsersCreationPopUpClicksonSignUpButton() throws InterruptedException {
		usesrpage.usersCreate();
	}
	
	@Then("User should be displayed in the listing")
	public void AppropriatesUsershouldbeDisplayedinthelisting() throws FileNotFoundException, IOException {
		Assert.assertTrue(usesrpage.element(By.xpath(AcceptanceSuite.props.getProperty("Addbutton"))).isCurrentlyVisible());
	}
	
	@Given("The User is on Lookupcode Create Pop Up")
	public void TheUserIsOnLookupsCreationPopUp() throws InterruptedException {
		OpenAndLogin();
	}
	
	 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
	@When("The User Enters Lookup code Valid data and Clicks on Submit Button")	
	public void TheUserIsOnLookupsCreationPopUpClicksonSignUpButton() throws InterruptedException {
		lookupspage.lookupsCreate();
	}
	
	@Then("Lookupcode should be displayed in the listing")
	public void AppropriatesLookupshouldbeDisplayedinthelisting() throws FileNotFoundException, IOException {
		Assert.assertTrue(lookupspage.element(By.xpath(AcceptanceSuite.props.getProperty("lookupsAdd"))).isCurrentlyVisible());
		
	}
	
	@Given("The User is on Events Create Pop Up1")
	public void TheUserIsOnEventsCreationPopUp() throws InterruptedException {
		OpenAndLogin();
	}
	 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
	@When("The User Enters Events Valid data and Clicks on Submit Button")
	public void TheUserIsOnEventsCreationPopUpClicksonSignUpButton() throws InterruptedException {
		//eventspage.eventsCreate();
	}
	
	@Then("Appropriate Event should be displayed in the listing")
	public void AppropriatesEventsshouldbeDisplayedinthelisting() throws FileNotFoundException, IOException {
		//Assert.assertTrue(lookupspage.element(By.xpath(AcceptanceSuite.props.getProperty("lookupsAdd"))).isCurrentlyVisible());
	}
	
	@Given("The User is on EventsRegistration Create Pop Up1")
	public void TheUserIsOnEventsRegistrationCreationPopUp() throws InterruptedException {
		OpenAndLogin();
	}
	
	//The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
	@When("The User Enters EventsRegistrations Valid data and Clicks on Submit Button")	
	public void TheUserIsOnEventsRgistrationCreationPopUpClicksonSignUpButton() throws InterruptedException {
		registration.eventsRegistrationCreate();
	}
	
	@Then("Appropriate EventsRegistration should be displayed in the listing")
	public void AppropriatesEventsRegistraionshouldbeDisplayedinthelisting() throws FileNotFoundException, IOException {
		Assert.assertTrue(registration.element(By.xpath(AcceptanceSuite.props.getProperty("EventRegistationAdd"))).isCurrentlyVisible());
	}
	
	@Given ("The User is on Fleet Type Attributes Delete page")
	public void TheUserHasCreatedAllEntitiesForSmokeTest() throws InterruptedException{
		OpenAndLogin();	
	}
	
	@When ("The User clicks on Fleet Type Attributes Delete button of any specific record")
	public void TheUserDeletesAllEntitiesCreatedDuringSmokeTest() throws InterruptedException{
		
		//registration.eventRegistrationDelete();
		//eventspage.eventDelete();
		Thread.sleep(20000);
		fleetTypeAttributes.fleetTypeAttributesDelete();
		//fleetpage.fleetDelete();
		//usesrpage.usersDelete();
		//resourcepage.enterpriseResourcesDelete();
		//billPaymentHistoryPage.billPaymentHistoryDelete();
	}
	
	@When ("The User deletes Enterprise Resource")
	public void TheUserDeletedEnterpriseResource() throws InterruptedException {
		resourcepage.enterpriseResourcesDelete();
	}
	
	@Then ("The Fleet Type attribute delete popup should display and by clicking on delete button in the popup, the record should get deleted from the listing, provided the Fleet type is NOT in use")
	public void TheCorrespondingEntitiesShouldBeDeleted(){
		
	}
	
	@Given ("The Super Admin User is on Bill Payments History page")
	public void TheUserIsOnBillPaymentHistoryCreatePopup() throws InterruptedException{
		OpenAndLogin();
	}
	
	@When ("The User clicks on Create Bill Payments History button and Enters valid data in the popup and Clicks on Submit Button")
	public void TheUserEntersValidDataAndClicksOnSubmitButton() throws InterruptedException{
		billPaymentHistoryPage.billPaymentHistoryCreate();
	}
	
	@Then ("Bill Payments History Record should be created and should be displayed in the listing")
	public void AppropriateBillPaymentHistoryRecordShouldBeDisplayedInTheListing(){
		
	}
	
	@Given ("The User is on Bill Payment History Edit Popup")
	public void TheUserIsOnBillPaymentHistoryEditPopup() throws InterruptedException{
		//OpenAndLogin();
	}
	
	@When ("The User clicks on Bill Payment History Edit button and modifies data in the popup and Clicks on Submit Button")
	public void TheUserModifiesBillPaymentHistoryRecord() throws InterruptedException{
		billPaymentHistoryPage.billPaymentHistoryEdit();
		//billPaymentHistoryPage.billPaymentHistoryDelete();
	}
	
	@Then ("Bill Payments History Record should be updated and should be displayed in the listing")
	public void BillPaymentHistoryRecordShouldBeUpdated(){
		
	}
	
	@Given ("The User is on Bill Payments History page")
	public void UserIsOnBPHViewPopup() throws InterruptedException{
		OpenAndLogin();
	}
	
	@When("The User clicks on View button of any specific Bill Payment History record")
	public void UserClicksOnViewButton() throws InterruptedException{
		billPaymentHistoryPage.billPaymentHistoryView();
	}
	
	@Then("Bill Payments History Record specific details should be displayed in the popup")
	public void ClickedElementShouldBeDisplayed(){
		
	}
	
	@When ("The User enters valid Bill Payments History record Search data and Clicks on Submit Button")
	public void UserClicksOnAdvSearchButton() throws InterruptedException{
		billPaymentHistoryPage.billPaymentHistoryAdvancedSearch();
	}
	
	@Then ("Appropriate Bill Payment History search results should be displayed in the listing")
	public void SearchResultsShouldAppear(){
		
	}
	
	@Given ("The Admin User is on Bill Payments History page")
	public void TheUserIsOnBillPaymentHistoryListingPage(){
		
	}
	@When ("The User clicks on Delete button of any specific Bill Payment History record")
	public void TheUserDeletesAnEntry() throws InterruptedException{
		billPaymentHistoryPage.billPaymentHistoryDelete();
	}
	@Then ("That specific Bill Payments History record should be deleted from the list")
	public void TheEntryShouldBeDeleted(){
		
	}
	
	public void OpenAndLogin() throws InterruptedException{
		homePage.openPage();	
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
	}
	
	@Given ("The User has created all the entities for Smoke Test")
	public void TheUserHasCreatedAllEntitiesForSmokeTest1() throws InterruptedException{
		OpenAndLogin();	
	}
	
	@When ("The User delete Enterprise Resource")
	public void TheUserDeletedEnterpriseResource1() throws InterruptedException {
		resourcepage.enterpriseResourcesDelete();
	}
	@Then ("The corresponding entities should be deleted")
	public void TheCorrespondingEntitiesShouldBeDeleted1(){
		
	}
	
	
	@Given ("The User is on Enterprise Resources View page")
	public void TheUserisonEnterpriseResourcesViewpage() throws InterruptedException{
		//OpenAndLogin();
	}
	
	@When ("The User clicks on Enterprise Resources ‘View’ button of any of the record in the listing")
	public void TheUserclicksonEnterpriseResourcesViewbuttonofanyoftherecordinthelisting() throws InterruptedException{
		resourcepage.enterpriseResourcesView();
	}
	
	@Then ("The details of the Enterprise Resource should display")
	public void ThedetailsoftheEnterpriseResourceshouldisplay(){
		
	}
	
	@Given ("The User is on Enterprise Resources Message page")
	public void TheUserisonEnterpriseResourcesMessagepage() throws InterruptedException{
		//OpenAndLogin();
	}
	
	@When ("The User clicks on ‘Message’ button of any of the record and enters details in the popup and clicks on submit")
	public void TheUserclicksonMessagebuttonofanyoftherecordandentersdetailsinthepopupandclicksonsubmit() throws InterruptedException{
		resourcepage.enterpriseResourcesMessage();
	}
	
	@Then ("The message should be delivered to the respective user")
	public void Themessageshouldbedeliveredtotherespectiveuser(){
		
	}
	
	
	
	
//Enterpise Resources Validations
	
	
	@Given("The user should not be able to create an Enterprise Resource Record")
	public void TheVisitorIsOnEnterprisePopUp() throws InterruptedException {
		homePage.openPage();
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		resourcepage.clickOnEnterpriseHeader();
	}

	//The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
	@When("The User Enters all Possible(Enterprise, ResourceType, FirstName, LastName, Designation, Department, Gender, MobileNumber, Email, Add1, City, Country, State, Zipcode, Latitude and Longitude) Invalid Combinations in Enterprise Resource Record $table")
	public void TheVisitorEntersValidFirstnameAndLastnameandEmailAndPasswordAndConfirmPasswordAndMobileNumberClicksonSignUpButton(
			ExamplesTable table) throws InterruptedException {
		for (Map<String, String> row : table.getRows()) {

			resourcepage.enterpriseResourcesNegativeCases(
					row.get("Enterprise"), row.get("ResourceType"),
					row.get("FirstName"), row.get("LastName"), row.get("Designation"), row.get("Department"),
					row.get("Gender"), row.get("MobileNumber"), row.get("Email"), row.get("Add1"), row.get("City"), row.get("Country"),
					row.get("State"), row.get("Zipcode"), row.get("Latitude"), row.get("Longitude"));
			//System.out.println("emailId============"+table.getRows().size());
			
		}
	}

	@Then("The Enterprise Resource Record will not be created")
	public void TheEnterpriseResourceRecordwillnotbecreated1() throws FileNotFoundException, IOException {
		//Assert.assertTrue(resourcepage.element(By.xpath(AcceptanceSuite.props.getProperty("Addbutton"))).isCurrentlyVisible());
		
	}
	@Given("The user is on Enterprise resources page edit popup  to check invalid combinations")
	public void TheUserisonEnterpriseResourcesPageEditPopuptoCheckInvalidCombinations() throws InterruptedException{
		homePage.openPage();
		homePage.clickOnLoginButton();
		resourcepage.clickOnEnterpriseEdtHeader();
		resourcepage.clickOnEnterpriseResourcesEdit();
		
	}
	@When("The User enters invalid combinations (ResourceType, FirstName, LastName, Designation, Department, Gender, MobileNumber, Email, Add1, City, Country, State, Zipcode, Latitude and Longitude) in enterprise resource edit popup and clicks on submit button $table")
	public void TheUserEntersInvalidCombinationsInEnterpriseResourceEditPopupAndClicksOnSubmitButton (ExamplesTable table) throws InterruptedException{
		for (Map<String, String> row : table.getRows()) {

			resourcepage.clickOnEnterpriseResourcesEditPopup(row.get("ResourceType"),
					row.get("FirstName"), row.get("LastName"), row.get("Designation"), row.get("Department"),
					row.get("Gender"), row.get("MobileNumber"), row.get("Email"), row.get("Add1"), row.get("City"), row.get("Country"),
					row.get("State"), row.get("Zipcode"), row.get("Latitude"), row.get("Longitude"));
			System.out.println("emailId============"+table.getRows().size());
			

		}
	}
	@Then("Appropriate validation message should be displayed on Enterprise resources page edit popup")
	public void AppropriatevalidationmessageshouldbedisplayedonEnterpriseresourcespageeditpopup (){
		
	}
	
	
	@Then("Appropriate validation message should be displayed")
	public void AppropriateValidationMessageShouldBeDiplayed (){
		
	}
	@Given("The user is on Enterprise resources page Delete popup  to check Delete Dependency")
	public void TheUserisonEnterpriseResourcesPageDeletePopuptoCheckDeleteDependency() throws InterruptedException{
		homePage.openPage();
		homePage.clickOnLoginButton();
		//enterpriseresource.clickOnEnterpriseHeader();
		resourcepage.clickOnEnterpriseDeleteHeader();
		//enterpriseresource.clickOnEnterpriseResourcesDelete();
		
	}
	@When("The User clicks on Delete button in enterprise resource delete popup")
	public void TheUserClicksOnDeleteButtonInEnterpriseResourceDeletePopup() throws InterruptedException{
		resourcepage.clickOnEnterpriseResourcesDelete();
			

		}
	@Then("Appropriate validation message should be displayed on Enterprise resources page Delete popup")
	public void AppropriatevalidationmessageshouldbedisplayedonEnterpriseresourcespageDeletepopup (){
		
	}
	
	
	
	@Given("The User is on Enterprise resource page block/unblockpopup to check validations")
	public void TheUserIsOnEnterpriseResourcePageBlock() throws InterruptedException{
		homePage.openPage();
		homePage.clickOnLoginButton();
		resourcepage.getDriver().manage().window().maximize();
		resourcepage.blockAndUnblockPopup();
		
	}
	@When("The User clicks on Enterprise resource block/unblock popup")
	public void TheUserClicksOnEnterpriseResourceBlockUnblockPopup() throws InterruptedException{
		resourcepage.blockAndUnblockNegative();
		resourcepage.blockAndUnblockNegative1();
	}
	
	
	@Then("Appropriate validation message should be displayed On Enterprise resource page block popup")
	public void  AppropriatevalidationmessageshouldbedisplayedOnEnterpriseresourcepageblockpopup (){
		
	}
	
	//FleetTypeAttributes
	
	
	
	@Given("The User is on Fleet type attribute page to check invalid combinations")
	public void TheUserrIsOnFleetTypeAttributePageToCheckInvalidCombinations() throws InterruptedException {
		//OpenAndLogin();
		homePage.openPage();	
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		fleetTypeAttributes.fleetTypeAttCreate();
	}
	
	//The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
	@When("The User enters invalid combinations(Enterprise, FleetType, AttributeName, AttributeType and Description) in fleet type attribute create popup and clicks on submit button $table")
	public void TheUserEntersInvalidCombinationsInFleetTypeAttributesAndClicksOnSubmitButton(ExamplesTable table) throws InterruptedException{
		for (Map<String, String> row : table.getRows()) {

			fleetTypeAttributes.FleetTypeAttNegativeCases(
								row.get("Enterprise"), row.get("FleetType"),
								row.get("AttributeName"), row.get("AttributeType"), row.get("Description"));
					
		}
	}
	
	@Then("Appropriate validation message should be displayed on Fleet Type Attribute Create popup")
	public void AppropriatevalidationmessageshouldbedisplayedonFleetTypeAttributeCreatepopup() throws FileNotFoundException, IOException {
		//Assert.assertTrue(resourcepage.element(By.xpath(AcceptanceSuite.props.getProperty("Addbutton"))).isCurrentlyVisible());
	}
	@Then("Enterprise Resource should be displayed in the listing")
	public void AppropriateValidationMessagesShouldBeDisplayedToTheVisitor1() throws FileNotFoundException, IOException {
		//Assert.assertTrue(resourcepage.element(By.xpath(AcceptanceSuite.props.getProperty("Addbutton"))).isCurrentlyVisible());
	}
	@Given("The User is on Fleet Type Attribute page Delete popup  to check Delete Dependency")
	public void TheUserIsOnFleetTypePageDeletePopupToCheckDeleteDependency() throws FileNotFoundException, IOException, InterruptedException{
		homePage.openPage();	
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		
	}
	
	@When("The User clicks on Delete button on fleet type attribute popup")
	public void TheUserClicksOnDeleteButtonInFleetTypeDeletePopup() throws InterruptedException{
		fleetTypeAttributes.fleetTypeAttributesDeleteNegative();
	}
	
	@Then("Appropriate validation message should be displayed on Fleet Type Attribute Delete popup")
	public void AppropriatevalidationmessageshouldbedisplayedonFleetTypeAttributeDeletepopup() throws FileNotFoundException, IOException {
		//Assert.assertTrue(resourcepage.element(By.xpath(AcceptanceSuite.props.getProperty("Addbutton"))).isCurrentlyVisible());
	}
	
	@Then("Pigeon Home/fleet reservations page will be displayed1")
	public void Login_Popup_must_be_Displayed1(){
	//	Assert.assertTrue(homePage.element(By.xpath(AcceptanceSuite.props.getProperty("Admin"))).isCurrentlyVisible());
	//	Assert.assertTrue(homePage.element(By.xpath(AcceptanceSuite.props.getProperty("Dashboard"))).isCurrentlyVisible());
		//homePage.getDriver().close();
	}
	@Given("The User is on Fleet Type attribute page edit popup  to check invalid combinations")
	public void TheUserIsOnFleetTypeAttributePageEditPopupToCheckInvalidCombinations() throws FileNotFoundException, IOException, InterruptedException{
		homePage.openPage();	
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		fleetTypeAttributes.FleetTypeAttEditCases();
	}
	
	@When("The User enters invalid combinations(AttributeName and Description) in fleet type attribute edit popup and clicks on submit button $table")
	public void TheUserEntersInvalidCOmbinationsInFleetTypeAttributeEditPopupAndClicksOnSubmitButton(ExamplesTable table) throws InterruptedException{
		for (Map<String, String> row : table.getRows()) {

			fleetTypeAttributes.FleetTypeAttEditNegativeCases(row.get("AttributeName"), row.get("Description"));
					
		}
	}
	
	
	@Then("Appropriate validation message should be displayed On Fleet Type attribute page edit popup")
	public void AppropriatevalidationmessageshouldbedisplayedOnFleetTypeattributepageeditpopup(){
	//	Assert.assertTrue(homePage.element(By.xpath(AcceptanceSuite.props.getProperty("Admin"))).isCurrentlyVisible());
	//	Assert.assertTrue(homePage.element(By.xpath(AcceptanceSuite.props.getProperty("Dashboard"))).isCurrentlyVisible());
		//homePage.getDriver().close();
	}
	
	//Billpayment
	@Given("The user is on Bill Payment History Create popup to check invalid combinations")
	public void TheUserIsOnBillPaymentHistoryCreatePopupToCheckInvalidCombinations() throws InterruptedException {
		OpenAndLogin();
		billPaymentHistoryPage.billpaymentHeader();

	}

	@When("The User enters invalid (Enterprise,InvoiceNumber,PeriodType,AmountDue) combinations in Bill Payment History create popup and clicks on submit button $table")
	public void TheUserEntersInvalidCombinationsInBillPaymentHistoryCreatePopupAndClicksOnSubmitButton(
			ExamplesTable table) throws InterruptedException {
		for (Map<String, String> row : table.getRows()) {
			billPaymentHistoryPage.invalidCombinations(row.get("Enterprise"), row.get("InvoiceNumber"),
					row.get("PeriodType"), row.get("AmountDue"));

		}

	}

	@Then("Appropriate validation message should be displayed on Bill Payment History Create popup")
	public void AppropriateValidationMessageShouldBeDisplayed() {

	}

	@Given("The user is on Bill Payment History Edit popup to check invalid combinations")
	public void TheUserIsOnBillPaymentHistoryEditPopupToCheckInvalidCombinations() throws InterruptedException {
		OpenAndLogin();
		billPaymentHistoryPage.invalidCombinationsEditHeader();

	}

	@When("The User enters invalid (AmountPaid,CreditCardType,CreditCardNumber,ExpiryMonth,ExpiryYear,NameonCreditCard,CVVNumber,AddressLine1,City,ZipCode) combinations in Bill Payment History Edit popup and clicks on submit button $table")
	public void TheUserEntersInvalidCombinationsInBillPaymentHistoryEditPopupAndClicksOnSubmitButton(
			ExamplesTable table) throws InterruptedException {
		for (Map<String, String> row : table.getRows()) {
			billPaymentHistoryPage.invalidCombinationsEdit(row.get("AmountPaid"), row.get("CreditCardType"),
					row.get("CreditCardNumber"), row.get("ExpiryMonth"), row.get("ExpiryYear"),
					row.get("NameonCreditCard"), row.get("CVVNumber"), row.get("AddressLine1"), row.get("City"),
					row.get("ZipCode"));
		}
	}

	@Then("Appropriate validation message should be displayed for Edit page")
	public void AppropriateValidationMessageShouldBeDisplayedForEditPage() {

	}
}
	
	


	
	
