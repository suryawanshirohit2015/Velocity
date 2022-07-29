package Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetNumericCell {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		FileInputStream file = new FileInputStream("D:\\VELOCITY\\Test Cases Amazon\\E-Commerce_TestCases.xlsx");
		double data = WorkbookFactory.create(file).getSheet("login page").getRow(5).getCell(5).getNumericCellValue();
		System.out.println(data);	
		

}}
