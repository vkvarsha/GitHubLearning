package seleniumlearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup
{

	public void fileupload()
	{
		
		ChromeDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		
		driver.get("https://www.monster.com/upload-resume/");
		
		WebElement uploadresume = driver.findElement(By.xpath("(//span[.='Upload Your Resume'])[1]"));
		uploadresume.sendKeys("D:\\My Personal\\MyFolder\\Images\\varshanice.jpg");
		
		
		
		
		
	}
	
}
