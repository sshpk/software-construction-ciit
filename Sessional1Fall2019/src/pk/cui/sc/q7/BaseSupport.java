package pk.cui.sc.q7;
import java.util.List;
import java.util.ArrayList;

public abstract class BaseSupport implements Support{
	protected Support next;
	protected List<String> queriesHandled=new ArrayList<String>();
	public void setNext(Support next){
		this.next=next;
	}
}
