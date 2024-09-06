package testscripts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utilities.readExcelData;

public class DatabasePROD {

	public static void main(String[] args) throws Exception {
		readPostgres();
	}

	static Statement st;

	public static void readPostgres() throws Exception {

		ArrayList<String> users = new ArrayList<String>();

		Class.forName("org.postgresql.Driver");
		String url = "jdbc:postgresql://192.168.9.102:5444/bpclprod";
		String username = "bpclread";
		String password = "6pc7@3d6";
		Connection db = DriverManager.getConnection(url, username, password);
		st = db.createStatement();

		ResultSet rs = st.executeQuery("SELECT * FROM bpcl_sap_payloads where api_data like '%4590624014'");

		
		
		ResultSetMetaData meta = rs.getMetaData();
		int cc = meta.getColumnCount();
		while (rs.next()) {
			String z = "";
			for (int i = 1; i <= cc; i++) {
				z += rs.getString(i) + "   |   ";

			}
			System.out.println(z);

		}

		rs.close();
		st.close();
		db.close();

	}

}
