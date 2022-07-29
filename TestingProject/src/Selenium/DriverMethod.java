package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		Thread.sleep(5000);
		
		driver.navigate().to("https://web.whatsapp.com/");
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		
		driver.close();
		
		WebDriver driver1 = new ChromeDriver();
		
		driver1.get("https://www.amazon.com/");
		
		Thread.sleep(3000);
		
		driver1.quit();
		
		
		
		
		
		
		
		
		
		

	}

}
