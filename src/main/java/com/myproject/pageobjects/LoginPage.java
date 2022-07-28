package com.myproject.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.myproject.action.Manipulation;
import com.myproject.base.Baseclass;
import com.myproject.utility.Log;

public class LoginPage extends Baseclass {

	public Manipulation manipulation = new Manipulation();
	public AddPatient addPatientt;
	
	@FindBy(xpath="//div[@class='MuiBox-root jss8']/p")
	public WebElement orgLable;
	
	@FindBy(xpath="//div[@class='MuiBox-root jss8']/p")
	public WebElement orgIdLable;

	@FindBy(id="neo_org_id_textfield")
	public WebElement enterOrgId;
	
	@FindBy(xpath="//*[@type='submit']")
	public WebElement nextSubmitButton;
	
	@FindBy(id="email")
	public WebElement enterEmailId;
	
	@FindBy(id="password")
	public WebElement enterPassword;
	
	@FindBys(@FindBy(xpath="//h4[contains(text(),'Wel')]"))
	public List<WebElement> loginWelcomeText;
	
	@FindBy(xpath="//*[contains(text(),'Sign')]")
	public WebElement signInText;
	
	@FindBy(xpath="//*[@type='button']")
	public WebElement emailSubmitContinue;
	
	@FindBy(xpath="//*[@title='Login with password']")
	public WebElement loginWithPassword;
	
	
	
	

	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void enterorganizationID(String organizationId) {
		manipulation=PageFactory.initElements(getDriver(), Manipulation.class);	
		String organizationLableText=orgLable.getText();
		if(orgLable.equals("Wellness at your finger tips")) {
			System.out.println("Orgainzation Lable Text is visibile"+organizationLableText);
		}else {
			System.out.println("There is no Orgainzation Lable Text in that page");
		}
		String organizationIdLableText=orgIdLable.getText();
		if(organizationIdLableText.equals("Enter your organization id")) {
			System.out.println("Orgainzation Id Lable Text is visibile");
		}else {
			System.out.println("There is no Orgainzation ID Lable Text in that page");
		}
		manipulation.isDisplayed(getDriver(), enterOrgId);
		manipulation.type(enterOrgId, organizationId);
		manipulation.isDisplayed(getDriver(), nextSubmitButton);
		manipulation.click(getDriver(), nextSubmitButton);
	}
	
	public void enterLoginData(String emailID,String Password) {
		manipulation=PageFactory.initElements(getDriver(), Manipulation.class);
		/*
		 * for(WebElement ele:loginWelcomeText) { String welcomeText=ele.getText();
		 * if(welcomeText.equals("Welcome to"+"Wellopathy ™")) {
		 * System.out.println("Login welcome Text is visibile"+welcomeText);
		 * 
		 * }else { System.out.println("Login welcome  Text in that page"); } }
		 */
		manipulation.isDisplayed(getDriver(), enterEmailId);
		manipulation.type(enterEmailId, emailID);
		manipulation.isDisplayed(getDriver(), emailSubmitContinue);
		manipulation.click(getDriver(), emailSubmitContinue);
		manipulation.isDisplayed(getDriver(), enterPassword);
		manipulation.type(enterPassword, Password);
		manipulation.isDisplayed(getDriver(), loginWithPassword);
		manipulation.click(getDriver(), loginWithPassword);
	}
	

}