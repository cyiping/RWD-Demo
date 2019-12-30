package course.c05;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
		name = "ParamServlet", 
		urlPatterns = { "/ParamServlet" }, 
		initParams = { @WebInitParam(name = "initParam2", value = "value2") })
public class ParamServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		try {
		
			ServletContext ctx = this.getServletContext();
			String ctxParamVal = ctx.getInitParameter("contextParam");
			out.println("contextParam : " + ctxParamVal + "</br>");
			
			//import webFragement1 and get contextParam2 from /webFragement1/src/META-INF/web-fragment.xml
			String ctxParamVal2 = ctx.getInitParameter("contextParam2");
			out.println("contextParam2 : " + ctxParamVal2 + "</br>");
	
			Enumeration<String> eum = this.getInitParameterNames();
			while (eum.hasMoreElements()) {
				String initParamName = eum.nextElement();
				String initParamVal = this.getInitParameter(initParamName);
				//String initParamVal = this.getServletConfig().getInitParameter(initParamName);
				out.println(initParamName + " : " + initParamVal + "</br>");
			}

		} finally {
			out.close();
		}
	}
}