package testngtutorials;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DataDrivenExample {
	
	private XSSFWorkbook ExcelBook;
	private XSSFSheet ExcelSheet;
	private XSSFCell Cell;
	String SearchWord;

	@Test
	public void getDataFromExcel() throws IOException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\donbo\\Desktop\\QA Tools\\Selenium\\geckodriver.exe");
		WebDriver wd= new FirefoxDriver();
		wd.get("https://www.homeadvisor.com/");
		FileInputStream fio;
		try {
			fio = new FileInputStream("TestData.xlsx");
			ExcelBook=new XSSFWorkbook(fio);
			ExcelSheet=ExcelBook.getSheetAt(0);
			Cell=ExcelSheet.getRow(0).getCell(0);
			SearchWord=Cell.getStringCellValue();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		wd.findElement(By.xpath(".//*[@id='homepage-predictive-search']/div/div/input")).sendKeys(SearchWord);
		wd.findElement(By.xpath(".//*[@id='homepage-predictive-search']/input")).click();
		
		
	}
	
	
}
