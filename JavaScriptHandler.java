package seleniumlearn;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptHandler 
{

	@Test
	public void JavaScript()
	{
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("E:\\Automation2\\learningHTML1.html");
			
		driver.switchTo().alert().accept();  //java script alert handle
		
		
		
		
		
	}
	
	
}
