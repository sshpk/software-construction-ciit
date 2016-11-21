
public class Demo {

	public static void main(String[] args) {
		Image image = new RealImage("test_10mb.jpg");
		image.display();
		
		image = new RealImage("test_10mb.jpg");
		image.display();
		
		//use proxy
		Image proxyImage = new ProxyImage("test_10mb.jpg");
		//image will be loaded from disk
		proxyImage.display();
		System.out.println("");
		//image will not be loaded from disk
		proxyImage.display();
	}

}
