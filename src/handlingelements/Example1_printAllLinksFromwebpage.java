package handlingelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.microsoft.schemas.office.office.impl.AllowincellAttributeImpl;

public class Example1_printAllLinksFromwebpage {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		
		
		System.out.println(allLinks.size());
		for( WebElement s1:allLinks) {
	System.out.println(s1.getText());
			
			
		}
	}

}
