package course.c02.autoConfig.test;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import course.c02.autoConfig.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:course/c02/autoConfig/appConfig.xml")
public class CDPlayerXmlConfigTest {

	@Rule
	public final SystemOutRule out = new SystemOutRule().enableLog();

	@Autowired
	private MediaPlayer player;

	@Autowired
	private CompactDisc cd;

	@Test
	public void cdShouldNotBeNull() {
		assertNotNull(cd);
	}

	@Test
	public void verifyCdPlayResult() {
		out.clearLog();
		player.perform();
		assertEquals("Playing [Nice Song] by [Some Artist]", out.getLog());
	}

}
