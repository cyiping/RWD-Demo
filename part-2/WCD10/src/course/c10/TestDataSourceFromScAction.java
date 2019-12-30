package course.c10;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/TestDataSourceFromScAction")
public class TestDataSourceFromScAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// get connection pool
		Object o = request.getServletContext().getAttribute(WeStartListener.DB);
		DataSource ds = (DataSource) o; 
		// pass connection pool to DAO, through service
		EmployeeService service = new EmployeeService(ds);
		// call service 
		List<Employee> emps = service.addThenFindAll(createEmp());
		// dispatch request
		request.setAttribute("emps", emps);
		request.setAttribute("subject", "By Servlet Context");
		RequestDispatcher rd = request.getRequestDispatcher("/course/c10/showEmps.jsp");
		rd.forward(request, response);
	}
	
	private Employee createEmp() {
		Employee emp = new Employee();
		emp.setId(new Date().getTime());
		emp.setFirstName("test");
		emp.setLastName("test");
		emp.setBirthDate(new Date());
		emp.setSalary(10000.1f);
		return emp;
	}

}