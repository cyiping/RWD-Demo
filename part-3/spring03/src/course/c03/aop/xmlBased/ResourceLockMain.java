package course.c03.aop.xmlBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import course.c03.aop.Lockable;
import course.c03.aop.Resource;

public class ResourceLockMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("course\\c03\\aop\\xmlBased\\resourceLock.xml");
		
		Resource resource = context.getBean(Resource.class);
		resource.setContent("Hi, Jim!!");

		Lockable lockable = (Lockable) resource;
		
		lockable.lock();
		resource.setContent("Hi, Jim!!");
		
		lockable.unlock();
		resource.setContent("Hi, Jim!!");

	}
}
