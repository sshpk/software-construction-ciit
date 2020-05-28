package pk.cui.sc.chain.homework;

public class Demo {
	public static void main(String[] args){
		
		Handler textHandler = new TextFileHandler("Notepad++");
		Handler docHandler = new DocFileHandler("MS Word");
		Handler pdfHandler = new PDFFileHandler("Adobe Acrobat");
		Handler mp3Handler = new MP3FileHandler("VLC Media Player");
	
		textHandler.setNext(docHandler);
		docHandler.setNext(pdfHandler);
		pdfHandler.setNext(mp3Handler);
		
		File file = null;
		file = new File("Abc.doc", FileType.DOC, "C:");
		textHandler.handle(file);
		System.out.println("--------------------------");
		file = new File("Def.pdf", FileType.PDF, "C:");
		textHandler.handle(file);
		System.out.println("--------------------------");
		file = new File("Ghi.txt", FileType.TXT, "C:");
		textHandler.handle(file);
		System.out.println("--------------------------");
		file = new File("Jkl.mp3", FileType.MP3, "C:");
		textHandler.handle(file);
		System.out.println("--------------------------");
		file = new File("Mno.gif", FileType.GIF, "C:");
		textHandler.handle(file);
	}
}
