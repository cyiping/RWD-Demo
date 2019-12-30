package course.c02.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan	for automatically scan & wiring
public class AppConfig {

	@Bean
	public CompactDisc getCompactDisc() {
		return new CompactDiscImpl();
	}

	@Bean
	public MediaPlayer getMediaPlayer(CompactDisc compactDisc) {
		return new MediaPlayerImpl(compactDisc);
	}
/*	
	@Bean
	public MediaPlayer getMediaPlayer() {
		return new MediaPlayerImpl(getCompactDisc());
	}
*/
}
