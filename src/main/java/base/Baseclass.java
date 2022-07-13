package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();

	public static WebDriver getDriver() {
		return driver.get();

	}

	@BeforeSuite
	public void launchApp() {
		WebDriverManager.chromedriver().setup();
		driver.set(new ChromeDriver());
	}

	@AfterSuite
	public void afterSuite() {
		if (getDriver() != null) {
			getDriver().quit();
		}
	}

}
