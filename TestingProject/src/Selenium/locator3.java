package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator3 {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[contains(@class,'inputtext')])[1]")).sendKeys("Surya@gmail.com");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'acc')]")).click();

}

}
