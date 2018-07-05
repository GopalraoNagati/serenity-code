package com.srisys.serenity.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.srisys.serenity.AcceptanceSuite;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class UserRolesPage extends PageObject {
	
	WebDriver driver;
	
	WebElement loginButtonElem;
	WebElement usernameElem;
	WebElement passwordElem;
	WebElement submitButtonElem;
	WebElement adminLinkElem;
	WebElement roleHeaderElem;
	WebElement createRoleElem;
	WebElement RoleNameFieldElem;
	WebElement descriptionFieldElem;
	WebElement submitBtnElem;
	WebElement errormessageElem;
	WebElement selectRoleListFieldElem;
	WebElement deleteRoleElem;
	WebElement deleteButtonElem;
	WebElement renameRoleElem;
	WebElement newDescriptionINputElem;
	WebElement submitRoleRenameBtnElem;
	WebElement enterprisesCheckBoxElem;
	WebElement enterpriseResourceCheckBoxElem;
	WebElement editRoleSubmitBtnElem;
	WebElement editRoleElem;
	WebElement usersDetailActionElem;
	WebElement roleNameElem;
	String defaultURL;
	String match;
	String result;
	public void openPage(){
		try 
		{
			defaultURL = AcceptanceSuite.props.getProperty("defaultURL");
			this.getDriver().navigate().to(defaultURL);
			System.out.println("Initial Default URL"+defaultURL);
		} catch (Exception ex){
			System.out.println("Exception Message="+ex.getMessage());
		}
		
		
	}
	
	public void clickOnLoginButton() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		usernameElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("userName"))));
		passwordElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("passWord"))));
		loginButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(AcceptanceSuite.props.getProperty("loginButton")))));
		usernameElem.sendKeys(AcceptanceSuite.props.getProperty("userNameValue"));
		passwordElem.sendKeys(AcceptanceSuite.props.getProperty("passwordValue"));
		loginButtonElem.click();
	}

	public void Click_ON_Roles_Header() {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		adminLinkElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("AdminLink"))));
		adminLinkElem.click();
		
		try{
			Thread.sleep(1000);
		}catch (InterruptedException ex){
			ex.printStackTrace();
		}
		
		roleHeaderElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("RolesHeader"))));
		roleHeaderElem.click();
	}

	public void click_On_CreateRole() {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);		
		createRoleElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("createRoleAction"))));
		createRoleElem.click();
	}

	public void enter_RoleName_Description_And_ClickON_SubmitBtn(String RoleName, String Description) throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
		
		RoleNameFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("CreateRole_RoleName"))));
		RoleNameFieldElem.clear();
		RoleNameFieldElem.sendKeys(RoleName);
		Thread.sleep(2000);
		
		descriptionFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("CreateRole_Description"))));
		descriptionFieldElem.clear();
		descriptionFieldElem.sendKeys(Description);
		Thread.sleep(2000);
		submitBtnElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("CreateRole_SubmitButton"))));
		submitBtnElem.click();
	}
	public String getErrorMessage() {
		errormessageElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("CreateRole_errorMessage")));
		String a = errormessageElem.getText();
		return a;
	}

	public void enterValidData_InRoleNameAndDescriptionFields(String roleName,
			String description) throws InterruptedException {
		RoleNameFieldElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("CreateRole_RoleName")));
		descriptionFieldElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("CreateRole_Description")));
		RoleNameFieldElem.sendKeys(roleName);
		Thread.sleep(1000);
		descriptionFieldElem.sendKeys(description);
	}

	public void clickonSubmitButton() {
		submitBtnElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("CreateRole_SubmitButton")));
		submitBtnElem.click();
	}
   
	 @SuppressWarnings("rawtypes")
	public ExpectedCondition roleNameIsVisible() {
	 RoleNameFieldElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("CreateRole_RoleName"))); 
	        return new ExpectedCondition<Boolean>() {
	            public Boolean apply(WebDriver driver) {
	                return (RoleNameFieldElem.isDisplayed());
	            }
	        };
	    }

	    @SuppressWarnings("unchecked")
		public void waitForFirstNameField() {
	        waitForCondition().until(roleNameIsVisible());
	    }

		public String check_SelectRoleListFiled_ForCreatedRole(String RoleName) {
			selectRoleListFieldElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Roles_selectRole")));	
			Select select = new Select(selectRoleListFieldElem);
			List<WebElement> allOptions = select.getOptions();
			for(WebElement option : allOptions){
				if(option.getText().equals(RoleName)) {
					match = "Role Displayed in Listing";
		            break;
		        }
				else{
					match = "Role Not Displayed in Listing";
		    }
					
				}
			return match;
		}

		public void select_RoleName_ToDelete(String RoleName) {
			WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
			
			selectRoleListFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Roles_selectRole"))));	
			Select roleNameListField = new Select(selectRoleListFieldElem); 		
			roleNameListField.selectByVisibleText(RoleName);
			 
			
		}

		public void clickonDeleteRoleBtn() {
			deleteRoleElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("DeleteRoleAction")));
			deleteRoleElem.click();
			
		}

		 @SuppressWarnings("rawtypes")
			public ExpectedCondition deleteBtnIsVisible() {
			 deleteButtonElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("DeleteRole_DeleteButton"))); 
			        return new ExpectedCondition<Boolean>() {
			            public Boolean apply(WebDriver driver) {
			                return (deleteButtonElem.isDisplayed());
			            }
			        };
			    }

			    @SuppressWarnings("unchecked")
				public void waitForDeleteButton() {
			        waitForCondition().until(deleteBtnIsVisible());
			    }

				public void clickonDeleteBtn() {
					 deleteButtonElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("DeleteRole_DeleteButton"))); 
					 deleteButtonElem.click();
					
				}

				public String check_SelectRoleListFiled_ForDeletedRole(
						String roleName) {
					selectRoleListFieldElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Roles_selectRole")));	
					Select select = new Select(selectRoleListFieldElem);
					List<WebElement> allOptions = select.getOptions();
					for(WebElement option : allOptions){
						if(option.getText().equals(roleName)) {
							match = "Role Displayed in Listing";
				            break;
				        }
						else{
							match = "Role Not Displayed in Listing";
				    }
							
						}
					return match;
				}

				public void select_RoleName_ToRename(String RoleName) {
					WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
					try{
						Thread.sleep(2000);
					}catch (InterruptedException ex){
						ex.printStackTrace();
					}
					selectRoleListFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Roles_selectRole"))));
					Select roleNameListField = new Select(selectRoleListFieldElem); 		
					roleNameListField.selectByVisibleText(RoleName);
					
				}

				public void clickonRenameRoleBtn() {
					WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
					renameRoleElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("RenameRoleAction"))));
					renameRoleElem.click();
					
				}

				@SuppressWarnings("rawtypes")
				public ExpectedCondition newdescriptioninputfieldIsVisible() {
				 newDescriptionINputElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("RenameRole_NewDescription"))); 
				        return new ExpectedCondition<Boolean>() {
				            public Boolean apply(WebDriver driver) {
				                return (newDescriptionINputElem.isDisplayed());
				            }
				        };
				    }

				    @SuppressWarnings("unchecked")
					public void waitFornewDescriptionInputField() {
				        waitForCondition().until(newdescriptioninputfieldIsVisible());
				    }

					public void enterNewDescription_ToRenameRole(String Description) throws InterruptedException {
						newDescriptionINputElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("RenameRole_NewDescription")));
						newDescriptionINputElem.clear();
						newDescriptionINputElem.sendKeys(Description);
						Thread.sleep(1000);
					}

					public void clickOnUserRoleSubmitBtn() {
						submitRoleRenameBtnElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("RenameRole_submitRoleButton")));	
						submitRoleRenameBtnElem.click();
					}

					public String check_SelectRoleListFiled_ForRenameRole(
							String RoleName) {
						selectRoleListFieldElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Roles_selectRole")));	
						Select select = new Select(selectRoleListFieldElem);
						List<WebElement> allOptions = select.getOptions();
						for(WebElement option : allOptions){
							if(option.getText().equals(RoleName)) {
								match = "RenameRole Displayed in Listing";
					            break;
					        }
							else{
								match = "RenameRole Not Displayed in Listing";
					    }
								
							}
						return match;
					}

					public void select_RoleName_ToEdit(String RoleName) throws InterruptedException {
						WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
						selectRoleListFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Roles_selectRole"))));	
						Thread.sleep(2000);
						Select roleNameListField = new Select(selectRoleListFieldElem);
						roleNameListField.selectByVisibleText(RoleName);
						
					}

					public void clickON_DashboardANDEnterpriseResources_CheckBoxes() {
						 enterprisesCheckBoxElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Roles_EnterprisesCheckBox")));
						 enterpriseResourceCheckBoxElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Roles_EnterpriseResourceCheckBox")));
						 enterprisesCheckBoxElem.click();
						 enterpriseResourceCheckBoxElem.click();
					}

					public void clickOnEditRoleBtn() {
						WebDriverWait wait = new WebDriverWait(this.getDriver(),20);
						editRoleElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("EditRoleAction"))));

//						editRoleElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EditRoleAction")));
						editRoleElem.click();

					}

					@SuppressWarnings("rawtypes")
					public ExpectedCondition editRoleSubmitBtnIsVisible() {
					 editRoleSubmitBtnElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EditRole_SubmitButton"))); 
					        return new ExpectedCondition<Boolean>() {
					            public Boolean apply(WebDriver driver) {
					                return (editRoleSubmitBtnElem.isDisplayed());
					            }
					        };
					    }

					    @SuppressWarnings("unchecked")
						public void waitForEditRole_SubmitButton() {
					        waitForCondition().until(editRoleSubmitBtnIsVisible());
					    }

						public void clickONUserRole_SubmitBtn() throws InterruptedException {
							Thread.sleep(2000);
							editRoleSubmitBtnElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("EditRole_SubmitButton")));
							editRoleSubmitBtnElem.click();
							Thread.sleep(2000);
							
//							WebElement editRoleSubmitBtnElem1 = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("RolesAction")));
//							editRoleSubmitBtnElem1.click();
//							Thread.sleep(1000);
							
						}

						public String check_wheatherPermissionSavedIN_CheckBoxes() {
							enterprisesCheckBoxElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Roles_EnterprisesCheckBox")));
							 enterpriseResourceCheckBoxElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Roles_EnterpriseResourceCheckBox")));
							 if(enterprisesCheckBoxElem.isSelected() && enterpriseResourceCheckBoxElem.isSelected()){
								 result = "Permissions Saved UserRole Edited Succesfully";
							 }
							 else{
								 result = "Permissions not Saved user Role Not Edited";
							 }
							return result;
						}

						public void select_RoleName_ToCheck_UsersDetails(
								String roleName) {
							selectRoleListFieldElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Roles_selectRole")));	
							Select roleNameListField = new Select(selectRoleListFieldElem); 		
							roleNameListField.selectByVisibleText(roleName);
							
						}

						public void clickonUsersDetailAction() {
							usersDetailActionElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("UsersDetailAction")));
							usersDetailActionElem.click();
						}

						public String getRoleName() {
							roleNameElem = this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Users_RoleNameListing")));
						String b =	roleNameElem.getText();
							return b;
						}
						
						
						public void userrolesect() throws InterruptedException {
							WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
							Thread.sleep(3000);
							adminLinkElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("userRoleList"))));
							//adminLinkElem.click();
							Thread.sleep(3000);
							
							selectRoleListFieldElem =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("userRoleList"))));	
							Select roleNameListField = new Select(selectRoleListFieldElem); 		
							roleNameListField.selectByVisibleText(AcceptanceSuite.props.getProperty("RoleNameusers"));
							
							Thread.sleep(1000);
							
							roleHeaderElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("rolenameList"))));
							roleHeaderElem.click();
						}
						
						
						
						
						
						
						
						
						
						
						
						//User Roles Create Validation Check 
						 //Start  --------------------------------------------------------
						    
						   Properties prop;
						//   WebElement EnterprisenameElem;
						   WebElement userscreateSubmitButtonElem;
						   
						   public void enter_usercreate_validation(String RoleName,String Description) throws InterruptedException, FileNotFoundException, IOException{
						    prop = new Properties();
						    prop.load(new FileInputStream("serenity.properties"));
						   
						    WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);     
						    
						    
						    if(!RoleName.isEmpty()) {
						     createRoleElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("CreateRole_RoleName"))));
						     createRoleElem.clear();
						     createRoleElem.sendKeys(RoleName);
						    }
						    
						    if(!Description.isEmpty()) {
						    descriptionFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("CreateRole_Description"))));
						    descriptionFieldElem.clear();
						    descriptionFieldElem.sendKeys(Description);
						    }    
						   }
						   
						   public void Roles_CreateCloseButton() {
						    WebElement CreateRole_CloseButtonElem;
						    WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
						    CreateRole_CloseButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("CreateRole_CloseButton"))));
						    CreateRole_CloseButtonElem.click();
						    
						   }
						  public void CreateRoleSubmit_Button() {
						   WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);

						   submitBtnElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("CreateRole_SubmitButton"))));
						   submitBtnElem.click();

						  }
						   
						 //Validation Check END Create Role----------------------------------------------------

						//Validation Start for Edit Role
						 
						 public void edit_role_validation_closeButton() {
						  WebElement Roles_EditCloseButtonElem;
						  WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
						  Roles_EditCloseButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Roles_EditCloseButton"))));
						  Roles_EditCloseButtonElem.click();
						 }
						 public void edit_role_validation_message_check() {
						  
						  String ActualEditRolevalidationMessageElem;
						  String ExpectedEditRoleValidationMessageElem;
						  WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
						  
						  ActualEditRolevalidationMessageElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Roles_Edit_ValidationMessage")))).getText();
						  System.out.println("ActualvalidationMessage:"+ActualEditRolevalidationMessageElem);
						    ExpectedEditRoleValidationMessageElem =AcceptanceSuite.props.getProperty("RolesEditValidationValue");
						  System.out.println("ExpectedValidation:"+ExpectedEditRoleValidationMessageElem);
						  Assert.assertTrue((ActualEditRolevalidationMessageElem).equalsIgnoreCase(ExpectedEditRoleValidationMessageElem));
						 
						 }
						// Validation End For Edit Role

						// Validation Start for Rename Role

						 public void verify_validation_of_renamerole_WithoutRole_Selection() {
						//  Properties prop;
						  
						  String ActualRenameRole_ValidationElem;
						  String RenameRole_ValidationWithoutRoleSelectionValueElem;
						  WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
						  ActualRenameRole_ValidationElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("RenameRole_Validation")))).getText();
						  System.out.println("ActualvalidationMessage:"+ActualRenameRole_ValidationElem);
						  RenameRole_ValidationWithoutRoleSelectionValueElem = AcceptanceSuite.props.getProperty("RenameRole_ValidationWithoutRoleSelectionValue");
						  System.out.println("ExpectedValidation:"+RenameRole_ValidationWithoutRoleSelectionValueElem);
						  Assert.assertTrue((ActualRenameRole_ValidationElem).equalsIgnoreCase(RenameRole_ValidationWithoutRoleSelectionValueElem));
						 }
						 
						 public void Rename_RolePopup_CloseButton() {
						  WebElement RenameRole_CloseButtonElem;
						  
						  WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
						  RenameRole_CloseButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("RenameRole_CloseButton"))));
						  RenameRole_CloseButtonElem.click();
						 }

						 public void Rename_Role_After_RoleSelected() throws InterruptedException {
						  
//								Properties prop;
//								Properties prop = new Properties();
							 WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
							 Thread.sleep(3000);
							WebElement  RenameRole_CloseButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Roles_selectRole"))));
							  RenameRole_CloseButtonElem.click();
								 Thread.sleep(3000);
							 Select Enterprice = new Select(
										wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Roles_selectRole")))));
								Enterprice.selectByVisibleText(AcceptanceSuite.props.getProperty("RenameRoleSelect_Value"));

							 Thread.sleep(3000);
							 
//								String RenameRoleSelect_Value;
//								WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
//								selectRoleListFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("Roles_selectRole")))); 
////										this.getDriver().findElement(By.xpath(AcceptanceSuite.props.getProperty("Roles_selectRole")));	
//								Select select = new Select(selectRoleListFieldElem);
////								Thread.sleep(3000);
//								Thread.sleep(3000);
//								RenameRoleSelect_Value = AcceptanceSuite.props.getProperty("RenameRoleSelect_Value");
//								System.out.println("####################################################"+RenameRoleSelect_Value);
//								select.selectByVisibleText(RenameRoleSelect_Value);
						 }
						 
						 public void Rename_Role_Description_Validation() throws InterruptedException {
						  WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
						  descriptionFieldElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("RenameRole_NewDescription"))));
						  descriptionFieldElem.clear();
						  Thread.sleep(2000);
						  descriptionFieldElem.sendKeys(AcceptanceSuite.props.getProperty("RenameRoleWithExistsName"));

						 }
						 public void verify_validation_of_renamerole_WithRole_Selection() {
						  String ActualRenameRole_ValidationElem;
						  String RenameRole_ValidationWithRoleSelectionValueElem;
						  WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
						  ActualRenameRole_ValidationElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("RenameRole_ValidationWithRoleSelected")))).getText();
						  System.out.println("ActualvalidationMessage:"+ActualRenameRole_ValidationElem);
						  RenameRole_ValidationWithRoleSelectionValueElem = AcceptanceSuite.props.getProperty("RenameRole_ValidationWithRoleSelectionValue");
						  System.out.println("ExpectedValidation:"+RenameRole_ValidationWithRoleSelectionValueElem);
						  //Assert.assertTrue((ActualRenameRole_ValidationElem).equalsIgnoreCase(RenameRole_ValidationWithRoleSelectionValueElem));
						 }

						 public void Rename_Role_SubmitButton() {
						  WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
						  submitBtnElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("RenameRole_submitRoleButton"))));
						  submitBtnElem.click();
						 }

						 public void Rename_RoleSelectedPopup_CloseButton() {
						  WebElement RenameRole_ValidationWithRoleSelectedCloseButtonElem;
						  
						  WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
						  RenameRole_ValidationWithRoleSelectedCloseButtonElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("RenameRole_ValidationWithRoleSelectedCloseButton"))));
						  RenameRole_ValidationWithRoleSelectedCloseButtonElem.click();
						 }
						// Validation End for Rename Role

						// Validation Role Delete Start
						 
						 public void Roles_Delete__Verify_Without_Role_Selection() throws InterruptedException {
						  String ActualDeleteRole_ValidationElem;
						  String DeleteRole_ValidationWithoutRoleSelectionValueElem;
						 
						  WebDriverWait wait=new WebDriverWait(this.getDriver(), 20);
						  
						  ActualDeleteRole_ValidationElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("DeleteRoleValidationWithoutRoleSelection")))).getText();
						  System.out.println("ActualvalidationMessage:"+ActualDeleteRole_ValidationElem);
						  DeleteRole_ValidationWithoutRoleSelectionValueElem = AcceptanceSuite.props.getProperty("DeleteRoleValidationWithoutRoleSelectionValue");
						  System.out.println("ExpectedValidation:"+DeleteRole_ValidationWithoutRoleSelectionValueElem);
						//  Thread.sleep(1000);
						  Assert.assertTrue((ActualDeleteRole_ValidationElem).equalsIgnoreCase(DeleteRole_ValidationWithoutRoleSelectionValueElem));
						 }
						 
						 
						 public void Roles_Delete_CloseButton_WithoutRoleSelection() {
						  WebElement DeleteRoleValidationWithoutRoleSelectionElem;
						  
						  WebDriverWait wait = new WebDriverWait(this.getDriver(), 20);
						  DeleteRoleValidationWithoutRoleSelectionElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AcceptanceSuite.props.getProperty("DeleteRoleValidationWithoutRoleSelectionCloseButton"))));
						  DeleteRoleValidationWithoutRoleSelectionElem.click();
						 }
						 
						 
						 
						// Validation Roles Delete End	
						
						
						
						
						
						
						
						
						
						
						
						
}

