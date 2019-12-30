package course.c12;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "EncodingTest", urlPatterns = { "/EncodingTest" })
public class EncodingTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setAttribute("js", "<script>alert('hi');</script>");

		RequestDispatcher rd = request.getRequestDispatcher("course/c12/encodingTest.jsp");
		rd.forward(request, response);
	}
}
