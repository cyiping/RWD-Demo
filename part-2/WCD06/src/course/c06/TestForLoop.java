package course.c06;

public class TestForLoop {

	public static void main(String[] args) {
		int count = 1;
		for (int i = 0; i <= 10; i = i + 2) {
			System.out.println(i + ", " + count);
			count++;
		}

	}

}
