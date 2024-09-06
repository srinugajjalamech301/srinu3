package testscripts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DatabaseOracle2 {

	public static void main(String[] args) throws Exception {
		readPostgres();
	}

	public static void readPostgres() throws Exception {

     String tableName="TTS_VENDOR_STOCK_REGISTER";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@//10.10.10.72:1521/ASSAMQC";
		String username = "EXASSAMP";
		String password = "AssQc571";
		Connection db = DriverManager.getConnection(url, username, password);

		Statement st = db.createStatement();

		int insertCount = 500;

		for (int count = 1; count <= insertCount; count++) {

			// System.out.println ("INSERT INTO TTS_VENDOR_STOCK_REGISTER
			// (ID,LOC_ID,PRODUCT_CODE,PRODUCT_NAME,BRAND_NUMBER,SIZE_CODE,UNITS_PER_CASE,STOCK_IN,STOCK_IN_PRT,OPENING_STOCK,OPENING_STOCK_PRT,STOCK_OUT,STOCK_OUT_PRT,CLOSING_STOCK,CLOSING_STOCK_PRT,DAMAGE_QTY,SHORTAGE_QTY,SYNC)
			// VALUES\r\n" + "
			// ('TESTER00"+count+"','TT09872','TESTER00"+count+"','CTELPRODUCT00"+count+"','BRAND00"+count+"','QQ','12','101','0','0','0','0','0','0','0','0','0','false')");

			st.executeQuery(
					"INSERT INTO "++" (ID,LOC_ID,PRODUCT_CODE,PRODUCT_NAME,BRAND_NUMBER,SIZE_CODE,UNITS_PER_CASE,STOCK_IN,STOCK_IN_PRT,OPENING_STOCK,OPENING_STOCK_PRT,STOCK_OUT,STOCK_OUT_PRT,CLOSING_STOCK,CLOSING_STOCK_PRT,DAMAGE_QTY,SHORTAGE_QTY,SYNC) VALUES\r\n"
							+ "	 ('TESTERA00" + count + "','TT09872','TESTERA00" + count + "','CTELPRODUCTA00" + count
							+ "','BRANDA00" + count + "','QQ','12','102','0','0','0','0','0','0','0','0','0','false')");

		}

		System.out.println("insert query was executed");
		// ResultSetMetaData meta = rs.getMetaData();

		// rs.close();
		st.close();
		db.close();

	}

}
