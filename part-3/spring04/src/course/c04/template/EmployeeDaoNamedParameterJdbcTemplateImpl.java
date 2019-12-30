package course.c04.template;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository(value = "namedParameterJdbcTemplateImpl")
public class EmployeeDaoNamedParameterJdbcTemplateImpl implements EmployeeDao {

	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Autowired
	public EmployeeDaoNamedParameterJdbcTemplateImpl(DataSource dataSource) {
		this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	public Employee findById(int id) {
		String SQL_SELECT = "select id, firstname, lastname, birthdate, salary from employee where id = :id";
		return namedParameterJdbcTemplate.queryForObject(SQL_SELECT, getParamMap(id), new EmployeeRowMapper());
	}

	private static Map<String, Object> getParamMap(int id) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("id", id);
		return paramMap;
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
		String SQL_INSERT = "insert into employee (id, firstname, lastname, birthdate, salary) values (:id, :firstname, :lastname, :birthdate, :salary)";
		this.namedParameterJdbcTemplate.update(SQL_INSERT, getParamMap(emp));
	}

	@Override
	public void modify(Employee emp) {
		String SQL_UPDATE = "update employee set firstname = :firstname, lastname = :lastname, birthdate = :birthdate, salary = :salary where id = :id";
		this.namedParameterJdbcTemplate.update(SQL_UPDATE, getParamMap(emp));
	}

	private static Map<String, Object> getParamMap(Employee emp) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("id", emp.getId());
		paramMap.put("firstname", emp.getFirstName());
		paramMap.put("lastname", emp.getLastName());
		paramMap.put("salary", emp.getSalary());
		paramMap.put("birthdate", emp.getBirthDate());
		return paramMap;
	}

}
