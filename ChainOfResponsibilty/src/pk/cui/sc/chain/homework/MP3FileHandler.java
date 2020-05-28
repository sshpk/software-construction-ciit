package pk.cui.sc.chain.homework;

public class MP3FileHandler extends BaseHandler{
	public MP3FileHandler(String name) {
		super(name);
	}
	public void handle(File file) {
		if(file.getType()==FileType.MP3){
			System.out.println("Processing and saving mp3 file... by "+name);
		}
		else if(next!=null){
			System.out.println(name+" fowards request to "+next.getName());
			next.handle(file);
		}else{
			System.out.println("File not supported");
		}

	}
}

