package course.c12;

import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.ServletSecurity;

//@ServletSecurity(@HttpConstraint(rolesAllowed = "myAdmin")) 
//Cant't pass the check by reference-role

@ServletSecurity(@HttpConstraint(rolesAllowed = "admin"))
public class TestReferenceRole extends MyHttpServlet {

	private static final long serialVersionUID = 1L;

}