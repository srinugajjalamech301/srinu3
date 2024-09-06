package testscripts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utilities.DatabaseActions;
import utilities.readExcelData;

public class Database3 {
	String tableName ="bpcl_case";
	String case_barcode="case_barcode";
	
	
	
	
	
	
	public static void main(String[] args) throws Exception {
		
		DatabaseActions.connectDataBase();
		DatabaseActions.openQuery("select * from bpcl_coupons ");
	}
	
}

