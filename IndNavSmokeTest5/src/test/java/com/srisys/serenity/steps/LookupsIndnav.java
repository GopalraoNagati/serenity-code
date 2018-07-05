package com.srisys.serenity.steps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

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
import com.srisys.serenity.pages.IndnavLookups;
//import com.srisys.serenity.pages.TFCRegistration;

import net.thucydides.core.steps.ScenarioSteps;

public class LookupsIndnav extends ScenarioSteps {

	IndnavLookups homePage;
	Properties prop;
	
	
     //Scenario1: When User checks for validations with invalid or Empty Values for the Mandatory fields in Lookups page Create/Create or Add popup

	@Given("The superadmin is on Lookups page")
	public void aa() throws InterruptedException {
		homePage.openPage();
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		homePage.Lookupspage();
		
		
	}
	@When("The superadmin clicks on create button and enters the empty values for mandatory fields")
	public void bb() throws FileNotFoundException, IOException, InterruptedException {
		
		prop = new Properties();
        prop.load(new FileInputStream("serenity.properties"));
        homePage.Lookupsaddpage();
        homePage.Lookupsaddsubmit();
	}

	@Then("Validation message should be displayed")
	public void cc() throws FileNotFoundException, IOException, InterruptedException {
		prop = new Properties();
		prop.load(new FileInputStream("serenity.properties"));
		Assert.assertTrue(homePage.element(By.xpath(AcceptanceSuite.props.getProperty("Lookups_MandatoryFields_Validation"))).isCurrentlyVisible());
		homePage.getDriver().close();
	}
	
	//Scenario2: When User tries to create a record with valid data then that record shoud succefully save and it should be display in lookups listing page
	
	
	@Given("The Super Admin is on Lookups page")
	public void dd() throws FileNotFoundException, IOException, InterruptedException {
		//prop = new Properties();
       // prop.load(new FileInputStream("serenity.properties"));
		homePage.openPage();
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		homePage.Lookupspage();
	}
	@When("The Super Admin clicks on create button and Enters valid or Appropriate Values for all fields and clicks on Submit Button")
	public void ee() throws InterruptedException, FileNotFoundException, IOException {
		//prop = new Properties();
       // prop.load(new FileInputStream("serenity.properties"));
        homePage.Lookupsaddpage();
        homePage.lookupsCreate();
       // homePage.Lookupsaddpage();
      //  homePage.lookupsCreate1();
       // homePage.Lookupsaddpage();
       // homePage.lookupsCreate2();
        
	}
	

	@Then("The created lookup should be displayed in the Listing")
	public void ff() throws FileNotFoundException, IOException, InterruptedException {
		
	}

	

	

	
	//Scenario2:  When User tries to Edit an existing record then the record shoud succefully Update 
	
	@Given("The Super Admin is on Lookups Edit page")
	public void EditPage() throws FileNotFoundException, IOException, InterruptedException {
		
		
	}
	
	
	@When("The Super Admin clicks on Edit button and modifies Appropriate Values for all fields and clicks on Submit Button")
	public void bbb() throws InterruptedException, FileNotFoundException, IOException {
		Thread.sleep(500);
        homePage.lookupsSearch();
    	Thread.sleep(500);
        homePage.Lookupseditpage();
    	Thread.sleep(500);
        homePage.lookupsSearch();
    	Thread.sleep(500);
        homePage.Lookupseditpage();
	}

	
	@Then("The modified lookup should be displayed in the Listing")
	public void ccc() throws FileNotFoundException, IOException, InterruptedException {
		
		
	 
	}
	
	
	//Scenario3:  When User tries to View a existing record then the record shoud succefully viewed with all particulat fields 
	
	@Given("The Super Admin is on Lookups View page")
	public void a1() throws FileNotFoundException, IOException, InterruptedException {
		



	}
	@When("The Super Admin clicks on View button")
	public void b2() throws InterruptedException, FileNotFoundException, IOException {
		
        homePage.lookupsSearch();
        homePage.Lookupsviewpage();
	}

	@Then("The lookup details should be displayed in the popup")
	public void c3() throws FileNotFoundException, IOException, InterruptedException {
		prop = new Properties();
		prop.load(new FileInputStream("serenity.properties"));
		Assert.assertTrue(homePage.element(By.xpath(prop.getProperty("LookupsView_Header"))).isCurrentlyVisible());
		Assert.assertTrue(homePage.element(By.xpath(prop.getProperty("LookupsView_Enterprise"))).isCurrentlyVisible());
		Assert.assertTrue(homePage.element(By.xpath(prop.getProperty("LookupsView_LookupType"))).isCurrentlyVisible());
		Assert.assertTrue(homePage.element(By.xpath(prop.getProperty("LookupsView_LookupTypeCategory"))).isCurrentlyVisible());
		Assert.assertTrue(homePage.element(By.xpath(prop.getProperty("LookupsView_LookupValue"))).isCurrentlyVisible());
		Assert.assertTrue(homePage.element(By.xpath(prop.getProperty("LookupsView_Enabled"))).isCurrentlyVisible());
		Assert.assertTrue(homePage.element(By.xpath(prop.getProperty("LookupsView_Description"))).isCurrentlyVisible());
		//homePage.getDriver().findElement(By.xpath(prop.getProperty("LookupsView_CloseButton"))).click();
		//homePage.findBy(prop.getProperty("LookupsView_CloseButton")).click();
		//homePage.getDriver().close();
		homePage.closeViewPopup();
	}
	
	
	@Given ("The Super Admin is on Lookups page to Search")
	public void SAUserIsOnLookupsPage(){
		
	}
	
	@When ("The Super Admin clicks on Advanced Search button and enters relevant data in the pop up and clicks on submit")
	public void SAUserClicksOnAdvancedSearchButtonWithSomeData() throws InterruptedException{
		
			homePage.AdvancedSearch();
	}
	
	@Then ("The appropriate lookups should be displayed in the listing")
	public void AdvancedSearchResultsShouldBeDisplayed(){
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	// Lookup_Create_Validation_Check Start

	@Given("The User is on IndNav Application Looksps page/Create Users Pop Up")
	public void lookups_Create_Validation_Check() throws FileNotFoundException, IOException, InterruptedException {
		prop = new Properties();
	    prop.load(new FileInputStream("serenity.properties"));
		homePage.openPage();
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		homePage.Lookupspage();
		homePage.Lookupsaddpage();
	}

	@When("The User Missed Values for any Mandatory fields in Lookups create Popup and clicks on Submit Button $table")
	public void lookups_Create_Validation(ExamplesTable table) throws FileNotFoundException, IOException, InterruptedException {
		
		for (Map<String, String> row : table.getRows()){

		homePage.Create_Lookup_Valdations_Check(row.get("Enterprise"), row.get("LookupType"), row.get("LookupValue"), row.get("LookupDescription"));
		String ActualvalidationMessage = homePage.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("CreateLookupValidationPath"))).getText();
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$"+ActualvalidationMessage);
	   String ExpectedValidation=row.get("Expected Error Message");
		System.out.println("###############################"+ExpectedValidation);
		Assert.assertTrue(ActualvalidationMessage.equalsIgnoreCase(ExpectedValidation));

			}
		}

	@Then("Appropriate Validation messages should be Displayed to the User for each combination in Create Loopups")
	public void create_Lookup_Validation() {
		
	}


	//Lookup_Create_Validation_Check End

	
		
}