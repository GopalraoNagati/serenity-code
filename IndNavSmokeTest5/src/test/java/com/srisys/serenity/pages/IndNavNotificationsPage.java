package com.srisys.serenity.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.srisys.serenity.AcceptanceSuite;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class IndNavNotificationsPage extends PageObject {

	WebDriver driver;
	WebElement notificationsHeaderElem;
	WebElement notificationsViewActionElem;
	WebElement notificationsViewCloseElem;
	WebElement notificationsReadElem;
	WebElement notificationsReadBtnElem;
	WebElement notificationsDeleteElem;
	WebElement notificationsDeleteBtnElem;
	WebElement CalenderElem;
	WebElement HoursElem;
	WebElement minituesElem;
	WebElement nextbuttonElem;
	WebElement monthElm;
	WebElement yearelm;
	WebElement columnelm;
	WebElement timenelm;
	
	WebElement endCalenderElem;
	WebElement endHoursElem;
	WebElement endminituesElem;
	WebElement endnextbuttonElem;
	WebElement endmonthElm;
	WebElement endyearelm;
	WebElement endcolumnelm;
	WebElement endtimenelm;
	
	WebElement closeCalenderElem;
	WebElement closeHoursElem;
	WebElement closeminituesElem;
	WebElement closenextbuttonElem;
	WebElement closemonthElm;
	WebElement closeyearelm;
	WebElement closecolumnelm;
	WebElement closetimenelm;

	public void clickOnNotificationsHeader() {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		notificationsHeaderElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Notificationsheader"))));
		notificationsHeaderElem.click();
		
	}

	public void clickONViewBtn() {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("NotificationBanner"))));
		
		notificationsViewActionElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("NotificationsViewAction"))));
		notificationsViewActionElem.click();
		
	}

	public void clickONView_CloseBtn() {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		notificationsViewCloseElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("NotificationsView_CloseButton"))));
		notificationsViewCloseElem.click();
		
	}

	public void clickONReadAction() {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("NotificationBanner"))));
		notificationsReadElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("NotificationsReadaction"))));
		notificationsReadElem.click();
		notificationsReadBtnElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("NotificationsRead_ReadButton"))));
		notificationsReadBtnElem.click();
		
	}

	public void clickONDeleteAction() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		notificationsDeleteElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("NotificationsDeleteaction"))));
		notificationsDeleteElem.click();
		notificationsDeleteBtnElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("NotificationsDelete_DeleteButton"))));;
		notificationsDeleteBtnElem.click();
	}
	
	public void AdvancedSearch() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		Thread.sleep(2000);
		WebElement FleetsAdvanceButtonElem,FleetAdvanceElem,FleetsAdvanceSubmitElem;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("NotificationBanner"))));

		FleetsAdvanceButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("NotificationsAdvancedsearch"))));
		FleetsAdvanceButtonElem.click();
		
		//System.out.println("Banner Displayed="+this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesBanner"))).isEnabled());
		FleetAdvanceElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("NotificationsAdvancedSearchUsername"))));
		FleetAdvanceElem.clear();
		FleetAdvanceElem.sendKeys(AcceptanceSuite.props.getProperty("NotificationsAdvancedSearchUsernameData"));
		Thread.sleep(2000);
		FleetsAdvanceSubmitElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("NotificationsAdvancedSearchSubmitButton"))));
		FleetsAdvanceSubmitElem.click();
		Thread.sleep(500);
		
		//Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesBanner")))).isEnabled());
		//System.out.println("Banner Displayed="+wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EnterpriseResourcesBanner")))).getText());

	
	}
	
	
	
	
	public void notificationAdvancedSearch() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
		Thread.sleep(5000);

		WebElement notificationLink = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("NotificationLink"))));
		notificationLink.click();
		Thread.sleep(2000);
		
		WebElement NotificationAdvanceButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(AcceptanceSuite.props.getProperty("NotificationAdvancedSearchButton"))));
		NotificationAdvanceButtonElem.click();

		WebElement CalenderElem = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(AcceptanceSuite.props.getProperty("NotificationAdvancedSearchStartDate"))));

		Thread.sleep(6000);
		CalenderElem.click();

		monthElm = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("NotificationMonth"))));
		yearelm = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("NotificationYear"))));
		minituesElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("NotificationStartMinutes"))));

		nextbuttonElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("NotificationNextMonth"))));
		timenelm = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("NotificationTime"))));
		HoursElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("NotificationHours"))));
		String userDate = AcceptanceSuite.props.getProperty("NotificationStartDate");
		String column = AcceptanceSuite.props.getProperty("NotificationStartColumnDate");
		Thread.sleep(1000);

		getUserDate(this.getDriver(), userDate, CalenderElem, monthElm, yearelm, column, nextbuttonElem, timenelm,
				HoursElem, minituesElem);

		Thread.sleep(2000);
		WebElement closeCalenderElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("NotificationEndDate"))));

		closeCalenderElem.click();

		closemonthElm = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("NotificationEndMonth"))));
		closeyearelm = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("NotificationEndYear"))));
		closeminituesElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("NotificationEndMin"))));

		closenextbuttonElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("NotificationEndNext"))));
		closetimenelm = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("NotificationEndTime"))));
		closeHoursElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("NotificationEndHours"))));

		String closeuserDate = AcceptanceSuite.props.getProperty("NotificationEndDate1");
		String closecolumn = AcceptanceSuite.props.getProperty("NotificationEndColum");

		Thread.sleep(1000);
		getUserDate(this.getDriver(), closeuserDate, closeCalenderElem, closemonthElm, closeyearelm, closecolumn,
				closenextbuttonElem, closetimenelm, closeHoursElem, closeminituesElem);
		WebElement NotificationAdvanceSubmitElem = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("NotificationSubmitButton"))));
		NotificationAdvanceSubmitElem.click();

	}

	public static void getUserDate(WebDriver driver, String userDate, WebElement CalenderElem, WebElement monthElm,
			WebElement yearelm, String column, WebElement nextbuttonElem, WebElement timenelm, WebElement HoursElem,
			WebElement minituesElem) throws InterruptedException {

		String datePart = userDate.split(":")[0];
		System.out.println("datePart=======" + datePart);

		String userYear = datePart.split("-")[0];
		System.out.println("userYear=======" + userYear);
		String userMonth = datePart.split("-")[1];
		System.out.println("userMonth=======" + userMonth);
		String requiredDate = datePart.split("-")[2];
		System.out.println("requiredDate=======" + requiredDate);

		switch (new Integer(userMonth).intValue()) {
		case 01:
			userMonth = "January";
			break;
		case 02:
			userMonth = "February";
			break;
		case 03:
			userMonth = "March";
			break;
		case 04:
			userMonth = "April";
			break;
		case 05:
			userMonth = "May";
			break;
		case 06:
			userMonth = "June";
			break;
		case 07:
			userMonth = "July";
			break;
		case 8:
			userMonth = "August";
			break;
		case 9:
			userMonth = "September";
			break;
		case 10:
			userMonth = "October";

			break;
		case 11:
			userMonth = "November";
			System.out.println("lllllllllll");
			break;
		case 12:
			userMonth = "December";
			break;
		}
		System.out.println("'''''''''''''''" + userMonth);
		String hours = userDate.split(":")[1];
		String minutes = userDate.split(":")[2];
		System.out.println("hours=======" + hours);
		System.out.println("hours=======" + minutes);
		Thread.sleep(5000);
		String actualHrs = timenelm.getText();
		System.out.println("Time=" + actualHrs);
		System.out.println("Time=" + actualHrs.substring(0, 2));
		while (!actualHrs.substring(actualHrs.length() - 2, actualHrs.length()).equalsIgnoreCase(minutes)) {
			minituesElem.click();
			actualHrs = timenelm.getText();
			System.out.println("llllllllllllllllllvvvvvvvvvvvv" + actualHrs);
		}
		while (!actualHrs.substring(0, 2).equalsIgnoreCase(hours)) {
			HoursElem.click();
			actualHrs = timenelm.getText();
			System.out.println(";;;;;;;;;;;;;;;;;" + actualHrs);
		}
		while (true) {
			System.out.println("lllllllllllllllllccccccc" + yearelm);
			String year = yearelm.getText();
			System.out.println("Year=" + year);
			if (year.equals(userYear)) {
				break;
			} else {
				nextbuttonElem.click();

			}
		}
		while (2 > 1) {
			String month = monthElm.getText();
			System.out.println("Month=" + month + ";userMonth=" + userMonth);

			if (month.equalsIgnoreCase(userMonth)) {
				List<WebElement> columns = driver.findElements(By.xpath(column));
				for (int c = 0; c < columns.size();) {
					System.out.println("rrrrrrrrrrrr" + columns.size());

					String date1 = ((WebElement) columns.get(c)).getText();
					System.out.println("DATES" + date1);
					if (date1.equalsIgnoreCase(requiredDate)
							&& !columns.get(c).getAttribute("class").contains("disabled")) {
						try {
							columns.get(c).click();
							break;
						} catch (Exception e) {

						}
					}
					c++;
				}
				break;
			} else {
				System.out.println("About to click next month" + nextbuttonElem);
				nextbuttonElem.click();
			}
		}
	}

}
