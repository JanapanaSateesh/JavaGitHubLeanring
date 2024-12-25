package com.astec.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String[][] data= getData();
		
	}
	
	public static String[][] getData() throws IOException {
		
		File file=new File("./TestData/userdata.xlsx");
		FileInputStream fi=new FileInputStream(file);
		
		XSSFWorkbook workbook=new XSSFWorkbook(fi);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int rows=sheet.getPhysicalNumberOfRows();
		int cols=sheet.getRow(0).getLastCellNum();
		
		System.out.println(rows);
		System.out.println(cols);
		
		String[][] data=new String[rows-1][cols]; //[3][5]
		
		for(int i=0;i<rows-1;i++) //3 0,1,2
		{
			for(int j=0;j<cols;j++) 
			{
				DataFormatter df=new DataFormatter();
				data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
				//System.out.println(data[i][j]);
			}
		}
		return data;
		
		
		
	}

}
