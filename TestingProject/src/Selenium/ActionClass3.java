package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass3 {
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
    Thread.sleep(5000); 
	
    WebElement more = driver.findElement(By.xpath("//div[@class='exehdJ']"));
    Actions act = new Actions(driver);
    act.moveToElement(more).perform();
    Thread.sleep(5000);
    
    WebElement Advertise = driver.findElement(By.xpath("//div[text()='Advertise']"));
    act.click(Advertise).perform();

}}
