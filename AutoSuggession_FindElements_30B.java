package seleniumlearn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggession_FindElements_30B {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("Shoes");
		Thread.sleep(2000);
		
		List<WebElement> listofshoes = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		 int shoescont=  listofshoes.size();
		 System.out.println(shoescont);
		 listofshoes.get(shoescont-9).click();
		 
	}

}
