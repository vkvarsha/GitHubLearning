package seleniumlearn;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowsing_49
{
	 WebDriver driver;

	@Test
	public  void ChromeBrowser(String nameofbrowser)
	{
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		
	}
	
	@Test
	public  void EdgeBrowser(String nameofbrowser)
	{
		
		driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		
		
	}
	
	
	
}
