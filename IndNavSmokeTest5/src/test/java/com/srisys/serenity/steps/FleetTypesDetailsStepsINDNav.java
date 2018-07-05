package com.srisys.serenity.steps;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebElement;

import com.srisys.serenity.pages.IndNavContractDetailspage;
import com.srisys.serenity.pages.IndNavEnterpriseResourcespage;
import com.srisys.serenity.pages.IndNavEventsRegistrationspage;
import com.srisys.serenity.pages.IndNavEventspage;
import com.srisys.serenity.pages.IndNavFleetTypesDetailspage;
import com.srisys.serenity.pages.IndNavFleetpage;
import com.srisys.serenity.pages.IndNavFunfactspage;
import com.srisys.serenity.pages.IndNavLoginpage;
import com.srisys.serenity.pages.IndNavLookupspage;
import com.srisys.serenity.pages.IndNavStaticContentDetailspage;
import com.srisys.serenity.pages.IndNavUserspage;

import net.thucydides.core.steps.ScenarioSteps;
public class FleetTypesDetailsStepsINDNav extends ScenarioSteps{

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
	IndNavContractDetailspage contractDetails;
	IndNavStaticContentDetailspage statiDetails;
		
	IndNavFleetTypesDetailspage fleetTypes;

	// Scenario 1
	@Given("The User is on Fleet Types page")
	public void The_Visitor_is_on_IndNav_Home_page() throws FileNotFoundException, IOException, InterruptedException{
		
	
		homePage.openPage();	
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
	}
	
	@When("The User clicks on Create button and enters valid Fleet Type data and clicks on Submit Button")
	public void The_Visitor_selects_or_Clicks_on_login_Button() throws InterruptedException, AWTException{
		System.out.println("About to click Login Button");
		Thread.sleep(20000);
		fleetTypes.FleetTypesCreation();
	}
	
	@Then("Fleet Type should be created and it should be displayed in the listing")
	public void Login_Popup_must_be_Displayed(){
		//Assert.assertTrue(homePage.element(By.xpath(AcceptanceSuite.props.getProperty("Admin"))).isCurrentlyVisible());
		//Assert.assertTrue(homePage.element(By.xpath(AcceptanceSuite.props.getProperty("Dashboard"))).isCurrentlyVisible());
		//homePage.getDriver().close();
	}
	
	
	@Given("The User is on Fleet Types Edit page")
	public void The_User_is_on_Fleet_Types_Edit_page() throws FileNotFoundException, IOException, InterruptedException{
		//homePage.openPage();	
		//homePage.getDriver().manage().window().maximize();
		//homePage.clickOnLoginButton();
	}
	
	@When("The User clicks on Edit button and modifies Fleet Type data and clicks on Submit Button")
	public void The_User_clicks_on_Edit_button_and_modifies_Fleet_Type_data_and_clicks_on_Submit_Button() throws InterruptedException, AWTException{
		System.out.println("About to click Login Button");
		fleetTypes.FleetTypesEdit();
	}
	
	@Then("Fleet Type should be updated and it should be displayed in the listing")
	public void Fleet_Type_should_be_updated_and_it_should_be_displayed_in_the_listing(){
		//Assert.assertTrue(homePage.element(By.xpath(AcceptanceSuite.props.getProperty("Admin"))).isCurrentlyVisible());
		//Assert.assertTrue(homePage.element(By.xpath(AcceptanceSuite.props.getProperty("Dashboard"))).isCurrentlyVisible());
		//homePage.getDriver().close();
	}
	
	@Given("The User is on Fleet Types View page")
	public void The_User_is_on_Fleet_Types_View_page() throws FileNotFoundException, IOException, InterruptedException{
		//homePage.openPage();	
		//homePage.getDriver().manage().window().maximize();
		//homePage.clickOnLoginButton();
	}
	
	@When("The User clicks on View button")
	public void The_User_clicks_on_View_sbutton() throws InterruptedException, AWTException{
		System.out.println("About to click Login Button");
		fleetTypes.FleetTypesView();
	}
	
	@Then("Fleet Type View popup should display with the fleet type data of the record")
	public void Fleet_Type_View_popup_should_display_with_the_fleet_type_data_of_the_record(){
		//Assert.assertTrue(homePage.element(By.xpath(AcceptanceSuite.props.getProperty("Admin"))).isCurrentlyVisible());
		//Assert.assertTrue(homePage.element(By.xpath(AcceptanceSuite.props.getProperty("Dashboard"))).isCurrentlyVisible());
		//homePage.getDriver().close();
	}
	
	
	@Given("The User is on Fleet Types Delete page")
	public void The_User_is_on_FleetTypes_Delete_Pop_Up() throws FileNotFoundException, IOException, InterruptedException{
		homePage.openPage();	
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
	}
	
	@When("The User clicks on Fleet Types Delete button of any record")
	public void The_User_Enters_FleetTypes_Valid_data_and_clicks_on_Delete_Button() throws InterruptedException, AWTException{
		System.out.println("About to click Login Button");
		Thread.sleep(20000);
		fleetTypes.FleetTypesDelete();
	}
	
	@Then("The Fleet Type delete popup should display and by clicking on delete button in the popup, the record should get deleted from the listing, provided the Fleet type is NOT in use")
	public void FleetTypes_should_be_deleted_in_the_listing(){
		//Assert.assertTrue(homePage.element(By.xpath(AcceptanceSuite.props.getProperty("Admin"))).isCurrentlyVisible());
		//Assert.assertTrue(homePage.element(By.xpath(AcceptanceSuite.props.getProperty("Dashboard"))).isCurrentlyVisible());
		//homePage.getDriver().close();
	}
	
	@Given("The Super Admin is on Fleet Types Advance Search page")
	public void The_Super_Admin_is_on_Fleet_Types_Advance_Search_page() throws FileNotFoundException, IOException, InterruptedException{
		//homePage.openPage();	
		//homePage.getDriver().manage().window().maximize();
		//homePage.clickOnLoginButton();
	}
	
	@When("The Super Admin clicks on Fleet Types Advanced Search button and enters relevant data in the pop up and clicks on submit")
	public void The_User_clicks_on_Fleet_Types_Delete_button_of_any_record() throws InterruptedException, AWTException{
		System.out.println("About to click Login Button");
		fleetTypes.FleetTypesAdvance();
	}
	
	@Then("The appropriate Fleet type should be displayed in the listing")
	public void The_appropriate_Fleet_type_should_be_displayed_in_the_listing(){
		//Assert.assertTrue(homePage.element(By.xpath(AcceptanceSuite.props.getProperty("Admin"))).isCurrentlyVisible());
		//Assert.assertTrue(homePage.element(By.xpath(AcceptanceSuite.props.getProperty("Dashboard"))).isCurrentlyVisible());
		//homePage.getDriver().close();
	}
	
	//Validations
	
	
	
	@Given("The User is on Fleet types page to check invalid combinations")
	public void The_Visitor_is_on_IndNav_Home_page1() throws FileNotFoundException, IOException, InterruptedException{
		homePage.openPage();	
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		fleetTypes.fleetTypesnegativeCreate();
	}
	
	@When("The User enters invalid combinations(Enterprise, FleetType, DisplayColor, DisplayIcon, AvailableFleetColor, ReservedFleetColor, NonTransactableFleetColor, ChekedInFleetColor) in fleet type create popup and clicks on submit button $table")
	public void The_Visitor_selects_or_Clicks_on_login_Button(ExamplesTable table) throws InterruptedException{
		for (Map<String, String> row : table.getRows()) {
			System.out.println("ooooooooooosssssssoo"+ row.get("DisplayColor"));
System.out.println("ooooooooooooo"+ row.get("DisplayIcon"));
fleetTypes.FleetTypesNegativeCases(
								row.get("Enterprise"), row.get("FleetType"),
								row.get("DisplayColor"), row.get("DisplayIcon"), row.get("AvailableFleetColor"), row.get("ReservedFleetColor"),
								row.get("NonTransactableFleetColor"), row.get("ChekedInFleetColor"));
					

			System.out.println("emailId============"+table.getRows().size());
	}
	}
	
	
	@Then("Appropriate validation message should be displayed on Fleet Types Create popup")
	public void AppropriatevalidationmessageshouldbedisplayedonFleetTypesCreatepopup(){
		//Assert.assertTrue(homePage.element(By.xpath(AcceptanceSuite.props.getProperty("Admin"))).isCurrentlyVisible());
		//Assert.assertTrue(homePage.element(By.xpath(AcceptanceSuite.props.getProperty("Dashboard"))).isCurrentlyVisible());
		//homePage.getDriver().close();
	}
	@Given("The User is on Fleet Type page Delete popup  to check Delete Dependency")
	public void TheUserIsOnFleetTypePageDeletePopupToCheckDeleteDependency() throws FileNotFoundException, IOException, InterruptedException{
		homePage.openPage();	
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		
	}
	
	@When("The User clicks on Delete button in fleet type delete popup")
	public void TheUserClicksOnDeleteButtonInFleetTypeDeletePopup() throws InterruptedException{
		fleetTypes.FleetTypesDeleteNegative();
	}
	
	@Then("Appropriate validation message should be displayed on Fleet Type page Delete popup")
	public void AppropriatevalidationmessageshouldbedisplayedonFleetTypepageDeletepopup(){
	//	Assert.assertTrue(homePage.element(By.xpath(AcceptanceSuite.props.getProperty("Admin"))).isCurrentlyVisible());
	//	Assert.assertTrue(homePage.element(By.xpath(AcceptanceSuite.props.getProperty("Dashboard"))).isCurrentlyVisible());
		//homePage.getDriver().close();
	}
	
	@Then("Pigeon Home/fleet reservations page will be displayed1")
	public void Login_Popup_must_be_Displayed1(){
	//	Assert.assertTrue(homePage.element(By.xpath(AcceptanceSuite.props.getProperty("Admin"))).isCurrentlyVisible());
	//	Assert.assertTrue(homePage.element(By.xpath(AcceptanceSuite.props.getProperty("Dashboard"))).isCurrentlyVisible());
		//homePage.getDriver().close();
	}
}

	
	
	
  


