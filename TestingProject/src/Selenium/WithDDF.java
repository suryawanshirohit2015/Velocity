package Selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WithDDF {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("D:\\VELOCITY\\Book1-DDF.xlsx");
	   Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajink\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    ChromeOptions opt = new ChromeOptions();
	    opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		
		//Step 1 entering UN with using DDF
		String UN = sh.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(UN);
		Thread.sleep(2000);
		
		//Step 2 entering PWD with using DDF
		String PWD = sh.getRow(1).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(PWD);
        Thread.sleep(2000);
       
        //Step 3 LOGIN
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(1000);
        
        //Step 4 entering pin with using DDF
        String PIN = sh.getRow(2).getCell(0).getStringCellValue();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(PIN);
        Thread.sleep(1000);
        
        //Step 5 Submit
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        
        String ActualUID = driver.findElement(By.xpath("//span[text()='OKP335']")).getText();
        
        
		String expectedUID = "OKP335";
		
		if(expectedUID.equals(ActualUID)) {
			System.out.println("TC PASS");
		}
		else 
			System.out.println("TC fail");
		}
	}

