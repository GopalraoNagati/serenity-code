package com.srisys.serenity.steps;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.srisys.serenity.pages.ImportHistoryPage;
import com.srisys.serenity.pages.IndNavLoginpage;

public class ImportHistorySteps {
	IndNavLoginpage homePage;
	ImportHistoryPage importhistory;
	
	@Given ("The User is on Import History Advanced Search Pop Up")
	public void TheUserisoEventsRegistrationSearchPopUp() throws InterruptedException{
		/*homePage.openPage();
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		importhistory.clickOnImportHistoryHeader();*/
	}
	
	@When ("The User Enters Import History Search data and Clicks on Submit Button")
	public void TheUserEntersEventsRegistrationdataSearchdataandClicksonSubmitUpButton() throws InterruptedException{
		
		importhistory.importHistoryAdvanceSearch();
		
		
	}
	
	@Then ("Appropriate Import History search records should be displayed in the listing")
	public void AppropriatesEventsRegistrationsearchrecordshouldbeDisplayedinthelisting(){
		
		//String ExpResult = importhistory.checkWeather_SearchImportHistoryDispalyedInListing();
		//String ActResult = "Srisys Corp";
	   // Assert.assertTrue(ExpResult.equalsIgnoreCase(ActResult));
	}
	
	
	
	// Scenario 2
		@Given("The User is on Import History page")
		public void The_User_is_on_IndNav_Application_Enterprises_page() throws FileNotFoundException, IOException, InterruptedException{
		homePage.openPage();
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		importhistory.clickOnImportHistoryHeader();
		}
		@When("The user clicks on View Action button corresponding to the import History record")
		public void The_user_clicks_on_View_Action_button_corresponding_to_the_Import_History_record() throws FileNotFoundException, IOException, InterruptedException{
			importhistory.clickONViewBtn();
		}
		@Then("Corresponding Import History Record View Page should display")
		public void  Corresponding_Import_History_Record_View_Page_should_display() throws InterruptedException{
			importhistory.clickONView_CloseBtn();
			//Assert.assertTrue(importhistory.element(By.xpath(AcceptanceSuite.props.getProperty("ImportHistoryExportAction"))).isCurrentlyVisible());
		}
		
		@Given ("The user is on import History page to Delete")
		public void UserIsOnImportHistoryPage(){
			
		}
		
	// Scenario 3
		@When("The user clicks on Delete Action button corresponding to the Import History record")
		public void The_user_clicks_on_Delete_Action_button_corresponding_to_the_Import_History_record() throws FileNotFoundException, IOException, InterruptedException{
			importhistory.clickONDeleteBtn();
		}
		
		@Then("Corresponding Import History Record should get deleted")
		public void  Corresponding_Import_History_Record_Delete_Page_should_display() throws InterruptedException{
			importhistory.clickONDelete_DeleteBtn();
			//Assert.assertTrue(importhistory.element(By.xpath(AcceptanceSuite.props.getProperty("ImportHistoryExportAction"))).isCurrentlyVisible());
		}
		
		
	
}
