package pk.cui.sc.ls2.state;

public class DefensiveBehavior implements Behavior{
	private String speech = "Phew, please don’t say anything. I am defensive!";
	@Override
	public String getSpeech() {
		return speech;
	}
}