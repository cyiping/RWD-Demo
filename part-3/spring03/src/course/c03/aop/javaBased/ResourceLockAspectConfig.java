package course.c03.aop.javaBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import course.c03.aop.Lockable;
import course.c03.aop.LockableImpl;
import course.c03.aop.Resource;
import course.c03.aop.ResourceImpl;

@Configuration
@EnableAspectJAutoProxy
public class ResourceLockAspectConfig {

	@Bean
	public Resource createResource() {
		return new ResourceImpl();
	}

	@Bean
	public Lockable createLock() {
		return new LockableImpl();
	}

	@Bean
	public ResourceLockAspect createResourceLockChecker() {
		return new ResourceLockAspect();
	}

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ResourceLockAspectConfig.class);

		Resource resource = context.getBean(Resource.class);
		resource.setContent("Hi, Jim!!");

		Lockable lockable = (Lockable) resource;
		
		lockable.lock();
		resource.setContent("Hi, Jim!!");
		
		lockable.unlock();
		resource.setContent("Hi, Jim!!");

	}

}