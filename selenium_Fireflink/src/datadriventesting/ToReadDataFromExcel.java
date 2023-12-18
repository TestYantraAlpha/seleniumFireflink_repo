package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.Month;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//step 1: Create FIS/FR object
		FileInputStream fis=new FileInputStream("./testdata/TestscriptData.xlsx");
	
		//step 2: Create respective file type object
		Workbook workbook = WorkbookFactory.create(fis);
		
		//step 3: call read methods
		String URL = workbook.getSheet("Login").getRow(1).getCell(0).getStringCellValue();
		System.out.println(URL);
		String USERNAME = workbook.getSheet("Login").getRow(1).getCell(1).getStringCellValue();
		System.out.println(USERNAME);
		
		LocalDateTime date = workbook.getSheet("Login").getRow(1).getCell(3).getLocalDateTimeCellValue();
		System.out.println(date);
		Month month = date.getMonth();
		int day = date.getDayOfMonth();
		int year = date.getYear();
		System.out.println(month);
		System.out.println(day);
		System.out.println(year);
		int number = (int) workbook.getSheet("Login").getRow(1).getCell(4).getNumericCellValue();
		System.out.println(number);
		boolean status = workbook.getSheet("Login").getRow(1).getCell(5).getBooleanCellValue();
		System.out.println(status);
	}
}
