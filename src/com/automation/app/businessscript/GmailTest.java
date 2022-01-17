package com.automation.app.businessscript;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.shekar.automation.base.BaseTest;
import com.shekar.automation.utilities.POJOReader;

public class GmailTest extends BaseTest {
	
	@Test
	public void gmailTest() throws IOException {
		
		String value = "";
		//BaseTest.getDriver().get("https://www.gmail.com");
		
		String url = POJOReader.getPRorConfObj().getPropertyValue("qa_url");
		getDriver().get(url);
		
		/*FileInputStream fipOr = new FileInputStream("C:\\Users\\NSS\\eclipse-workspace\\frameworks\\src\\com\\shekar\\automation\\app\\objectrepository\\or.properties");
		System.out.println(fipOr);
		Properties prOr = new Properties();
		prOr.load(fipOr);*/
		
		String unId = POJOReader.getPRorConfObj().getPropertyValue("un");
		String nxt = POJOReader.getPRorConfObj().getPropertyValue("pswd");
		
//		FileInputStream fip = new FileInputStream("C:\\Users\\NSS\\eclipse-workspace\\frameworks\\src\\com\\shekar\\automation\\testdata\\testdata.xlsx");
//		Workbook workbook = WorkbookFactory.create(fip);
//		Sheet sheet = workbook.getSheet("Data");
//		Row row = sheet.getRow(0);
//		Cell cell = row.getCell(0);
//		if(cell.getCellType()==CellType.STRING)
//		{
//			value = cell.getStringCellValue();
//		}
//		if(cell.getCellType()==CellType.BOOLEAN)
//		{
//			value = cell.getStringCellValue();
//		}
//		if(cell.getCellType()==CellType.NUMERIC)
//		{
//			value = cell.getStringCellValue();
//		}
//		
//		
//		getDriver().get("https://www.gmail.com");

//		
//		
//	}
		
		
		WebElement userName = getDriver().findElement(By.xpath(POJOReader.getPRorConfObj().getPropertyValue("un_xpath")));
		userName.clear();
		userName.sendKeys("value");
		WebElement next = getDriver().findElement(By.id(POJOReader.getPRorConfObj().getPropertyValue("next_id")));
		next.click();
		System.out.print("user is able to click on the Next button");
	}
	
	

}
