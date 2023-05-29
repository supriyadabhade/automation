package handlingofcustomizelistbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		
//to load from one to another page we are adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	//step1:
	 WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	
	
	//step2:
	Actions act=new Actions(driver);
	Thread.sleep(2000);
//step3:
	act.click(month).perform();
	}

}
