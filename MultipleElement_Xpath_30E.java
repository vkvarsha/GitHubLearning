package seleniumlearn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElement_Xpath_30E 
{

	public static void main(String[] args) throws InterruptedException  
	{

		ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	
	WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
	searchbox.sendKeys("Shoes");
	
	Thread.sleep(2000);
	searchbox.sendKeys(Keys.ENTER);
	
	WebElement topshoes =  driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
	topshoes.click();
	
	}
}
