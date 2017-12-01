import java.util.Iterator;

import chapter20bst.jsjf.LinkedBinarySearchTree;
import chapter20bst.jsjf.exceptions.ElementNotFoundException;

public class BSTExample {

	public static void main(String[] args) {
		LinkedBinarySearchTree<Integer> t = new LinkedBinarySearchTree<Integer>();
		LinkedBinarySearchTree<StudentRecord> s = new LinkedBinarySearchTree<StudentRecord>();
		
		for(int ii=0;ii<20;ii++) {
			t.addElement((int)(Math.random()*100));
		}
		
		s.addElement(new StudentRecord("Harrison Ford"));
		s.addElement(new StudentRecord("Mark Hamil"));
		s.addElement(new StudentRecord("Carrie Fisher"));
		s.addElement(new StudentRecord("Adam Driver"));
		s.addElement(new StudentRecord("Daisy Ridley"));
		s.addElement(new StudentRecord("John Boyega"));
		s.addElement(new StudentRecord("Oscar Isaac"));
		s.addElement(new StudentRecord("Lupita Nyong'o"));
		s.addElement(new StudentRecord("Andy Serkis"));
		s.addElement(new StudentRecord("Domhnall Gleeson"));
	
		System.out.println("Tree: " + t);
		System.out.println("Tree: " + s);

		System.out.println("Find 5: " + t.find(5));
		try {
			System.out.print("Find Mark Hamil: ");
			System.out.println(s.find(new StudentRecord("Mark Hamil")));
		}
		catch (ElementNotFoundException e) {
			System.out.println("Unable to find record!" );
		}
		try {
			System.out.print("Find William Shatner: ");
			System.out.println(s.find(new StudentRecord("William Shatner")));
		}
		catch (ElementNotFoundException e) {
			System.out.println("Unable to find record!" );
		}
		
		System.out.print("\nPre-Order: ");
		Iterator<Integer> preorder = t.iteratorPreOrder();
		while (preorder.hasNext()) {
			System.out.print(preorder.next() + " ");
		}
		
		System.out.print("\nIn-Order: ");
		Iterator<Integer> inorder = t.iteratorInOrder();
		while (inorder.hasNext()) {
			System.out.print(inorder.next() + " ");
		}		
		
		System.out.print("\nPost-Order: ");
		Iterator<Integer> postorder = t.iteratorPostOrder();
		while (postorder.hasNext()) {
			System.out.print(postorder.next() + " ");
		}

	}

}
