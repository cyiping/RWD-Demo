package course.c04.template;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository(value = "jdbcTemplateImpl")
public class EmployeeDaoJdbcTemplateImpl implements EmployeeDao {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public EmployeeDaoJdbcTemplateImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public Employee findById(int id) {
		String SQL_SELECT = "select id, firstname, lastname, birthdate, salary from employee where id = ?";
		return jdbcTemplate.queryForObject(SQL_SELECT, new EmployeeRowMapper(), id);
	}

	private static final class EmployeeRowMapper implements RowMapper<Employee> {
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			Employee employee = new Employee();
			employee.setId(rs.getInt("id"));
			employee.setFirstName(rs.getString("firstname"));
			employee.setLastName(rs.getString("lastname"));
			employee.setSalary(rs.getDouble("salary"));
			employee.setBirthDate(rs.getDate("birthdate"));
			return employee;
		}
	}

	@Override
	public void add(Employee emp) {
		String SQL_INSERT = "insert into employee (id, firstname, lastname, birthdate, salary) values (?, ?, ?, ?, ?)";
		this.jdbcTemplate.update(SQL_INSERT, 
				new Object[] { emp.getId(), emp.getFirstName(), emp.getLastName(), emp.getBirthDate(), emp.getSalary() });
	}

	@Override
	public void modify(Employee emp) {
		String SQL_UPDATE = "update employee set firstname = ?, lastname = ?, birthdate = ?, salary = ? where id = ?";
		this.jdbcTemplate.update(SQL_UPDATE, new Object[] { emp.getFirstName(), emp.getLastName(), emp.getBirthDate(),
				emp.getSalary(), emp.getId() });
	}

}
