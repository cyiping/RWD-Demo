package course.c12;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyHttpServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		try {
			out.println("<html>");
			out.println("<head>");
			out.println("<title>" + this.getClass().getSimpleName() + "</title>");
			out.println("</head>");
			out.println("<body>");

			if (request.getUserPrincipal() != null) {
				out.println("<h1> Welcome '" + request.getUserPrincipal().getName() + "'</h1>");
				out.println("<h1> Am i role of 'sales'? " + request.isUserInRole("sales") + "</h1>");
				out.println("<h1> Am i role of 'admin'? " + request.isUserInRole("admin") + "</h1>");
				out.println("<h1> Am i role of 'myAdmin'? " + request.isUserInRole("myAdmin") + "</h1>");			
			} else {
				out.println("<h1> No user login! </h1>");
			}
			out.println("<hr/>");
			
			Enumeration<String> headerNames = request.getHeaderNames();
			while (headerNames.hasMoreElements()) {
				String headerName = (String) headerNames.nextElement();
				out.print("Header Name: <em>" + headerName);
				String headerValue = request.getHeader(headerName);
				out.print("</em>, Header Value: <em>" + headerValue);
				out.println("</em><br/>");
			}

			out.println("<br/><hr/>");
			out.println("<a href='login/logout.jsp'>Click here to log out</a><br/>");
			out.println("<a href=' " + request.getContextPath() + "/'>Back to home</a>");

			out.println("</body>");
			out.println("</html>");
		} finally {
			out.close();
		}
	}
}
