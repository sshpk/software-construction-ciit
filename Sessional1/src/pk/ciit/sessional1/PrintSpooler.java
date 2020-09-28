package pk.ciit.sessional1;

public class PrintSpooler {
	private PrintSpooler() {}

	
	private static PrintSpooler instance = new PrintSpooler();
	 

	public static PrintSpooler getInstance() {
		return instance;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}

