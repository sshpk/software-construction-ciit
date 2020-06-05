package pk.cui.sc.ls2.state;

public class AggressiveBehavior implements Behavior{
	private String speech = "Grrrr, I am aggressive!!!!";
	@Override
	public String getSpeech() {
		return speech;
	}
}
