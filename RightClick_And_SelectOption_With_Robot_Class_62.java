package seleniumlearn;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightClick_And_SelectOption_With_Robot_Class_62 
{

	@Test
	public void Selectoptionbyrightclick() throws AWTException, InterruptedException
	{
		//this can be using robot class
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		
		Actions a1 = new Actions(driver);
		a1.contextClick(gmail).perform();
	
	Robot r1 = new Robot();
	r1.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(1000);
	r1.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(1000);
	r1.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(1000);
	r1.keyPress(KeyEvent.VK_ENTER);
	
	
	}
	
}
