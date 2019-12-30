package course.c10;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class EmployeeDaoJdbcImpl implements EmployeeDao {

	private DataSource dataSource;

	// called by TestDataSourceFromScAction
	public EmployeeDaoJdbcImpl(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void add(Employee e) {
		String sql = 
				"insert into EMPLOYEE (ID, FIRSTNAME, LASTNAME, BIRTHDATE, SALARY) " 
				+ "values (?, ?, ?, ?, ?)";
		try (Connection con = this.dataSource.getConnection(); 
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setLong(1, e.getId());
			pstmt.setString(2, e.getFirstName());
			pstmt.setString(3, e.getLastName());
			pstmt.setDate(4, new Date(e.getBirthDate().getTime()));
			pstmt.setFloat(5, e.getSalary());
			pstmt.executeUpdate();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> emps = new ArrayList<Employee>();
		String sql = "select * from EMPLOYEE order by id desc";
		try (Connection con = this.dataSource.getConnection();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {
			while (rs.next()) {
				Employee e = new Employee();
				e.setId(rs.getLong("ID"));
				e.setFirstName(rs.getString("FIRSTNAME"));
				e.setLastName(rs.getString("LASTNAME"));
				e.setSalary(rs.getFloat("SALARY"));
				e.setBirthDate(rs.getDate("BIRTHDATE"));
				emps.add(e);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return emps;
	}

	@Override
	public void update(Employee e) {
		// null implementation
	}

	@Override
	public void delete(int id) {
		// null implementation
	}

	@Override
	public Employee findById(int id) {
		// null implementation
		return null;
	}

	// called by TestJndiLookupAction
	public EmployeeDaoJdbcImpl() {
		this.dataSource = getDataSource();
	}

	@SuppressWarnings("unused")
	private DataSource getDataSource() {
		DataSource ds = null;
		try {
			Context ctx = new InitialContext();
			if (ctx == null) {
				throw new RuntimeException("JNDI Context could not be found.");
			}
			ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/MyLocalDB");
			if (ds == null) {
				throw new RuntimeException("DataSource could not be found.");
			}
		} catch (NamingException e) {
			e.printStackTrace();
		}
		return ds;
	}

}
