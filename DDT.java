package DataDrivenTesting_37;

public class DDT 
{

	//Fetching Data from Excelsheet
	/* 
	 * Import the Jars from apache poi
	 *  Go to Google Type apache poi jars
	 *  https://poi.apache.org/download.html
	 *  Go to Binary Artifacts click on archives of all prior releases.
	 *  Click on Binary Artifacts
	 *	Select latest poi.bin jars (where .zip file available with red tag
	 *Click to download
	 *
	 * Go to file downloaded Right click and extract same
	 * 
	 * Import all the jar files even from lib,ooxml.lib,auxiliary folder jars along in poi bin folder jars
	 *iMPORT -- Right click -- Build path -- Configure Build path, Add External jar files
	 *
	 *Right click on Project -- Create New Folder
	 *Create New excelsheet on that new folder -- go to project -property --- go to folder path and create new excelsheet
	 *
	 *
	 *Steps to fetch the value from Excelsheet
	 *
	 *1.Create an Object of FileInputStream class
	 *
	 *FileInputStream(Location of an Excelsheet)
	 *
	 *2.With the help of WorkbookFactory class and its create method open the excelsheet
	 *
	 *3.getsheet("sheetname")method opening the particular sheet.
	 *return type of get sheet is Sheet
	 *
	 *4.Using the getrow(12)  -- row number and the return type of getrow is Row
	 *
	 *5.Using getcell(10) --- cell number  
	 *
	 *getStringCellvalue --- fetching the value from particular cell
	 *
	 *
	 *
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  */
	
	
}
