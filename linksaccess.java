package seleniumlearn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class linksaccess 
{
	@Test
	public void linktocheck() throws InterruptedException
	{
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://qa-vicat.autoplant.in/AutoplantWeb");
	Thread.sleep(2000);
	
	WebElement unm= driver.findElement(By.xpath("//input[@placeholder=\"User Name\"]"));
	unm.sendKeys("vkinplant");
	
	WebElement	pwd = driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
	pwd.sendKeys("Vkvarsha@25");
	
	WebElement logbtn = driver.findElement(By.xpath("//button[@type='submit']"));
	logbtn.click();
	
	WebElement planselection= driver.findElement(By.id("plants"));
	
	planselection.click();
	Select s1 = new Select(planselection);
	s1.selectByValue("Vicat_Kalburgi");
	
	WebElement submitbtn = driver.findElement(By.name("submitplantcode"));
	submitbtn.click();
	
	
	
	
	
	}
}
