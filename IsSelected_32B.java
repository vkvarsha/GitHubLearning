package seleniumlearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected_32B {

	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/user-account/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		 
	WebElement	Checkbox = driver.findElement(By.xpath("(//span[@class='masterstudy-authorization__checkbox-wrapper'])[2]"));
	boolean selectedopt = Checkbox.isSelected();
	System.out.println(selectedopt);
	
	if(selectedopt==false)
	{
		Checkbox.click();
	}
	
	}

}
