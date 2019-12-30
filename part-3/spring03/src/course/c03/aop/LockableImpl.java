package course.c03.aop;

public class LockableImpl implements Lockable {
	private boolean lock = false;

	@Override
	public boolean isLocked() {
		return lock;
	}

	@Override
	public void lock() {
		lock = true;
	}

	@Override
	public void unlock() {
		lock = false;
	}
}