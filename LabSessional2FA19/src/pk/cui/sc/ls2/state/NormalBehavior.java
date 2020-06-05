package pk.cui.sc.ls2.state;

public class NormalBehavior implements Behavior{
	private String speech = "Good morning. I am normal";
	@Override
	public String getSpeech() {
		return speech;
	}

}
