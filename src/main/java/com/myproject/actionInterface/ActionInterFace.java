package com.myproject.actionInterface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface ActionInterFace {
	public boolean type(WebElement ele, String text);
	public void click(WebDriver driver, WebElement ele);
	public String getCurrentURL(WebDriver driver);
	public String screenShot(WebDriver driver, String name);

}
