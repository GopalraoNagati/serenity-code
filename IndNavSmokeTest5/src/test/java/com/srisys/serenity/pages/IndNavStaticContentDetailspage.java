package com.srisys.serenity.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.srisys.serenity.AcceptanceSuite;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class IndNavStaticContentDetailspage extends PageObject{
	
	
	WebElement EnterpriceElem;
	WebElement EnterpricesElem;
    WebElement FleetsElem;
    WebElement  FunfactsElem;
	WebElement FleetsAddElem;
	WebElement FleetElem;
	WebElement MobilidElem;
	WebElement fleetemailElem;
	WebElement fleetcontactDetailsElem;
	WebElement fleetaddressDetailsElem;
	WebElement fleetaddressLine1Elem;
	WebElement fleetcityElem;
	WebElement fleetzipElem;
	WebElement fleetLattitudeElem;
	WebElement fleetLongitudeElem;
	WebElement SettingsElem;
	WebElement preferenceElem;
	WebElement attributeElem;
	WebElement fleetSubmitbuttonElem;
	WebElement advancedReservationWindowInDays;
	
	WebElement FleetAdvanceElem;
	WebElement FleetsAdvanceSubmitElem;
	WebElement FleetsAdvanceButtonElem;
	
	WebElement closeCalenderElem;
	WebElement closeHoursElem;
	WebElement closeminituesElem;
	WebElement closenextbuttonElem;
	WebElement closemonthElm;
	WebElement closeyearelm;
	WebElement closecolumnelm;
	WebElement closetimenelm;
	WebElement staticElem;
	
	
	public void staticDetailsCreate() throws InterruptedException, AWTException{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);

		//Thread.sleep(1000);
		EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprices"))));
		EnterpricesElem.click();

		//Thread.sleep(1000);
		FleetsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("StaticContentpage"))));
		FleetsElem.click();

		//Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("StaticDetailsBanner"))));
		FleetsAddElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("StaticcontentAdd"))));
		//this.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
		FleetsAddElem.click();
		//Thread.sleep(2000);
		Select Enterprice = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("StaicContentEnterprise")))));
		
		Enterprice.selectByVisibleText(AcceptanceSuite.props.getProperty("EnterpriceData"));
		//Thread.sleep(2000);
	

		Thread.sleep(1000);
		Select parentfleetType = new Select(
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("StaticContentFleetId")))));
		parentfleetType.selectByVisibleText(AcceptanceSuite.props.getProperty("StaticContentFleetIdData"));
		
		FunfactsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("staticContentMenu"))));

		FunfactsElem.sendKeys(AcceptanceSuite.props.getProperty("staticContentMenuData"));
		
		
		Thread.sleep(1000);
		Select PaymentType = new Select(
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("StaticContentMenuTypeId")))));
		PaymentType.selectByVisibleText(AcceptanceSuite.props.getProperty("StaticContentMenuTypeIdData"));
		
		Thread.sleep(1000);
		Select Image = new Select(
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("StaticpageId")))));
		Image.selectByVisibleText(AcceptanceSuite.props.getProperty("StaticpageIdData"));
		
		Thread.sleep(2000);
		staticElem=this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("StaticInputfileId")));
		staticElem.click();
		
		//staticElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("StaticInputfileId"))));
		//staticElem.click();
	    String userData	=AcceptanceSuite.props.getProperty("userData");
		StringSelection ss = new StringSelection(userData);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		// imitate mouse events like ENTER, CTRL+C, CTRL+V
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		 //Thread.sleep(1000);
		
		fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("StaticContentSubmit"))));
		fleetSubmitbuttonElem.click();
	}
	public void statiDetailsEdit() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(3000);
		EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprices"))));
		EnterpricesElem.click();
		//Thread.sleep(2000);
		FleetsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("StaticContentpage"))));
		FleetsElem.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("StaticDetailsBanner"))));
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("StaticEdit");
		String valuesString = AcceptanceSuite.props.getProperty("StaticeditValue");

		for (int i = 0; i < xpathsString.split(",").length; i++) {

			xpaths.add(xpathsString.split(",")[i]);
			System.out.println("lllllllllll" + xpaths);
			values.add(valuesString.split(",")[i]);
			System.out.println("lllllllllll" + values);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("StaticEditButton");
		String nextPageXPath = AcceptanceSuite.props.getProperty("StaticNextButton");

		String searchXPath = AcceptanceSuite.props.getProperty("StaticearchButton");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("StaticsearchClick");

		//Thread.sleep(2000);
		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);
	    Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		
		FunfactsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("StaticEditMenuButton"))));
		FunfactsElem.clear();
		FunfactsElem.sendKeys(AcceptanceSuite.props.getProperty("staticEditMenuData"));
		
		//Thread.sleep(2000);
		fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("staticEditsubmitButton"))));
		fleetSubmitbuttonElem.click();
		
		

		
	}
	
	public void statiDetailsView() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(3000);
		EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprices"))));
		EnterpricesElem.click();
		//Thread.sleep(2000);
		FleetsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("StaticContentpage"))));
		FleetsElem.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("StaticDetailsBanner"))));
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("StaticEdit");
		String valuesString = AcceptanceSuite.props.getProperty("StaticeditValue");

		for (int i = 0; i < xpathsString.split(",").length; i++) {

			xpaths.add(xpathsString.split(",")[i]);
			System.out.println("lllllllllll" + xpaths);
			values.add(valuesString.split(",")[i]);
			System.out.println("lllllllllll" + values);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("StaticViewtButton");
		String nextPageXPath = AcceptanceSuite.props.getProperty("StaticNextButton");

		String searchXPath = AcceptanceSuite.props.getProperty("StaticearchButton");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("StaticsearchClick");

		//Thread.sleep(2000);
		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		
		
		
		//Thread.sleep(2000);
		fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("StaticViewtcloseButton"))));
		fleetSubmitbuttonElem.click();
		
		
		
		

		
	}
	public void statiDetailsDelete() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(3000);
		EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprices"))));
		EnterpricesElem.click();
		//Thread.sleep(2000);
		FleetsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("StaticContentpage"))));
		FleetsElem.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("StaticDetailsBanner"))));
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("StaticEdit");
		String valuesString = AcceptanceSuite.props.getProperty("StaticeditValue");

		for (int i = 0; i < xpathsString.split(",").length; i++) {

			xpaths.add(xpathsString.split(",")[i]);
			System.out.println("lllllllllll" + xpaths);
			values.add(valuesString.split(",")[i]);
			System.out.println("lllllllllll" + values);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("StaticDeleteButton");
		String nextPageXPath = AcceptanceSuite.props.getProperty("StaticNextButton");

		String searchXPath = AcceptanceSuite.props.getProperty("StaticearchButton");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("StaticsearchClick");

		//Thread.sleep(2000);
		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		
		if (!action.equalsIgnoreCase("No Match")){
			//Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("StaticFinalDeleteButton")))).click();
		}
	}
	
	public void statiDetailssearch() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);

		Thread.sleep(1000);
		EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprices"))));
		EnterpricesElem.click();

		//Thread.sleep(1000);
		FleetsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("StaticContentpage"))));
		FleetsElem.click();

		//Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("StaticDetailsBanner"))));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetBanner"))));
		FleetsAdvanceButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("StaticAdvanceSearchButton"))));
		FleetsAdvanceButtonElem.click();
		
		FleetAdvanceElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("StaticFleetsearch"))));

		FleetAdvanceElem.sendKeys(AcceptanceSuite.props.getProperty("StaticFleetsearchData"));
		//Thread.sleep(1000);
		FleetsAdvanceSubmitElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Staticsubmitsearch"))));
		FleetsAdvanceSubmitElem.click();
	}
	public static void getUserDate1(WebDriver driver, String userDate, WebElement CalenderElem, WebElement monthElm,
			WebElement yearelm, String column, WebElement nextbuttonElem) throws InterruptedException {

		System.out.println("lllllllll" + userDate);
		System.out.println("lllllllllllllllllcccccccvvvvvvvvvvvvvvvvvv"+yearelm.getText());
		//
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
System.out.println("'''''''''''''''"+userMonth);
		
		
		

		// Get correct year
		while (true) {
			System.out.println("lllllllllllllllllccccccc"+yearelm);
			String year = yearelm.getText();
			// String year =
			// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("yearXPath"))).getText();
			// String year=driver.findElement(By.xpath(yearXPath)).getText();
			System.out.println("Year=" + year);
			if (year.equals(userYear)) {
				break;
			} else {
				// nextbuttonElem =
				// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("nextButtonXPath")));
				nextbuttonElem.click();
				// driver.findElement(By.xpath(nextButtonXPath)).click();
			}
		}
		// Get correct month
		while (2 > 1) {
			String month = monthElm.getText();
			// String month =
			// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("monthXPath"))).getText();
			// String month=driver.findElement(By.xpath(monthXPath)).getText();
			System.out.println("Month=" + month + ";userMonth=" + userMonth);

			if (month.equalsIgnoreCase(userMonth)) {
				List<WebElement> columns = driver.findElements(By.xpath(column));
				System.out.println(":columns========"+columns.size());
				// List<WebElement> columns = columnelm

				// List<WebElement> columns =
				// driver.findElements(By.xpath(columnsXPath));

				// Using For Loop to iterate over cells
				for (int c = 0; c < columns.size();) {
					System.out.println("rrrrrrrrrrrr" + columns.size());

					String date1 = ((WebElement) columns.get(c)).getText();
					System.out.println("DATES" + date1);
					// System.out.println(columns.get(c).getAttribute("class"));
					// System.out.println(columns.get(c).getCssValue("class"));
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
				// driver.findElement(By.xpath("//span[@class='fa
				// fa-angle-right']")).click();
				System.out.println("About to click next month" + nextbuttonElem);
				// driver.findElement(By.xpath(nextButtonXPath)).click();
				nextbuttonElem.click();
				// nextbuttonElem =
				// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("nextButtonXPath")));
				// nextbuttonElem.click();
			}
		}
	}
	
	
	
	public void ValidationsHeader() throws InterruptedException, AWTException{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
	 EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprices"))));
	 EnterpricesElem.click();

	//Thread.sleep(1000);
	  FleetsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("StaticContentpage"))));
	  FleetsElem.click();

	//Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("StaticDetailsBanner"))));
	  FleetsAddElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("StaticcontentAdd"))));
	//this.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      FleetsAddElem.click();
	}
	
	public void ValidationsAdd(String Enterprise,String Fleet,String MenuName,String Type,String page,String ImageName) throws InterruptedException, AWTException{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);

		//Thread.sleep(1000);
	
		
		//Thread.sleep(2000);
		if(!Enterprise.isEmpty()){
		Select Enterprice = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("StaicContentEnterprise")))));
		
		Enterprice.selectByVisibleText(Enterprise);
		}
		//Thread.sleep(2000);
	

		Thread.sleep(1000);
		if(!Fleet.isEmpty()){
		Select parentfleetType = new Select(
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("StaticContentFleetId")))));
		parentfleetType.selectByVisibleText(Fleet);
		}
		if(!MenuName.isEmpty()){
		FunfactsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("staticContentMenu"))));
		FunfactsElem.sendKeys(Keys.CONTROL, "a");
		FunfactsElem.sendKeys(Keys.DELETE);
		FunfactsElem.sendKeys(MenuName);
		}
		
		
		
		Thread.sleep(1000);
		if(!Type.isEmpty()){
		Select PaymentType = new Select(
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("StaticContentMenuTypeId")))));
		PaymentType.selectByVisibleText(Type);
		}
		
		Thread.sleep(1000);
		if(!page.isEmpty()){
		Select Image = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("StaticpageId")))));
		Image.selectByVisibleText(page);
		}
		if(!ImageName.isEmpty()){
		Thread.sleep(2000);
		staticElem=this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("StaticInputfileId")));
		staticElem.click();
		
		//staticElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("StaticInputfileId"))));
		//staticElem.click();
	    String userData	=AcceptanceSuite.props.getProperty("userData");
		StringSelection ss = new StringSelection(userData);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		// imitate mouse events like ENTER, CTRL+C, CTRL+V
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		}
		
		
		
		
		 //Thread.sleep(1000);
		
		fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("StaticContentSubmit"))));
		fleetSubmitbuttonElem.click();
	}
	
	
	public void ValidationsEdit() throws InterruptedException, AWTException{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(3000);
		EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprices"))));
		EnterpricesElem.click();
		//Thread.sleep(2000);
		FleetsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("StaticContentpage"))));
		FleetsElem.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("StaticDetailsBanner"))));
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("StaticEdit");
		String valuesString = AcceptanceSuite.props.getProperty("StaticeditValue");

		for (int i = 0; i < xpathsString.split(",").length; i++) {

			xpaths.add(xpathsString.split(",")[i]);
			System.out.println("lllllllllll" + xpaths);
			values.add(valuesString.split(",")[i]);
			System.out.println("lllllllllll" + values);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("StaticEditButton");
		String nextPageXPath = AcceptanceSuite.props.getProperty("StaticNextButton");

		String searchXPath = AcceptanceSuite.props.getProperty("StaticearchButton");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("StaticsearchClick");

		//Thread.sleep(2000);
		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);
	    Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		
		FunfactsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("StaticEditMenuButton"))));
		FunfactsElem.sendKeys(Keys.CONTROL, "a");
		FunfactsElem.sendKeys(Keys.DELETE);
		
		
		//Thread.sleep(2000);
		fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("staticEditsubmitButton"))));
		fleetSubmitbuttonElem.click();
	
}
	
}
