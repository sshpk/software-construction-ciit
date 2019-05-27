package pk.cuiatd.sc.sp19.sessional1.q6;

public class Program { 
	public static void act1() {
		//Animal a = new Animal();
		//a.identifyYourself();
	}
	public static void act2() {
		Animal a = new Dog();
		a.identifyYourself();
	}
	public static void act3() {
		Animal a = new Dog();
		a.makeSound();
	}
	public static void act4() {
		//Animal a = new Dog();
		//a.eatBones(4);
	}
	public static void act5() {
		act3();
		Animal a = new Dog();
		a.walk();
	}
	public static void act6() {
		Dog a = new Dog();
		a.identifyYourself();
	}
}