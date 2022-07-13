package loginTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import action.Manipulation;
import webElementPages.LoginPage;

public class LoginTestCase extends Manipulation {

	public LoginPage pages = null;

	@Test
	public void LoginTc() {
		pages = PageFactory.initElements(getDriver(), LoginPage.class);
		getDriver().get("https://opensource-demo.orangehrmlive.com/");
		getDriver().manage().window().maximize();
		type(pages.userNameField, "Admin");
		type(pages.passwordFeild, "admin123");
		click(getDriver(), pages.loginButton);
		if (getDriver().getCurrentUrl().equals(getCurrentURL(getDriver())))
		{
			System.out.println("Current URL :" + getCurrentURL(getDriver()));
		}
	}

}
