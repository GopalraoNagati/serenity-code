package com.srisys.serenity.steps;

import java.awt.AWTException;
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
import com.srisys.serenity.pages.IndNavContractDetailspage;
import com.srisys.serenity.pages.IndNavEnterpriseResourcespage;
import com.srisys.serenity.pages.IndNavEventsRegistrationspage;
import com.srisys.serenity.pages.IndNavEventspage;
import com.srisys.serenity.pages.IndNavFleetpage;
import com.srisys.serenity.pages.IndNavFunfactspage;
import com.srisys.serenity.pages.IndNavLoginpage;
import com.srisys.serenity.pages.IndNavLookupspage;
import com.srisys.serenity.pages.IndNavStaticContentDetailspage;
import com.srisys.serenity.pages.IndNavUserspage;

import net.thucydides.core.steps.ScenarioSteps;

public class StaticContentDetailsStepsINDNav extends ScenarioSteps{

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
		@Given("The Admin User is on Static Content page")
		public void TheUserIsOnFunfactsCreationPopUp() throws InterruptedException {
			homePage.openPage();	
			homePage.getDriver().manage().window().maximize();
			homePage.clickOnLoginButton();
			
		}
		 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
		@When("The User clicks on Create Static Content button and Enters valid data in the popup and Clicks on Submit Button")	
		public void TheUserIsOnFunfactsCreationPopUpClicksonSignUpButton() throws InterruptedException, AWTException {
			statiDetails.staticDetailsCreate();
		}
		
		@Then("Static Content Record should be created and should be displayed in the listing")
		public void AppropriatesFunfactshouldbeDisplayedinthelisting() throws FileNotFoundException, IOException {
			//Assert.assertTrue(fleetpage.element(By.xpath(AcceptanceSuite.props.getProperty("FleetsAdd"))).isCurrentlyVisible());
			
		}
		
		@Given("The Admin User is on Static Content page to Edit")
		public void The_User_is_on_Funfacts_Edit_Pop_Up() throws InterruptedException {
			//homePage.openPage();	
			//homePage.getDriver().manage().window().maximize();
			//homePage.clickOnLoginButton();
			
		}
		 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
		@When("The User clicks on Edit button and modifies Static Content data in the popup and Clicks on Submit Button")
		public void The_User_Enters_Valid_FunfactsEdit_data_and_Clicks_on_Submit_Button() throws InterruptedException {
		statiDetails.statiDetailsEdit();
		}
		
		@Then("Static Content Record should be updated and should be displayed in the listing")
		public void The_User_Enters_Valid_FunfactsEdit_data_and_Clicks_on_Submit_Button_Edit() throws FileNotFoundException, IOException {
			//Assert.assertTrue(fleetpage.element(By.xpath(AcceptanceSuite.props.getProperty("FleetsAdd"))).isCurrentlyVisible());
			
		}
		
		@Given("The User is on Static Content page to View")
		public void The_User_is_on_Funfacts_View_Pop_Up() throws InterruptedException {
			//homePage.openPage();	
			//homePage.getDriver().manage().window().maximize();
			//homePage.clickOnLoginButton();
			
		}
		 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
		@When("The User clicks on View button of any specific Static Content record")
		public void The_User_Enters_Valid_FunfactsView_data_and_Clicks_on_Submit_Button() throws InterruptedException {
			statiDetails.statiDetailsView();
			
			
		}
		@Then("Static Content Record specific details should be displayed in the popup")
		public void The_User_Enters_Valid_FunfactsView_data_and_Clicks_on_Submit_Button_Edit() throws FileNotFoundException, IOException {
			//Assert.assertTrue(fleetpage.element(By.xpath(AcceptanceSuite.props.getProperty("FleetsAdd"))).isCurrentlyVisible());
			
		}
		
		
		@Given("The Admin User is on Static Content page to Delete")
		public void The_User_is_on_Funfacts_Delete_Pop_Up() throws InterruptedException {
			//homePage.openPage();	
			//homePage.getDriver().manage().window().maximize();
			//homePage.clickOnLoginButton();
			
		}
		 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
		@When("The User clicks on Delete button of any specific Static Content record")
		public void The_User_Enters_Valid_FunfactsDelete_data_and_Clicks_on_Submit_Button() throws InterruptedException {
			statiDetails.statiDetailsDelete();
			
			
		}
		@Then("That specific Static Content record should be deleted from the list")
		public void The_User_Enters_Valid_FunfactsDelete_data_and_Clicks_on_Submit_Button_Edit() throws FileNotFoundException, IOException {
			//Assert.assertTrue(fleetpage.element(By.xpath(AcceptanceSuite.props.getProperty("FleetsAdd"))).isCurrentlyVisible());
			
		
	}
		
		
		@Given("The User is on Static Content page to Search")
		public void TheUserisonFunfactsSearchPopUp() throws InterruptedException {
			//homePage.openPage();	
			//homePage.getDriver().manage().window().maximize();
			//homePage.clickOnLoginButton();
			
		}
		 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
		@When("The User enters valid Static Content record Search data and Clicks on Submit Button")
		public void TheUserEntersValidFunfactsdataSearchandClicksonSubmitUpButton() throws InterruptedException {
			statiDetails.statiDetailssearch();
			
			
		}
		@Then("Appropriate search results should be displayed in the Static Content listing")
		public void AppropriatesFunfactssearchshouldbeDisplayedinthelisting() throws FileNotFoundException, IOException {
			//Assert.assertTrue(fleetpage.element(By.xpath(AcceptanceSuite.props.getProperty("FleetsAdd"))).isCurrentlyVisible());
			
		
	}
		
		
		
		
		
		
		
		
		
		
		@Given("The user is on Static Content create popup to check invalid combinations")
		public void TheuserisonStaticContentcreatepopuptocheckinvalidcombinations() throws InterruptedException, AWTException {
			homePage.openPage();	
			homePage.getDriver().manage().window().maximize();
			homePage.clickOnLoginButton();
			statiDetails.ValidationsHeader();
			
		}
		 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
		@When("The User enters invalid combinations(Enterprise,Fleet,MenuName,Type,page,ImageName) in Static Content create popup and clicks on submit button $table")
		public void TheUserEntersValidStaticContentcreatepopupandclicksonsubmitbutton(ExamplesTable table) throws InterruptedException, AWTException {
               for (Map<String, String> row : table.getRows()) {
				//statiDetails.ValidationsAdd(row.get("Enterprise"),row.get("Fleet"),row.get("ImageName"),row.get("MenuName"),row.get("Type"));
				statiDetails.ValidationsAdd(row.get("Enterprise"),row.get("Fleet"),row.get("MenuName"),row.get("Type"),row.get("page"),row.get("ImageName"));
			
				//Serenity.setSessionVariable("result").to("fail");
				Thread.sleep(2000);
//				String actualMessage = statiDetails.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("StaticContentErrorMessage"))).getText();
//				System.out.println(",,,,,,,,,,,,,"+actualMessage);
//				
//				String expected=row.get("Expected Error Message");
//				System.out.println("++++++++++++++++++"+expected);
//			
//				Assert.assertTrue(actualMessage.equalsIgnoreCase(expected));
			}
			
			
		}
		@Then("appropriate validation message should be displayed on Static Content Create Popup")
		public void AppropriatesearchresultsshouldbedisplayedintheStaticContentlisting() throws FileNotFoundException, IOException {
			//Assert.assertTrue(fleetpage.element(By.xpath(AcceptanceSuite.props.getProperty("FleetsAdd"))).isCurrentlyVisible());
			
		
	}
		
		@Given("The user is on Static Content page edit popup  to check invalid combinations")
		public void TheuserisonStaticContentpageeditpopuptocheckinvalidcombinations() throws InterruptedException, AWTException {
			homePage.openPage();	
			homePage.getDriver().manage().window().maximize();
			homePage.clickOnLoginButton();
			//statiDetails.ValidationsHeader();
			
		}
		 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
		@When("The User enters invalid combinations in Static Content edit popup and clicks on submit button")
		public void TheUserentersinvalidcombinationsinStaticContenteditpopupandclicksonsubmitbutton() throws InterruptedException, AWTException {
               
				//statiDetails.ValidationsAdd(row.get("Enterprise"),row.get("Fleet"),row.get("ImageName"),row.get("MenuName"),row.get("Type"));
				statiDetails.ValidationsEdit();
			
				//Serenity.setSessionVariable("result").to("fail");
				Thread.sleep(2000);
//				String actualMessage = statiDetails.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("StaticContentErrorMessage"))).getText();
//				System.out.println(",,,,,,,,,,,,,"+actualMessage);
//				
//				String expected=row.get("Expected Error Message");
//				System.out.println("++++++++++++++++++"+expected);
			
				//Assert.assertTrue(actualMessage.equalsIgnoreCase(expected));
			
			
			
		}
		@Then("appropriate Static content validation message should be displayed")
		public void appropriateStaticcontentvalidationmessageshouldbedisplayed() throws FileNotFoundException, IOException {
			//Assert.assertTrue(fleetpage.element(By.xpath(AcceptanceSuite.props.getProperty("FleetsAdd"))).isCurrentlyVisible());
			
		
	}
	
	
	
  
}

