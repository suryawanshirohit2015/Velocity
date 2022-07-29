package Selenium;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotwithdate {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/r.php/");
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	    
	    Date d = new Date();
		//	System.out.println(d);
			String ScreenshotFB = d.toString().replace(", ", "_") .replace(":", "-")+".jpg";
			
			
	  File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//	System.out.println(source);
		
		File destination = new File("D:\\VELOCITY\\Screenshot\\"+ ScreenshotFB);
		FileHandler.copy(source, destination);
		driver.close();
		}

}
