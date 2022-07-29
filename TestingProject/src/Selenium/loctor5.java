package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loctor5 {
	 public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\Downloads\\chromedriver_win32\\chromedriver.exe");
    
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.instagram.com/accounts/login/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("suryawanshirohit2015@gmail.com");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("rohitbhaui");
	Thread.sleep(2000);
	
	WebElement result = driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']"));
	result.click();
	Thread.sleep(2000);
	boolean a = result.isEnabled();
	System.out.println(a);
	
	if(a==true) {
		System.out.println("element is enabled");
	}
	else {
		System.out.println("elemnt is unenabled");
		
	}
	
}}