package seleniumlearn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FindCordinateofAnyComponent_54
{
		/* How to find cordinate of any component*/
	@Test
	public void cordinates()
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		WebElement country = driver.findElement(By.linkText("About Amazon"));
		//country.click();
		
		Point xandy = country.getLocation();
		
		int xaxis = xandy.getX();
		int yaxis = xandy.getY();
		
		System.out.println("X is " +xaxis +"And Y is " +yaxis +"all");
		
		Actions a1 = new Actions(driver);
		a1.moveByOffset(xaxis, yaxis).click().perform();
		
	}
	
	
	
}
