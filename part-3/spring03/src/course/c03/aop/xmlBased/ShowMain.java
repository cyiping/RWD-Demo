package course.c03.aop.xmlBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import course.c03.aop.Show;

public class ShowMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"course\\c03\\aop\\xmlBased\\showAudience.xml");
		Show show = context.getBean(Show.class);
		show.play();
	}
}
