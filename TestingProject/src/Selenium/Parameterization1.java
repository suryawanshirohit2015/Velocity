package Selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization1 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\ajink\\Documents\\Book1.xlsx");
		Cell cellinfo = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(4);
		//System.out.println(cellinfo);
		
		CellType CT = cellinfo.getCellType();
		if(CT==CellType.STRING) {
			System.out.println(cellinfo.getStringCellValue());
		}
		else if(CT==CellType.BOOLEAN) {
			System.out.println(cellinfo.getBooleanCellValue());
		}
		else if(CT==CellType.NUMERIC) {
			System.out.println(cellinfo.getNumericCellValue());
		}
	}

}
