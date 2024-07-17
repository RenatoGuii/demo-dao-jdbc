package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {

	private static final String url = "jdbc:mysql://localhost:3306/curso_java";
	private static final String usuario = "root";
	private static final String senha = "1234";

	private static Connection conn;

	// Deixe apenas os métodos que for usar

	public static Connection getConnection() {

		try {
			if (conn == null) {
				conn = DriverManager.getConnection(url, usuario, senha);
				return conn;
			} else {
				return conn;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

	}

	public static void closeConnection() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void closeStatement(Statement st) {
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}

	public static void closeResultSent(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}

}
