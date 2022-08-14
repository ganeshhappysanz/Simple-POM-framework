package com.myproject.pageobjects;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.model.ScreenCapture;
import com.myproject.action.Manipulation;
import com.myproject.base.Baseclass;
import com.myproject.reports.CaptureScreen.ScreenshotOf;

public class AddPatient extends Baseclass {
	public Manipulation manipulation = new Manipulation();
	public LoginPage loginPagee;
	
	@FindBy(xpath = "//span[text()='Add Patient']")
	public WebElement addPatientButton;

	
	@FindBy(id = "name")
	public WebElement enterFirstName;
	@FindBy(id = "middleName")
	public WebElement enterMiddleName;
	@FindBy(id = "lastName")
	public WebElement enterLastName;
	@FindBy(id = "dob")
	public WebElement enterDateOfBirth;
	@FindBy(id = "gender")
	public WebElement selectGender;
	@FindBys(@FindBy(xpath ="//*[@id='menu-gender']/div[3]/ul/li"))
	public List<WebElement> pickGender;
	@FindBy(id = "maritalStatus")
	public WebElement selectMaritalStatus;
	@FindBys(@FindBy(xpath="//*[@id='menu-maritalStatus']/div[3]/ul/li"))
	public List<WebElement> pickMaritalStatus;
	@FindBy(id = "nationality")
	public WebElement selectNationality;
	@FindBy(id = "patient_address_proof_type")
	public WebElement selectProofType;
	@FindBys(@FindBy(xpath = "//*[@id='menu-addressProofTypeCode']/div[3]/ul/li"))
	public List<WebElement>pickProofType;
	@FindBy(id = "address_proof_number")
	public WebElement enterProofNumber;
	@FindBy(xpath="//*[@for='patient_address_front_file']")
	public WebElement uploadProof;
	@FindBy(id = "free-solo-2-demo")
	public WebElement selectOccupation;
	@FindBy(id = "lrNumber")
	public WebElement enterReferenceId;
	@FindBy(id = "phone")
	public WebElement enterPhoneNumber;
	@FindBy(id = "email")
	public WebElement enterEmailAddress;
	@FindBy(id = "address")
	public WebElement enterAddress;
	@FindBy(id = "addressType")
	public WebElement selectAddressType;
	@FindBys(@FindBy(xpath = "//*[@id='menu-addressType']/div[3]/ul/li"))
	public List<WebElement>pickAddressType;
	@FindBy(id = "fathersName")
	public WebElement enterFathersName;
	
	@FindBy(id="add_patient")
	public WebElement addPatientForm;

	public AddPatient() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(getDriver(), this);
	}

	public void addPaientDetail(String FirstName, String MiddleName, String LastName, String DateOfBirth,
			String Gender, String MaritalStatus, String Nationality, String ProofType, String ProofNumber,String ProofUploadLocation,
			String Occupation, String ReferenceId, String PhoneNumber, String EmailAddress, String Address, String Type,
			String FathersName) throws InterruptedException {
		
		manipulation = PageFactory.initElements(getDriver(), Manipulation.class);
		manipulation.isDisplayed(getDriver(), addPatientButton);
		manipulation.click(getDriver(), addPatientButton);		
		manipulation.isDisplayed(getDriver(), enterFirstName);
		manipulation.type(enterFirstName, FirstName);
		manipulation.isDisplayed(getDriver(), enterMiddleName);
		manipulation.type(enterMiddleName, MiddleName);
		manipulation.isDisplayed(getDriver(), enterLastName);
		manipulation.type(enterLastName, LastName);
		manipulation.isDisplayed(getDriver(), enterDateOfBirth);
		manipulation.type(enterDateOfBirth, DateOfBirth);
		manipulation.isDisplayed(getDriver(), selectGender);
		manipulation.click(getDriver(), selectGender);
		String genderText=null;
		for(WebElement genderElement:pickGender) {
			genderText=genderElement.getText();
			if(genderText.equals(Gender)) {
				manipulation.click(getDriver(), genderElement);
		}
		}
		
		manipulation.isDisplayed(getDriver(), selectMaritalStatus);
		manipulation.click(getDriver(), selectMaritalStatus);
		String martialStatusText=null;
		for(WebElement martialElement:pickMaritalStatus) {
			martialStatusText=martialElement.getText();
			if(martialStatusText.equals(MaritalStatus)) {
				manipulation.click(getDriver(), martialElement);
			}
		}
		
		manipulation.isDisplayed(getDriver(), selectNationality);
		manipulation.selectByVisibleText(Nationality,selectNationality);
		manipulation.isDisplayed(getDriver(), selectProofType);
		manipulation.click(getDriver(), selectProofType);
		
		String proofTypeTex=null;
		for(WebElement proofTypeElement:pickProofType) {
			proofTypeTex=proofTypeElement.getText();
		if(proofTypeTex.equals(ProofType)) {
			Thread.sleep(2000);
			manipulation.click(getDriver(), proofTypeElement);
		}
		}
		
		manipulation.isDisplayed(getDriver(), enterProofNumber);
		manipulation.type(enterProofNumber, ProofNumber);
		//manipulation.isDisplayed(getDriver(), uploadProof);
		//manipulation.explicitWait(getDriver(), uploadProof, 10);
		//manipulation.click(getDriver(), uploadProof);
		uploadProof.click();
		//Thread.sleep(3000);
		//String s=System.getProperty("user.dir")+ProofUploadLocation;
		//System.out.println("****"+s+"*****");
		
		//JavascriptExecutor js = (JavascriptExecutor) getDriver();
		//js.executeScript("arguments[0].style.visibility='visible'", uploadProof);
		uploadProof.sendKeys("C:\\Users\\Home\\eclipse-workspace\\T01_IDP_Patients\\src\\test\\resources\\ProofDocuments\\aadhar_card.jpg");
		
		//manipulation.type(uploadProof, ProofUploadLocation);
		
		
		
		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("arguments[0].setAttribute('style', arguments[1])",
		 * getDriver().findElement(By.xpath("//input[@type='file']")), "0");
		 * js.executeScript("arguments[0].setAttribute('class', arguments[1])",
		 * getDriver().findElement(By.xpath("//input[@type='file']/../../div[2]")),
		 * "a"); getDriver().findElement(By.xpath("//input[@type='file']")).sendKeys(
		 * ProofUploadLocation);
		 */
		
		
		
		manipulation.isDisplayed(getDriver(), selectOccupation);
		manipulation.selectByVisibleText(Occupation, selectOccupation);
		manipulation.isDisplayed(getDriver(), enterReferenceId);
		manipulation.type(enterReferenceId, ReferenceId);
		manipulation.isDisplayed(getDriver(), enterPhoneNumber);
		manipulation.type(enterPhoneNumber, PhoneNumber);
		manipulation.isDisplayed(getDriver(), enterEmailAddress);
		manipulation.type(enterEmailAddress, EmailAddress);
		manipulation.isDisplayed(getDriver(), enterAddress);
		manipulation.type(enterAddress, Address);
		manipulation.isDisplayed(getDriver(), selectAddressType);
		manipulation.click(getDriver(), selectAddressType);
		
		String addressTypeText=null;
		for(WebElement addressTypeElement:pickAddressType) {
			addressTypeText=addressTypeElement.getText();
			if(addressTypeText.equals(Type)) {
				manipulation.click(getDriver(), addressTypeElement);
			}
		}
		
		
		manipulation.scrollByVisibilityOfElement(getDriver(), enterFathersName);
		manipulation.isDisplayed(getDriver(), enterFathersName);
		manipulation.type(enterFathersName, FathersName);
		manipulation.isDisplayed(getDriver(), addPatientForm);
		manipulation.click(getDriver(), addPatientForm);
		manipulation.screenShot(getDriver(), "");
		ScreenCapture sc=new ScreenCapture();

	}

}
