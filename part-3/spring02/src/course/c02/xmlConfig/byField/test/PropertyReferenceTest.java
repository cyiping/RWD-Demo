package course.c02.xmlConfig.byField.test;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import course.c02.xmlConfig.byField.MediaPlayer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class PropertyReferenceTest {

	@Rule
	public final SystemOutRule log = new SystemOutRule().enableLog();

	@Autowired
	private MediaPlayer player;

	@Test
	public void play() {
		player.play();
		assertEquals("Playing [Nice Song] by [Some Artist]", log.getLog());
	}

}
