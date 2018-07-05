package com.srisys.serenity.steps;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.srisys.serenity.AcceptanceSuite;
import com.srisys.serenity.pages.IndNavLoginpage;
import com.srisys.serenity.pages.IndNavNotificationsPage;

public class NotificationsSteps {

	
WebDriver driver;
	
    IndNavNotificationsPage notificationspage;
	IndNavLoginpage homePage;
	WebElement ToastMessageElem;
	
	// Scenario 1
			@Given("The user is on Notifications page")
			public void The_user_is_on_Notifications_page() throws FileNotFoundException, IOException, InterruptedException{
				homePage.openPage();	
				homePage.getDriver().manage().window().maximize();
				homePage.clickOnLoginButton();
				notificationspage.clickOnNotificationsHeader();
			}
			@When("The user views a particular record")
			public void The_user_views_a_particular_record() throws InterruptedException{
				notificationspage.clickONViewBtn();
			}
			@Then("Corresponding Notification Record View Page should display")
			public void Corresponding_Notification_Record_View_Page_should_display() throws InterruptedException{
				notificationspage.clickONView_CloseBtn();
				//Assert.assertTrue(notificationspage.element(By.xpath(AcceptanceSuite.props.getProperty("NotificationsExportAction"))).isCurrentlyVisible());
			}
			
			
			
			
	// Scenario 2
			@Given("The user is on Notifications Read page")
			public void The_user_is_on_Notifications_page_Read() throws FileNotFoundException, IOException, InterruptedException{
				//homePage.openPage();	
				//homePage.getDriver().manage().window().maximize();
				//homePage.clickOnLoginButton();
				//notificationspage.clickOnNotificationsHeader();
			}
			
			@When("The user clicks on Read Button on Notifications Read Page")
			public void The_user_clicks_on_Read_Button_on_Notifications_Read_Page() throws InterruptedException{
				notificationspage.clickONReadAction();
			}
			@Then("Conformation Message Should display and the record should successfully read")
			public void Conformation_Message_Should_display_and_the_record_should_successfully_read() throws InterruptedException{
				WebDriverWait wait=new WebDriverWait(notificationspage.getDriver(), 20);
		 		   ToastMessageElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ToastMessage"))));
			}
	
			
			
    // Scenario 3
			@Given("The user is on Notifications Delete page")
			public void The_user_is_on_Notifications_page_Delete() throws FileNotFoundException, IOException, InterruptedException{
				//homePage.openPage();	
				//homePage.getDriver().manage().window().maximize();
				//homePage.clickOnLoginButton();
				//notificationspage.clickOnNotificationsHeader();
			}
			@When("The user clicks on Delete Button on Notifications Delete Page")
			public void The_user_clicks_on_Delete_Button_on_Notifications_Delete_Page() throws InterruptedException{
				notificationspage.clickONDeleteAction();
			}
			@Then("Conformation Message Should display and the record should delete from Listing")
			public void Conformation_Message_Should_display_and_the_record_should_delete_from_Listing() throws InterruptedException{
				//Assert.assertTrue(notificationspage.element(By.xpath(AcceptanceSuite.props.getProperty("NotificationsExportAction"))).isCurrentlyVisible());
			}
			
			@Given ("The User is on Notifications page to Search")
			public void UserIsOnNotificationsPageToSearch(){
				
			}
			@When ("The User enters valid Notifications record Search data and Clicks on Submit Button")
			public void UserSearchesUsingAdvancedSearch() throws InterruptedException{
				notificationspage.AdvancedSearch();
				
			}
			@Then ("Appropriate search results for Notifications should be displayed in the listing")
			public void AppropriateSearchResultsShouldBeDisplayed(){
				
			}
			
			
			
			
			@Given("The User is on Notification Advanced Search page")
			public void TheUserisonNotificationAdvancedSearchpage() throws InterruptedException {
				homePage.openPage();
				homePage.getDriver().manage().window().maximize();
				homePage.clickOnLoginButton();

			}

			@When("The User Enters Notification Search invaild data and Clicks on Submit Button")
			public void TheUserEntersNotificationSearchinvailddataandClicksonSubmitButton()
					throws InterruptedException{
				notificationspage.notificationAdvancedSearch();
			}

			@Then("Appropriate Vaidations should be displayed on Notification Advanced Search page")
			public void AppropriateVaidationsShouldBeDisplayedOnNotificationAdvancedSearchPage()
					throws FileNotFoundException, IOException {

			}


}
