package seleniumlearn;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement_27 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();   //Maximize the window
		WebElement searchbox = driver.findElement(By.id("APjFqb"));
		searchbox.sendKeys("Varsha Kadam");
		searchbox.sendKeys(Keys.ENTER);//Keys Function  -- This will provide whole keyboard
		Thread.sleep(5000);
		
		
		
			
	}

}
