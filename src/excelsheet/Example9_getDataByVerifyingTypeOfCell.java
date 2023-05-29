package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example9_getDataByVerifyingTypeOfCell {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\Shree\\Desktop\\study\\28thjanEve\\book2.xlsx");
	 Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");
	
	Cell cellInfo = sh.getRow(0).getCell(2);
	CellType s1 = cellInfo.getCellType();
	if(s1==CellType.STRING)
	{
		 String value= cellInfo.getStringCellValue();

		System.out.println(value);
	}
	else if (s1==CellType.NUMERIC) 
	{
		double value = cellInfo.getNumericCellValue();
		System.out.println(value);
	}
	else if(s1==CellType.BOOLEAN)
	{
		boolean value = cellInfo.getBooleanCellValue();
		System.out.println(value);
	}
	
	}
}