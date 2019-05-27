package pk.cuiatd.sc.sp19.sessional1.q6;

public abstract class Animal {
	protected int count = 1;
	abstract void makeSound();
	abstract void identifyYourself();
	public void action() {
		System.out.println("Fear me" + this.count + " times");
	}
	public void walk(){
		System.out.println("Animal::I am walking");
	}
	public int getCount() {
		return count;
	}
	public void incrementCount(){
		++count;
	}
}