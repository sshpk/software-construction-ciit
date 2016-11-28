package pk.ciit.sc.labsessional2;

public class ElectricKettle implements HomeDevice{

	@Override
	public void switchOn() {
		System.out.println("kettle is switched on");
		
	}

	@Override
	public void switchOff() {
		System.out.println("kettle is switched off");
		
	}

}