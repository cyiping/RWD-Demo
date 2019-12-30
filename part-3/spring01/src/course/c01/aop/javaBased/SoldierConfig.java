package course.c01.aop.javaBased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import course.c01.Gun;
import course.c01.MySoldierOK;
import course.c01.Soldier;
import course.c01.Weapon;

@Configuration
@EnableAspectJAutoProxy
public class SoldierConfig {

	@Bean
	public Soldier getSoldier() {
		return new MySoldierOK(getWeapon());
	}

	@Bean
	public Weapon getWeapon() {
		return new Gun();
	}

	@Bean
	public Alert getAlert() {
		return new Alert();
	}

}
