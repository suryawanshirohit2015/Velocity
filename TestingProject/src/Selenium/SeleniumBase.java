package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBase {
	
	public static void main(String[] args)throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		String title = driver.getTitle();
		System.out.println(title);
	    	
	    			
	}

}
