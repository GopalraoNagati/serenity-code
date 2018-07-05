package com.srisys.serenity.steps;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.srisys.serenity.AcceptanceSuite;
import com.srisys.serenity.pages.IndNavContractDetailspage;
import com.srisys.serenity.pages.IndNavEnterpriseResourcespage;
import com.srisys.serenity.pages.IndNavEventsRegistrationspage;
import com.srisys.serenity.pages.IndNavEventspage;
import com.srisys.serenity.pages.IndNavFleetpage;
import com.srisys.serenity.pages.IndNavFunfactspage;
import com.srisys.serenity.pages.IndNavLoginpage;
import com.srisys.serenity.pages.IndNavLookupspage;
import com.srisys.serenity.pages.IndNavUserspage;

import net.thucydides.core.steps.ScenarioSteps;

public class ContractDetailsStepsINDNav extends ScenarioSteps{

	IndNavLoginpage homePage;
	IndNavEnterpriseResourcespage resourcepage;
	IndNavFleetpage fleetpage;
	IndNavUserspage usesrpage;
	IndNavLookupspage lookupspage;
	IndNavEventspage eventspage;
	
	WebElement facebookElem;
	IndNavEventsRegistrationspage registration;
	IndNavFunfactspage funfacts;
	IndNavContractDetailspage contractDetails;
	WebElement loginButtonElem;
	WebElement usernameElem;
	WebElement passwordElem;
	WebElement submitButtonElem;
	//PigeonContractDetailsPages ContractDetailsElem;
		
	

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
		@Given("The Super Admin User is on Contract Details page")
		public void TheUserIsOnFunfactsCreationPopUp() throws InterruptedException {
			homePage.openPage();	
			homePage.getDriver().manage().window().maximize();
			homePage.clickOnLoginButton();
			
		}
		 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
		@When("The User clicks on Create Contract Details button and Enters valid data in the popup and Clicks on Submit Button")
		public void TheUserIsOnFunfactsCreationPopUpClicksonSignUpButton() throws InterruptedException {
			contractDetails.contractDetailsCreate();
		}
		
		@Then("Contract Details Record should be created and should be displayed in the listing")
		public void AppropriatesFunfactshouldbeDisplayedinthelisting() throws FileNotFoundException, IOException {
			//Assert.assertTrue(fleetpage.element(By.xpath(AcceptanceSuite.props.getProperty("FleetsAdd"))).isCurrentlyVisible());
			
		}
		
		@Given("The Super Admin User is on Contract Details page to Edit")
		public void The_User_is_on_Funfacts_Edit_Pop_Up() throws InterruptedException {
			//homePage.openPage();	
			//homePage.getDriver().manage().window().maximize();
			//homePage.clickOnLoginButton();
			
		}
		 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
		@When("The User clicks on Edit button and modifies Contract Details data in the popup and Clicks on Submit Button")
		public void The_User_Enters_Valid_FunfactsEdit_data_and_Clicks_on_Submit_Button() throws InterruptedException {
			contractDetails.contractDetailsEdit();
			
			
		}
		@Then("Contract Details Record should be updated and should be displayed in the listing")
		public void The_User_Enters_Valid_FunfactsEdit_data_and_Clicks_on_Submit_Button_Edit() throws FileNotFoundException, IOException {
			//Assert.assertTrue(fleetpage.element(By.xpath(AcceptanceSuite.props.getProperty("FleetsAdd"))).isCurrentlyVisible());
			
		}
		
		@Given("The User is on Contract Details page to View")
		public void The_User_is_on_Funfacts_View_Pop_Up() throws InterruptedException {
			homePage.openPage();	
			homePage.getDriver().manage().window().maximize();
			homePage.clickOnLoginButton();
			
		}
		 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
		@When("The User clicks on View button of any specific Contract Details record")
		public void The_User_Enters_Valid_FunfactsView_data_and_Clicks_on_Submit_Button() throws InterruptedException {
			contractDetails.contractDetailsView();
			
			
		}
		@Then("Contract Details Record specific details should be displayed in the popup")
		public void The_User_Enters_Valid_FunfactsView_data_and_Clicks_on_Submit_Button_Edit() throws FileNotFoundException, IOException {
			//Assert.assertTrue(fleetpage.element(By.xpath(AcceptanceSuite.props.getProperty("FleetsAdd"))).isCurrentlyVisible());
			
		}
		
		
		@Given("The Admin User is on Contract Details page to Delete")
		public void The_User_is_on_Funfacts_Delete_Pop_Up() throws InterruptedException {
			//homePage.openPage();	
			//homePage.getDriver().manage().window().maximize();
			//homePage.clickOnLoginButton();
			
		}
		 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
		@When("The User clicks on Delete button of any specific Contract Details record")
		public void The_User_Enters_Valid_FunfactsDelete_data_and_Clicks_on_Submit_Button() throws InterruptedException {
			contractDetails.contractDetailsDelete();
			
			
		}
		@Then("That specific Contract Details record should be deleted from the list")
		public void The_User_Enters_Valid_FunfactsDelete_data_and_Clicks_on_Submit_Button_Edit() throws FileNotFoundException, IOException {
			//Assert.assertTrue(fleetpage.element(By.xpath(AcceptanceSuite.props.getProperty("FleetsAdd"))).isCurrentlyVisible());
			
		
	}
		
		
		@Given("The User is on Contract Details page to Search")
		public void TheUserisonFunfactsSearchPopUp() throws InterruptedException {
			//homePage.openPage();	
			//homePage.getDriver().manage().window().maximize();
			//homePage.clickOnLoginButton();
			
		}
		 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
		@When("The User enters valid Contract Details record Search data and Clicks on Submit Button")
		public void TheUserEntersValidFunfactsdataSearchandClicksonSubmitUpButton() throws InterruptedException {
			contractDetails.contractDetailssearch();
			
			
		}
		@Then("Appropriate search results should be displayed in the Contract Details listing")
		public void AppropriatesFunfactssearchshouldbeDisplayedinthelisting() throws FileNotFoundException, IOException {
			//Assert.assertTrue(fleetpage.element(By.xpath(AcceptanceSuite.props.getProperty("FleetsAdd"))).isCurrentlyVisible());
			
		
	}
		
		
		
		@Given("The User is on Contract Details page Delete popup to check Delete Dependency")
		public void TheUserIsOnContractDetailsPageDeletePopupToCheckDeleteDependency() throws FileNotFoundException, IOException, InterruptedException{
			homePage.openPage();	
			contractDetails.getDriver().manage().window().maximize();
			homePage.clickOnLoginButton();
			
		}
		
		@When("The User clicks on Delete button in contract details delete popup")
		public void TheUserClicksOnDeleteButtonInContractDetailsDeletePopup() throws InterruptedException{
			contractDetails.contractDetailsDeleteNegative();
		}
		
		
		@Then("Appropriate validation message should be displayed on Contract Details page Delete popup")
		public void AppropriatevalidationmessageshouldbedisplayedonContractDetailspageDeletepopup() throws FileNotFoundException, IOException {
			//Assert.assertTrue(fleetpage.element(By.xpath(AcceptanceSuite.props.getProperty("FleetsAdd"))).isCurrentlyVisible());
			
		
	}
	
	
	
  
}

