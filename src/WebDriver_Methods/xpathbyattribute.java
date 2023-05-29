package WebDriver_Methods;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyattribute {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.sugarcosmetics.com");
		driver.findElement(By.xpath("//input[@type=\'text\']")).click();
		Thread.sleep(2000);
	
		
		driver.findElement(By.xpath("//input[@id=\'outlined-start-adornment\']")).sendKeys("9970062309");
	}

}
