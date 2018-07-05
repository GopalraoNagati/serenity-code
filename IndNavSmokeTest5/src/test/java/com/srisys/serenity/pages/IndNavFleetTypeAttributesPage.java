package com.srisys.serenity.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.srisys.serenity.AcceptanceSuite;

import net.serenitybdd.core.pages.PageObject;

public class IndNavFleetTypeAttributesPage extends PageObject {

	WebElement EnterprisesElem;
	WebElement FleetTypeAttributesElem;
	WebElement FleetTypeAttributeAddElem;
	WebElement FleetTypeAttributeAddAttributeNameElem;
	WebElement FleetTypeAttributeAddDescriptionElem;		
	WebElement FleetTypeAttributeAddEnabledElem;
	WebElement FleetTypeAttributeAddMandatoryElem;
	WebElement FleetTypeAttributeAddSubmitButtonElem;

	
	WebElement EnterpriceElem;
	WebElement EnterpricesElem;
    WebElement FleetTypeAttElem;
	WebElement AttributeNameElem;
	WebElement DescriptionElem;
	WebElement FleetTypesAttAddElem;
	WebElement fleetSubmitbuttonElem;
	WebElement advancedReservationWindowInDays;
	WebElement loginButtonElem;
	WebElement usernameElem;
	WebElement passwordElem;
	WebElement submitButtonElem;
	WebElement FleetAdvanceElem;
	WebElement FleetTypesAttEditElem;
	WebElement FleetsAdvanceSubmitElem;
	WebElement FleetsAdvanceButtonElem;
	String defaultURL;
	
	



	public void fleetTypeAttributesAdvanced() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		Thread.sleep(3000);
		EnterprisesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTyeAttribute_EnterpriseHeader"))));
		EnterprisesElem.click();
		//Thread.sleep(2000);
		FleetTypeAttributesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeLink"))));
		FleetTypeAttributesElem.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeBanner"))));
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetBanner"))));
		FleetsAdvanceButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetAdvancedSearch"))));
		FleetsAdvanceButtonElem.click();
		
		FleetAdvanceElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributesAdvancesearchAttributes"))));

		FleetAdvanceElem.sendKeys(AcceptanceSuite.props.getProperty("FleetTypeAttributesAdvancesearchInputsData"));
		//Thread.sleep(1000);
		FleetsAdvanceSubmitElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributesAdvanceSubmit"))));
		FleetsAdvanceSubmitElem.click();
		Thread.sleep(500);
		


	}
	
	public void fleetTypeAttributesCreate() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		EnterprisesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTyeAttribute_EnterpriseHeader"))));
		EnterprisesElem.click();

		Thread.sleep(1000);
		FleetTypeAttributesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeLink"))));
		FleetTypeAttributesElem.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeBanner"))));
		FleetTypeAttributeAddElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeAdd"))));
		FleetTypeAttributeAddElem.click();
				
		Select FleetType = new Select(
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeAdd_Enterprise")))));
		FleetType.selectByVisibleText(AcceptanceSuite.props.getProperty("FleetTypeAttributeAdd_EnterpriseValue"));

		Thread.sleep(1000);
		Select FleetTypeAttributeAddFleetTypeElem = new Select(
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeAdd_FleetType")))));
		FleetTypeAttributeAddFleetTypeElem.selectByVisibleText(AcceptanceSuite.props.getProperty("FleetTypeAttributeAdd_FleetTypeValue"));

		FleetTypeAttributeAddAttributeNameElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeAdd_AttributeName"))));
		FleetTypeAttributeAddAttributeNameElem.sendKeys(AcceptanceSuite.props.getProperty("FleetTypeAttributeAdd_AttributeNameValue"));
		
		Select FleetTypeAttributeAddAttributeTypeElem = new Select(
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeAdd_AttributeType")))));
		FleetTypeAttributeAddAttributeTypeElem.selectByVisibleText(AcceptanceSuite.props.getProperty("FleetTypeAttributeAdd_AttributeTypeValue"));

		Select FleetTypeAttributeAddLookupTypeElem = new Select(
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeAdd_LookupType")))));
		FleetTypeAttributeAddLookupTypeElem.selectByVisibleText(AcceptanceSuite.props.getProperty("FleetTypeAttributeAdd_LookupTypeValue"));
		

		FleetTypeAttributeAddDescriptionElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeAdd_Description"))));
		FleetTypeAttributeAddDescriptionElem.sendKeys(AcceptanceSuite.props.getProperty("FleetTypeAttributeAdd_DescriptionValue"));
		
		FleetTypeAttributeAddEnabledElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeAdd_EnabledField"))));
		//if (!FleetTypeAttributeAddEnabledElem.isSelected()){
			//FleetTypeAttributeAddEnabledElem.click();
		//}
		
		FleetTypeAttributeAddMandatoryElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeAdd_MandatoryField"))));
		FleetTypeAttributeAddMandatoryElem.click();
		
		Select FleetTypeAttributeAddDefaultValueElem = new Select(
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeAdd_DefaultValue")))));
		FleetTypeAttributeAddDefaultValueElem.selectByVisibleText(AcceptanceSuite.props.getProperty("FleetTypeAttributeAdd_DefaultValueValue"));
		
		FleetTypeAttributeAddSubmitButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeAdd_SubmitButton"))));
		FleetTypeAttributeAddSubmitButtonElem.click();
	}
	
	public void fleetTypeAttributesEdit() throws InterruptedException{
		
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		EnterprisesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTyeAttribute_EnterpriseHeader"))));
		EnterprisesElem.click();

		FleetTypeAttributesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeLink"))));
		FleetTypeAttributesElem.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeBanner"))));
		WebElement FleetTypeAttributeEditSearchElem =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeEdit_Search"))));
		FleetTypeAttributeEditSearchElem.sendKeys(AcceptanceSuite.props.getProperty("FleetTypeAttributeEdit_SearchTextValue"));
		
		WebElement FleetTypeAttributeEditSearchButtonElem  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeEdit_SearchButton"))));
		FleetTypeAttributeEditSearchButtonElem.click();
		
		Thread.sleep(1000);
		WebElement FleetTypeAttributeEditEditButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeEdit_EditButton"))));
		FleetTypeAttributeEditEditButton.click();
		
		WebElement FleetTypeAttributeEditAttributeName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeEdit_AttributeName"))));
		FleetTypeAttributeEditAttributeName.clear();
		FleetTypeAttributeEditAttributeName.sendKeys(AcceptanceSuite.props.getProperty("FleetTypeAttributeEdit_ReplaceValue"));
		
		WebElement FleetTypeAttributeEdit_SubmitButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeEdit_SubmitButton"))));
		FleetTypeAttributeEdit_SubmitButtonElem.click();
		
	}
	
	
	public void fleetTypeAttributesView() throws InterruptedException{
		
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		EnterprisesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTyeAttribute_EnterpriseHeader"))));
		EnterprisesElem.click();

		FleetTypeAttributesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeLink"))));
		FleetTypeAttributesElem.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeBanner"))));
		WebElement FleetTypeAttributeEditSearchElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeDelete_Search"))));
		FleetTypeAttributeEditSearchElem.clear();
		FleetTypeAttributeEditSearchElem.sendKeys(AcceptanceSuite.props.getProperty("FleetTypeAttributeDelete_SearchTextValue"));
			
		WebElement FleetTypeAttributeEditSearchButtonElem  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeDelete_SearchButton"))));
		FleetTypeAttributeEditSearchButtonElem.click();
		
		Thread.sleep(1000);
		WebElement FleetTypeAttributeDeleteButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttrbutesViewbutton"))));
		FleetTypeAttributeDeleteButton.click();
			
		WebElement FleetTypeAttributeDeleteConfirmButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributesViewfinal"))));
		FleetTypeAttributeDeleteConfirmButton.click();
	  }
public void fleetTypeAttributesDelete() throws InterruptedException{
		
	WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
	EnterprisesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTyeAttribute_EnterpriseHeader"))));
	EnterprisesElem.click();

	FleetTypeAttributesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeLink"))));
	FleetTypeAttributesElem.click();
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeBanner"))));
	WebElement FleetTypeAttributeEditSearchElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeDelete_Search"))));
	FleetTypeAttributeEditSearchElem.sendKeys(AcceptanceSuite.props.getProperty("FleetTypeAttributeDelete_SearchTextValue"));
		
	WebElement FleetTypeAttributeEditSearchButtonElem  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeDelete_SearchButton"))));
	FleetTypeAttributeEditSearchButtonElem.click();
	
	Thread.sleep(1000);
	WebElement FleetTypeAttributeDeleteButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeDelete_DeleteButton"))));
	FleetTypeAttributeDeleteButton.click();
		
	WebElement FleetTypeAttributeDeleteConfirmButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeDelete_ConfirmDeleteButton"))));
	FleetTypeAttributeDeleteConfirmButton.click();
  }


public void fleetTypeAttCreate() throws InterruptedException{


	  WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
	  EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTyeAttribute_EnterpriseHeader"))));
	  EnterpricesElem.click();

	  //Thread.sleep(1000);
	  FleetTypeAttElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeLink"))));
	  FleetTypeAttElem.click();

	  Thread.sleep(1000);
	  
	  //this.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeBanner"))));
	  FleetTypesAttAddElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeAdd"))));
	  FleetTypesAttAddElem.click();
	  
	  Thread.sleep(2000);
	  /*fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Submitbutton"))));
	  fleetSubmitbuttonElem.click();*/
	 }
	 
	 public void FleetTypeAttNegativeCases(String Enterprise, String FleetType, String AttributeName, String AttributeType,
	   String Description) throws InterruptedException{
	  
	  //System.out.println("=========="+EMailId+"kkkkkkkkkkkk"+EMailId);
	  WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);

	  
	  //System.out.println("-------"+EnterpriceResourcesElem+"22222222222"+EnterpriceResourcesElem);
	  if(!Enterprise.isEmpty()){
	  Select Enterprice = new
	   Select( wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeAdd_Enterprise")))));
	   Enterprice.selectByVisibleText(Enterprise);
	  }
	  if(!FleetType.isEmpty()){
	   Select FleetTypes = new Select(
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeAdd_FleetType")))));
	   FleetTypes.selectByVisibleText(FleetType);
	    }
	  if(!AttributeName.isEmpty()){
	   AttributeNameElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeAdd_AttributeName"))));
	   AttributeNameElem.clear();
	   AttributeNameElem.sendKeys(AttributeName);
	    }
	  if(!AttributeType.isEmpty()){
	   Select AttType = new Select(
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeAdd_AttributeType")))));
	   AttType.selectByVisibleText(AttributeType);
	    }
	  if(!Description.isEmpty()){
	   DescriptionElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeAdd_Description"))));
	   DescriptionElem.clear();
	   DescriptionElem.sendKeys(Description);
	    }
	  submitButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeAdd_SubmitButton"))));
	   submitButtonElem.click();
	}
	 public void fleetTypeAttributesDeleteNegative() throws InterruptedException{
	  
	  WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
	  EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTyeAttribute_EnterpriseHeader"))));
	  EnterpricesElem.click();

	  FleetTypeAttElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeLink"))));
	  FleetTypeAttElem.click();
	  
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeBanner"))));
	  WebElement FleetTypeAttributeEditSearchElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeDelete_Search"))));
	  FleetTypeAttributeEditSearchElem.sendKeys(AcceptanceSuite.props.getProperty("FleetTypeAttributeDelete_SearchTextValue1"));
	   
	  WebElement FleetTypeAttributeEditSearchButtonElem  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeDelete_SearchButton"))));
	  FleetTypeAttributeEditSearchButtonElem.click();
	  
	  Thread.sleep(1000);
	  WebElement FleetTypeAttributeDeleteButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeDelete_DeleteButton"))));
	  FleetTypeAttributeDeleteButton.click();
	   
	  WebElement FleetTypeAttributeDeleteConfirmButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeDelete_ConfirmDeleteButton"))));
	  FleetTypeAttributeDeleteConfirmButton.click();
	   }
	 public void FleetTypeAttEditCases() throws InterruptedException{
	  WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);


	  
	  EnterpricesElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTyeAttribute_EnterpriseHeader"))));
	  EnterpricesElem.click();

	  //Thread.sleep(1000);
	  FleetTypeAttElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeLink"))));
	  FleetTypeAttElem.click();

	  Thread.sleep(1000);
	  
	  //this.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeBanner"))));
	  
	  WebElement FleetTypeAttributeEditSearchElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeEdit_Search"))));
	  FleetTypeAttributeEditSearchElem.sendKeys(AcceptanceSuite.props.getProperty("FleetTypeAttributeEdit_SearchTextValue"));
	  FleetTypesAttEditElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeEdit_EditButton"))));
	  FleetTypesAttEditElem.click();
	  
	 }
	 public void FleetTypeAttEditNegativeCases(String AttributeName,
	   String Description) throws InterruptedException{
	  
	  //System.out.println("=========="+EMailId+"kkkkkkkkkkkk"+EMailId);
	  WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);

	  
	  Thread.sleep(2000);
	  /*fleetSubmitbuttonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Submitbutton"))));
	  fleetSubmitbuttonElem.click();*/
	  //System.out.println("-------"+EnterpriceResourcesElem+"22222222222"+EnterpriceResourcesElem);
	  AttributeNameElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeEdit_AttributeName"))));
	  //AttributeNameElem.clear();
	  AttributeNameElem.sendKeys(Keys.CONTROL, "a");
	  AttributeNameElem.sendKeys(Keys.DELETE);
	  if(!AttributeName.isEmpty()){
	   AttributeNameElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeEdit_AttributeName"))));
	   //AttributeNameElem.clear();
	   AttributeNameElem.sendKeys(Keys.CONTROL, "a");
	   AttributeNameElem.sendKeys(Keys.DELETE);
	   AttributeNameElem.sendKeys(AttributeName);
	    }
	  DescriptionElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeEdit_Description"))));
	  //DescriptionElem.clear();
	  DescriptionElem.sendKeys(Keys.CONTROL, "a");
	  DescriptionElem.sendKeys(Keys.DELETE);
	  Thread.sleep(2000);
	  if(!Description.isEmpty()){
	   DescriptionElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeEdit_Description"))));
	   //DescriptionElem.clear();
	   DescriptionElem.sendKeys(Keys.CONTROL, "a");
	   DescriptionElem.sendKeys(Keys.DELETE);
	   DescriptionElem.sendKeys(Description);
	    }
	  submitButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("FleetTypeAttributeEdit_SubmitButton"))));
	   submitButtonElem.click();
	}
}
