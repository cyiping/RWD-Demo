package course.c10;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestJndiLookupAction")
public class TestJndiLookupAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		EmployeeService service = new EmployeeService();

		request.setAttribute("emps", service.addThenFindAll(createEmp()));

		request.setAttribute("subject", "By JNDI Lookup");
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