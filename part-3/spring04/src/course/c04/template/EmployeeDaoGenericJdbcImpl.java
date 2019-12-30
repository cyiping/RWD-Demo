package course.c04.template;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository(value = "genericJdbcImpl")
public class EmployeeDaoGenericJdbcImpl implements EmployeeDao {

	private DataSource dataSource;

	@Autowired
	public EmployeeDaoGenericJdbcImpl(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public Employee findById(int id) {
		String SQL_SELECT = "select id, firstname, lastname, birthdate, salary from employee where id = ?";
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = dataSource.getConnection();
			stmt = conn.prepareStatement(SQL_SELECT);
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			Employee employee = null;
			if (rs.next()) {
				employee = new Employee();
				employee.setId(rs.getInt("id"));
				employee.setFirstName(rs.getString("firstname"));
				employee.setLastName(rs.getString("lastname"));
				employee.setBirthDate(rs.getDate("birthdate"));
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

	@Override
	public void add(Employee emp) {
		String SQL_INSERT = "insert into employee (id, firstname, lastname, birthdate, salary) values (?, ?, ?, ?, ?)";
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			conn = dataSource.getConnection();
			stmt = conn.prepareStatement(SQL_INSERT);
			stmt.setInt(1, emp.getId());
			stmt.setString(2, emp.getFirstName());
			stmt.setString(3, emp.getLastName());
			stmt.setDate(4, emp.getBirthDate());
			stmt.setDouble(5, emp.getSalary());
			stmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
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
	}

	@Override
	public void modify(Employee emp) {
		String SQL_UPDATE = "update employee set firstname = ?, lastname = ?, birthdate = ?, salary = ? where id = ?";
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			conn = dataSource.getConnection();
			stmt = conn.prepareStatement(SQL_UPDATE);
			stmt.setString(1, emp.getFirstName());
			stmt.setString(2, emp.getLastName());
			stmt.setDate(3, emp.getBirthDate());
			stmt.setDouble(4, emp.getSalary());
			stmt.setInt(5, emp.getId());
			stmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
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
	}

}
