package pk.cui.sc.ls2.state;

public class RobotSimulator {
	public static void main(String[] args) {
		Robot robot1 = new Robot();
		//a robot is by default normal
		System.out.println("robot1: normal");
		robot1.speak();
		
		//change the behavior of robot1
		Behavior aggressive = new AggressiveBehavior();
		robot1.setBehavior(aggressive);
		System.out.println("==============");
		System.out.println("robot1: aggressive");
		robot1.speak();
		
		//create another robot and make it defensive
		Robot robot2 = new Robot();
		Behavior defensive = new DefensiveBehavior();
		robot2.setBehavior(defensive);
		System.out.println("==============");
		System.out.println("robot2: defensive");
		robot2.speak();
	}
}
