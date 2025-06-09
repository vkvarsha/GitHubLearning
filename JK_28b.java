package seleniumlearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JK_28b {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://inplant.autoplant.in/");
		Thread.sleep(3000);
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Vkcentral");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Test@12345");
		
		WebElement submit =  driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		
		
		
	}

}
