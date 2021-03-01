package amazon.pages;

import amazon.base.AmazonBase;

public class FilterListPage extends AmazonBase{

	public ProductPage clickProduct() {
    	//click on iphone product
		driver.findElementByXPath("//span[text()='Apple iPhone 11 (64GB, Yellow) [Locked] + Carrier Subscription']").click();
		return new ProductPage();
	}
	
	
}
