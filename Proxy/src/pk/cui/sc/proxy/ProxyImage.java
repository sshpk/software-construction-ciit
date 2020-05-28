package pk.cui.sc.proxy;

public class ProxyImage implements Image{
	private String fileName;
	private RealImage service;
	
	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}
	public String getFileName(){
		return fileName;
	}

	@Override
	public void display() {
		if(service==null)
			service=new RealImage(fileName);
		service.display();
		
	}

}
