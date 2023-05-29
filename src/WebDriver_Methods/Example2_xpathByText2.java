package WebDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_xpathByText2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.faceebok.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Create a new account']")).click();
	}

}
