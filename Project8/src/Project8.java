import java.util.Random;

import chapter20bst.jsjf.LinkedBSTOrderedSet;

public class Project8 {

	
	public static void main(String[] args) {
	
	Random rand = new Random();	

	Integer[] array1 = new Integer[20];
	Integer[] array2 = new Integer[20];
	
	for (int i=0; i<20; i++) {
		array1[i] = rand.nextInt(100);
		array2[i] = rand.nextInt(100);
	}

	System.out.println("Array 1 before sorting: ");
	for (int i=0; i<20; i++) {
		System.out.print(array1[i] + ", ");
	}
	Sorting.bstSort(array1);
	System.out.println("\nArray 1 after sorting: ");
	for (int i=0; i<20; i++) {
		System.out.print(array1[i] + ", ");
	}
	
	System.out.println("\n\nArray 2 before sorting: ");
	for (int i=0; i<20; i++) {
		System.out.print(array2[i] + ", ");
	}
	Sorting.bstSort(array2);
	System.out.println("\nArray 2 after sorting: ");
	for (int i=0; i<20; i++) {
		System.out.print(array2[i] + ", ");
	}
	
	System.out.println("\n\n");
	
	LinkedBSTOrderedSet orderedSet = new LinkedBSTOrderedSet();
	for (int i=0; i<15; i++) {
		Integer temp = rand.nextInt(19)+1;
		orderedSet.addElement(temp);
	}
	
	System.out.println("\nOrdered Set:\n" + orderedSet);
	System.out.println("Number of unique numbers: " + orderedSet.size());
	
	}
	
}
