package seleniumlearn;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLinkText_28D {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		
		WebElement images = driver.findElement(By.linkText("Images"));
		images.click();
		
		WebElement  searchbox =  driver.findElement(By.id("APjFqb"));
		searchbox.sendKeys("INDIA");
		searchbox.sendKeys(Keys.ENTER);
		
	}

}
