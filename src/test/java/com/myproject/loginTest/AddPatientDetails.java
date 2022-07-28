package com.myproject.loginTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.myproject.action.Manipulation;
import com.myproject.dataprovider.DataProviders;
import com.myproject.pageobjects.AddPatient;
import com.myproject.pageobjects.LoginPage;
import com.myproject.utility.Log;

public class AddPatientDetails extends Manipulation{
	public AddPatient addPatient;
	private LoginPage pages;
	
	@Parameters("browser")
	@BeforeMethod(groups = { "Smoke" })
	public void setup(String browser) {
		launchApp(browser);
	}

	@AfterMethod(groups = { "Smoke"})
	public void tearDown() {
		//getDriver().quit();
	}
	
	@Test(groups = {"Smoke"},dataProvider = "addPatientDetails", dataProviderClass = DataProviders.class,priority = 2)
	public void addpatientDetails(String organizationId, String Email, String Password,String FirstName, String MiddleName, String LastName, String DateOfBirth,
			String Gender, String MaritalStatus, String Nationality, String ProofType, String ProofNumber,
			String Occupation, String ReferenceId, String PhoneNumber, String EmailAddress, String Address, String Type,
			String FathersName) throws Throwable {
		
		pages = PageFactory.initElements(getDriver(), LoginPage.class);
		Log.startTestCase("Loginpgae Testcase started");
		pages.enterorganizationID(organizationId);
		Log.info("Organization ID successfuuly entererd");
		pages.enterLoginData(Email, Password);
		Log.info("Email ID and password successfuuly entererd");
		Log.endTestCase("loginTest");
		
		addPatient = PageFactory.initElements(getDriver(), AddPatient.class);
		addPatient.addPaientDetail(FirstName, MiddleName, LastName, DateOfBirth, Gender, MaritalStatus, Nationality, ProofType, ProofNumber, Occupation, ReferenceId, PhoneNumber, EmailAddress, Address, Type, FathersName);
		Log.info("Patient details are successfuuly entererd");
		Log.endTestCase("Add Pateint Test case");
		

	}

}
