package seleniumlearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Select_29 {

	public static void main(String[] args) throws InterruptedException 
	{
		// Default tag name of any dropdown will be Select
		/*  By using select class dropdown functionality need to handle
		 * 1.Create an Object of Select Class
		 * 2.With the help of reference variable
		 * 
		 *	3 Methods to handle dropdown
		 *
		 *	Select s1 = new Select();
		 *	s1.Selectbyvalue
		 *	s1.selectbyindex
		 *	s1.selectbyvisibletext();
		 * */
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement AllDropdown =  driver.findElement(By.id("searchDropdownBox"));
		AllDropdown.click();
		Select s1 = new Select(AllDropdown);
		s1.selectByVisibleText("Clothing & Accessories");
		Thread.sleep(1000);
		s1.selectByValue("search-alias=dvd");
		Thread.sleep(1000);
		s1.selectByIndex(28);
		Thread.sleep(1000);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
