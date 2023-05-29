package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example2_getRowsizeInAsheet {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\Shree\\Desktop\\study\\28thjanEve\\Book1.xlsx");
		int rowsize = WorkbookFactory.create(file).getSheet("sheet1").getLastRowNum()+1;
		System.out.println(rowsize);
		
		
		
		

		
		
		
		
		
		
		
		
		
	}

}
