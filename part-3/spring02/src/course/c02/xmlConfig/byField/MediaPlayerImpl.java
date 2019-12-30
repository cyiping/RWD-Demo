package course.c02.xmlConfig.byField;

import course.c02.xmlConfig.byField.CompactDisc;
import course.c02.xmlConfig.byField.MediaPlayer;

public class MediaPlayerImpl implements MediaPlayer {
	private CompactDisc compactDisc;

	public void setCompactDisc(CompactDisc compactDisc) {
		this.compactDisc = compactDisc;
	}

	public void play() {
		compactDisc.play();
	}

}
