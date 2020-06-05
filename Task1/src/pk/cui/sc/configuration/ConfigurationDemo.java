package pk.cui.sc.configuration;

public class ConfigurationDemo {

	public static void main(String[] args) {
		Configuration config = Configuration.getInstance();
		
		config.writeConfiguration("server", "localhost");
		//config.writeConfiguration("database", "myDB");
		//config.writeConfiguration("password", "123");
		
		
		System.out.println(config.readConfiguration("server"));
		//System.out.println(config.readConfiguration("database"));
	}

}
