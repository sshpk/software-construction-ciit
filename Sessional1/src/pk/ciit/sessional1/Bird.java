package pk.ciit.sessional1;

public abstract class Bird {
	protected int a = 1;

	public abstract void identify();

	protected void shout() {
		System.out.println("Kaw-Kaw");
	}

	public void action() {
		System.out.println("Fear	me	" + this.a + "	times");
	}

	public void flyAround() {
		System.out.println("Wooooosh,	I	am	a	");
		identify();
		shout();
		System.out.println("You	should	");
		action();
	}

	protected int getA() {
		return a;
	}

	protected void addToA() {
		a++;
	}
}
