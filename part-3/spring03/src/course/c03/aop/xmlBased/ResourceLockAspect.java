package course.c03.aop.xmlBased;

import org.aspectj.lang.ProceedingJoinPoint;
import course.c03.aop.*;

public class ResourceLockAspect {

	public void beforeSetContent(ProceedingJoinPoint joinPoint, Lockable lockable, String content) throws Throwable {
		System.out.println("@Aspect: check if resource is locked? " + lockable.isLocked());
		if (!lockable.isLocked()) {
			joinPoint.proceed();
			System.out.println("@Aspect: after set content: " + content);
		} else {
			System.out.println("@Aspect: The resource is locked and content setting is rejected!!");
		}
		System.out.println("---------------------------------------------------------------------");
	}
}