package databaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection_Initial {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/orders_db", "root", "password");
				PreparedStatement ps = conn.prepareStatement("select salary from employees where name = ?")) {
			ps.setString(1, "Sara");
			try (ResultSet rs = ps.executeQuery()) {
				while (rs.next()) {
					System.out.println(rs.getString("salary"));
				}
			}

		}

	}

}
