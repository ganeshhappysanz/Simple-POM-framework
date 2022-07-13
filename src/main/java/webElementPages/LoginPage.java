package webElementPages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import action.Manipulation;
import base.Baseclass;

public class LoginPage extends Baseclass {

	Manipulation mani = new Manipulation();

	@FindBy(id = "txtUsername")
	public WebElement userNameField;

	@FindBy(id = "txtPassword")
	public WebElement passwordFeild;

	@FindBy(id = "btnLogin")
	public WebElement loginButton;

}
