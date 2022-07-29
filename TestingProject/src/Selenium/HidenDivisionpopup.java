package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HidenDivisionpopup {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Rohit");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	
		
		
	}

}
