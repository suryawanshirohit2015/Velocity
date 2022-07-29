package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniunBase1 {
	

	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\Downloads\\chromedriver_win32\\chromedriver.exe");
    
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
	String title = driver.getTitle();
	System.out.println(title);
	String exptitle ="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	
	if(title.equalsIgnoreCase(exptitle)) {
		System.out.println("Navigate to right page");
	}
	else {
		System.out.println("to wrong page");
	}


}}
