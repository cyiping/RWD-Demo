package course.c11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ThreadPoolLauncher implements ServletContextListener {

	public void contextInitialized(ServletContextEvent servletContextEvent) {
		ExecutorService es = Executors.newCachedThreadPool();
		servletContextEvent.getServletContext().setAttribute("threads", es);
	}

	public void contextDestroyed(ServletContextEvent servletContextEvent) {
		ExecutorService es = (ExecutorService) servletContextEvent.getServletContext().getAttribute("threads");
		es.shutdown();
	}
}
