package com.project.pages;

import java.io.IOException;

import org.openqa.selenium.By;

import com.project.framework.BaseTest;
import com.project.utils.XLUtility;

public class LoginPage {
	
	XLUtility xlUtil = new XLUtility(".//src//main//resources//Test_Data//TestData_TG//TestData_TruGenie.xlsx");
	//D:\Workspace_1\MyFramework\src\main\resources\Test_Data\TestData_TG/TestData_TruGenie.xlsx
	
	public By emailTxt = By.xpath("//input[@type='email']");
	public By nextBtn = By.xpath("//input[@type='submit']");
	public By passwordTxt = By.xpath("//input[@type='password']");
	public By signInBtn = By.xpath("//input[@type='submit']");
	public By NoBtn_StaySignIn = By.xpath("//input[@id='idBtn_Back']");
	public By logoutBtn = By.xpath("//span[@class='anchor-caption' and text()='Logout']");
	
	public String emailTxt_Name = "Sign-In-email, Phone or Skype text field";
	public String nextBtn_Name = "Next button";
	public String passwordTxt_Name = "Password text field";
	public String signInBtn_Name = "Sign-In button";
	public String NoBtn_StaySignIn_Name = "No button of Stay Sign-In";
	public String logoutBtn_Name = "Logout button";
	
	public void loginDeveloper() throws IOException {
		BaseTest.LOGGER.get().logTestStep(BaseTest.extentTest.get(), "INFO", "<b>Going to login into TURBOPARTNERS application using Developer credential<b>", false);
		BaseTest.driver.get().get(xlUtil.getCellData("Developer", 1, "Developer Url"));
		int objCnt = 0;
		BaseTest.utilObj.get().getUIUtils().inputText(emailTxt_Name, emailTxt, xlUtil.getCellData("Developer", 1, "UserName_Developer"));
		BaseTest.utilObj.get().getUIUtils().clickElement(nextBtn_Name, nextBtn);
		BaseTest.utilObj.get().getUIUtils().waitForSec(6);
		BaseTest.utilObj.get().getUIUtils().inputText(passwordTxt_Name, passwordTxt, xlUtil.getCellData("Developer", 1, "Password_Developer"));
		BaseTest.utilObj.get().getUIUtils().clickElement(signInBtn_Name, signInBtn);
		BaseTest.utilObj.get().getUIUtils().waitForSec(3);
		objCnt = BaseTest.utilObj.get().getUIUtils().objCnt(NoBtn_StaySignIn);
		if(objCnt > 0) {
			BaseTest.utilObj.get().getUIUtils().clickElement(NoBtn_StaySignIn_Name, NoBtn_StaySignIn);
		}
//		BaseTest.utilObj.get().getUIUtils().waitForSec(2);
//		
//		objCnt = BaseTest.utilObj.get().getUIUtils().objCnt(logoutBtn);
//		
//		BaseTest.sAssert.get().assertEquals(objCnt, 1, "Validation of Logout button for login");
//		if(!(objCnt ==1)) {
//			Assert.fail("Validation of Logout button for login");
//		}
		BaseTest.utilObj.get().getUIUtils().waitForSec(3);
		
	}
	
	public void loginInvestor() throws IOException{
		BaseTest.LOGGER.get().logTestStep(BaseTest.extentTest.get(), "INFO", "<b>Going to login into TURBOPARTNERS application using Lender credential<b>", false);
		BaseTest.driver.get().get(xlUtil.getCellData("Investor", 1, "Investor Url"));
		int objCnt = 0;
		BaseTest.utilObj.get().getUIUtils().inputText(emailTxt_Name, emailTxt, xlUtil.getCellData("Investor", 1, "UserName_Investor"));
		BaseTest.utilObj.get().getUIUtils().clickElement(nextBtn_Name, nextBtn);
		BaseTest.utilObj.get().getUIUtils().waitForSec(6);
		BaseTest.utilObj.get().getUIUtils().inputText(passwordTxt_Name, passwordTxt, xlUtil.getCellData("Investor", 1, "Password_Investor"));
		BaseTest.utilObj.get().getUIUtils().clickElement(signInBtn_Name, signInBtn);
		BaseTest.utilObj.get().getUIUtils().waitForSec(3);
		objCnt = BaseTest.utilObj.get().getUIUtils().objCnt(NoBtn_StaySignIn);
		if(objCnt > 0) {
			BaseTest.utilObj.get().getUIUtils().clickElement(NoBtn_StaySignIn_Name, NoBtn_StaySignIn);
		}
		BaseTest.utilObj.get().getUIUtils().waitForSec(2);
		
//		objCnt = BaseTest.utilObj.get().getUIUtils().objCnt(logoutBtn);
//		
//		//BaseTest.sAssert.get().assertEquals(objCnt, 1, "Validation of Logout button for Investor login");
//		BaseTest.utilObj.get().getAssertManager().sAssertEquals(objCnt, 1, "Validation of Logout button for Investor login", true, true);
//		if(!(objCnt ==1)) {
//			Assert.fail("Validation of Logout button for Investor login");
//		}
		BaseTest.utilObj.get().getUIUtils().waitForSec(3);
		
	}
	
	public void loginDebenture() throws IOException{
		BaseTest.LOGGER.get().logTestStep(BaseTest.extentTest.get(), "INFO", "<b>Going to login into TURBOPARTNERS application using Debenture credential<b>", false);
		BaseTest.driver.get().get(xlUtil.getCellData("Debenture", 1, "Debenture Url"));
		int objCnt = 0;
		BaseTest.utilObj.get().getUIUtils().inputText(emailTxt_Name, emailTxt, xlUtil.getCellData("Debenture", 1, "UserName_Debenture"));
		BaseTest.utilObj.get().getUIUtils().clickElement(nextBtn_Name, nextBtn);
		BaseTest.utilObj.get().getUIUtils().waitForSec(6);
		BaseTest.utilObj.get().getUIUtils().inputText(passwordTxt_Name, passwordTxt, xlUtil.getCellData("Debenture", 1, "Password_Debenture"));
		BaseTest.utilObj.get().getUIUtils().clickElement(signInBtn_Name, signInBtn);
		BaseTest.utilObj.get().getUIUtils().waitForSec(3);
		objCnt = BaseTest.utilObj.get().getUIUtils().objCnt(NoBtn_StaySignIn);
		if(objCnt > 0) {
			BaseTest.utilObj.get().getUIUtils().clickElement(NoBtn_StaySignIn_Name, NoBtn_StaySignIn);
		}
		BaseTest.utilObj.get().getUIUtils().waitForSec(2);
		
//		objCnt = BaseTest.utilObj.get().getUIUtils().objCnt(logoutBtn);
//		
//		//BaseTest.sAssert.get().assertEquals(objCnt, 1, "Validation of Logout button for Investor login");
//		BaseTest.utilObj.get().getAssertManager().sAssertEquals(objCnt, 1, "Validation of Logout button for Debenture login", true, true);
//		if(!(objCnt ==1)) {
//			Assert.fail("Validation of Logout button for Debenture login");
//		}
//		BaseTest.utilObj.get().getUIUtils().waitForSec(3);
//		
	}

	public void loginpmc() throws IOException{
			BaseTest.LOGGER.get().logTestStep(BaseTest.extentTest.get(), "INFO", "<b>Going to login into TURBOPARTNERS application using Developer2 credential<b>", false);
			BaseTest.driver.get().get(xlUtil.getCellData("PMC", 1, "PMC Url"));
			int objCnt = 0;
			BaseTest.utilObj.get().getUIUtils().inputText(emailTxt_Name, emailTxt, xlUtil.getCellData("PMC", 1, "UserName_PMC"));
			BaseTest.utilObj.get().getUIUtils().clickElement(nextBtn_Name, nextBtn);
			BaseTest.utilObj.get().getUIUtils().waitForSec(6);
			BaseTest.utilObj.get().getUIUtils().inputText(passwordTxt_Name, passwordTxt, xlUtil.getCellData("PMC", 1, "Password_PMC"));
			BaseTest.utilObj.get().getUIUtils().clickElement(signInBtn_Name, signInBtn);
			BaseTest.utilObj.get().getUIUtils().waitForSec(3);
			objCnt = BaseTest.utilObj.get().getUIUtils().objCnt(NoBtn_StaySignIn);
			if(objCnt > 0) {
				BaseTest.utilObj.get().getUIUtils().clickElement(NoBtn_StaySignIn_Name, NoBtn_StaySignIn);
			}
//			BaseTest.utilObj.get().getUIUtils().waitForSec(2);
//			
//			objCnt = BaseTest.utilObj.get().getUIUtils().objCnt(logoutBtn);
//			
//			BaseTest.sAssert.get().assertEquals(objCnt, 1, "Validation of Logout button for login");
//			if(!(objCnt ==1)) {
//				Assert.fail("Validation of Logout button for login");
//			}
			BaseTest.utilObj.get().getUIUtils().waitForSec(3);
		
	}
}
