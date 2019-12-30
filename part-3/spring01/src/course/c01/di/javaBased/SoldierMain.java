package course.c01.di.javaBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import course.c01.Soldier;

public class SoldierMain {

	public static void main(String[] args) {
		
		ApplicationContext context = 
				   new AnnotationConfigApplicationContext(SoldierConfig.class);				   
			
		Soldier soldier = context.getBean(Soldier.class);
		soldier.destroyTarget();
	}
}
