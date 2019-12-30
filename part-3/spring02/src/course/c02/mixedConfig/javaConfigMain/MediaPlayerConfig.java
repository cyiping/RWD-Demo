package course.c02.mixedConfig.javaConfigMain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import course.c02.mixedConfig.CompactDisc;
import course.c02.mixedConfig.MediaPlayer;
import course.c02.mixedConfig.MediaPlayerImpl;

@Configuration
@Import(CompactDiscConfig.class)
public class MediaPlayerConfig {
	
	@Bean
	public MediaPlayer cdPlayer(CompactDisc compactDisc) {
		return new MediaPlayerImpl(compactDisc);
	}

}
