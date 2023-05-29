package excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example4_getNumericDataAsString {
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
	FileInputStream file=new FileInputStream("C:\\Users\\Shree\\Desktop\\study\\28thjanEve\\Book1.xlsx");
	String value = WorkbookFactory.create(file).getSheet("sheet2").getRow(0).getCell(0).getStringCellValue();
	System.out.println(value);
}
}
