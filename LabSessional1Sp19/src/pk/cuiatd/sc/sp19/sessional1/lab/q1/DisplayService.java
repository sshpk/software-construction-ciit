package pk.cuiatd.sc.sp19.sessional1.lab.q1;

public abstract class DisplayService {
	protected XMLParser parser;
	public void display(){
		XMLParser parser = getParser();
		String msg = parser.parse();
		System.out.println(msg);
	}
	protected abstract XMLParser getParser();
}
