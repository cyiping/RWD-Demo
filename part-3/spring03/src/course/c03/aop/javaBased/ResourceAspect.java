package course.c03.aop.javaBased;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

//@Aspect
public class ResourceAspect {

	@Pointcut("execution(* course.c03.aop.Resource.setContent(String)) && args(content1)")
	public void setResourceContent(String content1) {
	}

	@Before("setResourceContent(content0)")
	public void beforeSetContent(String content0) {
		System.out.println("@Aspect: before set content: " + content0);
	}
	


}