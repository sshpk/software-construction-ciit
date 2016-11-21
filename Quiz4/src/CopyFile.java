import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class CopyFile {
	public static void main(String args[]) throws IOException
	{
		BufferedReader in = null;
		BufferedWriter out = null;

		try {
			FileInputStream fIn = new FileInputStream("input.txt");
			in = new BufferedReader(new InputStreamReader(fIn)); 
			out = new BufferedWriter(new FileWriter("output.txt"));
			fIn.getChannel().position(0);
			String st= "";
			int recordCount = 0;
			fIn.getChannel().position(0);
			while ( (st = in.readLine()) != null  ){
				out.write(st);
				recordCount++;
			}
		}finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}
}