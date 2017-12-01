import java.util.Scanner;

public class interpolationSearch {

	public static void main(String[] args) {
		int data[] = {-100,-25,-23,-15,-1,0,2,3,5,10,17,100,230,393,520};
		Scanner scan = new Scanner(System.in);
		System.out.println("What's your target? -- ");
		int target = scan.nextInt();
		System.out.println("Target found at index: " + search(data, target, 0, data.length-1));
		scan.close();
	}

	public static int search(int[] data, int target, int first, int last) {
		
		if (target < data[first] || target > data[last]) {
			 System.out.println("Target out of range.");
			 return -1;
		}
		
		int mid = first + ((last - first) * (target - data[first]) / (data[last] - data[first]));
	
		if (first > last) {
			System.out.println("Target not found.");
		}
		else if (data[mid] == target) {
			return mid;
		}
		else if (data[mid] < target) {
			return search(data, target, mid+1, last);
			
		}
		else {
			return search(data, target, first, mid-1);	
		}
		return -1;
	}
		
	}

