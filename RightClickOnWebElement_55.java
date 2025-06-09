package seleniumlearn;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightClickOnWebElement_55
{
	@Test	
	public void rightclick()
	{
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com/");
			
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	WebElement gmaillink = driver.findElement(By.linkText("Gmail"));
	
	Actions a1 = new Actions(driver);
	a1.contextClick(gmaillink).perform();
	
	
	
	}
}
