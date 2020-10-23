import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.junit.Test;

public class ExcelFileReading {
	
	@Test
	public void test() throws IOException {
		
		String path="F:\\API Testing Using Java\\SeleniumAssignment-5\\src\\TestFile.xlsx";
		
		FileInputStream input=new FileInputStream(path);
		XSSFWorkbook book =new XSSFWorkbook(input);
		XSSFSheet sheet=book.getSheet("Sheet1");
		
		int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
		
		for(int i=1;i<=rowCount;i++) {
			
			String firstname=sheet.getRow(i).getCell(0).getStringCellValue();
			String lastname=sheet.getRow(i).getCell(1).getStringCellValue();
			double age=sheet.getRow(i).getCell(2).getNumericCellValue();
			
			Assert.assertNotNull(firstname);
			System.out.println("First Name : "+firstname);
			System.out.println("Last Name : "+lastname);
			System.out.println("Age : "+(int)age);
			
		}
	}

}
