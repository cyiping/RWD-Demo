package course.c03.aop.javaBased;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AudienceAround {

	@Pointcut("execution(* course.c03.aop.Show.play(..))")
	public void playShow() {
	}

	@Around("playShow()")
	public void aroundShow(ProceedingJoinPoint jp) {
		System.out.println("Silencing cell phones.");		//@Before
		try {			
			jp.proceed();
			System.out.println("Good show!!");				//@AfterReturning
		} catch (Throwable e) {
			e.printStackTrace();
			System.out.println("Demanding a refund!!");		//@AfterThrowing
		}
		System.out.println("The show ends.");				//@After
	}

}
