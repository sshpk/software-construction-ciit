package pk.ciit.sessional1;

public class Penguin extends Bird {
	private int a;

	public Penguin() {
		a = 2;
	}

	@Override
	public void identify() {
		System.out.println("Penguin	#" + a + "	reporting	for	duty!");
	}

	public void shout() {
		System.out.println("Shouting	is	uncivilized...");
	}

	public void action(int times) {
		System.out.println("Swim	" + (times + getA()) + "	times!");
	}

	public void flyAround() {
		System.out.println("Sometimes	I	dream	I	can	fly	like	this:	");
		super.flyAround();
	}
}