package com.wordpress.ExcelLogin;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class LoginToWordpress {
	XSSFWorkbook wb;
	XSSFSheet sheet;
	WebDriver driver;

	public LoginToWordpress(String filePath) throws Exception {

		File path = new File(filePath);

		FileInputStream fis = new FileInputStream(path);

		wb = new XSSFWorkbook(fis);

	}

	public String getData(int sheetNumber, int row, int column) {
		sheet = wb.getSheetAt(sheetNumber);
		String data = sheet.getRow(row).getCell(column).getStringCellValue();
		return data;
	}

	@DataProvider(name = "wordpressData")
	public Object[][] passData() throws Exception {

		LoginToWordpress login =new LoginToWordpress("D:\\eclipse-workspace\\DataDriven\\doc\\UserCredentials.xlsx");

		int rows = sheet.getLastRowNum();
		rows = rows + 1;

		Object data[][] = new Object[rows][2];

		for (int i = 0; i < rows; i++) {
			data[0][0] = login.getData(1, i, 0);
			data[1][1] = login.getData(1, i, 1);
		}
		return data;
	}

}
