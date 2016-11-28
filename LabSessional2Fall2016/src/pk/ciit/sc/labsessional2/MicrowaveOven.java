package pk.ciit.sc.labsessional2;

public class MicrowaveOven implements HomeDevice{

	@Override
	public void switchOn() {
		System.out.println("microwave oven is switched on");
		
	}

	@Override
	public void switchOff() {
		System.out.println("microwave oven is switched off");
		
	}

}
