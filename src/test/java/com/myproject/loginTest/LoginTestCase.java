package com.myproject.loginTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.myproject.action.Manipulation;
import com.myproject.dataprovider.DataProviders;
import com.myproject.pageobjects.LoginPage;
import com.myproject.utility.Log;

public class LoginTestCase extends Manipulation {

	private LoginPage pages;

	@Parameters("browser")
	@BeforeMethod(groups = { "Smoke" })
	public void setup(String browser) {
		launchApp(browser);
	}

	@AfterMethod(groups = { "Smoke"})
	public void tearDown() {
		getDriver().quit();
	}

	@Test(groups = {"Smoke"},dataProvider = "credentials", dataProviderClass = DataProviders.class)
	public void LoginTc(String uname, String pswd) throws Throwable {
		pages = PageFactory.initElements(getDriver(), LoginPage.class);
		Log.startTestCase("loginTest");
		Log.info("user is going to click on SignIn");
		Log.info("Enter Username and Password");
		pages.login(uname, pswd);
		String actualURL = getDriver().getCurrentUrl();
		String expectedURL = getCurrentURL(getDriver());
		Log.info("Verifying if user is able to login");
		Assert.assertEquals(actualURL, expectedURL);
		Log.info("Login is Sucess");
		Log.endTestCase("loginTest");

	}

}
