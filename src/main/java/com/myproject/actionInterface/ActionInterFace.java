package com.myproject.actionInterface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface ActionInterFace {
	public boolean type(WebElement ele, String text);
	public void click(WebDriver driver, WebElement ele);
	public String getCurrentURL(WebDriver driver);
	public String screenShot(WebDriver driver, String name);
	public String getTEXT(WebElement ele);
	public boolean selectByVisibleText(String visibletext, WebElement ele);
	public boolean findElement(WebDriver driver, WebElement ele);
	public boolean isDisplayed(WebDriver driver, WebElement ele);
	public void scrollByVisibilityOfElement(WebDriver driver, WebElement ele);
	public boolean selectBySendkeys(String value,WebElement ele);
	public boolean selectByValue(WebElement element,String value);

}
