package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_SwitchTomainpagefromframe {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	//switch to frame
		//driver.switchTo().frame("iframeResult");
	//click on "click me btn" from iframe
		driver.findElement(By.xpath("//button[contains(text(),'click me to ')]")).click();
		
		//switch to main page
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
		//clcik on"open menu" option from main page
		driver.findElement(By.xpath("//a[@id='menuButton']")).click();
	}

}
