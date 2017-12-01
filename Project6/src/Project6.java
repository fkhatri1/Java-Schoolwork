import jsjf.LinkedQueue;
import jsjf.LinkedStack;

public class Project6 {

	public static void main(String[] args) {
		LinkedQueue<LinkedStack<String>> qOfStacks = new LinkedQueue<LinkedStack<String>>();
		
		LinkedStack<String> abc = new LinkedStack<String>();
		abc.push("A");
		abc.push("B");
		abc.push("C");
		
		LinkedStack<String> pqr = new LinkedStack<String>();
		pqr.push("P");
		pqr.push("Q");
		pqr.push("R");
		
		LinkedStack<String> xyz = new LinkedStack<String>();
		xyz.push("X");
		xyz.push("Y");
		xyz.push("Z");
		
		qOfStacks.enqueue(abc);
		qOfStacks.enqueue(pqr);
		qOfStacks.enqueue(xyz);
		
		
		System.out.println("Beginning contents of queue of stacks:\n" + qOfStacks);
		System.out.println("\n\tPopping stack at front of queue: " + qOfStacks.first().pop());
		System.out.println("\tNow at the top of the front of the queue: " + qOfStacks.first().peek());
		System.out.println("\tMoving the front to the back of the queue...");
		qOfStacks.enqueue(qOfStacks.dequeue());
		System.out.println("\nEnding contents of queue of stacks:\n" + qOfStacks);

	}

}
