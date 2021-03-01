package amazon.pages;

import org.openqa.selenium.Keys;

import amazon.base.AmazonBase;

public class Homepage extends AmazonBase {

	public Homepage sendKeywords() {
		//enter keyword in search box and enter
		driver.findElementById("twotabsearchtextbox").sendKeys("iphone 11");
		findEleIdSendKys("twotabsearchtextbox", "iphone 11");
		
		return this;
	}
	
	public SearchResultPage clickSearchIcon() {
		//click on the search icon
		driver.findElementById("nav-search-submit-button").click();
		return new SearchResultPage();
	}
	
}
