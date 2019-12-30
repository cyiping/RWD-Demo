package course.c04.transaction.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import course.c04.transaction.MyService;

public class Main {

	public static void main(String[] args) throws Exception {

		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		MyService s = context.getBean(MyService.class);

		s.doTx();

	}

}
