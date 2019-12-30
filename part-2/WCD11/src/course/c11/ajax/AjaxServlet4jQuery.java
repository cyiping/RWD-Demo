package course.c11.ajax;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

@WebServlet("/AjaxServlet4jQuery")
public class AjaxServlet4jQuery extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		if (name == null) {
			name = "none";
		}
		System.out.println(JsonUtility.data(name).toString());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		response.getWriter().append(JsonUtility.data(name).toString());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
