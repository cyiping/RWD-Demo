package node2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MyController", urlPatterns = { "/MyController" })
public class MyController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/pages/node2/myView.jsp");
		MyModel model = new MyModel();
		String name = request.getParameter("name");
		if (name == null) {
			name = "Secret";
		}
		model.setName(name);
		request.setAttribute("model", model);
		rd.forward(request, response);
	}
}