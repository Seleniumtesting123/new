package ST.OLB;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Application {
	
	static XSSFWorkbook ExcelWBook;
	static XSSFSheet ExcelWSheet;
	static XSSFCell Cell;
	static XSSFRow Row;
	
	public static String getCellData(String SheetName , int RowNum , int ColNum) {
	try {
		
		FileInputStream ExcelFile = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\eclipse-workspace\\OLB\\Test1.xlsx");
		
		ExcelWBook = new XSSFWorkbook(ExcelFile);
		
		ExcelWSheet = ExcelWBook.getSheet(SheetName);
		
	    Cell        = ExcelWSheet.getRow(RowNum).getCell(ColNum);
	    
	    String CellData = Cell.getStringCellValue();
	    
		
		return CellData;
		
		
		
	} catch (Exception e) {
		return "";
		
	}
	
	}
	
	public static void main(String[] args) {
		
		System.out.println(Application.getCellData("Sheet1", 0, 1));
		System.out.println(Application.getCellData("Sheet1", 1, 1));
		
	}

}
