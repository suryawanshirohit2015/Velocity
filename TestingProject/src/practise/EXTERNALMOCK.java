package practise;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EXTERNALMOCK {
	

public static void main(String[] args)throws InterruptedException{

System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		driver.get("http://123.252.129.5:8080/hob/");
		Thread.sleep(3000);
	
      Dimension D = new Dimension(100,200); 
      driver.manage().window().setSize(D);
     Thread.sleep(3000); 

      Point p = new Point(300,400);  
      driver.manage().window().setPosition(p);
      Thread.sleep(2000);
      
      driver.close();

}}
