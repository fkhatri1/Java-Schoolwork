import java.util.List;
import java.util.Random;

import cards.Deck;
import csc205.*;

public class Project7SampleDriver {

		public final static int LENGTH = 30;
		
		public static void main(String[] args) {
			Integer a[] = new Integer[LENGTH];

			a = generateRandomArray(LENGTH);

		    // Test sort()
		    System.out.println("Testing sort():");
		    System.out.print("Before sorting: ");
		    printArray(a);
		    Sorting.sort(a);
		    System.out.print("After sorting: ");
		    printArray(a);
		    testSortedArray(a);
		    System.out.println();

		    // test cutoff_qsort
			a = generateRandomArray(LENGTH);
		    System.out.println("Testing cutoff_sort():");
		    System.out.print("Before sorting: ");
		    printArray(a);
		    Sorting.cutoff_qsort(a);
		    System.out.print("After sorting: ");
		    printArray(a);
		    testSortedArray(a);
		    System.out.println();
		    
		    
		    // test cutoff_qsort with cutoff value
			a = generateRandomArray(LENGTH);
		    System.out.println("Testing cutoff_sort():");
		    System.out.print("Before sorting: ");
		    printArray(a);
		    Sorting.cutoff_qsort(a, 5);
		    System.out.print("After sorting: ");
		    printArray(a);
		    testSortedArray(a);
		    System.out.println();

		   
		    // find_nth() 
			a = generateRandomArray(LENGTH);
		    System.out.println("Testing find_nth():");
		    Integer first, fourth, thirtieth;
		    first = Sorting.find_nth(a, 1);
		    fourth = Sorting.find_nth(a, 4);
		    thirtieth = Sorting.find_nth(a, 30);
		    printArray(a);
		    testSortedArray(a);
		    System.out.println("1st: " + first);
		    System.out.println("4th: " + fourth);
		    System.out.println("30th: " + thirtieth);
		    
		
		    Integer[] list1 = {0, 2, 4, 5, 7, 9, 11};
		    System.out.println("\nTesting closest_pair():");
		    List<Integer> closest = Sorting.closest_pair(list1);
		    System.out.println("First test: " + closest);
		    Integer[] list2 = {0, 1, 4, 5, 7, 9, 15};
		    closest = Sorting.closest_pair(list2);
		    System.out.println("Second test: " + closest);
		    Integer[] list3 = {0, 2, 4, 6, 8, 10, 11};
		    closest = Sorting.closest_pair(list3);
		    System.out.println("Third test: " + closest);

		    System.out.println("\nTesting shuffle():");
			Deck d = new Deck(52);
			System.out.print("Before sorting: ");
			System.out.println(d);
			d.shuffle();
			System.out.print("After sorting:  ");
			System.out.println(d);

		}
		

		// ----------- Helper functions --------------
		public static void printArray(Object[] a) {
			for (int ii=0;ii<a.length;ii++) {
				System.out.print (a[ii] + " ");
			}
			System.out.println();
		}
		
		public static Integer[] generateRandomArray(int len) {
			Integer[] a = new Integer[len];
			Random rand = new Random();

		    for (int ii=0;ii<a.length;ii++) {
		    	a[ii] = rand.nextInt(1000);
		    }			
		    return a;
		}
		
		public static <T extends Comparable<T>>  
		void testSortedArray(T[] a) {
			if (Sorting.isSorted(a)) {
				System.out.println("The array is sorted!");
			}
			else {
				System.out.println("The array is NOT sorted!");
			}
		}
}

