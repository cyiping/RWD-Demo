package course.c01.aop;

import course.c01.Gun;
import course.c01.Weapon;

public class SoldierMain {

	public static void main(String[] args) {

		Weapon w = new Gun();
		Alert a = new Alert();
		
		new MySoldierNG(w, a).destroyTarget();
	}
}
