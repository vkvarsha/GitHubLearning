package seleniumlearn;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle_ContorltoNextWindow {

	public static void main(String[] args)
	{
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.naukri.com/");
			System.out.println(driver.getTitle());
			
			WebElement registration = driver.findElement(By.id("register_Layer"));
			registration.click();
			
			
			WebElement googlelink = driver.findElement(By.xpath("//span[.='Google']"));
			googlelink.click();
			
			// String pid = driver.getWindowHandle();
			Set<String> pcid = driver.getWindowHandles();
			
			Iterator<String> p1 = pcid.iterator();
			String initial =  p1.next();
			String newwindow = p1.next();
			
			System.out.println(initial);
			System.out.println(newwindow);
			
			driver.switchTo().window(newwindow);
			
			WebElement mailinput = driver.findElement(By.xpath("//input[@type='email']"));
			mailinput.sendKeys("myidcheck@gmail.com");
			
			
			
			
	}

}
