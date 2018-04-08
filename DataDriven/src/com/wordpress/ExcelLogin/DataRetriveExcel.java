package com.wordpress.ExcelLogin;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataRetriveExcel {

	public static void main(String[] args) throws Exception {

		File path=new File("D:\\eclipse-workspace\\DataDriven\\doc\\UserCredentials.xlsx");
		
		FileInputStream fis =new FileInputStream(path);//FileInputStream is a bytes stream class that's used to read bytes from file

		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet poiSheet1=wb.getSheetAt(1);
		
		int rowcount=poiSheet1.getLastRowNum();
		System.out.println("Total Row in Sheet are: "+rowcount);
		
		for (int i=0;i<rowcount;i++) {
			String userid=poiSheet1.getRow(3).getCell(4).getStringCellValue();
			String pass=poiSheet1.getRow(3).getCell(5).getStringCellValue();
			System.out.println("Username: "+userid+"\nPassword: "+pass);
			wb.close();
		}
	}

}
