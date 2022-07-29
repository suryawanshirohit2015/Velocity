package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenshotRandom {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 String random = RandomString.make(2);
		 
	        File dest = new File("D:\\VELOCITY\\Screenshot\\Amazon"+random+".png");
	        FileHandler.copy(source, dest);

		
		
	}

}
