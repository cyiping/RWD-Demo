package course.c10;

import java.util.List;

import javax.sql.DataSource;

public class EmployeeService {

	private EmployeeDao dao;

	// called by TestDataSourceFromScAction
	public EmployeeService(DataSource dataSource) {
		this.dao = new EmployeeDaoJdbcImpl(dataSource);
	}

	public List<Employee> addThenFindAll(Employee e) {
		dao.add(e);
		List<Employee> emps = dao.getAllEmployees();
		return emps;
	}

	// called by TestJndiLookupAction
	public EmployeeService() {
		this.dao = new EmployeeDaoJdbcImpl();
	}
}
