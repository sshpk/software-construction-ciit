package pk.ciit.toybuilder;

import pk.ciit.animals.Animal;

public class BuilderDemo {

	public static void main(String[] args) {
		Kid kid = new Kid("ali");
		AnimalBuilder kittenBuilder = new KittenBuilder();
		Animal kitten = kid.makeAimal(kittenBuilder);
		kitten.showMe();
		kitten.eat();
		
		AnimalBuilder monkeyBuilder = new MonkeyBuilder();
		Animal monkey = kid.makeAimal(monkeyBuilder);
		monkey.showMe();
		monkey.eat();

	}

}
