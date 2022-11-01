package apachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadData {
	
	@Test
	public void dataFetch() throws Exception {
		
		String path = "C:\\Users\\Elphill\\eclipse-workspace\\News\\DataTable\\ScoreBoard.xlsx";
		String file = "DataTable";
		String sheet = "Test";
		
		File fileName = new File(path);
		FileInputStream fis = new FileInputStream(fileName);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheetName = wb.getSheet(sheet);
		
		int rowCount = sheetName.getPhysicalNumberOfRows();
		int colCount = sheetName.getRow(1).getLastCellNum();
		
		System.out.println(rowCount);
		System.out.println(colCount);
		
		//DataFormatter formatter = new DataFormatter();
		
		for(int i=1; i<rowCount; i++) {
			XSSFRow row = sheetName.getRow(i);
			
			for(int j=0; j<colCount; j++) {
				XSSFCell cell = row.getCell(j);
				//Object cellname = formatter.getDefaultFormat(cell);
				System.out.print(cell + " ");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
