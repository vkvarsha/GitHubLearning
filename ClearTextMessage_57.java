package seleniumlearn;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClearTextMessage_57 
{
/* How to clear text message .There are 2 Methods
 * 
 * 1.Clear Method
 * 2.Keys functionality  -- control + a and backspace/delete
 *  
 *  */
	@Test
	public void clearmethod() throws InterruptedException
	{
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("E:\\\\Automation2\\\\learningHTML1.html");
	
	driver.switchTo().alert().accept();
	
	WebElement uname = driver.findElement(By.name("username"));
	uname.sendKeys("Varsha");
	Thread.sleep(2000);
	
	uname.clear();
	
	Thread.sleep(2000);
	
	uname.sendKeys("kadam");
	Thread.sleep(2000);
	
	uname.sendKeys(Keys.CONTROL+"a");
	uname.sendKeys(Keys.BACK_SPACE);
	
	Thread.sleep(2000);

	uname.sendKeys("Vaishali");
	uname.sendKeys(Keys.CONTROL+"a");
	uname.sendKeys(Keys.DELETE);
	
	}
	
}
