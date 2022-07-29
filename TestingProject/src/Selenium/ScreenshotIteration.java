package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotIteration {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		for(int i=1;i<=10;i++) {
	
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("D:\\VELOCITY\\Screenshot\\test"+i+".jpg");
		FileHandler.copy(source, destination);
		}
		
		driver.close();
				
	

	}}
