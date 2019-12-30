package course.c01.aop.javaBased;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Alert {

	@Before("execution(* course.c01.Soldier.destroyTarget(..))")
	public void beforeAttack() {
		System.out.println("Before Attack....");
	}

	@After("execution(* course.c01.Soldier.destroyTarget(..))")
	public void afterAttack() {
		System.out.println("After Attack....");
	}

}
