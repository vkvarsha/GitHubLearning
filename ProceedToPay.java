package DataDrivenTesting_37;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ProceedToPay extends LaunchAndQuit
{

	@Test
	void PayforAddToCartList() throws InterruptedException
	{
	WebElement AddToCartlist = driver.findElement(By.xpath("//span[@id='nav-cart-count']"));
	AddToCartlist.click();
	Thread.sleep(2000);
	WebElement ProceedtoBuy = driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']"));
	ProceedtoBuy.click();
	
	
	}
	

	
}
