package course.c03.aop.xmlBased;

import org.aspectj.lang.ProceedingJoinPoint;

public class AudienceAround {

	public void aroundShow(ProceedingJoinPoint jp) {
		try {
			System.out.println("Silencing cell phones.");
			jp.proceed();
			System.out.println("The show ends.");
			System.out.println("Good show!!");
		} catch (Throwable e) {
			System.out.println("Demanding a refund!!");
		}
	}

}
