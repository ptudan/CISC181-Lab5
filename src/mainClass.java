import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		
		//Problem 2
//		ReadStudentClass testing1 = new ReadStudentClass();
//		testing1.OpenForReading();
//		testing1.OpenForWriting();
//		
//		ReadDataClass testing2 = new ReadDataClass();
//		testing2.OpenForReading();
//		testing2.OpenForWriting();
		
		//Problem 3
		File f1 = new File("JackBeanstalk.txt");
		File f2 = new File("JackBeanstalk.html");
		try {
			Scanner r = new Scanner(f1);
			try {
				PrintStream p = new PrintStream(f2);
				p.println("<!doctype html>");
				p.println("<html>");
				p.println("<head>");
				p.println("<meta charset=\"utf-8\">");
				p.println("<title>My Web Page</title>");
				p.println("</head>");
				p.println("<body>");
				p.println("<h1>"+r.nextLine()+"</h1>");
				while(r.hasNext()){
					String temp = r.nextLine();
					String temp2 = temp.toUpperCase();
					if(temp.compareTo(temp2)==0){
						p.println("<h2>");
						p.println(temp);
						p.println("</h2>");
					}
					else{
						p.println("<p>");
						p.println(temp);
						p.println("</p>");
					}
				}
				p.println("</body>");
				p.println("</html>");
				p.close();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		r.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try{
			Desktop.getDesktop().browse(f2.toURI());
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
	

	}

}
