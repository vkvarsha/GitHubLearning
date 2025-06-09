package seleniumlearn;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReturnType_Find_ElementAmazon_28e {
	
	//Return type of Find Element is WebElement which is interface by Nature

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_custrec_signin%26adgrpid%3D155259813593%26hvpone%3D%26hvptwo%3D%26hvadid%3D674893540034%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D9755606366571280142%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9303628%26hvtargid%3Dkwd-64107830%26hydadcr%3D14452_2316413%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		Thread.sleep(4000);
		
		driver.findElement(By.name("email")).sendKeys("9769767426");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Varsha@27");
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(2000);
		
		WebElement sch = driver.findElement(By.id("twotabsearchtextbox"));
		sch.sendKeys("Books");
		sch.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		//WebElement Firstbook = driver.findElement(By.xpath("//span[@data-component-type=\"s-search-results\"]/div/div[3][@data-index=3]"));
		//Firstbook.click(); Not able to find this dynamic first book
		
		
		
	}

}
