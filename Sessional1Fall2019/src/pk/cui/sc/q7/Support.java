package pk.cui.sc.q7;

public interface Support {
	public void setNext(Support support);
	public void handle(Request request);
}
