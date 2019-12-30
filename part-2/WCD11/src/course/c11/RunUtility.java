package course.c11;

public class RunUtility {

	public static void run(int secs) {
		try {
			Thread.sleep(secs * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
