package course.c01.lifeCycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitSimpleBean implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("postProcess Before Initialization: " + arg1);
		return arg0;
	}

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("postProcess After Initialization: " + arg1);
		return arg0;
	}

}
