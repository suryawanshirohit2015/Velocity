package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 {
	
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/login/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abc");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abmw%^&*");
	Thread.sleep(8000);
	
	
	driver.findElement(By.xpath("//button[@name='login']")).click();
	
	

}
}