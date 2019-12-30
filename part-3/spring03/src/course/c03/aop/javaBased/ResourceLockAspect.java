package course.c03.aop.javaBased;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.aspectj.lang.annotation.Pointcut;

import course.c03.aop.*;

@Aspect
public class ResourceLockAspect {

	@Pointcut("execution(* *.*.*.Resource.setContent(String)) && args(content)")
	public void setResourceContent(String content) {
	}

    @DeclareParents(value = "course.c03.aop.Resource+", defaultImpl = LockableImpl.class)
    private Lockable lock;
	
    @Around("setResourceContent(content) && this(lockable)")
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