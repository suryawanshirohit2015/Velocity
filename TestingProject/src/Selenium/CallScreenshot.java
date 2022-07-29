package Selenium;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class CallScreenshot {
	public static void main(String[] args) {
		
	}
	
	public static  screenshot{
		
	
		
		Date d = new Date();
		System.out.println(d);
		String Screenshot = d.toString().replace(", ", "_") .replace(" -", ":");
		
		
 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	System.out.println(source);
	
	File destination = new File("D:\\VELOCITY\\Screenshot\\Amazon_"+Screenshot+".jpg");
	FileHandler.copy(source, destination);
	driver.close();
		
	}

}
