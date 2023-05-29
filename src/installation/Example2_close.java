package installation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_close {
	
	
	public static void main(String[] args) {
		
		
		
		WebDriver f=new ChromeDriver();
		f.get("https://www.google.com");
		f.get("https://www.facebook.com");
		f.close();
		
		
	}

}
