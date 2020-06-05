package pk.cui.sc.q7;

public class Demo {
	public static void main(String[] args) {
		Support l1=new L1Support();
		Support l2=new L2Support();
		l1.setNext(l2);
		
		Request request = new Request("how to run the project");
		l1.handle(request);
		System.out.println(request.getStatus());
		
		request = new Request("what is the fee");
		l1.handle(request);
		System.out.println(request.getStatus());
	}

}
