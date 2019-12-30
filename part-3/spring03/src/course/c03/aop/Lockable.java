package course.c03.aop;

public interface Lockable {
	boolean isLocked();

	void lock();

	void unlock();
}