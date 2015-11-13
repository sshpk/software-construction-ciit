package exceptions;

public class Demo {

	public static void main(String Args[]){
		int[] array = new int[3];
		try{
			for(int i=0;i<3;++i){
				array[i] = i;
				System.out.println(array[i]);
			}
			array[0] = 10/0;
		}
		catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		catch(Exception e){
			System.out.println("An unknown error has occoured");
		}
		finally{
			System.out.println("inside the finally block");
		}
	}
}

