package seleniumlearn;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Navigate_Methods 

{
		@Test
		public static void Navigation ()
		{
			
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.navigate().to("https://www.amazon.in/");  
			driver.navigate().back();
			driver.navigate().forward();
			driver.navigate().refresh();
			
			
		}
	
	
}
