import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public abstract class ReadAndWrite {
	private String fn;
	private String wn;
	
	public ReadAndWrite(String f, String w){
		fn = f;
		wn = w;
	}
	
	public abstract void ReadFile(Scanner s);
	public abstract String WriteString();
	
	public void OpenForReading(){
		File openFile = new File(fn);
		try {
			Scanner s = new Scanner(openFile);
			ReadFile(s);
			s.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void OpenForWriting(){
		File openFile = new File(wn);
		if(!openFile.exists()){
			try {
				openFile.createNewFile();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		String add = WriteString();
		
		try {
			PrintStream p = new PrintStream(openFile);
			p.println(add);
			p.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
