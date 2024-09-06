package testscripts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Database {

	public static void main(String[] args) throws Exception {
		readPostgres();
	}

	public static void readPostgres() throws Exception {

		ArrayList<String> users = new ArrayList<String>();

		Class.forName("org.postgresql.Driver");
		String url = "jdbc:postgresql://10.10.10.94:5444/central_qc3";
		String username = "enterprisedb";
		String password = "Oracle123";
		Connection db = DriverManager.getConnection(url, username, password);
		Statement st = db.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM bpcl_user  order by id desc limit 5");

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
