package course.c03.proxy;

public class ProxyImageCache implements Image {

	private Image realImage;
	private String fileName;

	public ProxyImageCache(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void display() {
		if (realImage == null) {
			realImage = new RealImage(fileName);
		}
		realImage.display();
	}
}