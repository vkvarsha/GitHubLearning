package DataDrivenTesting_37;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchAndQuit extends FetchCredentials
{


	ChromeDriver driver;

	@BeforeMethod
	void Launch() throws InterruptedException 
	{
		 driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 WebElement uname = driver.findElement(By.id("ap_email"));
		 uname.sendKeys(username2);
		 WebElement cont = driver.findElement(By.id("continue"));
		 cont.click();
		 
		 WebElement pwd = driver.findElement(By.id("ap_password"));
		 pwd.sendKeys(Password2);
		 
		 WebElement signin = driver.findElement(By.id("signInSubmit"));
		 signin.click();
		 
		 
	}
	
	
	@AfterMethod
	void Quit() throws InterruptedException
	{	
		Thread.sleep(1000);
		 driver.quit();
	}
	
	
	/*public LaunchAndQuit(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}*/
}
