package pk.cui.sc.chain.homework;

public class TextFileHandler extends BaseHandler{

	public TextFileHandler(String name) {
		super(name);
	}
	public void handle(File file) {
		if(file.getType()==FileType.TXT){
			System.out.println("Processing and saving txt file... by "+name);
		}
		else if(next!=null){
			System.out.println(name+" fowards request to "+next.getName());
			next.handle(file);
		}else{
			System.out.println("File not supported");
		}

	}
}
