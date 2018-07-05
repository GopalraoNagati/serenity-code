//pnd= GWT renames
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

import com.srisys.serenity.AcceptanceSuite;
//import com.srisys.serenity.pages.TFCRegistration;
import com.srisys.serenity.pages.IndnavUniversalImages;

import net.thucydides.core.steps.ScenarioSteps;

public class UniversalImagesIndnav extends ScenarioSteps {

	IndnavUniversalImages homePage;
	Properties prop;
	
	
	//Scenario2: When User tries to create a record with valid data then that record shoud succefully save and it should be display in Help listing page
	
		@Given("The Super Admin User is on Universal Images page")
		public void dd() throws FileNotFoundException, IOException, InterruptedException {
			
			homePage.openPage();
			homePage.getDriver().manage().window().maximize();
			homePage.clickOnLoginButton();
			homePage.clickOnUIpage();
		}
		
		@When("The User clicks on Create Universal Image button and Enters valid data in the popup and Clicks on Submit Button")
		public void ee() throws InterruptedException, FileNotFoundException, IOException {
		//	prop = new Properties();
	        //prop.load(new FileInputStream("serenity.properties"));
	        homePage.UIaddpage();
	        homePage.UTCreate();
	       // homePage.UIaddsbmitpage();
		}

		@Then("Universal Image Record should be created and should be displayed in the listing")
		public void ff() throws FileNotFoundException, IOException, InterruptedException {
			//prop = new Properties();
			//prop.load(new FileInputStream("serenity.properties"));
			//Assert.assertTrue(homePage.element(By.xpath(AcceptanceSuite.props.getProperty("ToastMessage"))).isCurrentlyVisible());
			//homePage.getDriver().close();
		}
	
     //Scenario: When User checks for validations with invalid or Empty Values for the Mandatory fields in Help Create/or Add popup

	@Given("The superadmin is on Universal Images page")
	public void aa() throws InterruptedException, FileNotFoundException, IOException {
		
		homePage.openPage();
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		homePage.clickOnUIpage();
		
	}
	
	@When("The superadmin clicks on create button and enters the empty values for mandatory fields11")
	public void bb() throws FileNotFoundException, IOException, InterruptedException {
		prop = new Properties();
		prop.load(new FileInputStream("serenity.properties"));
		homePage.UIaddpage();
		homePage.UIaddsbmitpage();
		
	}

	@Then("Validation message should be displayed11")
	public void cc() throws FileNotFoundException, IOException, InterruptedException {
		prop = new Properties();
		prop.load(new FileInputStream("serenity.properties"));
		//Assert.assertTrue(homePage.element(By.xpath(AcceptanceSuite.props.getProperty("UniversalImageAdd_MandatoryFieldsMessage"))).isCurrentlyVisible());
		//homePage.getDriver().close();
	}
	
	
	


	
	//Scenario: When User tries to Edit an existing record then the record should succefully Update 
	
	@Given("The Super Admin User is on Universal Images page to Edit")
	public void aaa() throws FileNotFoundException, IOException, InterruptedException {
		//prop = new Properties();
        //prop.load(new FileInputStream("serenity.properties"));
		//homePage.openPage();
		//homePage.getDriver().manage().window().maximize();
		//homePage.clickOnLoginButton();
		homePage.clickOnUIpage();
	}
	
	
	@When("The User clicks on Edit button and modifies data in the Edit popup and Clicks on Submit Button")
	public void bbb() throws InterruptedException, FileNotFoundException, IOException {
		//prop = new Properties();
       // prop.load(new FileInputStream("serenity.properties"));
       // homePage.helpsearchpage();
       // homePage.UIeditpagesubmit();
        homePage.UIeditRecord();
       // homePage.UIaddsbmitpage();
	}

	
	@Then("Universal Images Record should be updated and should be displayed in the listing")
	public void ccc() throws FileNotFoundException, IOException, InterruptedException {
		//prop = new Properties();
		//prop.load(new FileInputStream("serenity.properties"));
		//Assert.assertTrue(homePage.element(By.xpath(AcceptanceSuite.props.getProperty("ToastMessage_Edit_Delete"))).isCurrentlyVisible());
		//homePage.getDriver().close();
	}
	
	
	//Scenario: When User tries to View a existing record then the record should succefully viewed with all particulat fields
	
	@Given("The User is on Universal Images page to View")
	public void a1() throws FileNotFoundException, IOException, InterruptedException {
		//prop = new Properties();
       // prop.load(new FileInputStream("serenity.properties"));
		//homePage.openPage();
		//homePage.getDriver().manage().window().maximize();
		//homePage.clickOnLoginButton();
		homePage.clickOnUIpage();



	}
	@When("The User clicks on View button of any specific Universal Images record")
	public void b2() throws InterruptedException, FileNotFoundException, IOException {
		//prop = new Properties();
       // prop.load(new FileInputStream("serenity.properties"));
        //homePage.helpsearchpage1();
        homePage.UIviewpage();
	}

	@Then("Universal Images Record specific details should be displayed in the popup")
	public void c3() throws FileNotFoundException, IOException, InterruptedException {
		//prop = new Properties();
		//prop.load(new FileInputStream("serenity.properties"));
		//Assert.assertTrue(homePage.element(By.xpath(prop.getProperty("UniversalImageView_Header"))).isCurrentlyVisible());
		//Assert.assertTrue(homePage.element(By.xpath(prop.getProperty("UniversalImageAdd_UniverasalImageName"))).isCurrentlyVisible());
		//Assert.assertTrue(homePage.element(By.xpath(prop.getProperty("UniversalImageView_Enterprise"))).isCurrentlyVisible());
		//Assert.assertTrue(homePage.element(By.xpath(prop.getProperty("UniversalImageAdd_Description"))).isCurrentlyVisible());
		//?//Assert.assertTrue(homePage.element(By.xpath(prop.getProperty("UniversalImageView_Notes"))).isCurrentlyVisible());

		
		
		//homePage.getDriver().close();
	}
	
	
	//Scenario: When User tries to Delete an existing record then the record should be successfully deleted
	
	@Given("The Admin User is on Universal Images page to Delete")
	public void a2() throws FileNotFoundException, IOException, InterruptedException {
		//prop = new Properties();
       // prop.load(new FileInputStream("serenity.properties"));
		//homePage.openPage();
		//homePage.getDriver().manage().window().maximize();
		//homePage.clickOnLoginButton();
		homePage.clickOnUIpage();

	}
	
	@When("The User clicks on Delete button of any specific Universal Images record")
	public void b21() throws InterruptedException, FileNotFoundException, IOException {
		//prop = new Properties();
       // prop.load(new FileInputStream("serenity.properties"));
       // homePage.helpsearchpage1();
        homePage.UIDeletepage();
       // homePage.UIDeletesubmit();
	}

	@Then("That specific Universal Images record should be deleted from the list")
	public void c31() throws FileNotFoundException, IOException, InterruptedException {
		//prop = new Properties();
		//prop.load(new FileInputStream("serenity.properties"));
		//Assert.assertTrue(homePage.element(By.xpath(prop.getProperty("UniversalImageView_Header"))).isCurrentlyVisible());
		
		//Assert.assertTrue(homePage.element(By.xpath(AcceptanceSuite.props.getProperty("ToastMessage_Edit_Delete"))).isCurrentlyVisible());
		//homePage.getDriver().close();
	}
	
	
	@Given("The User is on Universal Images page to Search")
	public void The_User_is_on_UniversalImage_Search_Pop_Up() throws FileNotFoundException, IOException, InterruptedException {
		//prop = new Properties();
       // prop.load(new FileInputStream("serenity.properties"));
		//homePage.openPage();
		//homePage.getDriver().manage().window().maximize();
		//homePage.clickOnLoginButton();
		homePage.clickOnUIpage();

	}
	
	@When("The User enters valid Universal Image record Search data and Clicks on Submit Button")
	public void UniversalImage_data_advanceSearch_and_Clicks_on_Submit_Up_Button() throws InterruptedException, FileNotFoundException, IOException {
		//prop = new Properties();
       // prop.load(new FileInputStream("serenity.properties"));
       // homePage.helpsearchpage1();
          homePage.Advancesearch();
       // homePage.UIDeletesubmit();
	}

	@Then("Appropriate search results should be displayed in the Universal Images listing")
	public void Appropriates_UniversalImage_search_should_be_Displayed_in_the_listing() throws FileNotFoundException, IOException, InterruptedException {
		//prop = new Properties();
		//prop.load(new FileInputStream("serenity.properties"));
		//Assert.assertTrue(homePage.element(By.xpath(prop.getProperty("UniversalImageView_Header"))).isCurrentlyVisible());
		
		//Assert.assertTrue(homePage.element(By.xpath(AcceptanceSuite.props.getProperty("ToastMessage_Edit_Delete"))).isCurrentlyVisible());
		//homePage.getDriver().close();
	}
	
	
	
	
	
	
	
	
	
	
	
//	UniversalImageValidactionCheck Create Start
	@Given("The User is on IndNav Application Universal Images page/Create Universal Images Pop Up")
	
	public void UniversalImageValidationCheck() throws InterruptedException {
		homePage.openPage();
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		homePage.clickOnUIpage();
		 homePage.UIaddpage();
	}
	
	@When("The User Missed Values for any Mandatory fields in Universal Images Create Popup and clicks on Submit Button $table")
	public void UniversalImageValidation_CheckWhen(ExamplesTable table) throws FileNotFoundException, IOException {
		for (Map<String, String> row : table.getRows()){

			homePage.Create_UniversalImageValidationCheck(row.get("Enterprise"), row.get("UniversalImageName"), row.get("UniversalImageDescription"), row.get("UniversalImage"));
			String ActualvalidationMessage = homePage.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("UniversalImageAdd_MandatoryFieldsMessage"))).getText();
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$"+ActualvalidationMessage);
		   String ExpectedValidation=row.get("Expected Error Message");
			System.out.println("###############################"+ExpectedValidation);
			Assert.assertTrue(ActualvalidationMessage.equalsIgnoreCase(ExpectedValidation));
		}
	
	}
	
	@Then("Appropriate Validation messages should be Displayed in Universal Images create popup for each combination")
	
	public void UniversalImageValidationCheckThen() {
		
	}	
//	UniversalImageValidation Create End
	
//	Universal ImageValidation Edit Start
	@Given("The User is on IndNav Application Universal Images page/Edit Universal Images Pop Up")
	public void UniversalImageEditValidationStart() throws InterruptedException {
		homePage.openPage();
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		homePage.clickOnUIpage();	
		homePage.UniversalImagesEditButtonValidation();
	}
	@When("The User Missed Values for any Mandatory fields in Universal Images Edit Popup and clicks on Submit Button $table")
	public void UniversalImageEditValidationCheck(ExamplesTable table) throws FileNotFoundException, IOException, InterruptedException {
		for (Map<String, String> row : table.getRows()){
			homePage.EditUniversalImageCheck(row.get("UniversalImageName"),row.get("UniversalImageDescription"));
			String ActualvalidationMessage = homePage.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("UniversalImageAdd_MandatoryFieldsMessage"))).getText();
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$"+ActualvalidationMessage);
		   String ExpectedValidation=row.get("Expected Error Message");
			System.out.println("###############################"+ExpectedValidation);
			Thread.sleep(2000);
			Assert.assertTrue(ActualvalidationMessage.equalsIgnoreCase(ExpectedValidation));		
		}
	}
	@Then("Appropriate Validation messages should be Displayed in Universal Images Edit popup for each combination")
	public void UniversalImageEditValidationCheckEnd() {
		
	}
	
	
	
//	Universal ImageValidation Edit End
	
	
	
	
	
	
	
	
	
	
		
}