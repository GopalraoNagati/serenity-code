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

import com.srisys.serenity.pages.IndNavLoginpage;
import com.srisys.serenity.pages.IndnavAdvertisement;

import net.thucydides.core.steps.ScenarioSteps;

public class AdvertisementIndnav extends ScenarioSteps {

	IndnavAdvertisement advertisement;
	IndNavLoginpage homePage;
	//Properties prop;
	
	
     //Scenario: When User checks for validations with invalid or Empty Values for the Mandatory fields in Help Create/or Add popup

	/*@Given("The superadmin is on Advertisements page")
	public void aa() throws InterruptedException {
		homePage.openPage();
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		advertisement.Addspage();
		
	}

	@When("The superadmin clicks on create button and enters the empty values for mandatory fields3")
	public void bb() throws FileNotFoundException, IOException, InterruptedException {
		advertisement.AdvtAddpage();
		advertisement.helppageaddsubmit();
		
	}

	@Then("Validation message should be displayed2")
	public void cc() throws FileNotFoundException, IOException, InterruptedException {
		//Assert.assertTrue(advertisement.element(By.xpath(AcceptanceSuite.props.getProperty("AdvertisementAdd_MandatoryFieldsMessage"))).isCurrentlyVisible());
		advertisement.getDriver().close();
	}*/

	//Scenario2: When User tries to create a record with valid data then that record should succefully save and it should be display in Advertisements listing page
	
	
	@Given("The Super Admin User is on Advertisements page")
	public void dd() throws FileNotFoundException, IOException, InterruptedException {
		
		advertisement.openPage();
		advertisement.getDriver().manage().window().maximize();
		advertisement.clickOnLoginButton();
		advertisement.Addspage();
	}

	@When("The User clicks on Create Advertisement button and Enters valid data in the popup and Clicks on Submit Button")
	public void ee() throws InterruptedException, FileNotFoundException, IOException {
		
        advertisement.AdvtAddpage();
       advertisement.AddsCreate();
	
	}
	
	@Then("Advertisement Record should be created and should be displayed in the listing")
	public void ff() throws FileNotFoundException, IOException, InterruptedException {
		
		//Assert.assertTrue(advertisement.element(By.xpath(AcceptanceSuite.props.getProperty("ToastMessage_Edit_Delete"))).isCurrentlyVisible());
		//advertisement.getDriver().close();
	}

	
	//Scenario: When User tries to Edit an existing record then the record should succefully Update 
	
	@Given("The Super Admin User is on Advertisements page to Edit")
	public void aaa() throws FileNotFoundException, IOException, InterruptedException {
		
		//advertisement.openPage();
		//advertisement.getDriver().manage().window().maximize();
		//advertisement.clickOnLoginButton();
		//advertisement.Addspage();
	}
	
	
	@When("The User clicks on Edit button and modifies data in the popup and Clicks on Submit Button")
	public void bbb() throws InterruptedException, FileNotFoundException, IOException {
		
        //advertisement.addssearchpage();
        //advertisement.addsEditRecord1();
        advertisement.AddseditRecord();
	}

	
	@Then("Advertisements Record should be updated and should be displayed in the listing")
	public void ccc() throws FileNotFoundException, IOException, InterruptedException {
		
		//Assert.assertTrue(advertisement.element(By.xpath(AcceptanceSuite.props.getProperty("ToastMessage"))).isCurrentlyVisible());
		//advertisement.getDriver().close();
	 
	}
	
	
	//Scenario: When User tries to View a existing record then the record should succefully viewed with all particulat fields
	
	@Given("The User is on Advertisements page to View")
	public void a1() throws FileNotFoundException, IOException, InterruptedException {
		
		//advertisement.openPage();
		//advertisement.getDriver().manage().window().maximize();
		//advertisement.clickOnLoginButton();
		//advertisement.Addspage();

	}
	
	@When("The User clicks on View button of any specific record on Listing")
	public void b2() throws InterruptedException, FileNotFoundException, IOException {
		
        //advertisement.addssearchpage();
        advertisement.addsviewpage();
	}

	@Then("Advertisement Record specific details should be displayed in the popup")
	public void c3() throws FileNotFoundException, IOException, InterruptedException {
		
		//Assert.assertTrue(advertisement.element(By.xpath(prop.getProperty("AdvertisementView_Header"))).isCurrentlyVisible());
		//Assert.assertTrue(advertisement.element(By.xpath(prop.getProperty("AdvertisementView_Enterprise_Record"))).isCurrentlyVisible());
		//Assert.assertTrue(advertisement.element(By.xpath(prop.getProperty("AdvertisementAdd_AdName"))).isCurrentlyVisible());
		//Assert.assertTrue(advertisement.element(By.xpath(prop.getProperty("AdvertisementView_AdType"))).isCurrentlyVisible());
		//Assert.assertTrue(advertisement.element(By.xpath(prop.getProperty("AdvertisementAdd_Description"))).isCurrentlyVisible());
		//advertisement.getDriver().close();
	}
	
	
	//Scenario: When User tries to Delete an existing record then the record shoud be successfully deleted
	
	@Given("The Admin User is on Advertisements page to Delete")
	public void a2() throws FileNotFoundException, IOException, InterruptedException {
		//prop = new Properties();
       // prop.load(new FileInputStream("serenity.properties"));
		//advertisement.openPage();
		//advertisement.getDriver().manage().window().maximize();
		//advertisement.clickOnLoginButton();
		//advertisement.Addspage();

	}
	
	@When("The superadmin clicks on Delete Button on Advertisements Delete Popup4")
	public void b21() throws InterruptedException, FileNotFoundException, IOException {
		//prop = new Properties();
       // prop.load(new FileInputStream("serenity.properties"));
        //advertisement.addssearchdeldeppage();
        advertisement.AdvtDeletepage();
	}

	@Then("An Advertisements with dependencies cannot be deleted and Validation message is displayed")
	public void c31() throws FileNotFoundException, IOException, InterruptedException {
		//prop = new Properties();
		//prop.load(new FileInputStream("serenity.properties"));
		//Assert.assertTrue(advertisement.element(By.xpath(prop.getProperty("AdvertisementView_Header"))).isCurrentlyVisible());
//		advertisement.AddsDeletesubmit();
//		Assert.assertTrue(advertisement.element(By.xpath(prop.getProperty("AdvertisementAdd_MandatoryFieldsMessage"))).isCurrentlyVisible());
	}
	
	
	@Given("The superadmin is on Advertisements page5")
	public void a21() throws FileNotFoundException, IOException, InterruptedException {
//		prop = new Properties();
//        prop.load(new FileInputStream("serenity.properties"));
//		advertisement.openPage();
//		advertisement.getDriver().manage().window().maximize();
//		advertisement.Addspage();

	}
	
	@When("The User clicks on Delete button of any specific Advertisement record")
	public void b211() throws InterruptedException, FileNotFoundException, IOException {
		//prop = new Properties();
        //prop.load(new FileInputStream("serenity.properties"));
        //advertisement.getDriver().navigate().refresh();
       // advertisement.addssearchpage();
        advertisement.AdvtDeletepage();
	}

	@Then("That specific Advertisement record should be deleted from the list")
	public void c311() throws FileNotFoundException, IOException, InterruptedException {
		//prop = new Properties();
		//prop.load(new FileInputStream("serenity.properties"));
		//Assert.assertTrue(advertisement.element(By.xpath(prop.getProperty("AdvertisementView_Header"))).isCurrentlyVisible());
		advertisement.AddsDeletesubmit();
		//Assert.assertTrue(advertisement.element(By.xpath(AcceptanceSuite.props.getProperty("ToastMessage_Edit_Delete"))).isCurrentlyVisible());
//		advertisement.getDriver().close();
	}
	
	
	
	@Given("The User is on Advertisements page to Search")
	public void The_User_is_on_Advertisements_Search_Pop_Up() throws FileNotFoundException, IOException, InterruptedException {
		
		//advertisement.openPage();
		//advertisement.getDriver().manage().window().maximize();
		//advertisement.clickOnLoginButton();
//		prop = new Properties();
//        prop.load(new FileInputStream("serenity.properties"));
//		advertisement.openPage();
//		advertisement.getDriver().manage().window().maximize();
//		advertisement.Addspage();

	}
	
	@When("The User enters valid Advertisement record Search data and Clicks on Submit Button")
	public void The_User_Enters_Valid_Advertisements_data_advanceSearch_and_Clicks_on_Submit_Up_Button() throws InterruptedException, FileNotFoundException, IOException {
		//prop = new Properties();
        //prop.load(new FileInputStream("serenity.properties"));
       // advertisement.getDriver().navigate().refresh();
        //advertisement.addssearchpage();
        advertisement.Advtsearchpage();
	}

	@Then("Appropriate search results should be displayed in the listing")
	public void Appropriates_Advertisements_search_should_be_Displayed_in_the_listing() throws FileNotFoundException, IOException, InterruptedException {
		//prop = new Properties();
		//prop.load(new FileInputStream("serenity.properties"));
		//Assert.assertTrue(advertisement.element(By.xpath(prop.getProperty("AdvertisementView_Header"))).isCurrentlyVisible());
	//	advertisement.AddsDeletesubmit();
		//Assert.assertTrue(advertisement.element(By.xpath(AcceptanceSuite.props.getProperty("ToastMessage_Edit_Delete"))).isCurrentlyVisible());
//		advertisement.getDriver().close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	Create Advertisement Add Validation Check Start
	Properties prop;
	@Given("The User is on IndNav Application Advertisements page/Create Advertisements Pop Up")
	public void CreateAdvertisementAddRecordValidation() throws InterruptedException {
//		advertisement.getDriver().manage().window().maximize();
//		advertisement.clickOnLoginButton();
		homePage.openPage();
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();

		advertisement.Addspage();
		advertisement.AdvtAddpage();

	}
	@When("The User Missed Values for any Mandatory fields in Advertisements create Popup and clicks on Submit Button $table")
	public void CreateAdvertsementsAddrecord_validationCheck(ExamplesTable table) throws InterruptedException, FileNotFoundException, IOException {
		prop = new Properties();
		prop.load(new FileInputStream("serenity.properties"));

		for (Map<String, String> row : table.getRows()){
			advertisement.CreateAdertisement_ValidationCheck(row.get("Enterprise"),row.get("AdName"),row.get("AdType"), row.get("AdvertisementDescription"),row.get("AdvertisementImageAdd"));
			Thread.sleep(1000);
			String ActualvalidationMessage = 
//					advertisement.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_ErrorMsg"))).getText();		
					advertisement.getDriver().findElement(By.xpath(prop.getProperty("AdvertisementsAddValidationMessagePath"))).getText();
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$"+ActualvalidationMessage);
		   String ExpectedValidation=row.get("Expected Error Message");
			System.out.println("###############################"+ExpectedValidation);
			Thread.sleep(1000);
			Assert.assertTrue(ActualvalidationMessage.equalsIgnoreCase(ExpectedValidation));
	}
	}
	@Then("Appropriate Validation messages should be Displayed in create Advertisements popup for each combination")
	public void CreateAdvertisment_recordValidationCheckSuccess() {
		
	}	
//	Create Advertisements Validation Check End

//	Edit Advertisements Validation Check Start
	@Given("The User is on IndNav Application Advertisements page/Edit Advertisements Pop Up")
	public void EditAdvertisementsRecordValidation() throws InterruptedException {
		homePage.openPage();
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		advertisement.Addspage();
		advertisement.editAdertisementrecodaddssearchpage();
	}
	@When("The User Missed Values for any Mandatory fields in Advertisements Edit Popup and clicks on Submit Button $table")
	public void EditAdvertisemtentsValidationcheckVerify(ExamplesTable table) throws InterruptedException {
		advertisement.ClickonAdvertisementsEditButtonInListing();
		for (Map<String, String> row : table.getRows()){
			advertisement.VerifyAdvertisements_Edit_RecordValidationCheck(row.get("AdName"),row.get("AdType"), row.get("AdvertisementDescription"));
			Thread.sleep(2000);
			String ActualvalidationMessage = 
//					advertisement.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EnterprisesAdd_ErrorMsg"))).getText();		
					advertisement.getDriver().findElement(By.xpath(prop.getProperty("AdvertisementAdd_MandatoryFieldsMessage"))).getText();
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$"+ActualvalidationMessage);
		   String ExpectedValidation=row.get("Expected Error Message");
			System.out.println("###############################"+ExpectedValidation);
			Thread.sleep(1000);
			Assert.assertTrue(ActualvalidationMessage.equalsIgnoreCase(ExpectedValidation));
	}
		
	}
	@Then("Appropriate Validation messages should be Displayed in Edit Advertisements popup for each combination")
	public void EditAdvertisementRecordValidationVerifySuccess() {
		
	}
	
	
	
	
	
	@Given("The User is on Advertisements Advanced Search page")
	public void TheUserIsOnAdvertisementsAdvancedSearchPage() throws InterruptedException{
		homePage.openPage();
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		
	}
	
	@When("The User Enters Advertisements Search invaild data and Clicks on Submit Button")
	public void TheUserEntersAdvertisementsSearchInvaildDataAndClicksOnSubmitButton() throws InterruptedException{
		advertisement.advertisementsAdvancedSearch();
		
	}
	
	@Then("Appropriate Vaidations should get displayed on Advertisements Advanced Search page")
	public void AppropriateVaidationsShouldGetDisplayedOnAdvertisementsAdvancedSearchPage(){
		
	}
//	Edit Advertisements validation Check End
	
		
}