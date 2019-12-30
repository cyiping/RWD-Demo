package course.c02.xmlConfig.byConstructor;

public class CompactDiscBlankImpl implements CompactDisc {

	private String title;
	private String artist;

	public CompactDiscBlankImpl(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}

	public void play() {
		System.out.print("Playing " + title + " by " + artist);
	}

}
