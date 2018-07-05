package com.srisys.serenity.steps;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.srisys.serenity.pages.IndNavEnterpriseResourcespage;
import com.srisys.serenity.pages.IndNavEnterprisespage;
import com.srisys.serenity.pages.IndNavEventsRegistrationspage;
import com.srisys.serenity.pages.IndNavEventspage;
import com.srisys.serenity.pages.IndNavFleetTypeAttributesPage;
import com.srisys.serenity.pages.IndNavFleeteReservationspage;
import com.srisys.serenity.pages.IndNavFleetpage;
import com.srisys.serenity.pages.IndNavFunfactspage;
import com.srisys.serenity.pages.IndNavLoginpage;
import com.srisys.serenity.pages.UsersPage;

import net.thucydides.core.steps.ScenarioSteps;

public class AdvancedSearchSteps extends ScenarioSteps{
	
	IndNavFunfactspage funfacts;
	IndNavLoginpage homePage;
	IndNavEventsRegistrationspage registration;
	IndNavEventspage eventspage;
	IndNavEnterprisespage enterprisespage;
	IndNavFleeteReservationspage FleetReservations;
	IndNavFleetTypeAttributesPage fleetTypeAttributes;
	IndNavFleetpage fleetpage;
	IndNavEnterpriseResourcespage resourcepage;
	UsersPage users;
	
	//----Event Registration steps for advance search-----

	@Given ("The User is on EventsRegistration Search Pop Up")
		public void EventRegistration_TheUserisoEventsRegistrationSearchPopUp() throws InterruptedException{
			homePage.openPage();	
			homePage.getDriver().manage().window().maximize();
			homePage.clickOnLoginButton();		
		}
		
		@When ("The User Enters EventsRegistration data Search data and Clicks on Submit Up Button")
		public void Event_RegistrationTheUserEntersEventsRegistrationdataSearchdataandClicksonSubmitUpButton() throws InterruptedException{
			
			//registration.eventRegistrationDelete();
			//eventspage.eventDelete();
			registration.eventRegistrationAdvanceSearch();
			
			
		}
		
		@Then ("Appropriates EventsRegistration search record should be Displayed in the listing")
		public void EventRegistration_AppropriatesEventsRegistrationsearchrecordshouldbeDisplayedinthelisting(){
			
		}

	//Events steps for advance search-----

	@Given("The User is on Events Search Pop Up")
		public void TheUserisonEventsSearchPopUp() throws InterruptedException {
			homePage.openPage();	
			homePage.getDriver().manage().window().maximize();
			homePage.clickOnLoginButton();
			
		}
		 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
		@When("The User Enters valid search Event data and Clicks on Submit Button")
		public void TheUserEntersEventsdataSearchdataandClicksonSubmitUpButton() throws InterruptedException {
			eventspage.eventAdvancesearch();
			
			
		}
		@Then("appropriate Events list should be displayed in the listing")
		public void AppropriatesEventsearchrecordshouldbeDisplayedinthelisting() throws FileNotFoundException, IOException {
			//Assert.assertTrue(lookupspage.element(By.xpath(AcceptanceSuite.props.getProperty("lookupsAdd"))).isCurrentlyVisible());
		}

	//Enterprises steps for advance search-----

	

	


	//----Fleets steps for advance search-----

	
	
	
	//----Funfacts steps for advance search-----

	@Given("The User is on Fun facts page to Search")
			public void TheUserisonFunfactsSearchPopUp() throws InterruptedException {
				//homePage.openPage();	
				//homePage.getDriver().manage().window().maximize();
				//homePage.clickOnLoginButton();
				
			}
			 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
			@When("The User enters valid Fun facts data Search and Clicks on Submit Button")
			public void TheUserEntersValidFunfactsdataSearchandClicksonSubmitUpButton() throws InterruptedException {
				funfacts.funAdvancesearch();
				
				
			}
			@Then("Appropriate Fun facts search results should be displayed in the listing")
			public void AppropriatesFunfactssearchshouldbeDisplayedinthelisting() throws FileNotFoundException, IOException {
				//Assert.assertTrue(fleetpage.element(By.xpath(AcceptanceSuite.props.getProperty("FleetsAdd"))).isCurrentlyVisible());
				
			
		}
	//----Users steps for advance search-----

	   @Given ("The User is on Users Search Pop Up")
			public void TheUserisonUsersSearchPopUp() throws InterruptedException{
			   //users.openPage();
			  // users.clickOnLoginButton();
			}
			
			@When ("The User Enters Valid Users data advanceSearch and Clicks on Submit Up Button")
			public void TheUserEntersValidUsersdataadvanceSearchandClicksonSubmitUpButton() throws InterruptedException{
				users.UsersAdvanceSearch();
				//billPaymentHistoryPage.billPaymentHistoryDelete();
			}
			
			@Then ("Appropriates User(s) should be displayed in the listing as per the search criteria")
			public void AppropriatesUserssearchshouldbeDisplayedinthelisting(){
				
			}

	//----FleetTypeAttributes steps for advance search-----(note  :add in loginsteps page)


	@Given ("The User is on Fleet Type Attributes Search Pop Up")
		public void TheUserisonFleetTypeAttributesSearchPopUp() throws InterruptedException{
			//OpenAndLogin();
		}
		
		@When ("The User Enters valid search Fleet Type Attributes data and Clicks on Submit Button")
		public void TheUserEntersValidFleetTypeAttributessearchdataandClicksonSubmitUpButton() throws InterruptedException{
			fleetTypeAttributes.fleetTypeAttributesAdvanced();
			//billPaymentHistoryPage.billPaymentHistoryDelete();
		}
		
		@Then ("Appropriate Fleet Type Attributes search data should be displayed in the listing")
		public void AppropriatesFleetTypeAttributessearchdatashouldbeDisplayedinthelisting(){
			
		}
		

	//----EnterpriseResources steps for advance search-----(note  :add in loginsteps page)


	@Given ("The User is on Enterprise Resources Search Pop Up")
		public void EntResources_TheUserisonEnterpriseResourcesSearchPopUp() throws InterruptedException{
			//OpenAndLogin();
		}
		
		@When ("The User Enters Valid data of an existing Enterprise Resource and Clicks on Submit button")
		public void TheUserEntersValidEnterpriseResourcesdataSearchandClicksonSubmitUpButton() throws InterruptedException{
			resourcepage.EnterpriseResourcesAdvanceSearch();
			//billPaymentHistoryPage.billPaymentHistoryDelete();
		}
		
		@Then ("appropriate Enterprise Resource(s) should be displayed in the listing as per the search criteria")
		public void AppropriatesEnterpriseResourcessearchshouldbeDisplayedinthelisting(){
			
		}
		
		public void OpenAndLogin() throws InterruptedException{
			homePage.openPage();	
			homePage.getDriver().manage().window().maximize();
			homePage.clickOnLoginButton();
		}


}
