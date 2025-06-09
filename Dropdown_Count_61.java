package seleniumlearn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown_Count_61 
{
	@Test
	public void DropdownCount()
	{
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	
	WebElement dropdown =  driver.findElement(By.id("searchDropdownBox"));
	
	Select s1 = new Select(dropdown);
	
	s1.selectByVisibleText("Electronics");
	
	List<WebElement> ListDropdown = s1.getOptions();
	System.out.println(ListDropdown.size());
	
	
	
	}
	
}
