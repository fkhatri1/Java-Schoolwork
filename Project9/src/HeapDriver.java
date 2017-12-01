import csc205.Sorting;
import jsjf.HeapStack;
import jsjf.LinkedHeap;

public class HeapDriver {

	public static void main(String[] args) {
		HeapStack hs = new HeapStack();
		LinkedHeap mh = new LinkedHeap();
		String[] arr = new String[7];
		
		arr[0] = "This";
		arr[1] = "is";
		arr[2] = "my";
		arr[3] = "heaps";
		arr[4] = "project";
		arr[5] = "for";
		arr[6] = "CSC205";
		
		for (int i=0; i<arr.length; i++) {
			hs.push(arr[i]);
			mh.addElement(arr[i]);
		}
		
		Sorting.heapSort(arr);
		
		System.out.println("\nRemoving from the Min Heap: \n");
		while (mh.size()>0) {
			System.out.println("\t" + mh.removeMin());
		}
		
		System.out.println("\nRemoving from the HeapStack: \n");
		while (hs.size()>0) {
			System.out.println("\t" + hs.pop());
		}
		
		System.out.println("\nReading from the array: \n");
		for (String s : arr) {
			System.out.println("\t" + s);
		}

	}

}
