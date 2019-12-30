package course.c03.proxy;

public class RealImage implements Image {

	private String fileName;

	public RealImage(String fileName) {
		this.fileName = fileName;
		System.out.println(fileName + " is loadiong...");
	}

	@Override
	public void display() {
		System.out.println(fileName + " is displayed");
	}

}