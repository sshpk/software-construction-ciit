package pk.cuiatd.sc.sp19.sessional1.lab.q1;

public class ErrorXMLParser implements XMLParser{
	@Override
	public String parse() {
		System.out.println("Parsing error XML...");
		return "Error XML Message";
	}
}