package Selenium;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotWithDateName {
	 public static void main(String[] args) throws InterruptedException, IOException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\Downloads\\chromedriver_win32\\chromedriver.exe");
    
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	
	Thread.sleep(2000);
	
	//Calendar cal = Calendar.getInstance();
	//Date time =cal.getTime();
	//System.out.println(time);
	//String timestamp=time.toString().replace(":", " ").replace("_ ", "-");
	
	Date d = new Date();
			System.out.println(d);
			String Screenshot = d.toString().replace(", ", "_") .replace(" ", ":");
			
			
	 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//	System.out.println(source);
		
		File destination = new File("D:\\VELOCITY\\Screenshot\\Amazon_"+Screenshot+".jpg");
		FileHandler.copy(source, destination);
		driver.close();
		
		}
	

}
