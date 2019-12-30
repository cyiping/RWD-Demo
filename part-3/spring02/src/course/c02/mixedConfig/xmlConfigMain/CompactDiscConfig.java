package course.c02.mixedConfig.xmlConfigMain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import course.c02.mixedConfig.CompactDisc;
import course.c02.mixedConfig.CompactDiscImpl;

@Configuration
public class CompactDiscConfig {
	
	@Bean
	public CompactDisc compactDisc() {
		return new CompactDiscImpl();
	}
	
}