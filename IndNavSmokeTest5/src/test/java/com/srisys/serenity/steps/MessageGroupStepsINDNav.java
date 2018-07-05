package com.srisys.serenity.steps;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebElement;

import com.srisys.serenity.pages.IndNavEventsRegistrationspage;
import com.srisys.serenity.pages.IndNavEventspage;
import com.srisys.serenity.pages.IndNavFeedback;
import com.srisys.serenity.pages.IndNavFleetpage;
import com.srisys.serenity.pages.IndNavFunfactspage;
import com.srisys.serenity.pages.IndNavLoginpage;
import com.srisys.serenity.pages.IndNavLookupspage;
import com.srisys.serenity.pages.IndNavMessageGroup;
import com.srisys.serenity.pages.IndNavUserspage;

import net.thucydides.core.steps.ScenarioSteps;

public class MessageGroupStepsINDNav extends ScenarioSteps{

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
	IndNavMessageGroup messageGroup;
	

	// Scenario 1
	@Given("The User is on Message Group page")
	public void The_Visitor_is_on_IndNav_Home_page() throws FileNotFoundException, IOException, InterruptedException{
		homePage.openPage();	
		homePage.getDriver().manage().window().maximize();
		messageGroup.clickOnLoginButton();
	}
	
	@When("The User clicks on Create Group button and enters valid data and clicks on Submit Button")
	public void The_Visitor_selects_or_Clicks_on_login_Button() throws InterruptedException{
		System.out.println("About to click Login Button");
		messageGroup.feedBackcreate();
	}
	
	@Then("The Group should be created and should be displayed in the listing")
	public void Login_Popup_must_be_Displayed(){
		//Assert.assertTrue(homePage.element(By.xpath(AcceptanceSuite.props.getProperty("Admin"))).isCurrentlyVisible());
		//Assert.assertTrue(homePage.element(By.xpath(AcceptanceSuite.props.getProperty("Dashboard"))).isCurrentlyVisible());
		//homePage.getDriver().close();
	}
	
	
	@Given("The User is on Message Group page to Edit")
	public void The_Visitor_is_on_IndNav_Home_page_Edit() throws FileNotFoundException, IOException, InterruptedException{
		//homePage.openPage();	
		//homePage.getDriver().manage().window().maximize();
		//messageGroup.clickOnLoginButton();
	}
	
	@When("The User clicks on Edit button and modifies any data and Clicks on Submit Button")
	public void The_Visitor_selects_or_Clicks_on_login_Button_EditData() throws InterruptedException{
		System.out.println("About to click Login Button");
		messageGroup.messageGroupEdit();
	}
	
	@Then("The Group data should be modified and should be displayed in the listing accordingly")
	public void Login_Popup_must_be_messageGroupEditData_Displayed(){
		//Assert.assertTrue(homePage.element(By.xpath(AcceptanceSuite.props.getProperty("Admin"))).isCurrentlyVisible());
		//Assert.assertTrue(homePage.element(By.xpath(AcceptanceSuite.props.getProperty("Dashboard"))).isCurrentlyVisible());
		//homePage.getDriver().close();
	}
	
	
	@Given("The User is on Message Group page to View")
	public void The_User_is_on_Funfacts_View_Pop_Up() throws InterruptedException {
		
		
	}
	 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
	@When("The User clicks on View button of any specific Message Group record")
	public void The_User_Enters_Valid_FunfactsView_data_and_Clicks_on_Submit_Button() throws InterruptedException {
		messageGroup.messagegroupView();
	}
	
	@Then("The User should be able to view the details of the group")
	public void The_User_Enters_Valid_FunfactsView_data_and_Clicks_on_Submit_Button_Edit() throws FileNotFoundException, IOException {
		//Assert.assertTrue(fleetpage.element(By.xpath(AcceptanceSuite.props.getProperty("FleetsAdd"))).isCurrentlyVisible());
		
	}
	
	
	@Given("The User is on Message Group page to Block")
	public void The_User_is_on_Funfacts_Advancesearch_Pop_Up() throws InterruptedException {
		//homePage.openPage();	
		//homePage.getDriver().manage().window().maximize();
		//''homePage.clickOnLoginButton();
		
	}
	 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
	@When("The User clicks on block button of any specific Message Group record")
	public void The_User_Enters_Valid_advancesearch_data_and_Clicks_on_Submit_Button() throws InterruptedException {
		messageGroup.messagegroupBlock();
	}
	
	@Then("The User should be able to inactivate that group and it should no longer be available to send the messages")
	public void The_User_Enters_Valid_FunfactsAdvancesearch_data_data_and_Clicks_on_Submit_Button_Edit() throws FileNotFoundException, IOException {
		//Assert.assertTrue(fleetpage.element(By.xpath(AcceptanceSuite.props.getProperty("FleetsAdd"))).isCurrentlyVisible());
		
	}
	
	
	@Given ("The user is on Message Group page to Delete")
	public void UserIsOnMessageGroupsPage(){
		
	}
	
	@When ("The user clicks on Delete Action button corresponding to the Message Group record")
	public void deleteMessageGroup() throws InterruptedException{
		messageGroup.messagegroupDelete();
	}
	
	@Then ("Corresponding Message Group Record should get deleted")
	public void MessageGroupsShouldBeDeleted(){
		
	}
	
	
	
	
	
	
	@Given("The user is on Message Groups page to check invalid combinations")
	public void TheUserIsOnMessageGroupsPageToCheckInvalidCombinations() throws InterruptedException {
		homePage.openPage();
		homePage.getDriver().manage().window().maximize();
		messageGroup.clickOnLoginButton();
		messageGroup.messageGroupHeader();

	}

	@When("The User enters invalid (Enterprise, GroupName) combinations in message groups create popup and clicks on submit button $table")
	public void TheUserEntersInvalidCombinationsInMessageGroupsCreatePopupAndClicksOnSubmitButton(ExamplesTable table)
			throws InterruptedException {
		for (Map<String, String> row : table.getRows()) {
			messageGroup.invalidCombinationsAdd(row.get("Enterprise"), row.get("GroupName"));
		}
	}

	@Then("Appropriate validation message should get displayed for Message Groups")
	public void AppropriateValidationMessageShouldGetDisplayedForMessageGroups() {

	}
	
	
	@Given ("The user is on Message Groups Edit page to check invalid combinations")
	public void TheUserIsOnMessageGroupsEditPageToCheckInvalidCombinations() throws InterruptedException {
		homePage.openPage();
		homePage.getDriver().manage().window().maximize();
		messageGroup.clickOnLoginButton();
		messageGroup.invalidCombinationsEditHeader();
	}
	
	@When ("The User enters invalid (GroupName) combinations in message groups Edit popup and clicks on submit button $table")
	public void TheUserEntersInvalidCombinationsInMessageGroupsEditPopupAndClicksOnSubmitButton(ExamplesTable table) throws InterruptedException{
		for (Map<String, String> row : table.getRows()) {
			messageGroup.invalidCombinationsEdit(row.get("GroupName"));
		}
		
		
	}
	
	@Then ("Appropriate validation message should get displayed for Message Group edit page")
	public void AppropriateValidationMessageShouldGetDisplayedForMessageGroupEditPage(){
		
	}
	
	
	
	
	
	
  
}

