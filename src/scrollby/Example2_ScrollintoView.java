package scrollby;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_ScrollintoView {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement terms=driver.findElement(By.xpath("//a[text()='Terms']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",terms);
		
		
		
		
		
	}

}
