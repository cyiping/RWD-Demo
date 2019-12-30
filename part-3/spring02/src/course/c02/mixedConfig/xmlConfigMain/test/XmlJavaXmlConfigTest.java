package course.c02.mixedConfig.xmlConfigMain.test;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import course.c02.mixedConfig.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:course/c02/mixedConfig/xmlConfigMain/xmlJavaXmlConfig.xml")
public class XmlJavaXmlConfigTest {

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

}
