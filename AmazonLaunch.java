package testNg35;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AmazonLaunch extends LaunchAndQuit
{
	@Test(priority=1)
	void Amazonlaunch()
	{
	driver.get("https://www.amazon.in");
	WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
	searchbox.sendKeys("Mobiles");
	searchbox.sendKeys(Keys.ENTER);
	}
	
	
	

	
}
