package Sevenchats.com.app;

import java.io.FileInputStream;

import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class utills {
	public static void main(String[] args) {
		getRowCount();
	}
	
	public static void getRowCount() {
		String excelfilepath =System.getProperty("user.dir");
		
		try {
		
		
		XSSFWorkbook workbook = new XSSFWorkbook(excelfilepath+"/excel/data.xlsx");
		XSSFSheet sheet =workbook.getSheet("sheet1");
		int a=sheet.getLastRowNum();
	
		
		
		
		System.out.println(a);
		}
		catch(Exception e) {
			e.getCause();
		}
		
		
		
		
	}

}
