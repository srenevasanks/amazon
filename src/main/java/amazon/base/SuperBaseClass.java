package amazon.base;

import org.openqa.selenium.chrome.ChromeDriver;

public class SuperBaseClass {

	public static ChromeDriver driver;
	
	public static void findEleXpathClick(String xpathname) {
		driver.findElementByXPath(xpathname).click();
	}

	public static void findEleIdClick(String xpathname) {
		driver.findElementById(xpathname).click();
	}
	
	public static void findEleIdSendKys(String xpathname, String keyword) {
		driver.findElementById(xpathname).sendKeys(keyword);;
	}
	
	public static void findEleLinkTestClick(String xpathname) {
		driver.findElementByXPath(xpathname).click();
	}
	
	public static void findEleClassNameClick(String xpathname) {
		driver.findElementByXPath(xpathname).click();
	}
	
}
