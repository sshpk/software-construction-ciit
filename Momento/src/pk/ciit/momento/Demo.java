package pk.ciit.momento;

public class Demo {
	public static void main(String[] args) {
		TextFileCaretaker caretaker = new TextFileCaretaker();
        
        TextEditor textEditor = new TextEditor("data.txt");
        textEditor.write("First Set of Data\n");
        System.out.println(textEditor+"\n\n");
         
        // lets save the file
       
        //now write something else
        textEditor.write("Second Set of Data\n");
        caretaker.save(textEditor);
        //checking file contents
        
        textEditor.write("Third Set of Data\n");
        System.out.println(textEditor+"\n\n");
 
        //lets undo to last save
        caretaker.undo(textEditor);
         
        //checking file content again
        System.out.println(textEditor+"\n\n");
	}
}
