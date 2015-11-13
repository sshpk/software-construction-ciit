import java.util.Vector;

public class Aliasing {
	public static void main(String[] args) {
		Vector v = new Vector ();
		Vector k = v;
		String a = "bse 7d";
		v.add (a);
		k.add (a.toUpperCase());
		System.out.println (v.lastElement());
	
		
//		if (v == k)
//			System.out.println ("same");
//			else
//			System.out.println ("different");
		
		String x = null;
		System.out.println (x);
	
	}
}
