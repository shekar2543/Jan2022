package com.shekar.automation.supporters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {
	
	private String filePath;
	private FileInputStream fileInputStream;
	private Workbook workbook;
	public ExcelReader(String filePath) throws EncryptedDocumentException, IOException
	{
		this.filePath = filePath;
		fileInputStream = new FileInputStream(filePath);
		workbook = WorkbookFactory.create(fileInputStream);	
	}
//    public Sheet getSheetObj(String how, String value) 
//    {
//		if(workbook!=null)
//		{
//			if(how.equalsIgnoreCase("SheetName"))
//			{
//				Sheet sheet = workbook.getSheet("howValue");
//			}
//		}
//
//	}
}
