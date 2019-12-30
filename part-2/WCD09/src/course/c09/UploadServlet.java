package course.c09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet(name = "Upload", urlPatterns = { "/upload" })
@MultipartConfig(location = "D:/uploaded", maxFileSize = 1024 * 1024 * 100)
public class UploadServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// deal with input text
		Part p1 = request.getPart("desc");
		BufferedReader r = new BufferedReader(new InputStreamReader(p1.getInputStream()));
		String desc = r.readLine();
		request.setAttribute("desc", desc);

		// deal with uploaded file
		Part p2 = request.getPart("data");
		p2.write(getFileName(p2));
		RequestDispatcher rd = request.getRequestDispatcher("/course/c09/acknowledge.jsp");
		rd.forward(request, response);
	}

	private String getFileName(final Part part) {
		for (String content : part.getHeader("content-disposition").split(";")) {
			// System.out.println(content);
			if (content.trim().startsWith("filename")) {
				Path filePath = Paths.get(content.substring(content.indexOf('=') + 1).trim().replace("\"", ""));
				return filePath.getFileName().toString();
			}
		}
		return null;
	}

}