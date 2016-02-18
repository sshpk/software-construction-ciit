package pk.edu.ciit.calc;

import java.io.File;

public class CalculatorApp {
	static Calculator calc = new Calculator();
	public static final int STATUS_ERROR =0;
	public static final int STATUS_SUCCESS = 1;

	public static void main(String[] args) {
		int a= 10, b=20;
		System.out.println(calc.add(a, b));

	}

	public void openFile( File inputFile, int status ){
		String errorType;
		if(status == STATUS_SUCCESS){
			String fileData = readFile( inputFile, status );
			if (status == STATUS_SUCCESS){
				String summaryData = summarizeFileData( fileData, status );
				if (status == STATUS_SUCCESS){
					printSummary( summaryData );
					saveSummaryData( summaryData, status );
					if (status == STATUS_SUCCESS){
						updateAllAccounts();
						eraseUndoFile();
						errorType = "None ";
					}
					else{
						errorType = "Summary save error";
					}
				}
				else{
					errorType = " Data Summary Error ";
				}
			}
			else{
				errorType = "File Read Error";
			}
		}
	}

	private void eraseUndoFile() {
		// TODO Auto-generated method stub
		
	}

	private void updateAllAccounts() {
		// TODO Auto-generated method stub
		
	}

	private void saveSummaryData(String summaryData, int status) {
		// TODO Auto-generated method stub
		
	}

	private void printSummary(String summaryData) {
		// TODO Auto-generated method stub
		
	}

	private String summarizeFileData(String fileData, int status) {
		// TODO Auto-generated method stub
		return null;
	}

	private String readFile(File inputFile, int status) {
		// TODO Auto-generated method stub
		return null;
	}


}
