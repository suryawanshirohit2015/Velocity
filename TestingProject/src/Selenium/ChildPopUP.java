package Selenium;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopUP {
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();//click on new button
		Set<String> ids = driver.getWindowHandles();
		ArrayList<String> al  =new ArrayList<String>(ids);
		String CWD = al.get(1);//child browser address
		driver.switchTo().window(CWD);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Training'][1]")).click();
		driver.switchTo().window(al.get(0));
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		
	}
	

}
