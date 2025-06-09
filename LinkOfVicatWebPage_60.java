package seleniumlearn;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
public class LinkOfVicatWebPage_60

{
	
	String LinkName;
	
	@Test
	public void links() throws InterruptedException
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qa-vicat.autoplant.in/AutoplantWeb");
			
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
		WebElement uname = driver.findElement(By.xpath("//input[@placeholder=\"User Name\"]"));
		uname.sendKeys("vkinplant");
			
		WebElement pwd = driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
		pwd.sendKeys("Vkvarsha@25");
			
			
		WebElement Loginbtn = driver.findElement(By.xpath("//button[@class=\"submit\"]"));
		Loginbtn.click();
			
		WebElement plntname = driver.findElement(By.name("submitplantcode"));
		plntname.click();
			
		System.out.println("Plant selection done");
			
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int linkcount = links.size();
			 
		for(int i=0;i<linkcount;i++)
			{
				 
				WebElement a = links.get(i);
				  LinkName = a.getText();
				  String url = a.getDomAttribute("href");
				 String url2 = a.getDomProperty("href");
				 System.out.println("URL 2 "+url2);
				  
				 System.out.println("url is : "+LinkName);
				 System.out.println(url);
				 
			}
			 
		List<WebElement> Sections =  driver.findElements(By.xpath("//div[@class='container-fluid']/div"));
		 	 
			 
			 int seccount = Sections.size();
			 System.out.println("Section count is "+seccount);
			 
			 for(int j=0;j<seccount;j++)
			 {
				 
				 WebElement b = Sections.get(j);
				 int w = j+1;
				 WebElement sectionclcik = driver.findElement(By.xpath("//div[@class='container-fluid']/div["+w+"]/div/div/a"));
				 //WebElement sectionclcik = driver.findElement(By.linkText("Active Trips"));
				// System.out.println("I am j" +j);
				 //System.out.println("I am B" +b);
				 sectionclcik.getText();
				 //System.out.println("B Text"+b);
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				 try {
					sectionclcik.click();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Thread.sleep(5000);
				 List<WebElement> Sectionurl = driver.findElements(By.tagName("a"));
				 
				 int sidelinkscount = Sectionurl.size();
				 
				 for(int k=0;k<sidelinkscount;k++)
				 {
					 
					 WebElement c = Sectionurl.get(k);
					 String InsideUrl = c.getText();
					 String InsideLink =  c.getDomAttribute("href");
					// System.out.println(InsideUrl);
				
				 System.out.println( " Inside url :" +InsideUrl);
				 System.out.println(InsideLink);
			 }
			 
			  WebElement home = driver.findElement(By.linkText("Home"));
			  home.click();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 }
		

	
	}
}
	
