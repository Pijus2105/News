package apachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DataRead {
	

	public Object[][] process (Method method) throws Exception{
		
		File file = new File("C:\\Users\\Elphill\\eclipse-workspace\\News\\DataTable\\ScoreBoard.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheetName = wb.getSheet(method.getName());
		
		int rowCount = sheetName.getPhysicalNumberOfRows();
		int cellCount = sheetName.getRow(1).getLastCellNum();
		
DataFormatter formatter = new DataFormatter();
Object[][] array = new Object [rowCount-1][cellCount-1];

		for(int i=1; i<rowCount; i++) {
			XSSFRow row = sheetName.getRow(i);
			
			for(int j=0; j<cellCount; j++) {
				XSSFCell cell = row.getCell(j);
				
		array[i-1][j-2] = formatter.formatCellValue(cell);
				System.out.println(cell+"");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		return null;
		
	}

}
