package course.c02.javaConfig.test;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import course.c02.javaConfig.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class CDPlayerTest {

	@Rule
	public final SystemOutRule log = new SystemOutRule().enableLog();

	@Autowired
	private MediaPlayer player;

	@Test
	public void play() {
		log.clearLog();
		player.perform();
		assertEquals("Playing [Nice Song] by [Some Artist]", log.getLog());	
	}

	
	@Autowired
	private MediaPlayer player1;

	@Test
	public void testIfSingleton() {
		assertTrue(player == player1);
		assertTrue(player.getCD() == player1.getCD());	
	}

}
