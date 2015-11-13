package pk.ciit.mediator;

import java.util.ArrayList;
import java.util.List;

public class ApplicationMediator implements Mediator{
	List<Colleague> colleagues = new ArrayList<Colleague>();
	void addColleague(Colleague colleague){
		colleagues.add(colleague);
	}
	@Override
	public void send(String message, Colleague originator) {
		for (Colleague colleague:colleagues)
			if(colleague != originator)
				colleague.receive(message);
		
	}

}
