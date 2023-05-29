package excelsheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.plaf.metal.MetalIconFactory.FileIcon16;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example1_getexcelsheet {
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Shree\\Desktop\\study\\28thjanEve\\Book1.xlsx");
		
		String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	
		System.out.println(value);
		
	//Workbook book= WorkbookFactory.create(file);
	  //Sheet sh = book.getSheet("Sheet1");
	  //Row rw = sh.getRow(0);
	  //Cell cl = rw.getCell(0);
	  //String value = cl.getStringCellValue();
	  //System.out.println(value);
	}

}

