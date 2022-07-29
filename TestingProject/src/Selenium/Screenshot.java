package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
	public static void main(String[] args) throws InterruptedException, IOException{

	System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/r.php");
	
	Thread.sleep(2000);
	
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	System.out.println(source);
	
	File destination = new File("D:\\VELOCITY\\Screenshot\\FbSignin.jpg");
	FileHandler.copy(source, destination);
	
	
	
	
	}
	}


