package course.c01;

import course.c01.Gun;
import course.c01.MySoldierNG;
import course.c01.MySoldierOK;
import course.c01.Weapon;

public class SoldierMain {

	public static void main(String[] args) {
		
		new MySoldierNG().destroyTarget();
		
		Weapon w = new Gun();
		new MySoldierOK(w).destroyTarget();

	}

}
