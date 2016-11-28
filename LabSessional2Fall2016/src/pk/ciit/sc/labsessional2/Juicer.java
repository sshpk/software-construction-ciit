package pk.ciit.sc.labsessional2;

public class Juicer implements HomeDevice{

	@Override
	public void switchOn() {
		System.out.println("juicer is switched on");
		
	}

	@Override
	public void switchOff() {
		System.out.println("juicer is switched off");
		
	}

}