package course.c02.mixedConfig;

import org.springframework.beans.factory.annotation.Autowired;

public class MediaPlayerImpl implements MediaPlayer {
	private CompactDisc cd;

	@Autowired
	public MediaPlayerImpl(CompactDisc cd) {
		this.cd = cd;
	}

	public void perform() {
		cd.play();
	}

}
