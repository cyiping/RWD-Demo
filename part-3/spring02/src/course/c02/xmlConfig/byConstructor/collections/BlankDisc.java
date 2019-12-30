package course.c02.xmlConfig.byConstructor.collections;

import java.util.List;

import course.c02.xmlConfig.byConstructor.CompactDisc;

public class BlankDisc implements CompactDisc {

	private String title;
	private String artist;
	private List<String> tracks;

	public BlankDisc(String title, String artist, List<String> tracks) {
		this.title = title;
		this.artist = artist;
		this.tracks = tracks;
	}

	public void play() {
		System.out.print("Playing " + title + " by " + artist + "\n");
		for (String track : tracks) {
			System.out.print("-Track: " + track + "\n");
		}
	}

}
