package testNg35;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchAndQuit 
{
	ChromeDriver driver;

	@BeforeMethod
	void Launch()
	{
		 driver = new ChromeDriver();
	}
	
	
	@AfterMethod
	void Quit() throws InterruptedException, IOException
	{	
		Thread.sleep(1000);
		
		TakesScreenshot ts = driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File DESTINATION = new File("E:\\Automation2\\SeleniumLearning\\src\\Screenshots\\Varsha"+Math.random()+".png");
		FileUtils.copyFile(source, DESTINATION);
		 driver.quit();
		 
	}
	
	
}
