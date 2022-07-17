package com.myproject.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myproject.action.Manipulation;
import com.myproject.base.Baseclass;

public class LoginPage extends Baseclass {

	Manipulation mani = new Manipulation();

	@FindBy(id = "txtUsername")
	public WebElement userNameField;

	@FindBy(id = "txtPassword")
	public WebElement passwordFeild;

	@FindBy(id = "btnLogin")
	public WebElement loginButton;
	
	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public void login(String uname, String pswd) throws Throwable {
		mani=PageFactory.initElements(getDriver(), Manipulation.class);
		mani.type(userNameField, uname);
		mani.type(passwordFeild, pswd);
		mani.click(getDriver(), loginButton);
	}
}