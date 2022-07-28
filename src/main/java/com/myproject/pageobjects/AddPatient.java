package com.myproject.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myproject.action.Manipulation;
import com.myproject.base.Baseclass;

public class AddPatient extends Baseclass {
	public Manipulation manipulation = new Manipulation();
	public LoginPage loginPagee;
	
	@FindBy(xpath = "//span[text()=\"Add Patient\"]")
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
	@FindBy(id = "maritalStatus")
	public WebElement selectMaritalStatus;
	@FindBy(id = "nationality")
	public WebElement selectNationality;
	@FindBy(id = "patient_address_proof_type")
	public WebElement selectProofType;
	@FindBy(id = "address_proof_number")
	public WebElement enterProofNumber;
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
	public WebElement selectType;
	@FindBy(id = "fathersName")
	public WebElement enterFathersName;
	
	@FindBy(id="add_patient")
	public WebElement addPatientForm;

	public AddPatient() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(getDriver(), this);
	}

	public void addPaientDetail(String FirstName, String MiddleName, String LastName, String DateOfBirth,
			String Gender, String MaritalStatus, String Nationality, String ProofType, String ProofNumber,
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
		manipulation.selectByValue(selectGender, Gender);
		//manipulation.selectByVisibleText(Gender, selectGender);
		manipulation.isDisplayed(getDriver(), selectMaritalStatus);
		manipulation.selectByVisibleText(MaritalStatus, selectMaritalStatus);
		manipulation.isDisplayed(getDriver(), selectNationality);
		manipulation.selectByVisibleText(Nationality,selectNationality);
		manipulation.isDisplayed(getDriver(), selectProofType);
		manipulation.selectByVisibleText(ProofType, selectProofType);
		manipulation.isDisplayed(getDriver(), enterProofNumber);
		manipulation.type(enterProofNumber, ProofNumber);
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
		manipulation.isDisplayed(getDriver(), selectType);
		manipulation.selectByVisibleText(Type, selectType);
		manipulation.scrollByVisibilityOfElement(getDriver(), enterFathersName);
		manipulation.isDisplayed(getDriver(), enterFathersName);
		manipulation.type(enterFathersName, FathersName);
		manipulation.isDisplayed(getDriver(), addPatientForm);
		manipulation.click(getDriver(), addPatientForm);
		manipulation.screenShot(getDriver(), "");
		

	}

}
