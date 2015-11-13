
public class ExceptionReporter {
	private static ExceptionReporter instance = new ExceptionReporter();
	private ExceptionReporter(){
		
	}
	public static ExceptionReporter getInstance(){
		if(instance == null)
			instance = new ExceptionReporter();
		return instance;
	}
	public void report(String className, String methodName, Exception exception){
		String message = 
				"Exception: " + exception.toString() + " occoured in " 
				+"\nClass: " +className
				+"\nMethod: " +methodName;
		System.out.println(message);
	}
}
