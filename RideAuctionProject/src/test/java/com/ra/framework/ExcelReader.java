/****************************************************************************
 * ExcelReader.java
 * Data access class for Excel.
 * All data access methods are defined in this class.
 * 
 ***************************************************************************/
/************************************************************
 * Methods:
 * 
 * 
 ***********************************************************/


package com.ra.framework;

import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	public static Object[][] readExcelData(String excelFileName, String wSheetName) {
		
		try {
			// Get inputstream
			InputStream is = ClassLoader.getSystemClassLoader().getSystemResourceAsStream(excelFileName);
		
			// Create Workbook object
			XSSFWorkbook excelFile;
		
			excelFile = new XSSFWorkbook (is);
			
			// Get the worksheet
			XSSFSheet workSheet = excelFile.getSheet(wSheetName);
			
			int noOfRows 	= workSheet.getLastRowNum()+1;
			int noOfCol		= workSheet.getRow(0).getLastCellNum();
			
			// Declare 2 dimension array to store data.
			Object[][] data = new Object [noOfRows-1][noOfCol];
			
			// Loop through the number of rows.
			for (int i = 0; i < noOfRows - 1; i++) {
				
				XSSFRow row = workSheet.getRow(i+1);
				
				// Declare array to store data for each row.
				Object[] tempData 	= new Object[noOfCol];
				boolean isValueInRow 	= false;
				
				// Loop through columns in the row.
				for (int j = 0; j < noOfCol; j++) {
					XSSFCell cell = row.getCell(j);
					Object value  = cellToObject(cell);
					tempData[j] = value;
					
					// Exit at end of row.
					if(cell == null)
						continue;
					
					isValueInRow = true;					
				}
				
				if (isValueInRow)
					data[i] = tempData;
			}
			
			return data;
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return null;
		

		
		
	}

	// A stub was automatically generated when I referenced cellToObject in the above method.
	private static Object cellToObject(XSSFCell cell) {
		// TODO Auto-generated method stub
		
		int type;
		Object result = null;
		
		if (cell == null)
			return null;
		
		type = cell.getCellType();
		
		switch (type) {
		
		case XSSFCell.CELL_TYPE_NUMERIC:
			cell.setCellType(XSSFCell.CELL_TYPE_STRING);
			result = cell.getStringCellValue();
			
			if ("-".equals((String) result)) {
				result = null;
			}
			break;
		
		case XSSFCell.CELL_TYPE_STRING:
			cell.getStringCellValue();
			break;
		
		case XSSFCell.CELL_TYPE_FORMULA:
			throw new RuntimeException("We don't evaluate formulas in Java.");
			
		case XSSFCell.CELL_TYPE_BLANK:
			result = "-";
			break;
			
		case XSSFCell.CELL_TYPE_BOOLEAN:
			result = cell.getBooleanCellValue();
			break;
			
		case XSSFCell.CELL_TYPE_ERROR:
			throw new RuntimeException("This cell has an error.");
		
		default:
			throw new RuntimeException("We don't support this cell type: "+ type);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Object[][] dataObj = readExcelData("RideAuction Functional Test Cases.xlsx", "Sheet9");
		
		int noRows = dataObj.length;
		int noOfCols = dataObj[0].length;
		
		System.out.println("no of rows:" + noRows);
		System.out.println("no of columns: "+ noOfCols);
		
		for (int i = 0; i < noRows; i++) {
			for (int j = 0; j < noOfCols; j++) {
				System.out.println(dataObj[i][j]+ " ");
			}
			
			System.out.println();
		}
		
	}
	

}
