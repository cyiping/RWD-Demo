package course.c02.javaConfig;

public class MediaPlayerImpl implements MediaPlayer {
	private CompactDisc cd;

	public MediaPlayerImpl(CompactDisc cd) {
		this.cd = cd;
	}

	public void perform() {
		cd.play();
	}

	@Override
	public CompactDisc getCD() {
		return this.cd;
	}

}
