package Sevenchats.com.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Testng {

	public static void main(String[] args) {
		try {
		File a=new File("C:\\Users\\Dell\\OneDrive\\Desktop\\xelate notes\\SampleData.xlsx");
		
			FileInputStream s=new FileInputStream(a);
			XSSFWorkbook c=new XSSFWorkbook(s);
			XSSFSheet b=c.getSheetAt(0);
			System.out.println(b.getRow(0).getCell(0).getStringCellValue());
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
			e.printStackTrace();
		}
		
		
	}
	
	
		
		
		
		
		
		
	}
	
	
		
	
	
	
	

