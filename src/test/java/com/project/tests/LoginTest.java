package com.project.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.project.framework.BaseTest;
import com.project.pages.LoginPage;

public class LoginTest extends BaseTest {
	
	@Test(alwaysRun = true,groups="smoke")
	public void loginTestCase() throws IOException {
		
		LoginPage loginPage = new LoginPage();
		loginPage.loginDeveloper();
		//Assert.fail();
	}

}
