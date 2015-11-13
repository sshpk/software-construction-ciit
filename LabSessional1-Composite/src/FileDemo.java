
public class FileDemo {
	public static void main(String[] args) {
		Directory dir1 = new Directory("dir1");
		Directory dir2 = new Directory("dir2");
		File a = new File("a");
		File b = new File("b");
		File c = new File("c");
		dir1.add(a);
		
		dir2.add(b);
		dir2.add(c);
		
		dir1.add(dir2);
		
		dir1.ls();
		
	}
}
