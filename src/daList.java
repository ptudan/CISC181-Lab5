import java.util.ArrayList;
import java.util.Collection;

public interface daList {
	public void add(Object o);
	public void add(int i, Object o);
	public void addAll(Collection c);
	public void clear();
	public boolean contains(Object o);
	public Object get(int i);
	public int indexOf(Object o);
	public boolean isEmpty();
	public int lastIndexOf(Object o);
	public void remove(int i);
	public void remove(Object o);
	public void removeAll(Collection c);
	public void removeRange(int f, int t);
	public void retainAll(Collection c);
	public void set(int i, Object o);
	public int size();
	public ArrayList subList(int f, int t);
}
