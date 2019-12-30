package course.c03.aop.javaBased;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Lab_ResourceAspect {

	@Pointcut("execution(* course.c03.aop.Resource.setContent(String)) && args(content)")
	public void setResourceContent(String content) {
	}

	
	@Before("setResourceContent(content)")
	public void beforeSetContent(String content) {
		System.out.println("@Aspect: before set content: " + content);
	}

/*
	@Around("setResourceContent(content0)")
	public void aroundSetContent(ProceedingJoinPoint jp, String content0) {	//ProceedingJoinPoint must be the first param!
		try {
			if (content0.toLowerCase().contains("jim")) {
				jp.proceed();				
			} else {
				
				content0 = content0 + " is changed!";
				jp.proceed(new Object[] {content0});
				
				//throw new IllegalArgumentException("wrong name: " + content0);
			}			
		} catch (Throwable e) {
			e.printStackTrace();
		}		
	}
*/



}