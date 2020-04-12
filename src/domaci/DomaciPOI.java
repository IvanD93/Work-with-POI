package domaci;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DomaciPOI {

	public static void main(String[] args) {


	
		HSSFWorkbook wb;
		FileInputStream fis;
		
		try {
			fis = new FileInputStream("src/domaci/Data.xls");
			wb = new HSSFWorkbook(fis);
			
			Double suma = 0d;
			Sheet sheet = wb.getSheetAt(0);
			
			for (int i = 0; i < sheet.getLastRowNum(); i++) {
				
				Row row = sheet.getRow(i);
				Cell cell = row.getCell(0);
				
				String cells = cell.toString();
				Double x = Double.valueOf(cells);
				suma = suma + x;
				
			}
			
			System.out.println(suma);
			
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}


	}

}