package pk.ciit.momento;

public class TextFileCaretaker {
	private Object obj;
    
    public void save(TextEditor textEditor){
        this.obj=textEditor.save();
    }
     
    public void undo(TextEditor textEditor){
    	textEditor.undoToLastSaved(obj);
    }
}
