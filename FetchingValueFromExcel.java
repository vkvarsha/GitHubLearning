package DataDrivenTesting_37;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.testng.annotations.Test;

public class FetchingValueFromExcel 
{
	
	void FetchvaluefromExcel() throws EncryptedDocumentException, IOException
	{

	FileInputStream f1 = new FileInputStream("E:\\Automation2\\SeleniumLearning\\Excel\\Credentials.xlsx");
	Workbook wb =	WorkbookFactory.create(f1);
	Sheet s1 = wb.getSheet("Sheet1");  // --- always import from ss.usermodl
	DataFormatter formatter = new DataFormatter();   // As the value is Number
	String username=	formatter.formatCellValue(s1.getRow(1).getCell(0));
	System.out.println(username);
   /*   -----------------------------------------------------------------------------*/        
	Row r1 =s1.getRow(1);
	Cell c1 = r1.getCell(1);
	String password = c1.getStringCellValue();
	System.out.println(password);
	
	/*java.lang.IllegalStateException: Cannot get a STRING value from a NUMERIC cell - Handle it as per below formula
	 * DataFormatter formatter = new DataFormatter();
		String r1=	formatter.formatCellValue(s1.getRow(1).getCell(0));
	
		System.out.println(r1);*/
	
	/* ------------------------------------------aNOTHER WAY TO FETCH--------------------*/
	
	FileInputStream f2 = new FileInputStream("E:\\Automation2\\SeleniumLearning\\Excel\\Credentials.xlsx");
	Workbook wb2 =	WorkbookFactory.create(f2);
	Sheet s2 = wb.getSheet("Sheet1"); 
	DataFormatter formatter2 = new DataFormatter();
		String username2 = formatter2.formatCellValue(s2.getRow(1).getCell(0));
		String Password2 = s2.getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(username2);
		System.out.println(Password2);
		
		
	/* ----------------------------------------Another way to change number to text ------------ */
	
		

		FileInputStream f3 = new FileInputStream("E:\\Automation2\\SeleniumLearning\\Excel\\Credentials.xlsx");
		Workbook wb3 =	WorkbookFactory.create(f3);
		Sheet s3 = wb.getSheet("Sheet1"); 
			String username3 = NumberToTextConverter.toText(s3.getRow(1).getCell(0).getNumericCellValue());
			String Password3 = s2.getRow(1).getCell(1).getStringCellValue();
			
			System.out.println(username3);
			System.out.println(Password3);
			
	
		
		/* How to fetch numeric value from excelsheet
		 * 
		 *  NumberToTextConverter -- this class is used to change the value from Number to Text
		 *  
		 *  What happen when we fetch the value from cell which does not have value - getting java.lang.NullPointerException
		 *  
		 *  */
		
	}	
		
}
