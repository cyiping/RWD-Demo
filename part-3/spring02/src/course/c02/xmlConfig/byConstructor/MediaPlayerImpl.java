package course.c02.xmlConfig.byConstructor;

public class MediaPlayerImpl implements MediaPlayer {
	private CompactDisc cd;

	public MediaPlayerImpl(CompactDisc cd) {
		this.cd = cd;
	}

	public void play() {
		cd.play();
	}

}
