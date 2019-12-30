package course.c01.aop.xmlBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import course.c01.Soldier;

public class SoldierMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"course/c01/aop/xmlBased/applicationContext.xml");

		Soldier soldier = context.getBean(Soldier.class);
		soldier.destroyTarget();
	}
}
