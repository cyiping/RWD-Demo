package course.c01.template;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WithoutSpring {

	public static Employee getEmployeeById(int id) {

		String url = "jdbc:derby://localhost:1527/myDB";
		String username = "root";
		String password = "sa";

		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection(url, username, password);
			stmt = conn.prepareStatement("select id, firstname, lastname, salary from " + "employee where id=?");
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			Employee employee = null;
			if (rs.next()) {
				employee = new Employee();
				employee.setId(rs.getInt("id"));
				employee.setFirstName(rs.getString("firstname"));
				employee.setLastName(rs.getString("lastname"));
				employee.setSalary(rs.getLong("salary"));
			}
			return employee;
		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}
		return null;

	}

	public static void main(String[] args) {
		System.out.println(getEmployeeById(2));

	}

}
