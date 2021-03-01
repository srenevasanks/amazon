package amazon.pages;

import amazon.base.AmazonBase;

public class SearchResultPage extends AmazonBase {
	
	public FilterListPage clickFilter() {
		//click on the brand filter
		driver.findElementByXPath("//span[text()='Apple']").click();
		
		
		findEleXpathClick("//span[text()='Apple']");
		
		
		return new FilterListPage();
	}

}
