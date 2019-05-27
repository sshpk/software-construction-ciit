package pk.cuiatd.sc.sp19.sessional1.q8;

public class DatabaseConnection {
	private static DatabaseConnection INSTANCE = 
			new DatabaseConnection();
	private DatabaseConnection(){
		System.out.println("Connected to the database ...");
	}
	public static DatabaseConnection getInstance(){
		return INSTANCE;
	}
	public void executeQuery(String query){
		System.out.println("Executing query... \n"+query);
	}
	
}
