package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseActions {
	static ResultSet rs;
	static Statement st;
	static Connection db;

	public static void connectDataBase() throws Exception {
		Class.forName("org.postgresql.Driver");
		String url = "jdbc:postgresql://10.10.10.94:5444/central_qc3";
		String username = "enterprisedb";
		String password = "Ctel@123";
		db = DriverManager.getConnection(url, username, password);
		st = db.createStatement();

	}

	
	public static void openQuery(String queryt) throws SQLException {
		rs = st.executeQuery(""+queryt+"");
		ResultSetMetaData meta = rs.getMetaData();
		int count = meta.getColumnCount();
		while (rs.next()) {
			String collector = "";
			for (int i = 1; i <= count; i++) {
				collector += rs.getString(i) + "   |   ";

			}
			System.out.println(collector);

		}
	}
	
	public static void selectQuery(String tableName) throws SQLException {
		rs = st.executeQuery("SELECT *  FROM " + tableName + " ");
		ResultSetMetaData meta = rs.getMetaData();
		int count = meta.getColumnCount();
		while (rs.next()) {
			String collector = "";
			for (int i = 1; i <= count; i++) {
				collector += rs.getString(i) + "   |   ";

			}
			System.out.println(collector);

		}

	}

	public static void selectQueryWhere(String tableName, String coloumn, String data) throws SQLException {
		rs = st.executeQuery("SELECT *  FROM " + tableName + " WHERE +" + coloumn + "+ = " + data + "");
		ResultSetMetaData meta = rs.getMetaData();
		int count = meta.getColumnCount();
		while (rs.next()) {
			String collector = "";
			for (int i = 1; i <= count; i++) {
				collector += rs.getString(i) + "   |   ";

			}
			System.out.println(collector);

		}

		

		
	}

	public static void selectQueryWhere(String tableName, String coloumn, String data, int limit) throws SQLException {
		rs = st.executeQuery(
				"SELECT *  FROM " + tableName + " WHERE +" + coloumn + "+ = " + data + "+ limit " + limit + "");
		ResultSetMetaData meta = rs.getMetaData();
		int count = meta.getColumnCount();
		while (rs.next()) {
			String collector = "";
			for (int i = 1; i <= count; i++) {
				collector += rs.getString(i) + "   |   ";

			}
			System.out.println(collector);

		}

	}

	public static void selectQueryOrder(String tableName, String coloumn, String data, int limit) throws SQLException {
		rs = st.executeQuery(
				"SELECT *  FROM " + tableName + " WHERE +" + coloumn + "+ = " + data + "+ limit " + limit + "");
		ResultSetMetaData meta = rs.getMetaData();
		int count = meta.getColumnCount();
		while (rs.next()) {
			String collector = "";
			for (int i = 1; i <= count; i++) {
				collector += rs.getString(i) + "   |   ";

			}
			System.out.println(collector);

		}

	}

	public static void closeDatabase() throws Exception {
		rs.close();
		st.close();
		db.close();
	}

}
