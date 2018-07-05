package com.srisys.serenity.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.srisys.serenity.pages.IndNavLoginpage;
import com.srisys.serenity.pages.ProfilePage;

import net.thucydides.core.steps.ScenarioSteps;

public class ProfileSteps extends ScenarioSteps{

	ProfilePage pPage;
	IndNavLoginpage homePage;
	@Given ("The User is on the Profile page")
	public void TheUserIsOnProfilePage() throws InterruptedException{
		homePage.openPage();
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		pPage.clickOnProfileEdit();
	}
	
	@When ("The User modifies the data in the profile popup and clicks on submit")
	public void UserModifiesDataInProfilePopup(){
		pPage.profileEdit();
	}
	@Then ("The profile should get updated")
	public void ProfileShouldGetUpdated(){
		
	}
}
