package pk.cui.sc.q7;

public class Request {
	private String text=null;
	private String status=null;
	public Request(String text){
		this.text=text;
	}
	public String getText() {
		return text;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
