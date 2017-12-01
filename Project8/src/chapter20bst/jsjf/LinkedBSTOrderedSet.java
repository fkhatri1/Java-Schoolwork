package chapter20bst.jsjf;

import java.util.Iterator;

import chapter20bst.jsjf.exceptions.ElementNotFoundException;
import chapter20bst.jsjf.exceptions.EmptyCollectionException;

public class LinkedBSTOrderedSet<T> extends LinkedBinarySearchTree<T> implements OrderedSet<T> {

	
	public void addElement(T element) {
		if (!contains(element)) {
			super.addElement(element);
		}
	}

	
	public T removeElement(T targetElement) throws ElementNotFoundException {
		return super.removeElement(targetElement);
	}

	
	public T findMin() throws EmptyCollectionException {
		return super.findMin();
	}

	
	public T find(T targetElement) throws EmptyCollectionException {
		if (this.size() > 0) {
			return super.find(targetElement);	
		}
		else
			return null;
	}

	
	public T findMax() throws EmptyCollectionException {
		return super.findMax();
	}
	
	public boolean contains(T targetElement) {
		if (this.size() > 0) {
			T temp = null;
			temp = find(targetElement);
			if (temp != null) {
				return true;
			}
			else {
				return false;
			}
		}
		else
		{
			return false;
		}
	}
	

	public String toString() {
		return super.toString();
	}
	
	public Iterator<T> iterator() {
		return super.iteratorInOrder();
	}
	
	
	
}
