package seleniumlearn;

import java.io.File;

import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screeshot_With_Mathrandom_63
{
	@Test
	public void Screenshot_click() throws IOException
	{
	
	ChromeDriver driver = new ChromeDriver();
			
	//Step1 :- upcaste your driver to take the screenshot
	//step2 -- utilize method as get screenshot you can take screenshot
	//step3 -- create and object of file class and provide the location where the screenshot get store
	//step4 -- using  FileUtils class    class copy the screenshot from source to the destination
	
	
	//What is getscreenshot -- it is an abstract method present under TakesScreenshot interface
	
	
	driver.get("https://www.google.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();
	WebElement search = driver.findElement(By.name("q"));
	search.sendKeys("Varsha Kadam");
	search.sendKeys(Keys.ENTER);
	
	
	TakesScreenshot ts = driver;
  File source =	ts.getScreenshotAs(OutputType.FILE);
  File destination = new File("E:\\Automation2\\SeleniumLearning\\src\\Screenshots\\Varsha"+Math.random()+".png");
  FileUtils.copyFile(source, destination); //apache poi jars should be available
	
	
	}
}
