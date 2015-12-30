
public class Debugging {
	private static Prime prime = new Prime();
	public static void main(String args[]) {
//		for (int i = 0; i < 3; i++) {
//			System.out.print("Pass " + i + ": ");
//			for (int j = 0; j < 100; j++) {
//				if (j == 10)
//					break;
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
//		System.out.println("Loops complete.");
		for (int i = 2; i<10; i++){
			if(prime.isPrime(i)){
				System.out.println(i+" is prime");
			}
			else{
				System.out.println(i+" is not prime");
			}
		}
	}
}
