package course.c03.aop.javaBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import course.c03.aop.*;

@Configuration
@EnableAspectJAutoProxy
public class ResourceAspectConfig {

	@Bean
	public Resource createResource() {
		return new ResourceImpl();
	}

	@Bean
	public Lab_ResourceAspect createResourceChecker() {
		return new Lab_ResourceAspect();
	}
	
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ResourceAspectConfig.class);

		Resource resource = context.getBean(Resource.class);
		resource.setContent("Hi, Jim!!");
//		resource.setContent("Hi, XXX!!");
	}
}