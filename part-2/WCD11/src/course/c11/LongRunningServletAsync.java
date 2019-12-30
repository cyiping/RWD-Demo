package course.c11;

import java.io.IOException;
import java.util.concurrent.ExecutorService;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/LongRunningServletAsync", asyncSupported = true)
public class LongRunningServletAsync extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Request Thread 1:");
		System.out.println("Name: " + Thread.currentThread().getName());
		System.out.println("Time: " + new java.util.Date());
		System.out.println("--------------------------");

		AsyncContext asyncCtx = request.startAsync();
		asyncCtx.addListener(new AppAsyncListener());
		asyncCtx.setTimeout(9000);

		ExecutorService es = (ExecutorService) request.getServletContext().getAttribute("threads");
		es.execute(new AsyncRequestProcessor(asyncCtx));

	}
}