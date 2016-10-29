import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ReadDataClass extends ReadAndWrite {
	ArrayList<Double> Data = new ArrayList<Double>();
	
	public ReadDataClass(){
		super("ReadingNums.txt", "EnhancedReadingNums.txt");
	}
	
	private void sort(){
		Collections.sort(Data, new Comparator<Double>() {
		    @Override
		    public int compare(Double d1, Double d2) {
		        if (d1 > d2)
		            return 1;
		        if (d1 < d2)
		            return -1;
		        return 0;
		    }
		});
	}
	
	
	public void ReadFile(Scanner s) {
		//s.useDelimiter(", "); //comeback and fix commas
		while(s.hasNext()){
				Double temp = new Double(s.nextDouble());
				Data.add(temp);
		}
		

	}

	@Override
	public String WriteString() {
		sort();
		String ret = "";
		for(int i = 0; i<Data.size(); i++){
			ret += Data.get(i);
			ret += " ";
			ret += "\n";
		}
		return ret;
		
	}

}
