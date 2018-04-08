package com.wordpress.ExcelLogin;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo {
	XSSFWorkbook wbook;
	File path;
	public void readFile(String filePath) throws Exception {
		path=new File(filePath);
		FileInputStream streem=new FileInputStream(filePath);
		
		wbook=new XSSFWorkbook(streem);
		XSSFSheet sheet=wbook.getSheetAt(1);
		
		System.out.println("Number of rows in Sheet1: "+sheet.getLastRowNum());
		String rdata=sheet.getRow(2).getCell(4).getStringCellValue();
		String cdata=sheet.getRow(2).getCell(5).getStringCellValue();
		System.out.println("UserNam: "+rdata+" Password: "+cdata);
		
		//sheet.getRow(rownum)
		
		wbook.close();
	}
	
	public static void main (String args[]) {
		Demo d=new Demo();
		try {
			d.readFile("D:\\eclipse-workspace\\DataDriven\\doc\\UserCredentials.xlsx");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
