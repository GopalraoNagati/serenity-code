package com.srisys.serenity.pages;

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

public class IndNavContractDetailspage extends PageObject{
	
	
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
	
	
	public void contractDetailsCreate() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);

		//Thread.sleep(1000);
		EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprices"))));
		EnterpricesElem.click();

		//Thread.sleep(1000);
		FleetsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ContractDetailsLink"))));
		FleetsElem.click();

		//Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ContractDetailsBanner"))));
		FleetsAddElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ContractAddLink"))));
		//this.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
		FleetsAddElem.click();
		//Thread.sleep(2000);
		Select Enterprice = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ContractEnteprise")))));
		
		Enterprice.selectByVisibleText(AcceptanceSuite.props.getProperty("EnterpriceData"));
		//Thread.sleep(2000);
	

		FunfactsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ContractType"))));

		FunfactsElem.sendKeys(AcceptanceSuite.props.getProperty("ContractTypeData"));
		
		Select parentfleetType = new Select(
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("LisencingMode")))));
		parentfleetType.selectByVisibleText(AcceptanceSuite.props.getProperty("LisencingModeData"));
		
		
		Select PaymentType = new Select(
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("PaymentTerms")))));
		PaymentType.selectByVisibleText(AcceptanceSuite.props.getProperty("PaymentTermsData"));
		
		MobilidElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("PeroidAmount"))));
	
		MobilidElem.sendKeys(AcceptanceSuite.props.getProperty("PeroidAmountData"));
		
		closeCalenderElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ContractDetailcalenders"))));
		closeCalenderElem.click();
		
		closemonthElm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Monthxpaths"))));
		closeyearelm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("YearXpaths"))));
		// columnelm =
		// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("columnsXPath")));


		closenextbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("NextButtonXpaths"))));
		//closetimenelm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ContractColumnXapths"))));
		
		String userDate = AcceptanceSuite.props.getProperty("startdateuser1");
		String column = AcceptanceSuite.props.getProperty("ContractColumnXapths");
		getUserDate1(this.getDriver(), userDate, closeCalenderElem, closemonthElm, closeyearelm, column, closenextbuttonElem);
		 //Thread.sleep(1000);
		
		fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Submitcontractype"))));
		fleetSubmitbuttonElem.click();
	}
	public void contractDetailsEdit() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		Thread.sleep(1000);
		EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprices"))));
		EnterpricesElem.click();
		//Thread.sleep(2000);
		FleetsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ContractDetailsLink"))));
		FleetsElem.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ContractDetailsBanner"))));
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("ContractEdit");
		String valuesString = AcceptanceSuite.props.getProperty("ContracteditValue");

		for (int i = 0; i < xpathsString.split(",").length; i++) {

			xpaths.add(xpathsString.split(",")[i]);
			System.out.println("lllllllllll" + xpaths);
			values.add(valuesString.split(",")[i]);
			System.out.println("lllllllllll" + values);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("ContractEditButton");
		String nextPageXPath = AcceptanceSuite.props.getProperty("ContractNextButton");

		String searchXPath = AcceptanceSuite.props.getProperty("ContractsearchButton");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("ContractsearchClick");

		//Thread.sleep(2000);
		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		
		fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ContractEditsubmitButton"))));
		fleetSubmitbuttonElem.click();
		
		

		
	}
	
	public void contractDetailsView() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		Thread.sleep(1000);
		EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprices"))));
		EnterpricesElem.click();
		
		Thread.sleep(1000);
		FleetsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ContractDetailsLink"))));
		FleetsElem.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ContractDetailsBanner"))));
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("ContractEdit");
		String valuesString = AcceptanceSuite.props.getProperty("ContracteditValue");

		for (int i = 0; i < xpathsString.split(",").length; i++) {

			xpaths.add(xpathsString.split(",")[i]);
			System.out.println("lllllllllll" + xpaths);
			values.add(valuesString.split(",")[i]);
			System.out.println("lllllllllll" + values);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("ContractViewButton");
		String nextPageXPath = AcceptanceSuite.props.getProperty("ContractNextButton");

		String searchXPath = AcceptanceSuite.props.getProperty("ContractsearchButton");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("ContractsearchClick");

		//Thread.sleep(2000);
		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		//Thread.sleep(2000);
		
		/*closeCalenderElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ContractDetailcalenders"))));
		closeCalenderElem.click();
		
		closemonthElm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Monthxpaths"))));
		closeyearelm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("YearXpaths"))));
		// columnelm =
		// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("columnsXPath")));


		closenextbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("NextButtonXpaths"))));
		//closetimenelm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ContractColumnXapths"))));
		
		String userDate = AcceptanceSuite.props.getProperty("startdateuser2");
		String column = AcceptanceSuite.props.getProperty("ContractColumnXapths");
		getUserDate1(this.getDriver(), userDate, closeCalenderElem, closemonthElm, closeyearelm, column, closenextbuttonElem);*/
		//Thread.sleep(2000);
		fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ContractCloseButton"))));
		fleetSubmitbuttonElem.click();
		
		
		

		
	}
	public void contractDetailsDeleteNegative() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(3000);
		EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprices"))));
		EnterpricesElem.click();
		//Thread.sleep(2000);
		FleetsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ContractDetailsLink"))));
		FleetsElem.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ContractDetailsBanner"))));
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("ContractEdit");
		String valuesString = AcceptanceSuite.props.getProperty("ContracteditValue");

		for (int i = 0; i < xpathsString.split(",").length; i++) {

			xpaths.add(xpathsString.split(",")[i]);
			System.out.println("lllllllllll" + xpaths);
			values.add(valuesString.split(",")[i]);
			System.out.println("lllllllllll" + values);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("ContractDeleteButton");
		String nextPageXPath = AcceptanceSuite.props.getProperty("ContractNextButton");

		String searchXPath = AcceptanceSuite.props.getProperty("ContractsearchButton");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("ContractsearchClick");

		//Thread.sleep(2000);
		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		
		if (!action.equalsIgnoreCase("No Match")){
			//Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ContractFinalButton")))).click();
		}
	}
	
	public void contractDetailssearch() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);

		//Thread.sleep(1000);
		EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprices"))));
		EnterpricesElem.click();

		//Thread.sleep(1000);
		FleetsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ContractDetailsLink"))));
		FleetsElem.click();

		//Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ContractDetailsBanner"))));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetBanner"))));
		FleetsAdvanceButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ContractAdvancesSearchButton"))));
		FleetsAdvanceButtonElem.click();
		
		FleetAdvanceElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ContractNumber"))));

		FleetAdvanceElem.sendKeys(AcceptanceSuite.props.getProperty("ContactNumerSeachData"));
		//Thread.sleep(1000);
		FleetsAdvanceSubmitElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("SubmitButtonContract"))));
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
	
	public void ContractDetailsValidationCreateClick(){
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);

		//Thread.sleep(1000);
		
		EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprices"))));
		EnterpricesElem.click();
		
		//Thread.sleep(1000);
		FleetsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ContractDetailsLink"))));
		FleetsElem.click();

		//Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ContractDetailsBanner"))));
		FleetsAddElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ContractAddLink"))));
		//this.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		FleetsAddElem.click();
		
	}
	
	public void ContractDetailsValidationCreate(String enterprise, String contractType, String licensingMode,
								String paymentTerms, String periodAmount) throws InterruptedException{
		
			WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);

			//Thread.sleep(2000);
			if (!enterprise.isEmpty()){
				Select Enterprice = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ContractEnteprise")))));
			
				Enterprice.selectByVisibleText(enterprise);
				//Thread.sleep(2000);
			}

			if (!contractType.isEmpty()){
				Select FunfactsElem = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ContractType")))));
				FunfactsElem.selectByVisibleText(contractType);
			}
			
			if (!licensingMode.isEmpty()){
				Select parentfleetType = new Select(
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("LisencingMode")))));
				parentfleetType.selectByVisibleText(licensingMode);
			}
			
			if (!paymentTerms.isEmpty()){
				Select PaymentType = new Select(
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("PaymentTerms")))));
				PaymentType.selectByVisibleText(paymentTerms);
			}
		
			if (!periodAmount.isEmpty()){
				MobilidElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("PeroidAmount"))));
				MobilidElem.sendKeys(Keys.CONTROL, "a");
				MobilidElem.sendKeys(Keys.DELETE);
				MobilidElem.sendKeys(periodAmount);
			} else {
				MobilidElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("PeroidAmount"))));
				MobilidElem.sendKeys(Keys.CONTROL, "a");
				MobilidElem.sendKeys(Keys.DELETE);
			}
			
			closeCalenderElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ContractDetailcalenders"))));
			closeCalenderElem.click();
			
			closemonthElm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Monthxpaths"))));
			closeyearelm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("YearXpaths"))));
			// columnelm =
			// this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("columnsXPath")));


			closenextbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("NextButtonXpaths"))));
			//closetimenelm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ContractColumnXapths"))));
			
			String userDate = AcceptanceSuite.props.getProperty("startdateuser1");
			String column = AcceptanceSuite.props.getProperty("ContractColumnXapths");
			getUserDate1(this.getDriver(), userDate, closeCalenderElem, closemonthElm, closeyearelm, column, closenextbuttonElem);
			
			
			Thread.sleep(1000);
			
			fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Submitcontractype"))));
			fleetSubmitbuttonElem.click();
	}
	
	
	
	
	
	public void contractDetailsDelete() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(3000);
		EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Enterprices"))));
		EnterpricesElem.click();
		//Thread.sleep(2000);
		FleetsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ContractDetailsLink"))));
		FleetsElem.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ContractDetailsBanner"))));
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("ContractEdit");
		String valuesString = AcceptanceSuite.props.getProperty("ContracteditValue");

		for (int i = 0; i < xpathsString.split(",").length; i++) {

			xpaths.add(xpathsString.split(",")[i]);
			System.out.println("lllllllllll" + xpaths);
			values.add(valuesString.split(",")[i]);
			System.out.println("lllllllllll" + values);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("ContractDeleteButton");
		String nextPageXPath = AcceptanceSuite.props.getProperty("ContractNextButton");

		String searchXPath = AcceptanceSuite.props.getProperty("ContractsearchButton");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("ContractsearchClick");

		//Thread.sleep(2000);
		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		
		if (!action.equalsIgnoreCase("No Match")){
			//Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("ContractFinalButton")))).click();
		}
	}
	
}

	

