package course.c02.autoConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("mediaPlayerImpl2")
@Component
public class MediaPlayerImpl2 implements MediaPlayer {
	
	@Autowired
	@Qualifier("compactDiscImpl2")
	private CompactDisc cd;

/*
	public MediaPlayerImpl2(CompactDisc cd) {
		this.cd = cd;
	}
*/
	public void perform() {
		cd.play();
	}

}
