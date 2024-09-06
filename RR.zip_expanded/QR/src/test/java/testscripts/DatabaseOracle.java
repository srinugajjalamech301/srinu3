package testscripts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DatabaseOracle {

	public static void main(String[] args) throws Exception {
		readPostgres();
	}

	public static void readPostgres() throws Exception {

	//	ArrayList<String> usersp = new ArrayList<String>();

		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@//10.10.10.72:1521/ASSAMQC";
		String username = "EXASSAMP";
		String password = "AssQc571";
		Connection db = DriverManager.getConnection(url, username, password);
		

		Statement st = db.createStatement();
		ResultSet rs = st.executeQuery("SELECT   *  FROM  TTS_EXPORT_CHALLAN_DETAIL tecd  order by id desc fetch next 20 rows ONLY");

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
