package course.c01;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HelloServlet", urlPatterns = { "/HelloServlet", "/HelloServlet" })
public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		System.out.println();
		try {
			out.println("<html>");
			out.println("<head>");
			out.println("<title>HelloServlet</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>HelloServlet says \"Hello, World!\"</h1>");
			out.println("</body>");
			out.println("</html>");
		} finally {
			out.close();
		}
	}
}
