package pk.cui.sc.chain.homework;

public class File {
	private final String name;
	private final FileType type;
	private final String path;
	public File(String fileName, FileType type, String filePath){
		this.name = fileName;
		this.type = type;
		this.path = filePath;
	}
	public String getName() {
		return name;
	}
	public FileType getType() {
		return type;
	}
	public String getPath() {
		return path;
	}
}
