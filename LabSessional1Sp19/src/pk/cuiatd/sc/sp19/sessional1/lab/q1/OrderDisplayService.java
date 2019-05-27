package pk.cuiatd.sc.sp19.sessional1.lab.q1;

public class OrderDisplayService extends DisplayService{
	@Override
	public XMLParser getParser() {
		return new OrderXMLParser();
	}
}
