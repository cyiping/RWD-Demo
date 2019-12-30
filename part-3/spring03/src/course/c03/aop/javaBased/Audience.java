package course.c03.aop.javaBased;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
//@Component
public class Audience {
	@Before("execution(* course.c03.aop.Show.play(..))")
	public void beQuiet() {
		System.out.println("Silencing cell phones.");
	}

	@AfterReturning("execution(* course.c03.aop.Show.play(..))")
	public void applause() {
		System.out.println("Good show!!");
	}

	@AfterThrowing("execution(* course.c03.aop.Show.play(..))")
	public void demandRefund() {
		System.out.println("Demanding a refund!!");
	}

	@After("execution(* course.c03.aop.Show.play(..))")
	public void leave() {
		System.out.println("The show ends.");
	}
}
