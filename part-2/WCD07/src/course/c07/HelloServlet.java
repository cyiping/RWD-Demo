package course.c07;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HelloServlet", urlPatterns = { "/HelloServlet" })
public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		generateResponse(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		generateResponse(request, response);
	}

	private static final String DEFAULT_NAME = "World";
	
	public void generateResponse(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String name = request.getParameter("name");
		if ((name == null) || (name.length() == 0)) {
			name = DEFAULT_NAME;
		}

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<HTML>");
		out.println("<HEAD>");
		out.println("<TITLE>Hello Servlet</TITLE>");
		out.println("</HEAD>");
		out.println("<BODY BGCOLOR='white'>");
		out.println("<B>Hello, " + name + "</B>");
		out.println("</BODY>");
		out.println("</HTML>");

		out.close();
	}
}