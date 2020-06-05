package pk.cui.sc.memento;

import java.util.HashMap;
import java.util.Map;
public class CareTaker {
	private final Map<String, Object>savepointStorage = new HashMap<String, Object>();
	public void saveMemento(Object memento,String savepointName){
		System.out.println("Saving state..."+savepointName);
		savepointStorage.put(savepointName, memento);
	}
	public Object getMemento(String savepointName){
		System.out.println("Undo at ..."+savepointName);
		return savepointStorage.get(savepointName);
	}
	public void clearSavepoints(){
		System.out.println("Clearing all save points...");
		savepointStorage.clear();
	}
}
