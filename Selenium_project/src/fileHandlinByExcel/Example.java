package fileHandlinByExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fs = new FileInputStream("C:\\Users\\HP\\Desktop\\Collage\\File Handling Excel File\\Example.xlsx");
		
		Workbook book = WorkbookFactory.create(fs);
		
		Sheet sheet = book.getSheet("Sheet1");
		
		Row row = sheet.getRow(1);
		
		Cell cell = row.getCell(0);
		
		String un = cell.getStringCellValue();
		
		Cell cell2 = row.getCell(1);
		String pass = cell2.getStringCellValue();
		
		System.out.println(un);
		System.out.println(pass);
		
	}

}
