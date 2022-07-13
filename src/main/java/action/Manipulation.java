package action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import actionInterface.ActionInterFace;
import base.Baseclass;

public class Manipulation extends Baseclass implements ActionInterFace {

	public boolean type(WebElement ele, String text) {
		boolean flag = false;
		try {
			flag = ele.isDisplayed();
			ele.clear();
			ele.sendKeys(text);
			// logger.info("Entered text :"+text);
			flag = true;
		} catch (Exception e) {
			System.out.println("Location Not found");
			flag = false;
		} finally {
			if (flag) {
				System.out.println("Successfully entered value");
			} else {
				System.out.println("Unable to enter value");
			}

		}
		return flag;
	}

	public void click(WebDriver driver, WebElement ele) {

		try {
			if (ele.isDisplayed()) {
				ele.click();
			} else {
				System.out.println("Element not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public String getCurrentURL(WebDriver driver)  {
		boolean flag = false;

		String text = driver.getCurrentUrl();
		if (flag) {
			System.out.println("Current URL is: \""+text+"\"");
		}
		return text;
	}

}
