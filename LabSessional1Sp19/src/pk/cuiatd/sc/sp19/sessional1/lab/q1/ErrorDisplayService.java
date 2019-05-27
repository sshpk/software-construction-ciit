package pk.cuiatd.sc.sp19.sessional1.lab.q1;

public class ErrorDisplayService extends DisplayService{
	@Override
	public XMLParser getParser() {
		return new ErrorXMLParser();
	}
}
