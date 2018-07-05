package com.srisys.serenity.steps;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.srisys.serenity.pages.IndNavLoginpage;
import com.srisys.serenity.pages.LoginHistoryPage;

public class LoginHistorySteps {

	IndNavLoginpage homePage;
	LoginHistoryPage loginHistory;
	
	@Given ("The User is on Login History page to Search")
	public void TheUserisoEventsRegistrationSearchPopUp() throws InterruptedException{
//		homePage.openPage();
//		homePage.getDriver().manage().window().maximize();
//		homePage.clickOnLoginButton();
//		loginHistory.clickOnLoginHistoryHeader();
		
	}
	
	@When ("The User enters valid Login History record Search data and Clicks on Submit Button")
	public void TheUserEntersEventsRegistrationdataSearchdataandClicksonSubmitUpButton() throws InterruptedException{
		loginHistory.loginHistoryAdvanceSearch();
	}
	
	@Then ("Appropriate search results for Login History should be displayed in the listing")
	public void AppropriatesEventsRegistrationsearchrecordshouldbeDisplayedinthelisting(){
		
		//String ExpResult = loginHistory.checkWeather_SearchLoginHistoryDispalyedInListing();
		//String ActResult = "Srisys Corp";
	   // Assert.assertTrue(ExpResult.equalsIgnoreCase(ActResult));
	}
	
	
	// Scenario 2
				@Given("The User is on Login History page")
				public void The_User_is_on_IndNav_Application_Enterprises_page() throws FileNotFoundException, IOException, InterruptedException{
					//Thread.sleep(2000);
					//loginHistory.clickOnLoginHistoryHeader();
				homePage.openPage();
				homePage.getDriver().manage().window().maximize();
				homePage.clickOnLoginButton();
				loginHistory.clickOnLoginHistoryHeader();
				}
				@When("The User clicks on View button of any specific Login History record")
				public void The_user_clicks_on_View_Action_button_corresponding_to_the_Import_History_record() throws FileNotFoundException, IOException, InterruptedException{
					loginHistory.clickONViewBtn();
				}
				@Then("All the details related to that login record should get displayed in the popup")
				public void  Corresponding_Import_History_Record_View_Page_should_display() throws InterruptedException{
					loginHistory.clickONView_CloseBtn();
					//Assert.assertTrue(loginHistory.element(By.xpath(AcceptanceSuite.props.getProperty("LoginHistoryExportAction"))).isCurrentlyVisible());
				}
				
	
	// Scenario 3
				@Given("The User is on Login History page to Delete")
				public void The_User_is_on_IndNav_Application_Enterprises_page_Delete() throws FileNotFoundException, IOException, InterruptedException{
					//Thread.sleep(2000);
					//loginHistory.clickOnLoginHistoryHeader();
//				homePage.openPage();
//				homePage.getDriver().manage().window().maximize();
//				homePage.clickOnLoginButton();
// 			    loginHistory.clickOnLoginHistoryHeader();
				//loginHistory.clickOnLoginHistoryHeader();
			
				}
				@When("The User clicks on Delete button of any specific Login History record")
				public void The_user_clicks_on_Delete_Action_button_corresponding_to_the_Import_History_record() throws FileNotFoundException, IOException, InterruptedException{
					loginHistory.clickONDeleteBtn();
				}
				@Then("That specific login history record should get deleted")
				public void  Corresponding_Import_History_Record_Delete_Page_should_display() throws InterruptedException{
					loginHistory.clickONDelete_DeleteBtn();
					//Assert.assertTrue(loginHistory.element(By.xpath(AcceptanceSuite.props.getProperty("LoginHistoryExportAction"))).isCurrentlyVisible());
				}
	
	
}
