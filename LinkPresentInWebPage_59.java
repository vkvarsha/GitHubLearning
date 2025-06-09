package seleniumlearn;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinkPresentInWebPage_59 
{
	
	@Test
	public void LinkofWebPage()
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> links =  driver.findElements(By.tagName("a"));
		
		int linkcount = links.size();
		
		System.out.println(links.size());
		
		
		for(int i =0;i<linkcount;i++)
		{
			
		WebElement a	=links.get(i);
	//	String url =	a.getText();
		//System.out.println(url);
		
		String urllink = a.getDomProperty("href");
		System.out.println(urllink);
		
		}
		
		
		
	}
	
	
	
}
