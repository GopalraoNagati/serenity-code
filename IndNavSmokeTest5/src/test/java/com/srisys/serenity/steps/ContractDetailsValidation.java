package com.srisys.serenity.steps;

import java.util.Map;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.By;

import com.srisys.serenity.AcceptanceSuite;
import com.srisys.serenity.pages.IndNavContractDetailspage;
import com.srisys.serenity.pages.IndNavLoginpage;

import junit.framework.Assert;
import net.thucydides.core.steps.ScenarioSteps;

public class ContractDetailsValidation extends ScenarioSteps {
	
	IndNavLoginpage homePage;
	IndNavContractDetailspage contractDetails;
	
	
	
	@Given ("The user is on Contract Details create popup to check invalid combinations")
	public void UserIsOnContractDetailsCreatePopup() throws InterruptedException{
		homePage.openPage();	
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		contractDetails.ContractDetailsValidationCreateClick();
	}
	
	@When ("The User enters invalid combinations in Contract Details popup and clicks on submit button $ExamplesTable")
	public void UserEntersInvalidCombinations(ExamplesTable table) throws InterruptedException{
for (Map<String, String> row : table.getRows()) {
			
			System.out.println("Enterprise="+row.get("Enterprise"));
			contractDetails.ContractDetailsValidationCreate(row.get("Enterprise"), row.get("Contract Type"), row.get("Licensing Mode"),
					row.get("Payment Terms"), row.get("Period Amount"));

			//Serenity.setSessionVariable("result").to("fail");
			String actualMessage = homePage.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("ContractDetailsErrorMessage"))).getText();
			
			String expected=row.get("Expected Error Message");
		
			System.out.println("Expected="+expected+";Actual="+actualMessage);
			Assert.assertTrue(actualMessage.equalsIgnoreCase(expected));
			}
		
	}
	
	@Then ("Appropriate validation messages for Contract Details Create should be displayed")
    public void AppropriateValidationMessagesShouldBeDisplayed(){
		
	}

}
