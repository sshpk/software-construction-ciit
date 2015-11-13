import java.util.ArrayList;
import java.util.List;

public class Directory implements IFile{
	String name;
	List<IFile> files;
	
	public Directory(String name) {
		this.name = name;
		files = new ArrayList<IFile>();
	}

	@Override
	public void ls() {
		System.out.println(name);
		for(IFile file:files)
			file.ls();
		
	}

	public void add(IFile file) {
		files.add(file);
		
	}
}
