package course.c02.mixedConfig.javaConfigMain;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import({ MediaPlayerConfig.class })
@ImportResource("classpath:course/c02/mixedConfig/javaConfigMain/compactDiscBlankConfig.xml")
public class SystemConfigJavaXml {

}
