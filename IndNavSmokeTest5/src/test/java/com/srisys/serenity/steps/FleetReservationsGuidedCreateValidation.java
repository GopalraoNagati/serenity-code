package com.srisys.serenity.steps;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Map;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.By;

import com.srisys.serenity.AcceptanceSuite;
import com.srisys.serenity.pages.IndNavEventspage;
import com.srisys.serenity.pages.IndNavFleeteReservationspage;
import com.srisys.serenity.pages.IndNavLoginpage;

import junit.framework.Assert;
import net.thucydides.core.steps.ScenarioSteps;

public class FleetReservationsGuidedCreateValidation extends ScenarioSteps {

	IndNavLoginpage homePage;
	IndNavFleeteReservationspage fleetReservations;
	
	@Given("The user is on Fleet Reservations Guided Create page to check invalid combinations")
	public void The_user_is_on_IndNavLogin_Pop_Up() throws FileNotFoundException, IOException, InterruptedException, ParseException{
		homePage.openPage();
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		//events.
		//fleetReservations.fleetReservationsGuidedCreate();
		
	}
	
	@When("The User enters invalid combinations(Enterprise,Fleet Type, Country) in Fleet Reservations Guided Create popup and clicks on submit button $table")
	public void The_Userenters_fields_Combinations(ExamplesTable table) throws InterruptedException{
		System.out.println("About to click Login Button");
		//homePage.clickOnLoginButton();
		
		fleetReservations.openGuidedCreatePopup();
		for (Map<String, String> row : table.getRows()) {
			
			
			fleetReservations.GuidedCreateValidations(
					row.get("Enterprise"), row.get("Fleet Type"), row.get("Country"), row.get("Start Date"), row.get("End Date"));

			//Serenity.setSessionVariable("result").to("fail");
			String actualMessage = homePage.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("FleetReservationsGuidedCreateErrorMessage"))).getText();
			
			String expected=row.get("Expected Error Message");
		
			System.out.println("Expected="+expected+";Actual="+actualMessage);
			Assert.assertTrue(actualMessage.equalsIgnoreCase(expected));
		}
	}
	
	@Then("Appropriate validation messages for Fleet Reservations Guided Create should be displayed")
	public void Appropriate_Validation_messages_should_be_Displayed(){
		
	}
}
