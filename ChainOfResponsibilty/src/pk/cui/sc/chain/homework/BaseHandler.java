package pk.cui.sc.chain.homework;

public abstract class BaseHandler implements Handler{
	protected Handler next;
	protected final String name;
	public BaseHandler(String name){
		this.name = name;
	}
	public void setNext(Handler handler) {
		this.next = handler;
	}
	public String getName() {
		return name;
	}
}