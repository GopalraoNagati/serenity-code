package com.srisys.serenity.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.srisys.serenity.AcceptanceSuite;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.findby.By;

public class IndNavBillPaymentHistoryPage extends PageObject{

	
	public void billPaymentHistoryCreate() throws InterruptedException{
		
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		
		WebElement historyLink =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("HistoryLink"))));
		historyLink.click();
				
		WebElement BPHLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryLink"))));
		BPHLink.click();
				
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryBanner"))));
		WebElement createButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_Create"))));
		createButton.click();
				
		Thread.sleep(1000);
		Select enterpriseName = new Select(
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_EnterpriseName")))));
		enterpriseName.selectByVisibleText(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_EnterpriseNameValue"));
				
		WebElement invoiceNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_InvoiceNumber"))));
		invoiceNumber.sendKeys(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_InvoiceNumberValue"));

				//BillPaymentHistoryAdd_InvoiceDate=html/body/app-dashboard/div[2]/main/div/ng-component/app-billpaymenthistory-popup/div/div/div/div[2]/div/div/div[3]/p-calendar/span/input
				
		Select periodType = new Select(
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_PeriodType")))));
		periodType.selectByVisibleText(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_PeriodTypeValue"));
				
				
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_PeriodStartDate")))).click();
		getUserDate(this.getDriver(),AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_PeriodStartDateValue"),  
				this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_PeriodStartDate"))),
				this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_PeriodStartDateMonth"))),
				this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_PeriodStartDateYear"))),
				AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_PeriodStartDateColumn"),
				this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_PeriodStartDateNextButton"))),
				this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_PeriodStartDateTime"))),
				this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_PeriodStartDateHour"))),
				this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_PeriodStartDateMins")))
		);
				
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_PeriodEndDate")))).click();
		getUserDate(this.getDriver(),AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_PeriodEndDateValue"),  
				this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_PeriodEndDate"))),
				this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_PeriodEndDateMonth"))),
				this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_PeriodEndDateYear"))),
				AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_PeriodEndDateColumn"),
				this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_PeriodEndDateNextButton"))),
				this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_PeriodEndDateTime"))),
				this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_PeriodEndDateHour"))),
				this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_PeriodEndDateMins")))
		);
				
		WebElement amountDue = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_AmountDue"))));
		amountDue.sendKeys(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_AmountDueValue"));
				
		//BillPaymentHistoryAdd_Status=html/body/app-dashboard/div[2]/main/div/ng-component/app-billpaymenthistory-popup/div/div/div/div[2]/div/div/div[8]/select
				
		WebElement notes = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_Notes"))));
		notes.sendKeys(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_NotesValue"));
				
		WebElement submit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_Submit"))));
		submit.click();
	}
	
	
	public void billPaymentHistoryEdit() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		WebElement historyLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("HistoryLink"))));
		historyLink.click();
		
		WebElement BPHLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryLink"))));
		BPHLink.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryBanner"))));
		WebElement BillPaymentHistoryEditSearchElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryEdit_Search"))));
		BillPaymentHistoryEditSearchElem.clear();
		BillPaymentHistoryEditSearchElem.sendKeys(AcceptanceSuite.props.getProperty("BillPaymentHistoryEdit_SearchTextValue"));
		
		WebElement BillPaymentHistoryEditSearchButtonElem  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryEdit_SearchButton"))));
		BillPaymentHistoryEditSearchButtonElem.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Ta_Vedic']")));
		WebElement BillPaymentHistoryEditEditButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryEdit_EditButton"))));
		BillPaymentHistoryEditEditButton.click();
		
		WebElement BillPaymentHistoryEditDetailsTab = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryEdit_DetailsTab"))));
		BillPaymentHistoryEditDetailsTab.click();
		
		if (!this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryEdit_AmountPaid"))).isDisplayed()){
			BillPaymentHistoryEditDetailsTab.click();
		}
			
		WebElement BillPaymentHistoryEditAmountPaid = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryEdit_AmountPaid"))));
		BillPaymentHistoryEditAmountPaid.sendKeys(AcceptanceSuite.props.getProperty("BillPaymentHistoryEdit_AmountPaidValue"));
		
		WebElement BillPaymentHistoryEdit_SubmitButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryEdit_SubmitButton"))));
		BillPaymentHistoryEdit_SubmitButtonElem.click();
		Thread.sleep(5000);
	}
	
	public void billPaymentHistoryDelete() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		
		WebElement historyLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("HistoryLink"))));
		historyLink.click();
	
		WebElement BPHLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryLink"))));
		BPHLink.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryBanner"))));
			
		WebElement BillPaymentHistoryDeleteSearchElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryDelete_Search"))));
		BillPaymentHistoryDeleteSearchElem.clear();
		BillPaymentHistoryDeleteSearchElem.sendKeys(AcceptanceSuite.props.getProperty("BillPaymentHistoryEdit_SearchTextValue"));
		
		WebElement  BillPaymentHistoryDeleteButtonElem  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryDelete_SearchButton"))));
		BillPaymentHistoryDeleteButtonElem.click();
		
		WebElement  BillPaymentHistoryDeleteDeleteButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryDelete_DeleteButton"))));
		BillPaymentHistoryDeleteDeleteButton.click();
		
		WebElement  BillPaymentHistoryDeleteDeleteConfirmButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryDelete_ConfirmDeleteButton"))));
		BillPaymentHistoryDeleteDeleteConfirmButton.click();
		
	}
	
	public static void getUserDate(WebDriver driver,String userDate, WebElement CalenderElem, WebElement monthElm,
			WebElement yearelm, String column, WebElement nextbuttonElem,WebElement timenelm,WebElement HoursElem, WebElement minituesElem) throws InterruptedException {
		
	
	
   // System.out.println("lllllllll"+userDate);
      String datePart = userDate.split(":")[0];
   //   System.out.println("datePart======="+datePart);
  	
  	String userYear = datePart.split("-")[0];
  	 //System.out.println("userYear======="+userYear);
  	String userMonth = datePart.split("-")[1];	
  	 //System.out.println("userMonth======="+userMonth);
  	String requiredDate = datePart.split("-")[2];
  	 //System.out.println("requiredDate======="+requiredDate);
  	
  	switch(new Integer(userMonth).intValue()){
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
  		 break;
  	case 12:
  		 userMonth = "December";
  		 break;
  	}
  	
  	String hours =  userDate.split(":")[1];
  	String minutes = userDate.split(":")[2];
  	System.out.println("hours======="+hours);
  	System.out.println("minutes======="+minutes);
  	
  	
  	//CalenderElem.click();
  	//driver.findElement(By.xpath(calendarXPath)).click();
  	Thread.sleep(3000);
  	
  	//Set Time
  	//String actualHrs = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("timeXPath"))).getText();
  	String actualHrs =timenelm.getText();
  	//String actualHrs = driver.findElement(By.xpath(timeXPath)).getText();
  	System.out.println("Time="+actualHrs);
  	//TODO: Uncomment Below 2 while loops to set data
  	/*while(!actualHrs.substring(0, 2).equalsIgnoreCase(hours)){
  		HoursElem.click();
  		//HoursElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("hoursXPath")));
  		//HoursElem.click();
  		actualHrs=timenelm.getText();
  		//actualHrs = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("timeXPath"))).getText();
  	}
  	while(!actualHrs.substring(actualHrs.length()-2, actualHrs.length()).equalsIgnoreCase(minutes)){
  		//minituesElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("minutesXPath")));
  		minituesElem.click();
  		actualHrs=timenelm.getText();
  		//driver.findElement(By.xpath(minutesXPath)).click();
  		//actualHrs = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("timeXPath"))).getText();
  	}*/
  	
  	
  	//Get correct year
  	while (true){
  		String year=yearelm.getText();
  		//String year = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("yearXPath"))).getText();
  		//String year=driver.findElement(By.xpath(yearXPath)).getText();
  		System.out.println("Year="+year);
  		if (year.equals(userYear)){
  			break;
  		}
  		else{
  			//nextbuttonElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("nextButtonXPath")));
  			nextbuttonElem.click();
  			//driver.findElement(By.xpath(nextButtonXPath)).click();
  		}
  	}
  	//Get correct month
  	while(2>1)
  	{			
  		String month = monthElm.getText();
  		//String month = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("monthXPath"))).getText();
  		//String month=driver.findElement(By.xpath(monthXPath)).getText();
  		System.out.println("Month="+month+";userMonth="+userMonth);
  		
  		if(month.equalsIgnoreCase(userMonth))
  		{						
  			List<WebElement> columns = driver.findElements(By.xpath(column));
  			//List<WebElement> columns =  columnelm
  			
  			       // List<WebElement> columns = driver.findElements(By.xpath(columnsXPath));
       
  			        //Using For Loop to iterate over cells
                      for(int c=0;c<columns.size();){
                    	  System.out.println("rrrrrrrrrrrr"+columns.size());
                    	  
                          String date1 = ((WebElement)columns.get(c)).getText();
                          System.out.println("DATES"+date1);
                          System.out.println(columns.get(c).getAttribute("class"));
                          //System.out.println(columns.get(c).getCssValue("class"));
                          if(date1.equalsIgnoreCase(requiredDate) && !columns.get(c).getAttribute("class").contains("disabled")) {
                                try
                                {   
                              	  columns.get(c).click();
                              	  break;               
                                }catch(Exception e) 
                                {   
                              
                                }
                          }
                          c++;
                      }
                      break;			
  		}
  		else 
  		{
  			//driver.findElement(By.xpath("//span[@class='fa fa-angle-right']")).click();
  			System.out.println("About to click next month"+nextbuttonElem);
  			//driver.findElement(By.xpath(nextButtonXPath)).click();
  			nextbuttonElem.click();
  			//nextbuttonElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("nextButtonXPath")));
  			//nextbuttonElem.click();
  		}	
  	}
	}
	
	public void billPaymentHistoryView() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		WebElement historyLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("HistoryLink"))));
		historyLink.click();
		
		WebElement BPHLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryLink"))));
		BPHLink.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryBanner"))));
		WebElement BillPaymentHistoryEditSearchElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryView_Search"))));
		BillPaymentHistoryEditSearchElem.clear();
		BillPaymentHistoryEditSearchElem.sendKeys(AcceptanceSuite.props.getProperty("BillPaymentHistoryView_SearchTextValue"));
		
		WebElement BillPaymentHistoryEditSearchButtonElem  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryView_SearchButton"))));
		BillPaymentHistoryEditSearchButtonElem.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Ta_Vedic']")));
		WebElement BillPaymentHistoryEditEditButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryView_ViewButton"))));
		BillPaymentHistoryEditEditButton.click();
		
		WebElement BillPaymentHistoryEditDetailsTab = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryView_CloseButton"))));
		BillPaymentHistoryEditDetailsTab.click();
	}
	
	public void billPaymentHistoryAdvancedSearch() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		WebElement historyLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("HistoryLink"))));
		historyLink.click();
		
		WebElement BPHLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryLink"))));
		BPHLink.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryBanner"))));
		WebElement BillPaymentHistoryAdvSearchElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("BPHadvancesearch"))));
		BillPaymentHistoryAdvSearchElem.click();
		
		WebElement BillPaymentHistoryAdvSearchTextElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("BPHAdvancesearchinputbutton"))));
		BillPaymentHistoryAdvSearchTextElem.clear();
		BillPaymentHistoryAdvSearchTextElem.sendKeys(AcceptanceSuite.props.getProperty("BPHAdvancesearchinput"));
		
		WebElement BillPaymentHistoryAdvSearchButtonElem  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("BPHadvancesearchsubmit"))));
		BillPaymentHistoryAdvSearchButtonElem.click();
		
		
		
	}
	
	
	
	public void billpaymentHeader() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);

		WebElement historyLink = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("HistoryLink"))));
		historyLink.click();

		WebElement BPHLink = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryLink"))));
		BPHLink.click();

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryBanner"))));
		WebElement createButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_Create"))));
		createButton.click();

	}

	public void invalidCombinations(String Enterprise, String InvoiceNumber, String PeriodType, String AmountDue)
			throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
		Thread.sleep(2000);
		
		Select enterpriseName = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_EnterpriseName")))));
		enterpriseName.selectByVisibleText(Enterprise);

		WebElement invoiceNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_InvoiceNumber"))));
		invoiceNumber.sendKeys(Keys.CONTROL, "a");
		invoiceNumber.sendKeys(Keys.DELETE);
		invoiceNumber.sendKeys(InvoiceNumber);

		Select periodType = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_PeriodType")))));
		periodType.selectByVisibleText(PeriodType);

		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_PeriodStartDate")))).click();
		getUserDate(this.getDriver(), AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_PeriodStartDateValue"),
				this.getDriver().findElement(
						By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_PeriodStartDate"))),
				this.getDriver().findElement(
						By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_PeriodStartDateMonth"))),
				this.getDriver().findElement(
						By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_PeriodStartDateYear"))),
				AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_PeriodStartDateColumn"),
				this.getDriver().findElement(
						By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_PeriodStartDateNextButton"))),
				this.getDriver().findElement(
						By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_PeriodStartDateTime"))),
				this.getDriver().findElement(
						By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_PeriodStartDateHour"))),
				this.getDriver().findElement(
						By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_PeriodStartDateMins"))));

		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_PeriodEndDate")))).click();
		getUserDate(this.getDriver(), AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_PeriodEndDateValue"),
				this.getDriver().findElement(
						By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_PeriodEndDate"))),
				this.getDriver().findElement(
						By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_PeriodEndDateMonth"))),
				this.getDriver().findElement(
						By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_PeriodEndDateYear"))),
				AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_PeriodEndDateColumn"),
				this.getDriver().findElement(
						By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_PeriodEndDateNextButton"))),
				this.getDriver().findElement(
						By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_PeriodEndDateTime"))),
				this.getDriver().findElement(
						By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_PeriodEndDateHour"))),
				this.getDriver().findElement(
						By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_PeriodEndDateMins"))));

		WebElement amountDue = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_AmountDue"))));
		amountDue.sendKeys(Keys.CONTROL, "a");
		amountDue.sendKeys(Keys.DELETE);
		amountDue.sendKeys(AmountDue);

		// BillPaymentHistoryAdd_Status=html/body/app-dashboard/div[2]/main/div/ng-component/app-billpaymenthistory-popup/div/div/div/div[2]/div/div/div[8]/select

		WebElement notes = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_Notes"))));
		notes.sendKeys(Keys.CONTROL, "a");
		notes.sendKeys(Keys.DELETE);
		notes.sendKeys(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_NotesValue"));

		WebElement submit = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryAdd_Submit"))));
		submit.click();

	}

	public void invalidCombinationsEditHeader() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
		Thread.sleep(2000);

		WebElement historyLink = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("HistoryLink"))));
		historyLink.click();

		WebElement BPHLink = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryLink"))));
		BPHLink.click();

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryBanner"))));
		WebElement BillPaymentHistoryEditSearchElem = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryEdit_Search"))));
		BillPaymentHistoryEditSearchElem.clear();
		BillPaymentHistoryEditSearchElem
				.sendKeys(AcceptanceSuite.props.getProperty("BillPaymentHistoryEdit_SearchTextValue"));

		WebElement BillPaymentHistoryEditSearchButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryEdit_SearchButton"))));
		BillPaymentHistoryEditSearchButtonElem.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Ta_Vedic']")));
		WebElement BillPaymentHistoryEditEditButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryEdit_EditButton"))));
		BillPaymentHistoryEditEditButton.click();

		WebElement blockClick = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryEdit_DetailsTab"))));
		blockClick.click();

	}

	public void invalidCombinationsEdit(String AmountPaid, String CreditCardType, String CreditCardNumber,
			String ExpiryMonth, String ExpiryYear, String NameonCreditCard, String CVVNumber, String AddressLine1,
			String City, String ZipCode) throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
		Thread.sleep(2000);

		WebElement amountPaid = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryEdit_AmountPaid"))));
		amountPaid.sendKeys(Keys.CONTROL, "a");
		amountPaid.sendKeys(Keys.DELETE);
		amountPaid.sendKeys(AmountPaid);

		Select creditCardType = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryEdit_CreditCardType")))));
		creditCardType.selectByVisibleText(CreditCardType);

		WebElement creditCardNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryEdit_CreditCardNumber"))));
		creditCardNumber.sendKeys(Keys.CONTROL, "a");
		creditCardNumber.sendKeys(Keys.DELETE);
		creditCardNumber.sendKeys(CreditCardNumber);

		Select expiryMonth = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryEdit_ExpiryMonth")))));
		expiryMonth.selectByVisibleText(ExpiryMonth);

		Select expiryYear = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryEdit_ExpiryYear")))));
		expiryYear.selectByVisibleText(ExpiryYear);

		WebElement nameOnCreditCard = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryEdit_NameOnCreditCard"))));
		nameOnCreditCard.sendKeys(Keys.CONTROL, "a");
		nameOnCreditCard.sendKeys(Keys.DELETE);
		nameOnCreditCard.sendKeys(NameonCreditCard);

		WebElement cVVNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryEdit_CVVNumber"))));
		cVVNumber.sendKeys(Keys.CONTROL, "a");
		cVVNumber.sendKeys(Keys.DELETE);
		cVVNumber.sendKeys(CVVNumber);

		WebElement addressLine1 = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryEdit_AddressLine1"))));
		addressLine1.sendKeys(Keys.CONTROL, "a");
		addressLine1.sendKeys(Keys.DELETE);
		addressLine1.sendKeys(AddressLine1);

		WebElement city = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryEdit_City"))));
		city.sendKeys(Keys.CONTROL, "a");
		city.sendKeys(Keys.DELETE);
		city.sendKeys(City);

		WebElement zip = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryEdit_ZIP"))));
		zip.sendKeys(Keys.CONTROL, "a");
		zip.sendKeys(Keys.DELETE);
		zip.sendKeys(ZipCode);

		WebElement submit = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(AcceptanceSuite.props.getProperty("BillPaymentHistoryEdit_SubmitButton"))));
		submit.click();

	}

}
