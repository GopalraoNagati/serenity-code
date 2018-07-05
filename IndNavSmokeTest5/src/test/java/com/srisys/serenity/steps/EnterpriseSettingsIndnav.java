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
import com.srisys.serenity.pages.IndnavEnterpriseSettings;
import com.srisys.serenity.pages.IndnavLookups;
//import com.srisys.serenity.pages.TFCRegistration;














import net.serenitybdd.core.Serenity;
import net.thucydides.core.steps.ScenarioSteps;

public class EnterpriseSettingsIndnav extends ScenarioSteps {

	IndnavEnterpriseSettings homePage;
	Properties prop;
	WebElement Elem1;
	
	
	
	
	   //Scenario: When User checks for validations with invalid or Empty Values for the Mandatory fields in Lookups page Create/Create or Add popup

		@Given("The superadmin is on EnterpriseSettings page4")
		public void aa1() throws InterruptedException {
			homePage.openPage();
			homePage.getDriver().manage().window().maximize();
			homePage.clickOnLoginButton();
			//homePage.Lookupspage();
			homePage.EnterpriseSettingspage();
			
			
		}
		@When("The superadmin clicks on advanced search gives the data of some field and clicks on submit button1")
		public void bb1() throws FileNotFoundException, IOException, InterruptedException {
			
			prop = new Properties();
	        prop.load(new FileInputStream("serenity.properties"));
	        homePage.AdvSearch();
	        homePage.AdvSearchFields();
		}

		@Then("Record should be displayed in EnterpriseSettings page Listing1")
		public void cc1() throws FileNotFoundException, IOException, InterruptedException {
			prop = new Properties();
			prop.load(new FileInputStream("serenity.properties"));
			Assert.assertTrue(homePage.element(By.xpath(AcceptanceSuite.props.getProperty("Lookups_ListingPage"))).isCurrentlyVisible());
			homePage.getDriver().close();
		}
		
	
	
	
	//Scenario3: When User tries to Click on all pages then pagination should work
	
	@Given("The superadmin is on EnterpriseSettings page33")
	public void a11() throws FileNotFoundException, IOException, InterruptedException {
		prop = new Properties();
        prop.load(new FileInputStream("serenity.properties"));
		homePage.openPage();
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		homePage.EnterpriseSettingspage();



	}
	@When("The superadmin clicks on first to last pages in listing page11")
	public void b21() throws InterruptedException, FileNotFoundException, IOException {
		prop = new Properties();
        prop.load(new FileInputStream("serenity.properties"));
        homePage.clickOnLastButton();
        
	}

	@Then("Pagination should work correctly11")
	public void c31() throws FileNotFoundException, IOException, InterruptedException {
		prop = new Properties();
		prop.load(new FileInputStream("serenity.properties"));
		Assert.assertTrue(homePage.element(By.xpath(prop.getProperty("LookupsList_LastPage"))).isCurrentlyVisible());
		
		Elem1 = homePage.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("LookupsList_LastPage")));
		String txtLatePageNymber = Elem1.getText();
		System.out.println("Number of Pages="+txtLatePageNymber);
		homePage.clickOnFirstPage();
			      
		          for(int i=0;i<=Integer.parseInt(txtLatePageNymber);i++){
			    	  homePage.clickOnNextButton();
			    
			   }
		
	}
	
	
	//Scenario3:  When User tries to View a existing record then the record should succefully viewed with all particulat fields 
	
	@Given("The superadmin is on EnterpriseSettings page3")
	public void a1() throws FileNotFoundException, IOException, InterruptedException {
		prop = new Properties();
        prop.load(new FileInputStream("serenity.properties"));
		homePage.openPage();
		homePage.getDriver().manage().window().maximize();
		homePage.clickOnLoginButton();
		homePage.EnterpriseSettingspage();

	}
	
	@When("The superadmin views a particular record31")
	public void b2() throws InterruptedException, FileNotFoundException, IOException {
		prop = new Properties();
        prop.load(new FileInputStream("serenity.properties"));
        homePage.lookupsSearch();
        homePage.EnterpriseSettingsviewpage();
	}

	@Then("The pop up for the view record should be opened and all the fields are displayed31")
	public void c3() throws FileNotFoundException, IOException, InterruptedException {
		prop = new Properties();
		prop.load(new FileInputStream("serenity.properties"));
		Assert.assertTrue(homePage.element(By.xpath(prop.getProperty("EnterpriseSettingView_Header"))).isCurrentlyVisible());
		homePage.getDriver().close();
	}
	
	@Given("The superadmin is on EnterpriseSettings page26")
	public void aaa() throws FileNotFoundException, IOException, InterruptedException {
		prop = new Properties();
        prop.load(new FileInputStream("serenity.properties"));
		homePage.openPage();
		homePage.getDriver().manage( ).window().maximize();
		homePage.clickOnLoginButton();
		homePage.EnterpriseSettingspage();
	}
	
	
	@When("The superadmin clicks on edit page of a particular record and updates the record26")
	public void bbb() throws InterruptedException, FileNotFoundException, IOException {
		prop = new Properties();
        prop.load(new FileInputStream("serenity.properties"));
        homePage.lookupsSearch();
        homePage.enterpriseSettingsseditRecord();
	}

	
	@Then("The updated record should be displayed in the listing26")
	public void ccc() throws FileNotFoundException, IOException, InterruptedException {
		prop = new Properties();
		prop.load(new FileInputStream("serenity.properties"));
		//Assert.assertTrue(homePage.element(By.xpath(AcceptanceSuite.props.getProperty("ToastMessage"))).isCurrentlyVisible());
		homePage.getDriver().close();
	 
	}
	
	

		

	
}