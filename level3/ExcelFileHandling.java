package com.java.level3;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.*;

public class ExcelFileHandling{
	
	public static void main(String[] args) throws IOException {
		File anExcelFile = new File ("D:\\codespace\\JavaFoundation\\src\\resources\\Excel2Read.xlsx");
		FileInputStream fileInputObj = new FileInputStream(anExcelFile);
		//FileOutputStream fileOutputObj = new FileOutputStream(anExcelFile);
		XSSFWorkbook excel2ReadHandle = new XSSFWorkbook(fileInputObj);


		XSSFCell cell2Handle;
		XSSFRow row2Handle;
		
		//Get a sheet in workbook
		XSSFSheet cityNames = excel2ReadHandle.getSheet("City");
		
		//Get total number of rows in the worksheet
		int totalRowsInTheSheet = cityNames.getPhysicalNumberOfRows();
		
		//Read value from a specific cell
		cell2Handle = cityNames.getRow(1).getCell(1);
		System.out.println(cell2Handle.getStringCellValue());
		
		//Read all cell values in a given row [Left to Right]
		row2Handle = cityNames.getRow(4);
		row2Handle.iterator();
		for (Cell currentCell : row2Handle){
			System.out.print(currentCell.getStringCellValue() + ">");
		}
		
		//Get a column and read values thru [Top to Bottom]
		Iterator<Row> rowsOfCity = cityNames.rowIterator();
		Row currentRow;
		Cell cellOfSpecificColumn;
		while(rowsOfCity.hasNext()){
			currentRow=rowsOfCity.next();
			cellOfSpecificColumn = currentRow.getCell(10);
			System.out.println(cellOfSpecificColumn);
		}

		//Write Value to a cell
		//System.out.println(cityNames.getRow(4).getLastCellNum());
		cityNames.getRow(4).createCell(4).setCellValue("Anaheim");
		
		//Update value to the cell
		cityNames.getRow(4).createCell(4).setCellValue("Malibu");
		
		//Append value to the end of a row
		cityNames.getRow(4).createCell(cityNames.getRow(4).getLastCellNum()).setCellValue("Anaheim");
		
		fileInputObj.close();
		FileOutputStream fileOutputObj = new FileOutputStream(anExcelFile);
		excel2ReadHandle.write(fileOutputObj);

	}
	
}
