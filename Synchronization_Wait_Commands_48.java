package seleniumlearn;

import java.time.Duration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class Synchronization_Wait_Commands_48
{
	@Test
	public static void synchro()
	{
		/*  
		 * implicit wait --> Threshold time (maximum time) -- No wastage of time like thread.sleep
		 *  
		 *  */
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);  this is deprecated method
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement searchbox = driver.findElement(By.name("q"));
				searchbox.sendKeys("Mumbai");
		searchbox.sendKeys(Keys.ENTER);
		

		WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		w1.until(ExpectedConditions.titleContains("mumbai - Google Search"));
		

		WebElement searchbox2 = driver.findElement(By.name("q"));
				searchbox2.sendKeys("Varsha");
		
				
				Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
						.withTimeout(Duration.ofSeconds(30))
						.pollingEvery(Duration.ofMillis(300))
						.ignoring(NoSuchElementException.class);
				
				WebElement wt = wait.until(new Function<WebDriver,WebElement>()
						{
					
							public WebElement apply(WebDriver driver)
							{
								return driver.findElement(By.xpath("//div[text()='Mumbai']"));
							}
					
						});
		
		
		
		
		
		
		
		
		
		
	}	
	
	
}
