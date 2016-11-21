package pk.ciit.ad;

public class AdapterDemo {

	public static void main(String[] args) {
		SocketAdapter adapter = 
				new SocketAdapterImpl();
		
		//240 volts required
		Volt output = adapter.get240Volts();
		System.out.println("the output is "+output.getVolts());
		
		//10 volts required
		output = adapter.get10Volts();
		System.out.println("the output is "+output.getVolts());

		//3 volts required
		output = adapter.get3Volts();
		System.out.println("the output is "+output.getVolts());

	}

}
