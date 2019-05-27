package pk.cuiatd.sc.sp19.sessional1.q8;

public class Demo {

	public static void main(String[] args) {
		DatabaseConnection connection = 
				DatabaseConnection.getInstance();
		connection.executeQuery("SELECT * FROM STUDENTS");
	}

}
