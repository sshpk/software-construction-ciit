package pk.ciit.sc.labsessional2;

public class Light implements HomeDevice{

	@Override
	public void switchOn() {
		System.out.println("light is switched on");
		
	}

	@Override
	public void switchOff() {
		System.out.println("light is switched off");
		
	}

}
