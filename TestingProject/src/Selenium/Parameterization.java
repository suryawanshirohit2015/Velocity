package Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\\\Users\\\\ajink\\\\Documents\\\\Book1.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	
	
	for(int i=0;i<=sh.getLastRowNum();i++) {
		for(int j=0;j<=sh.getRow(i).getLastCellNum()-1;j++) {
			Cell cellinfo = sh.getRow(i).getCell(j);
			CellType CT = cellinfo.getCellType();
			if (CT==CellType.STRING) {
				System.out.print(cellinfo.getStringCellValue()+" ");
			}
				
			else if (CT==CellType.BOOLEAN) {
					System.out.print(cellinfo.getBooleanCellValue()+" ");
			}
					
			else if (CT==CellType.NUMERIC) {
						System.out.print(cellinfo.getNumericCellValue()+" ");


			}}
			System.out.println();
			}
	}
		
