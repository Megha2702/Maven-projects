package Utilitypackage;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutilities {

	public static String getCellValue(String xl, String Sheet, int r, int c) {
		try {
			FileInputStream file = new FileInputStream(xl);
			XSSFWorkbook wb = new XSSFWorkbook(file);
			XSSFCell cell = wb.getSheet(Sheet).getRow(r).getCell(c);
			
			if(cell.getCellType() == CellType.STRING) {
				return cell.getStringCellValue();
			}
			else {
				
				return cell.getRawValue();
			}
		} catch(Exception e) {
			
			return "";
		}
		
				
	}

	public static int getRowCount(String xl,String Sheet) {
		
		try {
			
			FileInputStream file = new FileInputStream(xl);
			XSSFWorkbook wb = new XSSFWorkbook(file);
			
			return wb.getSheet(Sheet).getLastRowNum();
			
		} catch(Exception e) {
			return 0;
			
		}
	}
	}


