package Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetBooleanCellValue {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\ajink\\Documents\\Book1.xlsx");
		boolean data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(2).getBooleanCellValue();
		
		
		
	}

}
