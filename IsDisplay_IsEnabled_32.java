package seleniumlearn;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplay_IsEnabled_32 {

	public static void main(String[] args)
	{
		/*  check if (field is display)yes   , if(field is enable) = yes,-- type your name*/
	
		ChromeDriver driver  = new ChromeDriver ();
		driver.get("https:www.google.com");
		driver.manage().window().maximize();
		
		
		WebElement id = driver.findElement(By.id("APjFqb"));
		
		
		boolean available =id.isDisplayed();  // is it display
		System.out.println(available);
		boolean writable = id.isEnabled();		// is it enable
		System.out.println(writable);
		
		if(available==true)
		{
			if(writable ==true)
			{
				System.out.println("Both are true");
				id.sendKeys("Varsha");
				id.sendKeys(Keys.ENTER);
			}
			
		}
	}

}
