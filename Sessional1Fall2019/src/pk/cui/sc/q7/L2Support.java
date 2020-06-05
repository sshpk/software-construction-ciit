package pk.cui.sc.q7;

public class L2Support extends BaseSupport{
	public L2Support(){
		queriesHandled.add("how to run the project");
		queriesHandled.add("how to create a mapping file");
		queriesHandled.add("what should be installed to run the project");
	}

	@Override
	public void handle(Request request) {
		boolean handled = false;
		for(String query:queriesHandled){
			if(query.equals(request.getText())){
				request.setStatus("L2 solved it");
				handled=true;
			}
		}
		if(handled==false){
			if(next != null)
				next.handle(request);
			else
				System.out.println("can not help");
		}
	}
}
