package com.srisys.serenity.pages;

import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.srisys.serenity.AcceptanceSuite;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class IndNavMessageGroup extends PageObject{
	
	
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
	WebElement loginButtonElem;
	WebElement usernameElem;
	WebElement passwordElem;
	WebElement submitButtonElem;
	
	public void clickOnLoginButton() throws InterruptedException{
		usernameElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("loginuserName")));
		passwordElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("passWord")));
		loginButtonElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("loginButton")));
		usernameElem.sendKeys(AcceptanceSuite.props.getProperty("userNameValue"));
		passwordElem.sendKeys(AcceptanceSuite.props.getProperty("passwordValue"));
		loginButtonElem.click();
	}
public void messageGroupAdvancesearch() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);

		//Thread.sleep(1000);
       EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("messageGrouphistoryLink"))));
		
		EnterpricesElem.click();
		WebElement EnterprisesElem;
      EnterprisesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("GroupLink"))));
		
		EnterprisesElem.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("MessageBanner"))));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetBanner"))));
		FleetsAdvanceButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetAdvancedSearch"))));
		FleetsAdvanceButtonElem.click();
		
		FleetAdvanceElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FunfactsAdvancesearchAdd"))));

		FleetAdvanceElem.sendKeys(AcceptanceSuite.props.getProperty("FunfactsAdvancesearchAddData"));
		//Thread.sleep(1000);
		FleetsAdvanceSubmitElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EventRegistrationsubmitButton"))));
		FleetsAdvanceSubmitElem.click();
	}
	
	
	public void feedBackcreate() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);

		//Thread.sleep(1000);
		EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("messageGrouphistoryLink"))));
		
		EnterpricesElem.click();
		WebElement EnterprisesElem;
      EnterprisesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("GroupLink"))));
		
		EnterprisesElem.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("MessageBanner"))));

		//Thread.sleep(1000);
		FleetsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("messageGroupaddLink"))));
		FleetsElem.click();

		//Thread.sleep(1000);
		
		
		//Thread.sleep(2000);
		Select Enterprice = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("MessageGroupEnterprises")))));
		
		Enterprice.selectByVisibleText(AcceptanceSuite.props.getProperty("MessageGroupEnterprisesData"));
		Thread.sleep(1000);
		WebElement mobilenumberElem;
		mobilenumberElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("MessageGroupname"))));
		mobilenumberElem.sendKeys(AcceptanceSuite.props.getProperty("MessageGroupnameData"));
		
		Thread.sleep(1000);
		
		FleetsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Availiableusers"))));
		FleetsElem.click();
		
		//Thread.sleep(2000);
	

		FunfactsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("messageButton"))));

		FunfactsElem.click();

		
		fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("messagesubmitButton"))));
		fleetSubmitbuttonElem.click();
	}
	
	
	public void messageGroupEdit() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(3000);
        EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("messageGrouphistoryLink"))));
		
		EnterpricesElem.click();
		WebElement EnterprisesElem;
        EnterprisesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("GroupLink"))));
		
		EnterprisesElem.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("MessageBanner"))));
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("messagegroupViewxpths");
		String valuesString = AcceptanceSuite.props.getProperty("messagegroupViewValue");

		for (int i = 0; i < xpathsString.split(",").length; i++) {

			xpaths.add(xpathsString.split(",")[i]);
			//System.out.println("lllllllllll" + xpaths);
			values.add(valuesString.split(",")[i]);
			//System.out.println("lllllllllll" + values);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("messageGroupEditrecord");
		String nextPageXPath = AcceptanceSuite.props.getProperty("messageGroupnextButton");

		String searchXPath = AcceptanceSuite.props.getProperty("messageGroupsearch");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("messageGroupsearchbutton");

		//Thread.sleep(2000);
		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		//Thread.sleep(2000);
		
		MobilidElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("messageGroupEdit"))));
		MobilidElem.clear();
		MobilidElem.sendKeys(AcceptanceSuite.props.getProperty("messageGroupEditData"));
		Thread.sleep(2000);
		fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("messageGroupEditsubmit"))));
		fleetSubmitbuttonElem.click();
		
		

		
	}
	
	public void messagegroupView() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(3000);
		
		//WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		Thread.sleep(1000);
        EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("messageGrouphistoryLink"))));
		
		EnterpricesElem.click();
		WebElement EnterprisesElem;
      EnterprisesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("GroupLink"))));
		
		EnterprisesElem.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("MessageBanner"))));
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("messagegroupViewxpths");
		String valuesString = AcceptanceSuite.props.getProperty("messagegroupViewmodifiedValue");

		for (int i = 0; i < xpathsString.split(",").length; i++) {

			xpaths.add(xpathsString.split(",")[i]);
			//System.out.println("lllllllllll" + xpaths);
			values.add(valuesString.split(",")[i]);
			//System.out.println("lllllllllll" + values);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("messageGroupViewrecord");
		String nextPageXPath = AcceptanceSuite.props.getProperty("messageGroupnextButton");

		String searchXPath = AcceptanceSuite.props.getProperty("messageGroupsearch");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("messageGroupsearchbutton");

		//Thread.sleep(2000);
		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		//Thread.sleep(2000);
		
		
		//Thread.sleep(2000);
		fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("messageGroupviewclose"))));
		fleetSubmitbuttonElem.click();
		
		

		
	}
	public void messagegroupBlock() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(3000);
		
		//WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(3000);
        EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("messageGrouphistoryLink"))));
		
		EnterpricesElem.click();
		WebElement EnterprisesElem;
      EnterprisesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("GroupLink"))));
		
		EnterprisesElem.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("MessageBanner"))));
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("messagegroupViewxpths");
		String valuesString = AcceptanceSuite.props.getProperty("messagegroupViewmodifiedValue");

		for (int i = 0; i < xpathsString.split(",").length; i++) {
			xpaths.add(xpathsString.split(",")[i]);
			//System.out.println("lllllllllll" + xpaths);
			values.add(valuesString.split(",")[i]);
			//System.out.println("lllllllllll" + values);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("messageGroupBlockRecord");
		String nextPageXPath = AcceptanceSuite.props.getProperty("messageGroupnextButton");

		String searchXPath = AcceptanceSuite.props.getProperty("messageGroupsearch");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("messageGroupsearchbutton");

		//Thread.sleep(2000);
		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		//Thread.sleep(2000);
		
		//Thread.sleep(2000);
		fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("messageBlockbutton"))));
		fleetSubmitbuttonElem.click();
		
		//unblock
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("messageBlockbutton"))));
		fleetSubmitbuttonElem.click();
		Thread.sleep(4000);
 }
	
	public void messageGroupAdvancesearch1() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleedbackBanner"))));
		
		WebElement uieditElem;
		uieditElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("feedbackadvancesearh"))));
		uieditElem.click();
		
		  WebElement SearchElm;
	        SearchElm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("feedbackobjectadvancesearch"))));
	        SearchElm.sendKeys(AcceptanceSuite.props.getProperty("feedbackobjectadvanceData"));
	        
	        WebElement searchsubmitElem;
	        searchsubmitElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("feedbackadvancesubmit"))));
	        searchsubmitElem.click();
		
	}
	
	public void messagegroupDelete() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(3000);
		
		//WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		//Thread.sleep(3000);
        EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("messageGrouphistoryLink"))));
		
		EnterpricesElem.click();
		WebElement EnterprisesElem;
      EnterprisesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("GroupLink"))));
		
		EnterprisesElem.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("MessageBanner"))));
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();

		String xpathsString = AcceptanceSuite.props.getProperty("messagegroupDeletexpths");
		String valuesString = AcceptanceSuite.props.getProperty("messagegroupDeleteValue");

		for (int i = 0; i < xpathsString.split(",").length; i++) {
			xpaths.add(xpathsString.split(",")[i]);
			//System.out.println("lllllllllll" + xpaths);
			values.add(valuesString.split(",")[i]);
			//System.out.println("lllllllllll" + values);
		}

		String actionXPath = AcceptanceSuite.props.getProperty("messageGroupDeleteRecord");
		String nextPageXPath = AcceptanceSuite.props.getProperty("messageGroupnextButton");

		String searchXPath = AcceptanceSuite.props.getProperty("messageGroupsearch");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("messageGroupsearchbutton");

		//Thread.sleep(2000);
		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		//Thread.sleep(2000);
		
		//Thread.sleep(2000);
		fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("messageDeletebutton"))));
		fleetSubmitbuttonElem.click();
		
	
	}
	
	
	
	
	public void messageGroupHeader() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);

		WebElement headerLink = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("messageGrouphistoryLink"))));
		headerLink.click();

		WebElement groupLink;
		groupLink = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("GroupLink"))));
		groupLink.click();

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("MessageBanner"))));

		WebElement addLink = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("messageGroupaddLink"))));
		addLink.click();
	}

	public void invalidCombinationsAdd(String Enterprise, String GroupName) throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
		Thread.sleep(2000);

		Select enterprise = new Select(wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("MessageGroupEnterprises")))));
		enterprise.selectByVisibleText(Enterprise);

		WebElement groupName;
		groupName = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("MessageGroupname"))));
		groupName.sendKeys(Keys.CONTROL, "a");
		groupName.sendKeys(Keys.DELETE);
		groupName.sendKeys(GroupName);

		WebElement adminUsers;
		if (!Enterprise.equalsIgnoreCase("Select")) {
			adminUsers = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("MessageGroupAdminUser"))));
			adminUsers.click();

			WebElement adminUsersNxt;
			adminUsersNxt = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("MessageGroupAdminNext"))));
			adminUsersNxt.click();
		}

		WebElement submitButton;
		submitButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("messagesubmitButton"))));
		submitButton.click();

	}

	public void invalidCombinationsEditHeader() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
		Thread.sleep(2000);
		WebElement headerLink = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("messageGrouphistoryLink"))));
		headerLink.click();

		WebElement groupLink;
		groupLink = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("GroupLink"))));
		groupLink.click();

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("MessageBanner"))));
		
		ArrayList<String> xpaths = new ArrayList<String>();
		ArrayList<String> values = new ArrayList<String>();
		String xpathsString = AcceptanceSuite.props.getProperty("messagegroupViewxpths");
		String valuesString = AcceptanceSuite.props.getProperty("messagegroupViewValue");

		for (int i = 0; i < xpathsString.split(",").length; i++) {

			xpaths.add(xpathsString.split(",")[i]);
			values.add(valuesString.split(",")[i]);

		}

		String actionXPath = AcceptanceSuite.props.getProperty("messageGroupEditrecord");
		String nextPageXPath = AcceptanceSuite.props.getProperty("messageGroupnextButton");
		String searchXPath = AcceptanceSuite.props.getProperty("messageGroupsearch");
		String searchButtonXPath = AcceptanceSuite.props.getProperty("messageGroupsearchbutton");

		String action = AcceptanceSuite.getXPath(xpaths, values, actionXPath, nextPageXPath, this.getDriver(),
				searchXPath, searchButtonXPath);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action))).click();
		Thread.sleep(1000);

	}

	public void invalidCombinationsEdit(String GroupName) throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
		Thread.sleep(2000);
		
		WebElement groupName;
		groupName = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("MessageGroupname"))));
		groupName.sendKeys(Keys.CONTROL, "a");
		groupName.sendKeys(Keys.DELETE);
		groupName.sendKeys(GroupName);
		
		WebElement submitButton;
		submitButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("messagesubmitButton"))));
		submitButton.click();
		
	}

}
