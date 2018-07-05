package com.srisys.serenity.steps;

import java.util.Map;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.By;

import com.srisys.serenity.AcceptanceSuite;
import com.srisys.serenity.pages.IndNavLoginpage;
import com.srisys.serenity.pages.ProfilePage;

import junit.framework.Assert;
import net.thucydides.core.reports.html.ExampleTable;
import net.thucydides.core.steps.ScenarioSteps;

public class ProfileValidationSteps extends ScenarioSteps{
	
	ProfilePage pPage;
	IndNavLoginpage homePage;
	
	@Given ("The user is on Profile Edit page to check invalid combinations")
	public void UserIsOnProfileEdit() throws InterruptedException{
		homePage.openPage();
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		pPage.clickOnProfileEdit();
	}
	
	@When ("The User enters invalid combinations(Mobile, Security Answers) in Profile Edit popup and clicks on submit button $ExampleTable")
	public void UserEntersInvalidCombinations(ExamplesTable table) throws InterruptedException{
			for (Map<String, String> row : table.getRows()) {
			
			pPage.doValidations(
					row.get("Mobile"), row.get("Answer1"), row.get("Answer2"), row.get("Answer3"), row.get("Answer4"), row.get("Answer5"));

			//Serenity.setSessionVariable("result").to("fail");
			String actualMessage = homePage.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("ProfileEditErrorMessages"))).getText();
			
			String expected=row.get("Expected Error Message");
		
			System.out.println("Expected="+expected+";Actual="+actualMessage);
			Assert.assertTrue(actualMessage.equalsIgnoreCase(expected));
			}
		
	}
	
	@Then ("Appropriate validation messages for Profile Edit should be displayed")
	public void ValidationsShouldBeDisplayed(){
		
	}

}
