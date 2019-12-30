package course.c03.aop;

import course.c03.aop.Show;

//@Component
public class ShowImpl implements Show {

	@Override
	public void play() {
		System.out.println("The show is playing...");
		throw new RuntimeException("something is wrong!!");
	}

}
