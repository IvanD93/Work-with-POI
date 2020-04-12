package rad_sa_poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Citanje {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("proba1.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0); 
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		
		double x = cell.getNumericCellValue();
		System.out.println(x);
		
		//System.out.println(cell.toString());
		
		

	}

}
