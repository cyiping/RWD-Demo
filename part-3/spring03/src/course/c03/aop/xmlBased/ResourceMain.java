package course.c03.aop.xmlBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import course.c03.aop.Resource;

public class ResourceMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("course\\c03\\aop\\xmlBased\\resource.xml");
		Resource resource = context.getBean(Resource.class);
		resource.setContent("Hi, Jim!!");
	}
}
