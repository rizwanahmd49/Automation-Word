package com.wordpress.DDT;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	XSSFWorkbook wb;
	XSSFSheet sheet;

	public ExcelDataConfig(String excelPath) {
		try {
			File src = new File(excelPath);
			FileInputStream fis = new FileInputStream(src);

			wb = new XSSFWorkbook(fis);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
public int getRowCount(int sheetNum) {
		
		int row=wb.getSheetAt(sheetNum).getLastRowNum();
		row=row+1;
		return row;
	}

	public String getData(int sheetNum, int row, int column) {
		sheet = wb.getSheetAt(sheetNum);
		String data = sheet.getRow(row).getCell(column).getStringCellValue();
		return data;

	}
	
	

}
