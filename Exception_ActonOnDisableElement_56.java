package seleniumlearn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Exception_ActonOnDisableElement_56
{
	@Test
	public void ExceptiononDisableElement()
	{
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("E:\\Automation2\\learningHTML1.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.switchTo().alert().accept();
	
	
	WebElement uname = driver.findElement(By.name("username"));
	uname.sendKeys("Varsha");
	
	WebElement lname = driver.findElement(By.name("lname"));
	lname.sendKeys("Kadam");
	
	System.out.println("See the Exception is  : org.openqa.selenium.ElementNotInteractableException: element not interactable");
	
	
	
	}
	
}
