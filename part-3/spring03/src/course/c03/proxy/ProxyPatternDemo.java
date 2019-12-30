package course.c03.proxy;

public class ProxyPatternDemo {

	public static void main(String[] args) {
		System.out.println("------------- Cache Image Demo -------------");
		Image cache = new ProxyImageCache("someImage.jpg");
		cache.display();
		cache.display();
		
		System.out.println("\n------------- No Cache Image Demo -------------");
		Image noCache = new ProxyImageNoCache("someImage.jpg");
		noCache.display();
		noCache.display();
	}
}