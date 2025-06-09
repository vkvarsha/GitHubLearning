package testNg35;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.w3c.dom.Text;

public class Flipkart_Launch extends LaunchAndQuit


{
	@Test(priority=1)
	void flipkartlaunch()
	{
	driver.get("https://www.flipkart.com");
	WebElement searchbox = driver.findElement(By.name("q"));
	searchbox.sendKeys("Bluetooth");
	searchbox.sendKeys(Keys.ENTER);
	
	
	}
	

}
