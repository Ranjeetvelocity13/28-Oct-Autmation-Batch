package Com.Ecommerce.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;
import Com.Ecommerce.PageClasses.TC_Ecommerce_AddToCart;

public class Payment_Testcases extends Ecommerce_BaseClass {

	TC_Ecommerce_AddToCart TEA = new TC_Ecommerce_AddToCart();
	
	//Action & Actions
	
	Actions Act = new Actions(driver);

	WebElement Computer = driver.findElement(By.xpath("//a[contains(text(),'Computers ')]"));

//	Act.moveToEement(Computer).perform();
	
}
