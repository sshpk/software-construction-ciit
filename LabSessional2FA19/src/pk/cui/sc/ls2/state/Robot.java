package pk.cui.sc.ls2.state;

public class Robot {
	private Behavior behavior = new NormalBehavior();
	public void setBehavior(Behavior behavior){
		this.behavior = behavior;
	}
	public void speak(){
		System.out.println(behavior.getSpeech());
	}
}
