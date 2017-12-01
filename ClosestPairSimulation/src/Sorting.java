// The methods in this package are adapted from the code provided with:
//   Java Foundations (2nd & 3rd ed) by  Lewis, DePasquale, & Chase
//   Algorithms (4th ed) by Sedgewick & Wayne



import java.util.ArrayList;
import java.util.List; 

public class Sorting {

	// Helper methods
	// These operations will occur multiple times in our sorting methods,
	//   so we add methods for them here

	private static <T extends Comparable<T>> boolean less_than(T a, T b) {
		return (a.compareTo(b) < 0);
	}
	private static <T extends Comparable<T>> boolean less_than_equal(T a, T b) {
		return (a.compareTo(b) <= 0);
	}
	private static <T extends Comparable<T>> boolean greater_than(T a, T b) {
		return (a.compareTo(b) > 0);
	}
	private static void swap(Object[] a, int ii, int jj) {
		Object swap = a[ii];
		a[ii] = a[jj];
		a[jj] = swap;
	}
	public static <T extends Comparable<T>> 
	boolean isSorted(T[]data){
		return isSorted(data, 0, data.length-1);
	}
	public static <T extends Comparable<T>> 
	boolean isSorted(T[]data, int min, int max){
		for (int ii=min+1; ii<=max; ii++) {
			if (less_than(data[ii], data[ii-1]))
				return false;
		}
		return true;
	}



    
	public static ArrayList<Integer> mergePair(Integer[] data, int min, int max) {
		if (min < max)
		{
			int mid = min + ((max - min) / 2);
			mergePair(data, min, mid);
			mergePair(data, mid+1, max);
			return merge(data, min, mid, max);
		}
		else {
			return null;
		}
	}
	
	private static ArrayList<Integer> merge(Integer[] data, int first, int mid, int last) {
		Integer[] temp = new Integer[data.length];
		ArrayList<Integer> results = new ArrayList<Integer>();	
		results.add(data[first]);
		results.add(data[first+1]);
		int smallestDiff = Math.abs(data[first+1]-data[first]);
		
		// The two subarrays have already been sorted
		int first1 = first, last1 = mid;   // endpoints of first subarray
		int first2 = mid+1, last2 = last;  // endpoints of second subarray
		int index = first1;  // next index open in temp array
		
		//  Copy smaller item from each subarray into temp until one
		//  of the subarrays is exhausted
		while (first1 <= last1 && first2 <= last2)
		{
			if (less_than(data[first1],data[first2]))
			{
				temp[index] = data[first1];
				if (index !=0) { //need at least 2 elements to compare
					if (temp[index-1] != null) {  //merge may not have gotten to the previous element yet
						if (Math.abs(temp[index]-temp[index-1]) < smallestDiff) { 
						smallestDiff = Math.abs(temp[index]-temp[index-1]);
		            	results.clear();
		                results.add(temp[index-1]);	              
		        		results.add(temp[index]);
						}
					}
				}
				first1++;
			}
			else
			{
				temp[index] = data[first2];
				if (index !=0) {
					if (temp[index-1] != null) {
						if (Math.abs(temp[index]-temp[index-1]) < smallestDiff) {
						smallestDiff = Math.abs(temp[index]-temp[index-1]);
		            	results.clear();
		                results.add(temp[index-1]);	              
		        		results.add(temp[index]);
						}
					}
				}
				first2++;
			}
			index++;
		}
		
		//  Copy remaining elements from first subarray, if any
		while (first1 <= last1)
		{
			temp[index] = data[first1];
			if (index !=0) {
				if (temp[index-1] != null) {
					if (Math.abs(temp[index]-temp[index-1]) < smallestDiff) {
					smallestDiff = Math.abs(temp[index]-temp[index-1]);
	            	results.clear();
	                results.add(temp[index-1]);	              
	        		results.add(temp[index]);
					}
				}
			}
			first1++;
			index++;
		}
		
		//  Copy remaining elements from second subarray, if any
		while (first2 <= last2)
		{
			temp[index] = data[first2];
			if (index !=0) {
				if (temp[index-1] != null) {
					if (Math.abs(temp[index]-temp[index-1]) < smallestDiff) {
					smallestDiff = Math.abs(temp[index]-temp[index-1]);
	            	results.clear();
	                results.add(temp[index-1]);	              
	        		results.add(temp[index]);
					}
				}
			}
			first2++;
			index++;
		}
		
		//  Copy merged data into original array
		for (index = first; index <= last; index++) {
			data[index] = temp[index];
		}
		return results;
	}
	

	public static <T extends Comparable<T>> 
	void quickSort(T[] data) {
		quickSort(data, 0, data.length-1);
	}

	private static <T extends Comparable<T>> 
	void quickSort(T[] data, int min, int max) {
		if (min < max)
		{
			// create partitions
			int indexofpartition = partition(data, min, max);
			
			// sort the left partition (lower values)
			quickSort(data, min, indexofpartition - 1);
			
			// sort the right partition (higher values)
			quickSort(data, indexofpartition + 1, max);
		}
	}

	private static <T extends Comparable<T>> 
	int partition(T[] data, int min, int max) {
		T partitionelement;
		int left, right;
		int middle = min + ((max - min) / 2);
		
		// use the middle data value as the partition element
		partitionelement = data[middle];
		// move it out of the way for now
		swap(data, middle, min);
		
		left = min;
		right = max;
		
		while (left < right)
		{
			// search for an element that is > the partition element
			while (left < right && less_than_equal(data[left],partitionelement))
				left++;
			
			// search for an element that is < the partition element
			while (greater_than(data[right], partitionelement))
				right--;
			
			// swap the elements
			if (left < right)
				swap(data, left, right);
		}
		
		// move the partition element into place
		swap(data, min, right);
		
		return right;
	}


	public static List<Integer> bubblePair(Integer[] data) {
		ArrayList<Integer> results = new ArrayList<Integer>();
		
		int position, scan;
		results.add(data[0]);
		results.add(data[1]);
		int smallestDiff = Math.abs(data[1]-data[0]);
        
		int min = 0;
		int max = data.length-1;
		
        // position is the "stopping point" for each pass
        for (position = max; position >= min; position--)
        {
            for (scan = 0; scan < position; scan++)
            {
                if (greater_than(data[scan],data[scan+1]))
                    swap(data, scan, scan + 1);
                
                if (Math.abs(data[scan+1]-data[scan]) <= smallestDiff) {  //<= so we get the smallest closest pair
                    smallestDiff = Math.abs(data[scan+1]-data[scan]);
                	results.clear();
	                results.add(data[scan]);	              
	        		results.add(data[scan+1]);
                }
            }
        }
        return results;
	}
	
	public static List<Integer> quickPair(Integer[] data) {
		quickSort(data);
		ArrayList<Integer> results = new ArrayList<Integer>();
		int smallestDiff = Math.abs(data[1]-data[0]);
		results.add(data[0]);
		results.add(data[1]);
		for (int i=2; i<data.length;i++) {
			if (Math.abs(data[i]-data[i-1]) < smallestDiff) {
				smallestDiff = Math.abs(data[i]-data[i-1]);
            	results.clear();
                results.add(data[i-1]);	              
        		results.add(data[i]);
			}
		}
		return results;
		
	}
	
}
