package course.c01;

import static org.mockito.Mockito.*;
import org.junit.Test;

import course.c01.MySoldierOK;
import course.c01.Weapon;

public class MySoldierOkUnitTest {

	@Test
	public void test() {
		Weapon mockWeapon = mock(Weapon.class);
		MySoldierOK soldier = new MySoldierOK(mockWeapon);
		soldier.destroyTarget();
		verify(mockWeapon, times(1)).attack();
	}
}
