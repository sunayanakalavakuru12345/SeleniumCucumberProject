import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.xslf.usermodel.XSLFSheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
@Test
public void readExcel(String s) {
	File file=new File("C:\\Users\\training_b6b.01.09\\eclipse-Selenium\\Sunnu\\src\\com\\testing\\src\\test\\resources\\DataDrivenTesting.xlsx");
	
	
	try {
		InputStream is=new FileInputStream(file);
		XSSFWorkbook work=new XSSFWorkbook(is);
		XSSFSheet sheet=work.getSheet("Sheet1");
		
		for (int i = 1; i < sheet.getLastRowNum(); i++) {
			for (int j = 0; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
			}
			System.out.println();
			work.close();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}


}
