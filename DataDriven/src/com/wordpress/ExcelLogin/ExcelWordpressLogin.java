package com.wordpress.ExcelLogin;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

public class ExcelWordpressLogin {
	WebDriver driver;
	XSSFWorkbook wbook;
	XSSFSheet sheet;

	public ExcelWordpressLogin(String Excelpath) throws Exception {

		File path = new File(Excelpath);
		FileInputStream fis = new FileInputStream(path);
		wbook = new XSSFWorkbook(fis);

	}

	

	public int getRowCount(int sheetNumber) {

		int row = wbook.getSheetAt(sheetNumber).getLastRowNum();
		row = row + 1;
		return row;

	}
	
	public String getData(int sheetnumber, int row, int columnNumber) {

		sheet = wbook.getSheetAt(sheetnumber);
		String data = sheet.getRow(row).getCell(columnNumber).getStringCellValue();

		return data;

	}

	@DataProvider
	public Object[][] passData() throws Exception {

		ExcelWordpressLogin ewp = new ExcelWordpressLogin(
				"D:\\eclipse-workspace\\DataDriven\\doc\\UserCredentials.xlsx");
		int rows=ewp.getRowCount(1);
		
		
		Object[][] data = new Object[rows][2];
		
		for (int i=6;i<rows;i++) {
			data[i][0]=ewp.getData(1, i, 0);
			data[i][1]=ewp.getData(1, i, 2);
		}

		return data;

	}

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\eclipse-workspace\\Selenium Webdriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demosite.center/wordpress/wp-login.php");

	}

}
