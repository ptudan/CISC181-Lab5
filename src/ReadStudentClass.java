import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ReadStudentClass extends ReadAndWrite {
	ArrayList<Student> Class = new ArrayList<Student>();
	
	public ReadStudentClass(){
		super("ClassData.txt", "EnhancedClassData.txt");
	}

	@Override
	public void ReadFile(Scanner s) {
		int index = 0;
		while(s.hasNext()){
			Student stu = new Student(s.next(), s.next(),
					s.nextInt(), s.nextInt(), s.nextInt());
			Class.add(index, stu);
		}

	}
	
	private void SortStudent(){
		Collections.sort(Class, new Comparator<Student>() {
		    public int compare(Student s1, Student s2) {
		        if (s1.getGrade() > s2.getGrade())
		            return 1;
		        if (s1.getGrade() < s2.getGrade())
		            return -1;
		        return 0;
		    }
		});
	}

	@Override
	public String WriteString() {
		SortStudent();
		String ret = "";
		for(int i = 0; i<Class.size(); i++){
			ret += Class.get(i);
			ret += " ";
			ret += "\n";
		}
		return ret;
	}

}
