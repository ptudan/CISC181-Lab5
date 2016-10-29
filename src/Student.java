
public class Student {
	private String first;
	private String last;
	private int labGrade;
	private int projGrade;
	private int examGrade;
	private int totalGrade;
	
	public Student(String f, String l, int lab, int proj, int exam){
		first = f;
		last = l;
		labGrade = lab;
		projGrade = proj;
		examGrade = exam;
		totalGrade = lab + proj + exam;
	}
	
	public int getGrade(){
		return totalGrade;
	}
	
	public String toString(){
		return(last + ", " + first + " Grade:" + totalGrade);
	}
	
}
