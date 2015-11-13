package pk.ciit.TemplateMethod;

abstract public class DataParser {
    //Template method
    public void parseDataAndGenerateOutput(){
        readData();
        processData();
        writeData();
    }
    //These methods will be implemented by its subclass
    abstract void readData();
    abstract void processData();

    /** We have to write output in a CSV file 
    this step will be same for all subclasses */
    public void writeData(){
        System.out.println("Output generated, writing to CSV");
    }
}
