package course.c04.transaction.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import course.c04.transaction.MyService;

public class Main {

	public static void main(String[] args) throws Exception {

		ApplicationContext context = 
				new ClassPathXmlApplicationContext("course/c04/transaction/xml/Config.xml");
		MyService s = context.getBean(MyService.class);

		s.doTx();

	}

}
