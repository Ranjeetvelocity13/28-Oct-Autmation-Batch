package Com.Ecommerce.PageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TC_Payment_Test {

	public TC_Payment_Test() {
		
	}
	@FindBy(xpath = "//a[contains(text(),'Computers ')]")
	public WebElement Com;
	
	@FindBy(xpath = "//a[contains(text(),'Notebooks ')]")
	public WebElement Notebook;
	
	
	
}
