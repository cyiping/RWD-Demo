package course.c01.template;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class WithSpring {

	public static void main(String[] args) {
		
		String ctxClassPath = "course/c01/template/applicationContext.xml";		
		ApplicationContext clsContext = new ClassPathXmlApplicationContext(ctxClassPath);
		EmployeeDao dao1 = clsContext.getBean(EmployeeDao.class);
		System.out.println(dao1.getEmployeeById(2));
		
		String ctxFsPAth = "D:/springMVC/source/spring01/src/course/c01/template/applicationContext.xml";
		ApplicationContext fsContext = new FileSystemXmlApplicationContext(ctxFsPAth);
		EmployeeDao dao2 = fsContext.getBean(EmployeeDao.class);
		System.out.println(dao2.getEmployeeById(2));

		

	}

}
