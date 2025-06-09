package DataDrivenTesting_37;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchCredentials
{
	String username2;
	String Password2;
	
	
	void CredentialsFetch() throws EncryptedDocumentException, IOException
	{
	FileInputStream f2 = new FileInputStream("E:\\Automation2\\SeleniumLearning\\Excel\\Credentials.xlsx");
	Workbook wb2 =	WorkbookFactory.create(f2);
	Sheet s2 = wb2.getSheet("Sheet1"); 
	DataFormatter formatter2 = new DataFormatter();
		 username2 = formatter2.formatCellValue(s2.getRow(1).getCell(0));
		 Password2 = s2.getRow(1).getCell(1).getStringCellValue();
		// username2= this.username2;
		 //Password2=this.Password2;
	
	}

}
