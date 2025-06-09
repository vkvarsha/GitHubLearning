package seleniumlearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_HoverOver {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		WebElement fasionss = driver.findElement(By.xpath("//span/span[.='Fashion']"));
		
		Actions a1 = new Actions(driver);
		a1.moveToElement(fasionss).perform();
		Thread.sleep(1000);
		
		WebElement menswear = driver.findElement(By.linkText("Men's Casual Shirts"));
		menswear.click();
		Thread.sleep(2000);
		
		WebElement toptshirt = driver.findElement(By.xpath("((//div[@class='_75nlfW'])[1]/div)[1]"));
		toptshirt.click();
		Thread.sleep(1000);
		
		WebElement buynow = driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ _3Yl67G _7Pd1Fp']"));
		buynow.click();
	}

}
