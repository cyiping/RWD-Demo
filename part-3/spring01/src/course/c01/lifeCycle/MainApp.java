package course.c01.lifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("course/c01/lifeCycle/applicationContext.xml");

		SimpleBean bean = context.getBean(SimpleBean.class);
		bean.getMessage();
		
		((ClassPathXmlApplicationContext) context).close();

	}

}
