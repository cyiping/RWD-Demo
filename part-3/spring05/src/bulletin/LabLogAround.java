package bulletin;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LabLogAround {

	static Logger logger = Logger.getLogger(LabLogAround.class);

	@Pointcut("execution(public String * (..)) && " 
			+ "@within(org.springframework.stereotype.Controller)")
	public void playShow() {
	}

	@Around("playShow()")
	public Object aroundShow(ProceedingJoinPoint jp) {
		String c = jp.getSignature().getDeclaringTypeName();
		String m = jp.getSignature().getName();
		Object o = null;
		try {
			
			long s = System.currentTimeMillis();
			o = jp.proceed();
			long e = System.currentTimeMillis();
			logger.info(c + "." + m + "() cost " + (e-s) + "(ms)");
		} catch (Throwable e) {
			e.printStackTrace();

		}
		return o;
	}

}
