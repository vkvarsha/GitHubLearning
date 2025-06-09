package seleniumlearn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_30D {

	public static void main(String[] args) throws InterruptedException 
	{
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		WebElement searchbox =  driver.findElement(By.name("q"));
		searchbox.sendKeys("Shoes");
		Thread.sleep(3000);
		
		List<WebElement> listshoes = driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search']/ul/li"));
		int cntshoes = listshoes.size();
		System.out.println(cntshoes);
		
		
		
		
		
		
		
		
		
		
	}

}
