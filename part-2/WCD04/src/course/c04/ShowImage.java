package course.c04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.servlet.ServletOutputStream;
import javax.servlet.UnavailableException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/showImage")
public class ShowImage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws UnavailableException, IOException {
		showImage1(response);
	//	showImage2(response);
	}

	private void showImage1(HttpServletResponse response) 
			throws IOException, FileNotFoundException {
		response.setContentType("image/jpeg");
		String p1 = getServletContext().getRealPath(File.separator) + "/images/duke.jpg";

		byte[] b = new byte[128];
		int bLen = b.length;
		try (FileInputStream fis = new FileInputStream(p1); 
				ServletOutputStream out = response.getOutputStream();) {
			System.out.println("Need to copy bytes: " + fis.available());
			int read = 0;
			while ((read = fis.read(b)) != -1) {
				if (read < bLen) {
					out.write(b, 0, read);
				} else {
					out.write(b);
				}
			}
		}
	}

	private void showImage2(HttpServletResponse response) 
			throws IOException, FileNotFoundException {
		response.setContentType("image/jpeg");
		String p1 = getServletContext().getRealPath(File.separator) + "/images/duke.jpg";

		Files.copy(Paths.get(p1), response.getOutputStream());
	}

}
