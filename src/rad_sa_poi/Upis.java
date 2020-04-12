package rad_sa_poi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Upis {

	public static void main(String[] args) {
		
		// XSSF - .xlsx - novije verzije excela
		// HSSF - .xls - starije verzije
		
		XSSFWorkbook wb = new  XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("Sheet1");
		Row row = sheet.createRow(0);
		
		Cell cell = row.createCell(0);
		cell.setCellValue("id");
		cell = row.createCell(1);
		cell.setCellValue("username");
		
		try {
			FileOutputStream fos = new FileOutputStream("proba1.xlsx");
			wb.write(fos);
			wb.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
