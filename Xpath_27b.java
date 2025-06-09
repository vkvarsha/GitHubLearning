package seleniumlearn;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;

public class Xpath_27b {

	public static void main(String[] args) throws InterruptedException {
		/*  
		 * Two TYpes of Xpath
		 * 
		 * 1.Absolute Xpath  -- with traverse parent tag name to child tag name with the help of /
		 * 2.Relative Xpath  --use // to directly reach to any tag name
		 * to tackle xpath some time need to use index
		 *  
		 *  */
		
		ChromeDriver driver1 = new ChromeDriver();
		driver1.get("https://www.google.com");
		driver1.manage().window().maximize();
		Thread.sleep(2000);
		WebElement searchbox = driver1.findElement(By.xpath("//textarea[@id='APjFqb']")); //relative X path
		searchbox.sendKeys("Varsha kadam");
		searchbox.sendKeys(Keys.ENTER);
		driver1.close();
		
		
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			//Absolute x path
			//WebElement fashion = driver.findElement(By.xpath("(//div[@class='YBLJE4']/span/span)[3]")); //absolute x path
			
			
			//X path by Text
			//  //button[.='']
			//span/span[.='Mobiles'] OR Below
			WebElement fashion = driver.findElement(By.xpath("(//div[@class='YBLJE4']/span/span)[.='Mobiles']"));
			fashion.click();
			Thread.sleep(2000);
			driver.close();
			
			
		
	}

}
