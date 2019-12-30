package course.c12;

import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = { "/testRoleAdmin" })
@ServletSecurity(@HttpConstraint(rolesAllowed = "admin"))
public class TestRoleAdmin extends MyHttpServlet {

	private static final long serialVersionUID = 1L;

}