package course.c04.jdbcDriver;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

public class Main {

	public static void main(String[] args) {

		testDriverManagerDataSource(getXmlApplicationContext());
		testSingleConnectionDataSource(getXmlApplicationContext());

		testDriverManagerDataSource(getConfigApplicationContext());
		testSingleConnectionDataSource(getConfigApplicationContext());

	}

	private static void testDriverManagerDataSource(ApplicationContext context) {
		DataSource dataSource = (DriverManagerDataSource) context.getBean("driverManagerDataSource");
		try {
			System.out.println(context.getClass() + ": testDriverManagerDataSource........");
			System.out.println(dataSource.getConnection());
			System.out.println(dataSource.getConnection());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void testSingleConnectionDataSource(ApplicationContext context) {
		DataSource dataSource = context.getBean(SingleConnectionDataSource.class);
		try {
			System.out.println(context.getClass() + ": testSingleConnectionDataSource........");
			System.out.println(dataSource.getConnection());
			System.out.println(dataSource.getConnection());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static ApplicationContext getXmlApplicationContext() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"course/c04/jdbcDriver/jdbcDriverBasedDataSource.xml");
		return context;
	}

	private static ApplicationContext getConfigApplicationContext() {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		return context;
	}

}
