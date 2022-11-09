package helpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestDataProvider {

	XSSFWorkbook workbook;

	public TestDataProvider() {

		File src = new File("./resources/testdata.xlsx");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			workbook = new XSSFWorkbook(fis);
		} catch (Exception e) {
			
			System.out.println("Unable to reach Excel file "+e.getMessage());
		}
			
	} 

	

	public String getUsername(int sheetIndex, int row, int col) {
		
		
		return workbook.getSheetAt(sheetIndex).getRow(row).getCell(col).getStringCellValue().toString();
		
	}

	public String getpassword(int sheetIndex, int row, int col) {

		return workbook.getSheetAt(sheetIndex).getRow(row).getCell(col).getStringCellValue().toString();
	}

}
