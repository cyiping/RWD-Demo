package course.c01.aop;

import course.c01.Soldier;
import course.c01.Weapon;

public class MySoldierNG implements Soldier {
	
	Weapon weapon;
	Alert alert;
	
	public MySoldierNG (Weapon w, Alert a) {
		this.weapon = w;
		this.alert = a;
	}
	
	@Override
	public void destroyTarget() {
		this.alert.beforeAttack();
		this.weapon.attack();
		this.alert.afterAttack();
	}

}
