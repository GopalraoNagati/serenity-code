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

import com.srisys.serenity.AcceptanceSuite;
import com.srisys.serenity.pages.IndNavLoginpage;
import com.srisys.serenity.pages.MessageHistoryPages;

import net.thucydides.core.steps.ScenarioSteps;

public class MessageHistorySteps extends ScenarioSteps{

	IndNavLoginpage homePage;
	MessageHistoryPages messageHistory;
	
	@Given ("The User is on the Message History page")
	public void TheUserisoMessageHisoryPopUp() throws InterruptedException{
		homePage.openPage();
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		messageHistory.clickOnMessageHistoryHeader();
		
	}
	
	@When ("The User clicks on ‘Create Message’ button and enters valid data in the create message popup and clicks on submit button")
	public void TheMessage_History_valid_dataClicksonSubmitUpButton() throws InterruptedException{
		messageHistory.messageHistoryCreate();
	}
	
	@Then ("The user should be able to send the message successfully to other User or Group in an Enterprise")
	public void Appropriate_Message_History_record_should_be_displayed_in_the_listing(){
		
		//String ExpResult = messageHistory.checkWeather_SearchMessageHistoryDispalyedInListing();
		//String ActResult = "Vedic Systems";
	   // Assert.assertTrue(ExpResult.equalsIgnoreCase(ActResult));
	}
	
	@Given ("The User is on Message History Advanced Search Pop Up to Search")
	public void TheUserisoEventsRegistrationSearchPopUp() throws InterruptedException{
		//homePage.openPage();
		//homePage.getDriver().manage().window().maximize();
		//homePage.clickOnLoginButton();
		//messageHistory.clickOnMessageHistoryHeader();
	}
	
	@When ("The User Enters Message History Search data and Clicks on Submit Button")
	public void TheUserEntersEventsRegistrationdataSearchdataandClicksonSubmitUpButton() throws InterruptedException{
		messageHistory.messageHistoryAdvanceSearch();
	}
	
	@Then ("Appropriate Message History search records should be displayed in the listing")
	public void AppropriatesEventsRegistrationsearchrecordshouldbeDisplayedinthelisting(){
		
		//String ExpResult = messageHistory.checkWeather_SearchMessageHistoryDispalyedInListing();
		//String ActResult = "Vedic Systems";
	   // Assert.assertTrue(ExpResult.equalsIgnoreCase(ActResult));
	}
	
	
	
	// Scenario 2
			@Given("The User is on Message History page to View")
			public void The_User_is_on_IndNav_Application_Enterprises_page() throws FileNotFoundException, IOException, InterruptedException{
			//homePage.openPage();
			//homePage.getDriver().manage().window().maximize();
			//homePage.clickOnLoginButton();
			//messageHistory.clickOnMessageHistoryHeader();
			}
			@When("The user clicks on View Action button corresponding to the Message History record")
			public void The_user_clicks_on_View_Action_button_corresponding_to_the_Import_History_record() throws FileNotFoundException, IOException, InterruptedException{
				messageHistory.clickONViewBtn();
			}
			@Then("Corresponding Message History Record View Page should be displayed")
			public void  Corresponding_Import_History_Record_View_Page_should_display() throws InterruptedException{
				//messageHistory.clickONView_CloseBtn();
				//Assert.assertTrue(messageHistory.element(By.xpath(AcceptanceSuite.props.getProperty("MessageHistoryExportAction"))).isCurrentlyVisible());
			}
			
		
			
			
		// Scenario 3
			@Given ("The user is on Message History page to Delete")
			public void UserIsOnMessageHistoryPage(){
				
			}
			@When("The user clicks on Delete Action button corresponding to the Message History record")
			public void The_user_clicks_on_Delete_Action_button_corresponding_to_the_Import_History_record() throws FileNotFoundException, IOException, InterruptedException{
				messageHistory.clickONDeleteBtn();
			}
			@Then("Corresponding Message History Record should get deleted")
			public void  Corresponding_Import_History_Record_Delete_Page_should_display() throws InterruptedException{
				//messageHistory.clickONDelete_DeleteBtn();
				//Assert.assertTrue(messageHistory.element(By.xpath(AcceptanceSuite.props.getProperty("MessageHistoryExportAction"))).isCurrentlyVisible());
			}
			

			@Given ("The User is on Message History page to Read/Unread")
			public void UserIsOnMessageHistoryRead(){
				
			}
			
			@When ("The user clicks on Read/Unread Action button corresponding to the Message History record and clicks on ‘Read/Unread’ in the popup")
			public void UserReadsUnreadsAMessage() throws InterruptedException{
				messageHistory.readUnread();
				
			}
			
			@Then ("Corresponding Message History Record status should change to ‘Unread/Read’ in the listing")
			public void MessageHistoryStatusShouldBeChangedToReadUnread(){
				
			}
			
			
			@Given ("The user is on Message History page to check invalid combinations")
			public void TheUserIsOnMessageHistoryPageToCheckInvalidCombinations() throws InterruptedException{
				homePage.openPage();
				homePage.getDriver().manage().window().maximize();
				homePage.clickOnLoginButton();
				messageHistory.clickOnMessageHistoryHeader();
				
				
			}
			
			@When ("The User enters invalid (Enterprise, To, MessageType, Message) combinations in message history create popup and clicks on submit button $table")
			public void TheUserEntersInvalidCombinationsInMessageHistoryCreatePopupAndClicksOnSubmitButton(
			ExamplesTable table) throws InterruptedException {
				messageHistory.clickCreate();
				for (Map<String, String> row : table.getRows()) {
					messageHistory.invalidCombinationsAdd(row.get("Enterprise"), row.get("To"),
							row.get("MessageType"), row.get("Message"));
				}
				
			}
			
			@Then ("Appropriate validation message should be displayed for Message History")
			public void AppropriateValidationMessageShouldBeDisplayedForMessageHistory(){
				
			}
}
