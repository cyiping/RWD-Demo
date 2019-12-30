package course.c02.autoConfig;

import org.springframework.stereotype.Component;

@Component
public class CompactDiscImpl implements CompactDisc {

	private String title = "[Nice Song]";
	private String artist = "[Some Artist]";

	public void play() {
		System.out.print("Playing " + title + " by " + artist);
	}

}
