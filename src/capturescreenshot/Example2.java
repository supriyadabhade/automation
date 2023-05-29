package capturescreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Example2 {
	
	
	public static void  main(String[] args) throws IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String RS = RandomString.make(2);
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println(src);
		File dest = new File("C:\\Users\\Shree\\Pictures\\Camera Roll\\capturescreenshot\\Image"+RS+".jpg");
		
		FileHandler.copy(src, dest);
		//className.methodname(pathsource,pathOfDest);
		
		
	}

	}


