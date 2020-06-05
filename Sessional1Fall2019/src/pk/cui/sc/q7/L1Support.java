package pk.cui.sc.q7;

public class L1Support extends BaseSupport{
	public L1Support(){
		queriesHandled.add("where can I download the file");
		queriesHandled.add("how much time it will take to learn");
		queriesHandled.add("what is the fee");
	}

	@Override
	public void handle(Request request) {
		boolean handled = false;
		for(String query:queriesHandled){
			if(query.equals(request.getText())){
				request.setStatus("L1 solved it");
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
