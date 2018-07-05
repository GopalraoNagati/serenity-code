package com.srisys.serenity.steps;

import java.awt.AWTException;
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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.srisys.serenity.AcceptanceSuite;
import com.srisys.serenity.pages.IndNavEnterpriseResourcespage;
import com.srisys.serenity.pages.IndNavEventsRegistrationspage;
import com.srisys.serenity.pages.IndNavEventspage;
import com.srisys.serenity.pages.IndNavFleeteReservationspage;
import com.srisys.serenity.pages.IndNavFleetpage;
import com.srisys.serenity.pages.IndNavLoginpage;
import com.srisys.serenity.pages.IndNavLookupspage;
import com.srisys.serenity.pages.IndNavUserspage;

import net.thucydides.core.steps.ScenarioSteps;

public class FleetReservationsStepsINDNav extends ScenarioSteps{

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
	IndNavFleeteReservationspage FleetReservations;
	
	WebElement FleetAdvanceElem;
	WebElement FleetsAdvanceSubmitElem;
	WebElement FleetsAdvanceButtonElem;



public void fleetReservationsAdvanced() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(2000);
		/*AdminElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Transparent"))));
		AdminElem.click();

		//Thread.sleep(2000);
		usersLinkElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistration"))));
		usersLinkElem.click();*/
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsBanner"))));
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetBanner"))));
		FleetsAdvanceButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetAdvancedSearch"))));
		FleetsAdvanceButtonElem.click();
		
		FleetAdvanceElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetReseravtionsAdvancesearch"))));

		FleetAdvanceElem.sendKeys(AcceptanceSuite.props.getProperty("EventRegistrationEventInputData"));
		//Thread.sleep(1000);
		FleetsAdvanceSubmitElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistrationsubmitButton"))));
		FleetsAdvanceSubmitElem.click();
		//Thread.sleep(2000);
		

}
	
	
	
	
	
	@Given("The User is on Fleet Reservations page")
	public void TheUserIsOnEventsCreationPopUp() throws InterruptedException {
		Thread.sleep(2000);
		homePage.openPage();	
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		
	}
	 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
	@When("The User clicks on Direct Create button and Enters valid Fleet Reservation data and clicks on Submit Button")
	
	
	public void TheUserIsOnEventsCreationPopUpClicksonSignUpButton() throws InterruptedException, ParseException {
		FleetReservations.reseravtionsCreate();
		
		
	}
	@Then("Fleet Reservation should be created and display in the listing")
	public void AppropriatesEventsshouldbeDisplayedinthelisting() throws FileNotFoundException, IOException {
		//Assert.assertTrue(lookupspage.element(By.xpath(AcceptanceSuite.props.getProperty("lookupsAdd"))).isCurrentlyVisible());
		
	}
	@Given("The User is on Fleet Reservations Edit page")
	public void TheUserIsOnEventsEditPopUp() throws InterruptedException {
		//homePage.openPage();	
		//homePage.getDriver().manage().window().maximize();
		//homePage.clickOnLoginButton();
		
	}
	 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
	@When("The User clicks on Edit button and modifies the Fleet Reservation data and clicks on Submit button")
	
	
	public void TheUserIsOnEventsEditPopUpClicksonSignUpButton() throws InterruptedException {
		FleetReservations.eventsEdit();
		
		
	}
	@Then("Fleet Reservation of the user should get updated and should be displayed in the listing")
	public void AppropriatesEventEditsshouldbeDisplayedinthelisting() throws FileNotFoundException, IOException {
		//Assert.assertTrue(lookupspage.element(By.xpath(AcceptanceSuite.props.getProperty("lookupsAdd"))).isCurrentlyVisible());
		
	}
	
	@Given("The User is on Fleet Reservations Check-In page")
	public void TheUserIsOnEventsViewPopUp() throws InterruptedException {
		//homePage.openPage();	
		//homePage.getDriver().manage().window().maximize();
		//homePage.clickOnLoginButton();
		homePage.getDriver().navigate().refresh();

		
	}
	 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
	@When("The User clicks on Check-In button of a Record and verifies the Fleet reservation details in the popup and then clicks on Check-In button in popup")
	
	
	public void TheUserIsOnEventsViewPopUpClicksonSignUpButton() throws InterruptedException {
		FleetReservations.fleetReservationsCheckIn();
		
		
	}
	@Then("User should be able to Check-In successfully and the reservation status should be updated in the listing")
	public void AppropriatesEventViewsshouldbeDisplayedinthelisting() throws FileNotFoundException, IOException {
		//Assert.assertTrue(lookupspage.element(By.xpath(AcceptanceSuite.props.getProperty("lookupsAdd"))).isCurrentlyVisible());
		
	}
	
	@Given("The User is on Fleet Reservations Check-Out page")
	public void TheUserIsOnEventsCheckInPopUp() throws InterruptedException {
		//homePage.openPage();	
		//homePage.getDriver().manage().window().maximize();
		//homePage.clickOnLoginButton();
				
	}
	 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
	@When("The User clicks on Check-Out button of a Record and verifies the Fleet reservation details in the popup and then clicks on Check-Out button in popup")
	
	
	public void TheUserIsOnEventsCheckInPopUpClicksonSignUpButton() throws InterruptedException {
		FleetReservations.fleetReservationsCheckOut();
		
		
	}
	@Then("User should be able to Check-Out successfully and the reservation status should be updated in the listing")
	public void AppropriatesEventChecKInshouldbeDisplayedinthelisting() throws FileNotFoundException, IOException {
		//Assert.assertTrue(lookupspage.element(By.xpath(AcceptanceSuite.props.getProperty("lookupsAdd"))).isCurrentlyVisible());
		
	}
	
	@Given("The User is on Fleet Reservation Delete page")
	public void TheUserIsOnEventsCheckOutPopUp() throws InterruptedException {
		//homePage.openPage();	
		//homePage.getDriver().manage().window().maximize();
		//homePage.clickOnLoginButton();
		
	}
	 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
	@When("The User clicks on Delete button of any specific record")
	
	
	public void TheUserIsOnEventsCheckOutPopUpClicksonSignUpButton() throws InterruptedException {
		FleetReservations.fleetReservationsDelete();
		
		
	}
	@Then("The Fleet Reservation delete popup should display and by clicking on delete button in the popup, the record should get deleted from the listing")
	public void AppropriatesEventChecKOutshouldbeDisplayedinthelisting() throws FileNotFoundException, IOException {
		//Assert.assertTrue(lookupspage.element(By.xpath(AcceptanceSuite.props.getProperty("lookupsAdd"))).isCurrentlyVisible());
		
	}
	
	@Given("The User is on Fleet Reservations Extend page")
	public void FleetReservationsDeletePopUp() throws InterruptedException {
		//homePage.openPage();	
		//homePage.getDriver().manage().window().maximize();
		//homePage.clickOnLoginButton();
		
	}
	 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
	@When("The User clicks on Extend button of a Record and increases the total duration in the Fleet reservation popup and then clicks on Extend button in popup")
	
	
	public void UserEntersFleetReservationsclicksonDeleteButton() throws InterruptedException {
		FleetReservations.fleetReservationsExtend();
		
		
	}
	@Then("User should be able to extend the reservation and the listing should be updated")
	public void FleetReservationsDeletedshouldbedisplayedinthelisting() throws FileNotFoundException, IOException {
		//Assert.assertTrue(lookupspage.element(By.xpath(AcceptanceSuite.props.getProperty("lookupsAdd"))).isCurrentlyVisible());
		
	}
	
	
	@Given("The User is on Fleet Reservations Cancel page")
	public void TheUserisonFleetReservationsCancelPopUp() throws InterruptedException {
		//homePage.openPage();	
		//homePage.getDriver().manage().window().maximize();
		//homePage.clickOnLoginButton();
		
	}
	 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
	@When("The User clicks on Cancel button of a Record and verifies the Fleet reservation details in the popup and then clicks on Cancel button in popup")
	
	
	public void TheUserEntersFleetReservationsclicksonCancelButton() throws InterruptedException {
		FleetReservations.fleetReservationsCancel();
		
		
	}
	@Then("User should be able to Cancel the reservation and the status should be updated in the listing")
	public void FleetReservationsCanceledshouldbedisplayedinthelisting() throws FileNotFoundException, IOException {
		//Assert.assertTrue(lookupspage.element(By.xpath(AcceptanceSuite.props.getProperty("lookupsAdd"))).isCurrentlyVisible());
		
	}
	
	
	//----FleetReservations steps for advance search-----
		@Given("The User is on Fleets Reservations Search Pop Up")
			public void TheUserisonFleetReservationsSearchPopUp() throws InterruptedException {
				//homePage.openPage();	
				//homePage.getDriver().manage().window().maximize();
				//homePage.clickOnLoginButton();
				
			}
			 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
			@When("The User Enters valid search data and Clicks on Submit Button")
			
			
			public void TheUserEntersFleetReservationsdataSearchdataandClicksonSubmitUpButton() throws InterruptedException {
				FleetReservations.fleetReservationsAdvanced();
				
				
			}
			@Then("Appropriate Fleets Reservation search data should be displayed in the listing")
			public void AppropriatesFleetReservationssearchrecordshouldbeDisplayedinthelisting() throws FileNotFoundException, IOException {
				//Assert.assertTrue(lookupspage.element(By.xpath(AcceptanceSuite.props.getProperty("lookupsAdd"))).isCurrentlyVisible());
				
			}
	
	/*
	@Given("The User is on FleetReservations Search Pop Up")
	public void TheUserisonFleetReservationsSearchPopUp() throws InterruptedException {
		homePage.openPage();	
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		
	}
	 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
	@When("The User Enters FleetReservations data Search data and Clicks on Submit Up Button")
	
	
	public void TheUserEntersFleetReservationsdataSearchdataandClicksonSubmitUpButton() throws InterruptedException {
		FleetReservations.fleetReservationsAdvanced();
		
		
	}
	@Then("Appropriates FleetReservations search record should be Displayed in the listing")
	public void AppropriatesFleetReservationssearchrecordshouldbeDisplayedinthelisting() throws FileNotFoundException, IOException {
		//Assert.assertTrue(lookupspage.element(By.xpath(AcceptanceSuite.props.getProperty("lookupsAdd"))).isCurrentlyVisible());
		
	}
	
	*/
	
	
	
			@Given("The User is on Fleet Reservations View page")
			public void TheUserisonFleetReservationsViewpage() throws InterruptedException {
				//homePage.openPage();	
				//homePage.getDriver().manage().window().maximize();
				//homePage.clickOnLoginButton();
				
			}
			 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
			@When("The User clicks on Fleet Reservations View button of any specific record")
			
			
			public void TheUserclicksonFleetReservationsViewbuttonofanyspecificrecord() throws InterruptedException {
				FleetReservations.fleetReservationsView();
				
				
			}
			@Then("Fleet Reservations details should get displayed in the popup")
			public void FleetReservationsdetailsshouldgetdisplayedinthepopup() throws FileNotFoundException, IOException {
				//Assert.assertTrue(lookupspage.element(By.xpath(AcceptanceSuite.props.getProperty("lookupsAdd"))).isCurrentlyVisible());
				
			}
	
			@Given("The User is on Guided Create Fleet Reservations page")
			public void TheUserisonGuidedCreateFleetReservationspage() throws InterruptedException {
				homePage.openPage();	
				homePage.getDriver().manage().window().maximize();
				homePage.clickOnLoginButton();
				
			}
			
			 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
			@When("The User clicks on Guided Create button and Enters valid data and clicks on Submit Button and selects the required available fleet and clicks on Submit and completes the reservation process through Direct Create popup")
			public void TheUserclicksonGuidedCreatebuttonandEntersvaliddataandclicksonSubmitButton() throws InterruptedException, ParseException {
				FleetReservations.fleetReservationsGuidedCreate();
			}
			
			
			@Then("Fleet Reservation should be Guided created and display in the listing")
			public void FleetReservationshouldbecreatedanddisplayinthelisting() throws FileNotFoundException, IOException {
				//Assert.assertTrue(lookupspage.element(By.xpath(AcceptanceSuite.props.getProperty("lookupsAdd"))).isCurrentlyVisible());
				
			}
			
			
			@Given("The User is on Fleet Reservations Advanced Search page")
			public void TheUserisonFleetReservationsAdvancedSearchpage() throws InterruptedException {
				homePage.openPage();	
				homePage.getDriver().manage().window().maximize();
				homePage.clickOnLoginButton();
				
			}
			
			 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
			@When("The User Enters Fleet Reservations Search invaild data and Clicks on Submit Button")
			public void TheUserEntersFleetReservationsSearchinvailddataandClicksonSubmitButton() throws InterruptedException, ParseException {
				FleetReservations.fleetReservationsAdvanceddata();
			}
			
			
			@Then("Appropriate Fleet Reservations Vaidations should be displayed on  Advanced Search page")
			public void FleetReservationshouldbeGuidedcreatedanddisplayinthelisting() throws FileNotFoundException, IOException {
				//Assert.assertTrue(lookupspage.element(By.xpath(AcceptanceSuite.props.getProperty("lookupsAdd"))).isCurrentlyVisible());
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			@Given("The user is on Fleet Reservations create popup to check invalid combinations")
			public void TheuserisonStaticContentpageeditpopuptocheckinvalidcombinations() throws InterruptedException, AWTException {
				homePage.openPage();	
				homePage.getDriver().manage().window().maximize();
				homePage.clickOnLoginButton();
				FleetReservations.ValidationsAddHeader();
				
			}
			 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
			@When("The User enters invalid combinations(Enterprise,Fleet,StartDate,EndDate) in Fleet Reservations create popup and clicks on submit button $table")
			public void TheUserentersinvalidcombinationsinStaticContenteditpopupandclicksonsubmitbutton(ExamplesTable table) throws InterruptedException, AWTException, ParseException {
	               
					//statiDetails.ValidationsAdd(row.get("Enterprise"),row.get("Fleet"),row.get("ImageName"),row.get("MenuName"),row.get("Type"));
				for (Map<String, String> row : table.getRows()) {
					//statiDetails.ValidationsAdd(row.get("Enterprise"),row.get("Fleet"),row.get("ImageName"),row.get("MenuName"),row.get("Type"));
					FleetReservations.ValidationsAddReservations(row.get("Enterprise"),row.get("Fleet"),row.get("StartDate"),row.get("EndDate"));
				
					//Serenity.setSessionVariable("result").to("fail");
					Thread.sleep(2000);
					String actualMessage = FleetReservations.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("fleetreservationsErrormessge"))).getText();
					System.out.println(",,,,,,,,,,,,,"+actualMessage);
					
					String expected=row.get("Expected Error Message");
					System.out.println("++++++++++++++++++"+expected);
				
					Assert.assertTrue(actualMessage.equalsIgnoreCase(expected));
				}
				
				
				
			}
			@Then("appropriate validation message should be displayed on Fleet Reservations Create Popup")
			public void appropriateStaticcontentvalidationmessageshouldbedisplayed() throws FileNotFoundException, IOException {
				//Assert.assertTrue(fleetpage.element(By.xpath(AcceptanceSuite.props.getProperty("FleetsAdd"))).isCurrentlyVisible());
				
			
		}
			
			@Given("The user is on Fleet Reservations CheckIn popup to check In invalid combinations")
			public void TheuserisonFleetReservationsCheckInpopuptocheckIninvalidcombinations() throws InterruptedException {
				homePage.openPage();	
				homePage.getDriver().manage().window().maximize();
				homePage.clickOnLoginButton();
				
			}
			
			 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
			@When("The User enters invalid combinations in Fleet Reservations check In popup and clicks on submit button")
			public void TheUserentersinvalidcombinationsinFleetReservationscheckInpopupandclicksonsubmitbutton() throws InterruptedException, ParseException {
				FleetReservations.fleetReservationsCheckdIn();
			}
			
			
			@Then("appropriate validation message should be displayed on Fleet Reservations CheckIn Popup")
			public void appropriatevalidationmessageshouldbedisplayedonFleetReservationsCheckInPopup() throws FileNotFoundException, IOException {
				//Assert.assertTrue(lookupspage.element(By.xpath(AcceptanceSuite.props.getProperty("lookupsAdd"))).isCurrentlyVisible());
				
			}
			
			@Given("The user is on Fleet Reservations cancel invalid combinations")
			public void TheuserisonFleetReservationsCancelpopuptocancelinvalidcombinations() throws InterruptedException {
				homePage.openPage();	
				homePage.getDriver().manage().window().maximize();
				homePage.clickOnLoginButton();
				
			}
			
			 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
			@When("The User enters invalid combinations in Fleet Reservations cancel popup and clicks on submit button")
			public void TheUserentersinvalidcombinationsinFleetReservationscheckIpopupandclicksonsubmitbutton() throws InterruptedException, ParseException {
				FleetReservations.fleetReservationsinvalidCancel();
			}
			
			
			@Then("appropriate validation message should be displayed on Fleet Reservations Cancel Popup")
			public void appropriatevalidationmessageshouldbedisplayedonFleetReservationsCancelPopup() throws FileNotFoundException, IOException {
				//Assert.assertTrue(lookupspage.element(By.xpath(AcceptanceSuite.props.getProperty("lookupsAdd"))).isCurrentlyVisible());
				
			}
			
			
			@Given("The user is on Fleet Reservations Extend popup to Extend invalid combinations")
			public void TheuserisonFleetReservationsExtendpopuptocancelinvalidcombinations() throws InterruptedException {
				homePage.openPage();	
				homePage.getDriver().manage().window().maximize();
				homePage.clickOnLoginButton();
				
			}
			
			 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
			@When("The User enters invalid combinations in Fleet Reservations Extend popup and clicks on submit button")
			public void TheUserentersinvalidcombinationsinFleetReservationscancelpopupandclicksonsubmitbutton() throws InterruptedException, ParseException {
				FleetReservations.fleetReservationsinvalidExtend();
			}
			
			
			@Then("appropriate validation message should be displayed on Fleet Reservations Extend Popup")
			public void appropriatevalidationmessageshouldbedisplayedonFleetReservationsExtendPopup() throws FileNotFoundException, IOException {
				//Assert.assertTrue(lookupspage.element(By.xpath(AcceptanceSuite.props.getProperty("lookupsAdd"))).isCurrentlyVisible());
				
			}
			
			@Given("The user is on Fleet Reservations Delete popup to Delete invalid combinations")
			public void TheuserisonFleetReservationsDeletepopupandinvalidcombinations() throws InterruptedException {
				homePage.openPage();	
				homePage.getDriver().manage().window().maximize();
				homePage.clickOnLoginButton();
				
			}
			
			 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
			@When("The User enters invalid combinations in Fleet Reservations Delete popup and clicks on submit button")
			public void TheUserentersinvalidcombinationsinFleetReservationsDeletepopupandclicksonsubmitbutton() throws InterruptedException, ParseException {
				FleetReservations.fleetReservationsinvalidDelete();
			}
			
			
			@Then("appropriate validation message should be displayed on Fleet Reservations Delete Popup")
			public void appropriatevalidationmessageshouldbedisplayedonFleetReservationsDeletePopup() throws FileNotFoundException, IOException {
				//Assert.assertTrue(lookupspage.element(By.xpath(AcceptanceSuite.props.getProperty("lookupsAdd"))).isCurrentlyVisible());
				
			}
			
			
			
			@Given("The user is on Fleet Reservations CheckOut popup to  CheckOut invalid combinations")
			public void TheuserisonFleetReservationsCheckOutpopuptoCheckOutinvalidcombinations() throws InterruptedException {
				homePage.openPage();	
				homePage.getDriver().manage().window().maximize();
				homePage.clickOnLoginButton();
				
			}
			
			 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
			@When("The User enters invalid combinations in Fleet Reservations check CheckOut popup and clicks on submit button")
			public void TheUserentersinvalidcombinationsinFleetReservationscheckCheckOutpopupandclicksonsubmitbutton() throws InterruptedException, ParseException {
				FleetReservations.fleetReservationsinvalidCheckOut();
			}
			
			
			@Then("appropriate validation message should be displayed on Fleet Reservations CheckOut Popup")
			public void appropriatevalidationmessageshouldbedisplayedonFleetReservationsCheckOutPopup() throws FileNotFoundException, IOException {
				//Assert.assertTrue(lookupspage.element(By.xpath(AcceptanceSuite.props.getProperty("lookupsAdd"))).isCurrentlyVisible());
				
			}
			
			
			@Given("The user is on Fleet Reservations Edit popup to check invalid combinations")
			public void TheuserisonFleetReservationsEditpopuptocheckinvalidcombinations() throws InterruptedException {
				homePage.openPage();	
				homePage.getDriver().manage().window().maximize();
				homePage.clickOnLoginButton();
				FleetReservations.ValidationsInvalidEditReservations();
				
			}
			
			 //The Visitor Enters Valid Enterprise 'Vedic Systems', Resourcetype 'Permanent', FirstName 'Srisys', LastName 'srisys', Designation 'Consultant', Department 'Quality', Gender 'Male', MobileNumber '9550102366', EMailID 'srinivas@gmail.com', AddressLine1 'Hyderbad', City 'Hyderbad', Country 'India', State 'Telangana', ZIPcode '506381', Latitude '+3.55555', Longitude '-3.5555555' and Clicks on Sign Up Button
			@When("The User enters invalid combinations(Fleet,StartDate,EndDate) in Fleet Reservations Edit popup and clicks on submit button $table")
			public void TheUserentersinvalidcombinationsinFleetReservationscheckCheckOutpopupandclicksonsubmitbutton(ExamplesTable table) throws InterruptedException, ParseException {
				//FleetReservations.fleetReservationsinvalidCheckOut();
				for (Map<String, String> row : table.getRows()) {
					//statiDetails.ValidationsAdd(row.get("Enterprise"),row.get("Fleet"),row.get("ImageName"),row.get("MenuName"),row.get("Type"));
					FleetReservations.ValidationsEditReservations(row.get("Fleet"),row.get("StartDate"),row.get("EndDate"));
				
					//Serenity.setSessionVariable("result").to("fail");
					Thread.sleep(2000);
					String actualMessage = FleetReservations.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("fleetreservationsErrormessge"))).getText();
					System.out.println(",,,,,,,,,,,,,"+actualMessage);
					
					String expected=row.get("Expected Error Message");
					System.out.println("++++++++++++++++++"+expected);
				
					Assert.assertTrue(actualMessage.equalsIgnoreCase(expected));
				}
			}
			
			
			@Then("appropriate validation message should be displayed on Fleet Reservations Edit Popup")
		public void appropriatevalidationmessageshouldbedisplayedonFleetReservationsEditPopup() throws FileNotFoundException, IOException {
				//Assert.assertTrue(lookupspage.element(By.xpath(AcceptanceSuite.props.getProperty("lookupsAdd"))).isCurrentlyVisible());
				
			}
  
}

