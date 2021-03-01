package amazon.testcases;

import org.testng.annotations.Test;

import amazon.base.AmazonBase;
import amazon.pages.Homepage;

public class AmazonOpenProduct extends AmazonBase{

	@Test
	public void openProduct() {
	
		new Homepage().sendKeywords().clickSearchIcon().clickFilter().clickProduct().getProductTitle().verifyPage();
		
	}
	
}
