package testscripts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DatabaseOracle3 {

	public static void main(String[] args) throws Exception {
		readPostgres();
	}

	public static void readPostgres() throws Exception {

		// Adding Table Name
		String tableName = "TTS_VENDOR_STOCK_REGISTER";
		// Insert count
		int insertCount =500;
		// Number start sequence
		int startNum = 1;
		// Character Change
		char charChange = 'A';

		// Adding Driver class
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// Adding jdbc url connection setup
		String url = "jdbc:oracle:thin:@//10.10.10.72:1521/ASSAMQC";
		// Adding database credentials
		String username = "EXASSAMP", password = "AssQc571";
		Connection db = DriverManager.getConnection(url, username, password);
		Statement st = db.createStatement();

		for (int count = startNum; count <= insertCount; count++) {

			st.executeQuery("INSERT INTO " + tableName
					+ " (ID,LOC_ID,PRODUCT_CODE,PRODUCT_NAME,BRAND_NUMBER,SIZE_CODE,UNITS_PER_CASE,STOCK_IN,STOCK_IN_PRT,OPENING_STOCK,OPENING_STOCK_PRT,STOCK_OUT,STOCK_OUT_PRT,CLOSING_STOCK,CLOSING_STOCK_PRT,DAMAGE_QTY,SHORTAGE_QTY,SYNC) VALUES\r\n"
					+ "	 ('TESTER" + charChange + "00" + count + "','TT09872','TESTER" + charChange + "00" + count
					+ "','CTELPRODUCT" + charChange + "00" + count + "','BRAND" + charChange + "00" + count
					+ "','QQ','12','102','0','0','0','0','0','0','0','0','0','false')");
		}

		System.out.println("insert query was executed");
		st.close();
		db.close();

	}

}
