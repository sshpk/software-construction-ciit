
public class File implements IFile{

	private String name;
	public File(String name) {
		this.name = name;
	}
	@Override
	public void ls() {
		System.out.println(name);
		
	}

}
