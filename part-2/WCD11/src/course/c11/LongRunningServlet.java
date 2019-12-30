package course.c11;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LongRunningServlet")
public class LongRunningServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Request Thread 1:");
		System.out.println("Name: " + Thread.currentThread().getName());
		System.out.println("Time: " + new java.util.Date());
		System.out.println("--------------------------");

		RunUtility.run(5);

		RequestDispatcher rd = request.getRequestDispatcher("/course/c11/result.jsp");
		rd.forward(request, response);

	}
}
