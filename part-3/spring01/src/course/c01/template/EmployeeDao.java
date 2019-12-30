package course.c01.template;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDao {

	JdbcTemplate jdbcTemplate;
	public EmployeeDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Employee getEmployeeById(int id) {

		String sql = "select id, firstname, lastname, salary from employee where id = ?";

		return jdbcTemplate.queryForObject(sql, new EmployeeRowMapper(), id);
	}

	private static final class EmployeeRowMapper implements RowMapper<Employee> {
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			Employee employee = new Employee();
			employee.setId(rs.getInt("id"));
			employee.setFirstName(rs.getString("firstname"));
			employee.setLastName(rs.getString("lastname"));
			employee.setSalary(rs.getDouble("salary"));
			return employee;
		}
	}

}
