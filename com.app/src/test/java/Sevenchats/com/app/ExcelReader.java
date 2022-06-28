package Sevenchats.com.app;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static void main(String[] args) throws IOException{
		
	
	
	FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\com.app\\excel\\data.xlsx");
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	XSSFSheet sheet = workbook.getSheetAt(0);
	                        //I have added test data in the cell A1 as "SoftwareTestingMaterial.com"
	                        //Cell A1 = row 0 and column 0. It reads first row as 0 and Column A as 0.
	Row row = sheet.getRow(0);
	Cell cell = row.getCell(0);
	                       System.out.println(cell);
	System.out.println(sheet.getRow(0).getCell(0));
}
}