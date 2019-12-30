package course.c02.autoConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MediaPlayerImpl implements MediaPlayer {
	
	@Autowired
	@Qualifier("compactDiscImpl")
	private CompactDisc cd;
/*
	public MediaPlayerImpl(CompactDisc cd) {
		this.cd = cd;
	}
*/
	public void perform() {
		cd.play();
	}

}
