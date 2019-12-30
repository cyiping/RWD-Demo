package course.c04;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/URLRewriteTest")
public class URLRewriteTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println(request.getSession().getId());	//force to create a session and will need JSESSIONID right now!!
		
		String url = response.encodeURL("course/c04/addLeague.jsp");
		response.getWriter()
				.println("<form action='" + url + "' method='GET'>"
						+ "<input type='submit' value='GO' />"
						+ "</form>");

	}

}
