package course.c02.mixedConfig.javaConfigMain.test;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import course.c02.mixedConfig.*;
import course.c02.mixedConfig.javaConfigMain.SystemConfigJavaXml;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SystemConfigJavaXml.class)
public class JavaXmlMixedConfigTest {

	@Rule
	public final SystemOutRule log = new SystemOutRule().enableLog();

	@Autowired
	private MediaPlayer player;

	@Test
	public void testJavaXml() {
		log.clearLog();
		player.perform();
		assertEquals("Playing [Nice Song] by [Some Artist]" + "#Track: A" + "#Track: B" + "#Track: C" + "#Track: D",
				log.getLog());
	}

}
