package testscripts;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utilities.readExcelData;
public class ttt {

	


		public static void main(String[] args) throws Exception {
			readPostgres();
		}

		static Statement st;

		public static void readPostgres() throws Exception {

			ArrayList<String> users = new ArrayList<String>();

			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://10.10.10.94:5444/central_qc3";
			String username = "enterprisedb";
			String password = "Oracle123";
			Connection db = DriverManager.getConnection(url, username, password);
			st = db.createStatement();

			
			for(int i=1; i<400;i++) {

				st.executeUpdate("Update bpcl_user set email_id= "+i+" where id="+i+" ");
			}
			st.close();
			db.close();

		}

		static void selectQuery(String data) throws SQLException {
			ResultSet rs = st.executeQuery("SELECT *  FROM bpcl_user where mobile_no=" + data + " ");
			ResultSetMetaData meta = rs.getMetaData();
			int count = meta.getColumnCount();
			while (rs.next()) {
				String z = "";
				for (int i = 1; i <= count; i++) {
					z += rs.getString(i) + "   |   ";

				}
				System.out.println(z);

			}

		}


	}


