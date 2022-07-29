package Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizePosition {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\Downloads\\chromedriver_win32\\chromedriver.exe"); 

        WebDriver driver = new ChromeDriver();    //upcasting
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(3000);
		
		Dimension D = new Dimension(300,800);           //set size
		driver.manage().window().setSize(D);
		
		Thread.sleep(5000);
		
		Point P=  new Point(300,500);   
		driver.manage().window().setPosition(P);     //set position
		
		Thread.sleep(5000);
		
		driver.close();
		
	
	
	
}
	}


