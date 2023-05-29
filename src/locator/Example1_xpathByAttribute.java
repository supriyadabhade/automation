package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_xpathByAttribute {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	//enteruN
	//driver.findElement("Locator type")
	//driver.findElement(by.Xpath("xpathExpression"));
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("supriyadabhade62309@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("kacheshwar");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@value='1']")).click();
	
}

}
