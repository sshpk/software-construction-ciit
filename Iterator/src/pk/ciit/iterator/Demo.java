package pk.ciit.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("BSE 7D");
		list.add("You are doing good");
		list.add("in Software Construction");
 
		Iterator<String> it = list.iterator();
		while(it.hasNext()){   
			String s = it.next();
			System.out.println(s);
		}
		
		System.out.println("Our TV has the following channels");
		TV tv = new ConcreteTV();
		pk.ciit.iterator.Iterator iterator = tv.getIterator();
		
		while(iterator.hasNext()){
			String channel = iterator.next();
			System.out.println(channel);
		}

	}

}
