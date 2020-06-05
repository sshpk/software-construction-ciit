package pk.cui.sc.strategy;

public class LowerTextFormatter implements TextFormatter{
	@Override
	public void format(String text) {
		System.out.println("[LowerTextFormatter]: "+text.toLowerCase());
	}
}
