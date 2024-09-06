package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcelData {

	public static int lastRowNo;
	public static int lastCellNo;
	static DataFormatter formatter;

	static XSSFSheet sheet;
	static XSSFWorkbook workbook;
	static String arrayLength[][];
	static String da;
	static String[] singleArray;

	public static void main(String[] args) throws Exception {

		String excelName = "user_create";
		String sheetName = "user";
		int rowNo = 15;
		trythis(excelName, sheetName, rowNo);

		/*
		 * String[] userdata = getAddUserDetails(excelName, sheetName, rowNo);
		 * 
		 * String locationType = userdata[0]; String locationName = userdata[1]; String
		 * roleName = userdata[2]; String firstName = userdata[3]; String middleName =
		 * userdata[4]; String lastName = userdata[5]; String password = userdata[6];
		 * String email = userdata[7]; String mobileNo = userdata[8]; String phoneNo =
		 * userdata[9]; System.out.println(locationType + " " + firstName);
		 * 
		 * // getUserData(excelName, sheetName); // getLastRowLastCell(excelName,
		 * sheetName);
		 */
	}

	public static void loadExcel(String excelName, String sheetName) throws Exception {

		File path = new File(".\\resources\\files\\" + excelName + ".xlsx");

		InputStream ge = new FileInputStream(path);

		workbook = new XSSFWorkbook(ge);

		sheet = workbook.getSheet(sheetName);
	}

	public static void getLastRowLastCell(int rowNo) throws Exception {

		lastRowNo = sheet.getLastRowNum();
		lastCellNo = sheet.getRow(rowNo).getLastCellNum();
		System.out.println("last row -->" + lastRowNo);
		System.out.println("lat cell --->" + lastCellNo);
	}

	public static String[][] getUserData(String excelName, String sheetName) throws Exception {

		loadExcel(excelName, sheetName);
		// getLastRowLastCell(excelName, sheetName);
		arrayLength = new String[lastRowNo][lastCellNo];
		for (int row = 1; row <= lastRowNo; row++) {
			for (int cell = 0; cell < lastCellNo; cell++) {
				arrayLength[row - 1][cell] = sheet.getRow(row).getCell(cell).getStringCellValue();
				//System.out.println(user[row-1][cell]);
				// System.out.println("*****************");

			}

		}
		return arrayLength;

	}

	public static String[] getAddUserDetails(String excelName, String sheetName, int num) throws Exception {

		loadExcel(excelName, sheetName);
		getLastRowLastCell(num);
		singleArray = new String[lastCellNo];
		formatter = new DataFormatter();
		for (int row = num; row <= lastRowNo; row++) {
			for (int cell = 0; cell < lastCellNo; cell++) {

				singleArray[cell] = formatter.formatCellValue(sheet.getRow(row).getCell(cell));
			}
		}
		return singleArray;

	}

	public static void getMultipleCellValues(String excelName, String sheetName, int rowNo) throws Exception {

		loadExcel(excelName, sheetName);

		getLastRowLastCell(rowNo);

		formatter = new DataFormatter();
		for (int row = 1; row <= lastRowNo; row++) {
			for (int cell = 0; cell < lastCellNo; cell++) {
				da = formatter.formatCellValue(sheet.getRow(row).getCell(cell));
				formatter.formatCellValue(sheet.getRow(rowNo).getCell(0));
				System.out.println(da);
				System.out.println("***************************");

				// String val = formatter.formatCellValue(sheet.getRow(i).getCell(0));
			}

		}
	}


	
	
	public static String[] trythis(String excelName, String sheetName, int rowNo) throws Exception {
		loadExcel(excelName, sheetName);
		getLastRowLastCell(rowNo);
		singleArray = new String[lastCellNo];
		formatter = new DataFormatter();
		for (int cell = 0; cell < lastCellNo; cell++) {
			singleArray[cell] = formatter.formatCellValue(sheet.getRow(rowNo).getCell(cell));
			// System.out.println("cvcv"+cell+" ---->"+singleArray[cell]);

		}
		return singleArray;
	}
	
	
	
	public static int lastRow() {
		return lastRowNo = sheet.getLastRowNum();
	
	}
}
