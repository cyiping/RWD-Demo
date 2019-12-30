package course.c01;

public class MySoldierOK implements Soldier {
	
	Weapon weapon;
	
	public MySoldierOK (Weapon w) {
		this.weapon = w;
	}
	
	@Override
	public void destroyTarget() {
		this.weapon.attack();
	}

}
