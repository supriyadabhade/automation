package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example1_getNumericData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream file=new FileInputStream("C:\\Users\\Shree\\Desktop\\study\\28thjanEve\\book2.xlsx");
		
		double value = WorkbookFactory.create(file).getSheet("sheet4").getRow(0).getCell(1).getNumericCellValue();
		
		
		System.out.println(value);
		
		
		
		
		
		
		
		
		
	}

}
