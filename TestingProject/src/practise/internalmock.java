package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class internalmock {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobile");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"p_89/OnePlus\"]/span/a/div/label/i")).click();
	

}}
