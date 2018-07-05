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

import com.srisys.serenity.AcceptanceSuite;
import com.srisys.serenity.pages.IndnavHelp;
import com.srisys.serenity.pages.IndnavLookups;
//import com.srisys.serenity.pages.TFCRegistration;














import net.serenitybdd.core.Serenity;
import net.thucydides.core.steps.ScenarioSteps;

public class HelpIndnav extends ScenarioSteps {

	IndnavHelp homePage;
	Properties prop;
	
	
     //Scenario: When User checks for validations with invalid or Empty Values for the Mandatory fields in Help Create/or Add popup

	@Given("The superadmin is on Help page")
	public void aa() throws InterruptedException {
		homePage.openPage();
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		homePage.clickOnHelppage();
		
	}
	
	@When("The superadmin clicks on create button and enters the empty values for mandatory fields1")
	public void bb() throws FileNotFoundException, IOException, InterruptedException {
		//prop = new Properties();
       // prop.load(new FileInputStream("serenity.properties"));
		homePage.helpaddpage();
		homePage.helpaddsubmitpage();
		
	}

	@Then("Validation message should be displayed1")
	public void cc() throws FileNotFoundException, IOException, InterruptedException {
		//prop = new Properties();
       // prop.load(new FileInputStream("serenity.properties"));
		//Assert.assertTrue(homePage.element(By.xpath(AcceptanceSuite.props.getProperty("Help_MandatoryFields"))).isCurrentlyVisible());
		//homePage.getDriver().close();
	}

	
	//Scenario2: When User tries to create a record with valid data then that record shoud succefully save and it should be display in Help listing page
	
	@Given("The Super Admin User is on Help page")
	public void dd() throws FileNotFoundException, IOException, InterruptedException {
		//prop = new Properties();
       // prop.load(new FileInputStream("serenity.properties"));
		homePage.openPage();
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		homePage.clickOnHelppage();
	}
	
	@When("The User clicks on Create Help button and Enters valid data in the popup and Clicks on Submit Button")
	public void ee() throws InterruptedException, FileNotFoundException, IOException {
		//prop = new Properties();
        //prop.load(new FileInputStream("serenity.properties"));
        homePage.helpaddpage();
        homePage.helpCreate();
	}

	@Then("Help Record should be created and should be displayed in the listing")
	public void ff() throws FileNotFoundException, IOException, InterruptedException {
		//prop = new Properties();
		//prop.load(new FileInputStream("serenity.properties"));
		//Assert.assertTrue(homePage.element(By.xpath(AcceptanceSuite.props.getProperty("ToastMessage"))).isCurrentlyVisible());
		//homePage.getDriver().close();
	}

	
	//Scenario: When User tries to Edit an existing record then the record should succefully Update 
	
	@Given("The Super Admin User is on Help page to Edit")
	public void aaa() throws FileNotFoundException, IOException, InterruptedException {
		//prop = new Properties();
      //  prop.load(new FileInputStream("serenity.properties"));
		//homePage.openPage();
		//homePage.getDriver().manage().window().maximize();
		//homePage.clickOnLoginButton();
		homePage.clickOnHelppage();
	}
	
	@When("The User clicks on Edit button and modifies Help data in the popup and Clicks on Submit Button")
	public void bbb() throws InterruptedException, FileNotFoundException, IOException {
		//prop = new Properties();
       // prop.load(new FileInputStream("serenity.properties"));
        //homePage.helpsearchpage();
       // homePage.helpeditpage();
        homePage.HelpeditRecord();
	}

	
	@Then("Help Record should be updated and should be displayed in the listing")
	public void ccc() throws FileNotFoundException, IOException, InterruptedException {
		//prop = new Properties();
		//prop.load(new FileInputStream("serenity.properties"));
		//Assert.assertTrue(homePage.element(By.xpath(AcceptanceSuite.props.getProperty("ToastMessage_Edit_Delete"))).isCurrentlyVisible());
		//homePage.getDriver().close();
	 
	}
	
	
	//Scenario: When User tries to View a existing record then the record should succefully viewed with all particulat fields
	
	@Given("The User is on Help page to View")
	public void a1() throws FileNotFoundException, IOException, InterruptedException {
	//	prop = new Properties();
       // prop.load(new FileInputStream("serenity.properties"));
		//homePage.openPage();
		//homePage.getDriver().manage().window().maximize();
		//homePage.clickOnLoginButton();
		homePage.clickOnHelppage();

	}
	
	@When("The User clicks on View button of any specific Help record")
	public void b2() throws InterruptedException, FileNotFoundException, IOException {
		//prop = new Properties();
       // prop.load(new FileInputStream("serenity.properties"));
      //  homePage.helpsearchpage();
        homePage.Helpviewpage();
	}

	@Then("Help Record specific details should be displayed in the popup")
	public void c3() throws FileNotFoundException, IOException, InterruptedException {
		//prop = new Properties();
		//prop.load(new FileInputStream("serenity.properties"));
		//Assert.assertTrue(homePage.element(By.xpath(prop.getProperty("HelpView_Header"))).isCurrentlyVisible());
		//Assert.assertTrue(homePage.element(By.xpath(prop.getProperty("HelpView_Page"))).isCurrentlyVisible());
		//Assert.assertTrue(homePage.element(By.xpath(prop.getProperty("HelpView_Feature"))).isCurrentlyVisible());
		//Assert.assertTrue(homePage.element(By.xpath(prop.getProperty("HelpView_Question"))).isCurrentlyVisible());
		//Assert.assertTrue(homePage.element(By.xpath(prop.getProperty("HelpEdit_Answer"))).isCurrentlyVisible());
		//Assert.assertTrue(homePage.element(By.xpath(prop.getProperty("HelpView_Notes"))).isCurrentlyVisible());
		//homePage.getDriver().close();
	}
	
	
	
	@Given("The User is on Help page to Search")
	public void Help_search() throws FileNotFoundException, IOException, InterruptedException {
	//	prop = new Properties();
       // prop.load(new FileInputStream("serenity.properties"));
		//homePage.openPage();
		//homePage.getDriver().manage().window().maximize();
		//homePage.clickOnLoginButton();
		homePage.clickOnHelppage();

	}
	
	@When("The User enters valid Help record Search data and Clicks on Submit Button")
	public void Help_advancesearch() throws InterruptedException, FileNotFoundException, IOException {
		//prop = new Properties();
       // prop.load(new FileInputStream("serenity.properties"));
      //  homePage.helpsearchpage();
        homePage.HelpAdvancesearch();
	}

	@Then("Appropriate search results for Help should be displayed in the listing")
	public void Help_advancesearch1() throws FileNotFoundException, IOException, InterruptedException {
		//prop = new Properties();
		//prop.load(new FileInputStream("serenity.properties"));
		//Assert.assertTrue(homePage.element(By.xpath(prop.getProperty("HelpView_Header"))).isCurrentlyVisible());
		//Assert.assertTrue(homePage.element(By.xpath(prop.getProperty("HelpView_Page"))).isCurrentlyVisible());
		//Assert.assertTrue(homePage.element(By.xpath(prop.getProperty("HelpView_Feature"))).isCurrentlyVisible());
		//Assert.assertTrue(homePage.element(By.xpath(prop.getProperty("HelpView_Question"))).isCurrentlyVisible());
		//Assert.assertTrue(homePage.element(By.xpath(prop.getProperty("HelpEdit_Answer"))).isCurrentlyVisible());
		//Assert.assertTrue(homePage.element(By.xpath(prop.getProperty("HelpView_Notes"))).isCurrentlyVisible());
		//homePage.getDriver().close();
	}
	
	//Scenario: When User tries to Delete an existing record then the record should be successfully deleted
	
	@Given("The Super Admin User is on Help page to Delete")
	public void a2() throws FileNotFoundException, IOException, InterruptedException {
		//prop = new Properties();
        //prop.load(new FileInputStream("serenity.properties"));
		//homePage.openPage();
		//homePage.getDriver().manage().window().maximize();
		//homePage.clickOnLoginButton();
		homePage.clickOnHelppage();

	}
	
	@When("The User clicks on Delete button of any specific Help record")
	public void b21() throws InterruptedException, FileNotFoundException, IOException {
		//prop = new Properties();
        //prop.load(new FileInputStream("serenity.properties"));
       // homePage.helpsearchpage1();
        homePage.HelpDeletepage();
	}

	@Then("That specific Help record should be deleted from the list")
	public void c31() throws FileNotFoundException, IOException, InterruptedException {
		//prop = new Properties();
		//prop.load(new FileInputStream("serenity.properties"));
		//Assert.assertTrue(homePage.element(By.xpath(prop.getProperty("HelpDelete_Header"))).isCurrentlyVisible());
		//homePage.HelpDeletesubmit();
		//Assert.assertTrue(homePage.element(By.xpath(AcceptanceSuite.props.getProperty("ToastMessage_Edit_Delete"))).isCurrentlyVisible());
		//homePage.getDriver().close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// Create_Help_Record_Validation_Check_Start

		@Given("The User is on IndNav Application Help page/Create Help Pop Up")
		public void Create_ValidationCheck_Start() throws InterruptedException {
			homePage.openPage();
			homePage.getDriver().manage().window().maximize();
			homePage.clickOnLoginButton();
			homePage.clickOnHelppage();
			homePage.helpaddpage();
		}
		
		@When("The User Missed Values for any Mandatory fields in Help create Popup and clicks on Submit Button $table")
		public void Create_ValidationCheck_Verification(ExamplesTable table) throws FileNotFoundException, IOException, InterruptedException {
//			  prop = new Properties();
//			  prop.load(new FileInputStream("serenity.properties"));
			  for (Map<String, String> row : table.getRows()){
				   homePage.Create_Help_Validation_Check1(row.get("SelectPage"), row.get("SelectFeature"), row.get("HelpQuestion"), row.get("HelpAnswer"));
				   System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!11");
				   homePage.CreateValidation_ClickOn_Submit_Button();
				   Thread.sleep(2000);
				   String ActualvalidationMessage = homePage.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Help_MandatoryFields"))).getText();
					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$"+ActualvalidationMessage);
				   String ExpectedValidation=row.get("Expected Error Message");
					System.out.println("###############################"+ExpectedValidation);
					Assert.assertTrue(ActualvalidationMessage.equalsIgnoreCase(ExpectedValidation));
				}
		}
		
		@Then("Appropriate Validation messages should be Displayed in create help popup for each combination")
		public void Create_ValidationCheck_VerificationComplete() {
			
		}
		
	// Create_Help_Record_Validation_Check_End	

//		Edit_Help_Record_Validation_Check_Start
		@Given("The User is on IndNav Application Help page/Edit Help Pop Up")
		public void Edit_Help_Record_Validation_Check() throws InterruptedException{
			homePage.openPage();
			homePage.getDriver().manage().window().maximize();
			homePage.clickOnLoginButton();
			homePage.clickOnHelppage();
		}
		@When("The User Missed Values for any Mandatory fields in Help edit Popup and clicks on Submit Button")
		public void Edit_HelpPopup_Record_Validation_Check() throws InterruptedException {
			homePage.Click_On_Edit_Help_Record_Button_For_ValidationCheck();
			homePage.Clear_Answer_Field_Data_In_Edit_Help_Record_Page();
			homePage.Click_On_HelpEdit_Page_SubmitButton();
		}
		@Then("Appropriate Validation messages should be Displayed in edit help popup for each combination")
		public void Edit_HelppopupRecord_Validation_Checked() throws InterruptedException {
			homePage.Verify_Help_Edit_Popup_validation_Message();
			
		}
		
		
//		Edit_Help_Record_Validation_Check_End
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
}