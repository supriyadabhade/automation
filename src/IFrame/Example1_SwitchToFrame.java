package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_SwitchToFrame{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	
	
	//Switch to frame
		//driver.switchTo().frame("iframeResult");		//String frameID
		//driver.switchTo().frame("iframeResult");	//String FrameName
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
//frame Webelement

	
	//driver.switchTo().frame();
	//int frameIndex
	//click on"click me btn"
	driver.findElement(By.xpath("//button[contains(text(), 'Click me to')]")).click();
	
	}

}
