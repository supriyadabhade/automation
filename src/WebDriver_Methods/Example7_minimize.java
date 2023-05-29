package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example7_minimize {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	driver.manage().window().minimize();
	//option s1 = driver.manage();
	//window s2 =s1.window();
	//s2.minimize();
	
	
}
}
