package course.c04.template;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) throws Exception {

		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		EmployeeDao dao;

		//test generic JDBC
		dao = (EmployeeDao) context.getBean("genericJdbcImpl");
		Employee emp1 = new Employee(101, "jim", "tzeng", 10, getDate("1977/07/07"));
		dao.add(emp1);
		emp1.setSalary(100);
		dao.modify(emp1);
		System.out.println(dao.findById(101));

		// test JdbcTemplate
		dao = (EmployeeDao) context.getBean("jdbcTemplateImpl");
		Employee emp2 = new Employee(201, "jim", "tzeng", 10, getDate("1977/07/07"));
		dao.add(emp2);
		emp2.setSalary(200);
		dao.modify(emp2);
		System.out.println(dao.findById(201));

		//test NamedParameterJdbcTemplate
		dao = (EmployeeDao) context.getBean("namedParameterJdbcTemplateImpl");
		Employee emp3 = new Employee(301, "jim", "tzeng", 10, getDate("1977/07/07"));
		dao.add(emp3);
		emp3.setSalary(300);
		dao.modify(emp3);
		System.out.println(dao.findById(301));

	}

	private static Date getDate(String d) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		return new Date(format.parse(d).getTime());
	}

}
