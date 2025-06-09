package seleniumlearn;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggession_FindElements_30A
{
	/*  Autosuggession --> When Text field available and on type multiple option and you have to select one out of those 
	 * Xpath for autosuggession --- it should be combination of Absolute and relative
	 * 
	 * wHILE write xpath for autosuggession write it from Grand parent tag name
	 * 
	 * 
	 * */

	
	
	public static void main(String[] args) throws InterruptedException
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		WebElement searchbox = driver.findElement(By.id("APjFqb"));
		searchbox.sendKeys("india");
		//searchbox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> Indialist = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int listcount = Indialist.size();
		System.out.println(listcount);
		
		Indialist.get(listcount-1).click(); //Or Indialist.get(9).click();
		
		
		
	}

}
