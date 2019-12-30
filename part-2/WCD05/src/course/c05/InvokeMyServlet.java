package course.c05;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "InvokeMyServlet", urlPatterns = { "/InvokeMyServlet" })
public class InvokeMyServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		RequestDispatcher dispatcher = null;
		
//		dispatcher = getServletContext().getRequestDispatcher("/YourServlet");
		
		dispatcher = getServletContext().getNamedDispatcher("MyServletName");
		
		dispatcher.forward(request, response);
	}
}
