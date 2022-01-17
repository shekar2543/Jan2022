package com.shekar.automation.testdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDemo {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	//File file = new File("C:\\Users\\NSS\\eclipse-workspace\\frameworks\\src\\com\\shekar\\automation\\testdata\\testdata.xlsx");
	//Workbook workbook = WorkbookFactory.create(file);
	
	FileInputStream fip = new FileInputStream("C:\\Users\\NSS\\eclipse-workspace\\frameworks\\src\\com\\shekar\\automation\\testdata\\testdata.xlsx");
	Workbook workbook = WorkbookFactory.create(fip);
	//Sheet sheet = workbook.getSheetAt(0);
	Sheet sheet = workbook.getSheet("Data");
	Row row3 = sheet.createRow(3);
	Cell cell30 = row3.createCell(0);
	cell30.setCellFormula("JAVA");
	
	Cell cell31 = row3.createCell(1);
	cell31.setCellFormula("SELENIUM");
	
	Row row4 = sheet.createRow(4);
	Cell cell40 = row4.createCell(0);
	cell40.setCellFormula("FRAMEWORKS");
	
	Cell cell41 = row4.createCell(1);
	cell41.setCellFormula("JAVA WITH SELENIUM");
	
	FileOutputStream fop = new FileOutputStream("C:\\Users\\NSS\\eclipse-workspace\\frameworks\\src\\com\\shekar\\automation\\testdata\\testdata.xlsx");
	workbook.write(fop);
	
	
	
	
	}
}
	/*int rowNums = sheet.getLastRowNum();
	System.out.println("Total No.o Rows : "+rowNums);
	
	for(int i=0; i<=sheet.getLastRowNum(); i++)
	{
		Row row = sheet.getRow(i);
		for(int j=0; j<row.getLastCellNum(); j++)
		{
			Cell cell = row.getCell(j);
			if(cell.getCellType()==CellType.STRING)
			{
			String value = cell.getStringCellValue();
			System.out.println(value);
			}
			else if(cell.getCellType()==CellType.NUMERIC)
			{
			double value = cell.getNumericCellValue();
			System.out.println(value);
			}
			else if(cell.getCellType()==CellType.BOOLEAN)
			{
			boolean value = cell.getBooleanCellValue();
			System.out.println(value);
			}
		}
	}
  }
}
*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*Row row0 = sheet.getRow(0);
	int cellNums = row0.getLastCellNum();
	System.out.println("Total No.of cells in 0th row : "+cellNums);
	Cell cell00 = row0.getCell(0);
	String cell00Value = cell00.getStringCellValue();
	System.out.println(cell00Value);
	
	Cell cell01 = row0.getCell(1);
	String cell01Value = cell01.getStringCellValue();
	System.out.println(cell01Value);
	
	Row row1 = sheet.getRow(1);
	int cellCount = row1.getLastCellNum();
	System.out.println("Total No.of cells in 1st row : "+cellCount);
	Cell cell10 = row0.getCell(0);
	String cell10Value = cell10.getStringCellValue();
	System.out.println(cell10Value);
	
	Cell cell11 = row0.getCell(1);
	String cell11Value = cell11.getStringCellValue();
	System.out.println(cell11Value);
	*/
	
	
	
	
	
	
	


