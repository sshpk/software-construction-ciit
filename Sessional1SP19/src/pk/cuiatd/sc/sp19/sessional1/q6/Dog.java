package pk.cuiatd.sc.sp19.sessional1.q6;

public class Dog extends Animal {
	private int count;
	public Dog() {
		count = 2;
	}
	void makeSound() {
		System.out.println("Woof");
	}
	public int getCount() {
		return count;
	}
	public void incrementCount(){
		++count;
	}
	void identifyYourself() {
		System.out.println("Dog Nr. "+count+" reports for duty");

	}
	public void walk(){
		System.out.println("Dog::I am walking");
	}
	void eatBones(int howMuch){
		System.out.println("Yum! I am eating "+howMuch+" bones");
	}
}