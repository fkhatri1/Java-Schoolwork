import java.util.Random;

import csc205.Sorting;
import jsjf.HeapStack;

public class HeapTester {


	public static void main(String[] args) {
		HeapStack stack = new HeapStack();
		stack.push("a");
		stack.push("b");
		stack.push("c");
		stack.push("e");
		stack.push("f");
		stack.push("g");
		stack.push("h");
		stack.push("i");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		Random rand = new Random();
		
		Integer[] data = new Integer[20];
		for (int i=0; i<data.length; i++) {
			data[i] = rand.nextInt(20) + 1;  //random int between 1-20
		}
		System.out.println("\nBefore sort: ");
		for (Integer i : data) {
			System.out.print(i + ", ");
		}
		
		Sorting.heapSort(data);
		System.out.println("\nAfter sort: ");
		for (Integer i : data) {
			System.out.print(i + ", ");
		}

	}

}
