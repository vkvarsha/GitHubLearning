package seleniumlearn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DoubleClickOnAnyComponent_53
{
	@Test
	public void double_Click()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.google.com/");
		
		WebElement gmaillink = driver.findElement(By.linkText("Gmail"));
		//gmail.click();
		
		
	Actions a1 = new Actions(driver);
	a1.doubleClick(gmaillink).perform();
	
	
	}
}
