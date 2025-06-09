package seleniumlearn;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverInvokeConcept_25
{

	
	public static void main(String[] args) throws InterruptedException 
	{
		
		
		
		ChromeDriver driver = new ChromeDriver(); // import chromedriver class -- invoking empty 
		
		driver.get("https://www.google.com"); // to redirect to URL
		Thread.sleep(4000); // thread class and sleep method , sleeping programe for mention second
		String title = driver.getTitle();  // it will give the title of page
		System.out.println(title);
		driver.close(); // to close the current/parent browser
		driver.quit(); // to close the all the chrome browser  ,it will close parent as well as child browser
		
		
	}

}
