package com.myproject.reports;

import org.openqa.selenium.WebElement;

public class CaptureScreen {
	private boolean captureBrowserPage = false;
	private boolean captureDesktop = false;
	private boolean captureWebElement = false;
	private WebElement element = null;

	public CaptureScreen(WebElement paramWebElement) {
		if (paramWebElement != null) {
			setCapturBrowserPage(true);
			setElement(paramWebElement);
		}
	}
	public CaptureScreen(ScreenshotOf paramScreenshotOf) {
		if(paramScreenshotOf==ScreenshotOf.BROWSER_PAGE) {
			setCapturBrowserPage(true);
		}else if(paramScreenshotOf==ScreenshotOf.DESKTOP){
			setCaptureDesktop(true);
		}
		
	}
	
	public boolean isCaptureBrowserPage() {
		return this.captureBrowserPage;
	}
	

	public void setCaptureDesktop(boolean paramBoolen) {
		// TODO Auto-generated method stub
		this.captureWebElement=paramBoolen;
		
	}
	public boolean isCaptureWebElement() {
		return this.captureWebElement;
		
	}
	
	public void setCaptureWebElement(boolean paramBoolean) {
		this.captureWebElement=paramBoolean;
	}
	
	public WebElement getElement() {
		return this.element;
	}
	public void setCapturBrowserPage(boolean b) {
		// TODO Auto-generated method stub

	}

	public void setElement(WebElement paramWebElement) {
		// TODO Auto-generated method stub
		this.element=paramWebElement;

	}
	
	public static enum ScreenshotOf{
		BROWSER_PAGE, DESKTOP;
		private ScreenshotOf() {}
	}

}
