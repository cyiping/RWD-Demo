package course.c01.di.javaBased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import course.c01.Gun;
import course.c01.MySoldierOK;
import course.c01.Soldier;
import course.c01.Weapon;

@Configuration
public class SoldierConfig {

	@Bean
	public Soldier getSoldier() {
		return new MySoldierOK(getWeapon());
	}

	@Bean
	public Weapon getWeapon() {
		return new Gun();
	}

}
