package scrollby;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_ScrollUpDown {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		//scrolldown-->1st parameter:0,2nd parameter: +ve
	//	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)");
	Thread.sleep(2000);
	
	//scrollup-->1st parameter:0,2nd parameter:-ve
	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-100)");
	
	
	//scrollright-->parameter:+ve,2nd Parameter:0
	((JavascriptExecutor)driver).executeScript("window.scrollBy(100,0)");
	
	//scrollleft--->parameter:-ve,2nd parameter:0
	//((JavascriptExecutor)driver).executeScript("window.scrollBy(-50,0)");
		
		
		
		
		
	}

}
