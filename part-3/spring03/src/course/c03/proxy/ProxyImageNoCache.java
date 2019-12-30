package course.c03.proxy;

public class ProxyImageNoCache implements Image {

	private String fileName;

	public ProxyImageNoCache(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void display() {
		new RealImage(fileName).display();
	}
}