package course.c02.autoConfig.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import course.c02.autoConfig.*;

public class CDPlayerMain {

	public static void main(String args[]) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		MediaPlayer player = (MediaPlayer) context.getBean("mediaPlayerImpl2");

		// .getBean(MediaPlayer.class);

		player.perform();
	}

}
