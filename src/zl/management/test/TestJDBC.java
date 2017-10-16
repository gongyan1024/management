package zl.management.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {
	private Connection conn = null;
	private Connection connNew = null;

	private Statement statement = null;

	private void sqlInit() {
		String driverPath = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/management?characterEncoding=utf-8&&useSSL=true";
		try {
			Class.forName(driverPath);
			conn = DriverManager.getConnection(url, "root", "root");
			connNew = DriverManager.getConnection(url, "root", "root");
			System.out.println(conn.equals(connNew));
			statement = conn.createStatement();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			closeAll();
		} catch (SQLException e) {
			e.printStackTrace();
			closeAll();
		}
	}

	private void closeAll() {
		try {
			if (statement != null) {
				statement.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		TestJDBC t = new TestJDBC();
		t.sqlInit();
	}
}
