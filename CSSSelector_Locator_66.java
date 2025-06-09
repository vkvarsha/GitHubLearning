package seleniumlearn;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CSSSelector_Locator_66 
{
	@Test
	public void CSSSelector_Locator() throws AWTException
	{

	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.navigate().to("https://www.google.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	WebElement searchbox1 = driver.findElement(By.tagName("textarea"));
	WebElement searchbox2 = driver.findElement(By.cssSelector("textarea#APjFqb"));
	WebElement searchbox3 = driver.findElement(By.cssSelector("textarea[name=q]"));
	WebElement searchbox4 = driver.findElement(By.cssSelector("textarea.gLFyf[name=q]"));
	
	searchbox4.sendKeys("Varsha Kadam");
	//searchbox.sendKeys(Keys.ENTER);
	Actions a1 = new Actions(driver);
	a1.moveToElement(searchbox4).perform();
	
	Robot rq = new Robot();
	rq.keyPress(KeyEvent.VK_ENTER);
	
	
	}
	
}
