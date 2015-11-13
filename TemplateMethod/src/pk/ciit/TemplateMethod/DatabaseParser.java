package pk.ciit.TemplateMethod;

public class DatabaseParser extends DataParser {
	@Override
    void readData() {
        System.out.println("Reading data from database");
    }
	@Override
	void processData() {
        System.out.println("Looping through datasets");    
    }
}