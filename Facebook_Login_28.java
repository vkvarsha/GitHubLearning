package seleniumlearn;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login_28 {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys("varsha.kadam27@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("Lovelyvarsha");
		driver.findElement(By.name("login")).click();
		
		
	}

}
