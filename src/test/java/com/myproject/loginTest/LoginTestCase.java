package com.myproject.loginTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.myproject.action.Manipulation;
import com.myproject.dataprovider.DataProviders;
import com.myproject.pageobjects.AddPatient;
import com.myproject.pageobjects.LoginPage;
import com.myproject.utility.Log;

public class LoginTestCase extends Manipulation {

	private LoginPage pages;

	@Parameters("browser")
	@BeforeMethod(groups = { "Smoke" })
	public void setup(String browser) {
		launchApp(browser);
	}

	@AfterMethod(groups = { "Smoke" })
	public void tearDown() {
		getDriver().quit();
	}

	@Test(groups = { "Smoke" }, dataProvider = "loginDetails", dataProviderClass = DataProviders.class, priority = 1)
	public void loginTestcase(String organizationId, String Email, String Password) throws Throwable {
		pages = PageFactory.initElements(getDriver(), LoginPage.class);
		Log.startTestCase("Loginpgae Testcase started");
		pages.enterorganizationID(organizationId);
		Log.info("Organization ID successfuuly entererd");
		pages.enterLoginData(Email, Password);
		Log.info("Email ID and password successfuuly entererd");
		Log.endTestCase("loginTest");
	}

}
