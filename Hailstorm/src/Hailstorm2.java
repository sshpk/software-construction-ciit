
public class Hailstorm2 {
	public static void main(String[] args) {
		int[] a = new int[100]; // <==== DANGER
		int i = 0;
		int n = 7;
		while (n != 1) {
			a[i] = n;
			i++; // very common shorthand for i=i+1
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n = 3 * n + 1;
			}
		}
		a[i] = n;

		for (i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
			if (i % 10 == 9)
				System.out.println();
		}
	}

}
