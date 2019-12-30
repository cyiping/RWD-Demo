package course.c03.aop.javaBased;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AudiencePointcut {

	@Pointcut("execution(* course.c03.aop.Show.play(..))")
	public void playShow() {
	}

	@Before("playShow()")
	public void beQuiet() {
		System.out.println("Silencing cell phones.");
	}

	@AfterReturning("playShow()")
	public void applause() {
		System.out.println("Good show!!");
	}

	@AfterThrowing("playShow()")
	public void demandRefund() {
		System.out.println("Demanding a refund!!");
	}
	
	@After("playShow()")
	public void leave() {
		System.out.println("The show ends.");
	}
}
