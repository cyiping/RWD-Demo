package course.c02.mixedConfig.javaConfigMain;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ 
//	CompactDiscConfig.class, 
	MediaPlayerConfig.class })
public class SystemConfigOnlyJava {

}
