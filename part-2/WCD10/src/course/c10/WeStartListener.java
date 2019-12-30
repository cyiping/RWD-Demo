package course.c10;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.commons.dbcp.BasicDataSource;

public class WeStartListener implements ServletContextListener {
	public static final String DB = "DB";

	@Override
	public void contextInitialized(ServletContextEvent event) {
		ServletContext servletContext = event.getServletContext();

		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName("org.apache.derby.jdbc.ClientDriver");
		ds.setUsername("root");
		ds.setPassword("sa");
		ds.setUrl("jdbc:derby://localhost:1527/myDB");
		ds.setInitialSize(10);

		servletContext.setAttribute(DB, ds);
	}

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		// Null implementation
	}
}