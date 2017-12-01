//Faysal Khatri
package bag;
import java.util.ArrayList;
import java.util.Iterator;

public class MyBag<T> implements Bag<T> {

	private ArrayList<T> mybag;
	
	public MyBag() {
		mybag = new ArrayList<T>();
	}

	@Override
	public Iterator<T> iterator() {
		return mybag.iterator();
	}

	@Override
	public boolean isEmpty() {
		return (this.size()==0);
	}

	@Override
	public int size() {
		return mybag.size();
	}

	@Override
	public void add(T item) {
		mybag.add(item);
	}

	@Override
	public String toString() {
		String bagContents = "";
		for (T item : mybag) {
			bagContents += item;
			bagContents += ", ";
		}
		bagContents = bagContents.substring(0, bagContents.length()-2);
		return bagContents;
	}

}
