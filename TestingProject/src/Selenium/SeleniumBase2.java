package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBase2 {
	
			public static void main(String[] args)throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\Downloads\\chromedriver_win32\\chromedriver.exe");
		    
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			
		    driver.manage().window().maximize();
	        Thread.sleep(5000);
	        
	        driver.manage().window().minimize();
	        Thread.sleep(5000);
	        
	        driver.manage().window().maximize();
	        
	        String url = driver.getCurrentUrl();
	        System.out.println(url);
			
	}

}
