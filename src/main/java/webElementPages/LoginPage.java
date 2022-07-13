package webElementPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import action.Manipulation;
import base.Baseclass;

public class LoginPage extends Baseclass {
	
	public LoginPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(getDriver(), this);
	}
	
	Manipulation mani=new Manipulation();
	
	@FindBy(id = "txtUsername")
	public WebElement userNameField;
	
	@FindBy(id="txtPassword")
	public WebElement passwordFeild;
	
	@FindBy(id="btnLogin")
	public WebElement loginButton;

	

	

}
