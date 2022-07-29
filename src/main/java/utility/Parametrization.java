package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {
	
	public static String getData(String Name, int R, int C ) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("F:\\Akshay Suryawanshi ST\\Automation\\PDFs\\TestData.xlsx");
		String value = WorkbookFactory.create(file).getSheet(Name).getRow(R).getCell(C).getStringCellValue();
		return value;
	}
}
