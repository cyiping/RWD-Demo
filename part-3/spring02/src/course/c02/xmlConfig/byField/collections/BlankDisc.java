package course.c02.xmlConfig.byField.collections;

import java.util.List;

import course.c02.xmlConfig.byField.CompactDisc;

public class BlankDisc implements CompactDisc {

	private String title;
	private String artist;
	private List<String> tracks;

	public void setTitle(String title) {
		this.title = title;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void setTracks(List<String> tracks) {
		this.tracks = tracks;
	}

	public void play() {
		System.out.print("Playing " + title + " by " + artist + "\n");
		for (String track : tracks) {
			System.out.print("-Track: " + track + "\n");
		}
	}

}
