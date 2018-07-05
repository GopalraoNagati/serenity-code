package com.srisys.serenity.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.srisys.serenity.pages.CallHistoryPage;
import com.srisys.serenity.pages.IndNavLoginpage;

import net.thucydides.core.steps.ScenarioSteps;

public class CallHistorySteps extends ScenarioSteps{
	
	IndNavLoginpage homePage;
	CallHistoryPage callHistoryPage;
	
	@Given ("The User is on Call History page")
	public void UserIsOnCallHistoryPage() throws InterruptedException{
		homePage.openPage();
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		callHistoryPage.goToCallHistoryPage();
	}
	
	@When ("The user clicks on View Action button corresponding to the Call History record")
	public void UserClicksOnViewButton() throws InterruptedException{
		callHistoryPage.clickView();
	}
	
	@Then ("Corresponding Call History Record View Page should display")
	public void CallHistoryRecordShouldDisplay(){
		
	}

	@Given ("The user is on Call History page to Delete")
	public void UserIsOnCallHistoryPageToDelete(){
		
	}
	
	@When ("The user clicks on Delete Action button corresponding to the Call History record")
	public void UserClicksOnDeleteButton(){
		//callHistoryPage.clickDelete();
	}
	
	
	
	@Then ("Corresponding Call History Record should get deleted")
	public void CorrespondingRecordShouldBeDeleted(){
		
	}

	@Given ("The User is on Call History Advanced Search Pop Up")
	public void UserIsOnAdvancedSearch(){
		
	}
	
	@When ("The User Enters Call History Search data and Clicks on Submit Button")
	public void UserEntersCallHistorySearchData(){
		callHistoryPage.clickAdvSearch();
	}
	
	@Then ("Appropriate Call History search records should be displayed in the listing")
	public void AppropriateCallHistorySearhResults(){
		
	}


}
