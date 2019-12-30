package course.c04.connPool;

import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		testXML();
		testJava();
	}

	private static void testDS(BasicDataSource dataSource) {
		try {
			System.out.println(dataSource.getDriverClassName());
			System.out.println(dataSource.getConnection().getMetaData().getUserName());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void testXML() {
		System.out.println("Test XML Config....");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"course/c04/connPool/pooledDataSource.xml");
		BasicDataSource dataSource = context.getBean(BasicDataSource.class);
		testDS(dataSource);
		context.close();
	}

	private static void testJava() {
		System.out.println("Test Java Config....");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		BasicDataSource dataSource = context.getBean(BasicDataSource.class);
		testDS(dataSource);
		context.close();
	}

}
