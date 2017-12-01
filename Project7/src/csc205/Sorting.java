// The methods in this package are adapted from the code provided with:
//   Java Foundations (2nd & 3rd ed) by  Lewis, DePasquale, & Chase
//   Algorithms (4th ed) by Sedgewick & Wayne

package csc205;

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

	// Selection Sort
	public static <T extends Comparable<T>> 
		void selectionSort (T[] data) {
		selectionSort (data, 0, data.length-1);
	}

	public static <T extends Comparable<T>> 
		void selectionSort (T[] data, int min, int max) {

		int indexOfSmallest;  // Smallest element found this pass
		
		min = Math.max(min, 0);
		max = Math.min(max, data.length-1);
		
		// ii is the starting point for each pass
		for(int ii=min; ii <= max; ii++ ) {
            indexOfSmallest = ii;
            for (int scan=ii+1; scan<=max; scan++) {
            	if (less_than(data[scan], data[indexOfSmallest])) {
            		indexOfSmallest = scan;
            	}
            }
            swap(data, indexOfSmallest, ii);
		}

	}
	
    public static <T extends Comparable<T>> 
	void insertionSort(T[] data) {
    	insertionSort(data, 0, data.length-1);
    }

    public static <T extends Comparable<T>> 
	void insertionSort(T[] data, int min, int max)
    {
    	int start = Math.max(min,  1);
    	int end = Math.min(max,  data.length-1);
    	
        for (int index = start; index < end; index++)
        {
            T key = data[index];
            int position = index;
			
            // shift larger values to the right 
            while (position > 0 && greater_than(data[position-1],key))
            {
                data[position] = data[position-1];
                position--;
            }
			
            data[position] = key;
        }
    }

    public static <T extends Comparable<T>> 
	void bubbleSort(T[] data) {
    	bubbleSort(data, 0, data.length-1);
    }
    public static <T extends Comparable<T>> 
	void bubbleSort(T[] data, int min, int max) {
        int position, scan;
        
		min = Math.max(min, 0);
		max = Math.min(max, data.length-1);
		
        // position is the "stopping point" for each pass
        for (position = max; position >= min; position--)
        {
            for (scan = 0; scan < position; scan++)
            {
                if (greater_than(data[scan],data[scan+1]))
                    swap(data, scan, scan + 1);
            }
        }
    }

    
	public static <T extends Comparable<T>>
	void mergeSort(T[] data) {
		mergeSort(data, 0, data.length-1);
	}

	private static <T extends Comparable<T>>
	void mergeSort(T[] data, int min, int max) {
		if (min < max)
		{
			int mid = min + ((max - min) / 2);
			mergeSort(data, min, mid);
			mergeSort(data, mid+1, max);
			merge(data, min, mid, max);
		}
	}
	
	private static <T extends Comparable<T>>
	void merge(T[] data, int first, int mid, int last) {
		T[] temp = (T[])(new Object[data.length]);
		
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
				first1++;
			}
			else
			{
				temp[index] = data[first2];
				first2++;
			}
			index++;
		}
		
		//  Copy remaining elements from first subarray, if any
		while (first1 <= last1)
		{
			temp[index] = data[first1];
			first1++;
			index++;
		}
		
		//  Copy remaining elements from second subarray, if any
		while (first2 <= last2)
		{
			temp[index] = data[first2];
			first2++;
			index++;
		}
		
		//  Copy merged data into original array
		for (index = first; index <= last; index++)
			data[index] = temp[index];
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

	// Project 7
	public static <T extends Comparable<T>> 
	void sort(T[] data) {
		quickSort(data);
	}
	
	
	public static <T extends Comparable<T>> 
	void cutoff_qsort(T[] data) {
		cutoff_qsort(data, 0, data.length-1, 6);
	}
	
	private static <T extends Comparable<T>> 
	void cutoff_qsort(T[] data, int min, int max, int cutoff) {
		if (min < max && ((max-min) > cutoff))
		{
			// create partitions
			int indexofpartition = partition(data, min, max);
			
			// sort the left partition (lower values)
			cutoff_qsort(data, min, indexofpartition - 1, cutoff);
			
			// sort the right partition (higher values)
			cutoff_qsort(data, indexofpartition + 1, max, cutoff);
		}
		else if (min < max)
		{
			// call bubble sort for arrays of length 5 or less
			bubbleSort(data, min, max);
		}
	}

	public static <T extends Comparable<T>> 
	void cutoff_qsort(T[] data, int cutoff) {
		cutoff_qsort(data, 0, data.length-1, cutoff);
	}

	
	public static <T extends Comparable<T>> 
	T find_nth(T[] data, int n) {
		//selectionSortnth (data, 0, data.length-1, n-1);
		return quickSortNth(data, 0, data.length-1, n-1);
	}

	
	public static <T extends Comparable<T>> 
	void selectionSortnth (T[] data, int min, int max, int n) {

		int indexOfSmallest;  // Smallest element found this pass
		
		min = Math.max(min, 0);
		max = Math.min(max, data.length-1);
		
		// ii is the starting point for each pass
		for(int ii=min; ii <= n; ii++ ) {
	        indexOfSmallest = ii;
	        for (int scan=ii+1; scan<=max; scan++) {
	        	if (less_than(data[scan], data[indexOfSmallest])) {
	        		indexOfSmallest = scan;
	        	}
	        }
	        swap(data, indexOfSmallest, ii);
		}

	}
	
	private static <T extends Comparable<T>> 
	T quickSortNth(T[] data, int min, int max, int n) {
		if (min <= max)
		{
			// create partitions
			int indexofpartition = partition(data, min, max);
			
			if (indexofpartition == n) {
				return data[indexofpartition];
			}
			else if (indexofpartition > n) {
				//keep looking in the left side of the array
				return quickSortNth(data, min, indexofpartition - 1, n);
			}
			else {
				//keep looking in the right side of the array
				return quickSortNth(data, indexofpartition + 1, max, n);
			}			
		}
		else {
			return null;
		}
	}

	
	
	
	
	// Write a method find_closest that finds the index of the closest two items in a list. 
	// If if two pairs have the same distance, select the smallest ones
	public static 
	List<Integer> closest_pair(Integer[] data) {
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
                if (Math.abs(data[scan+1]-data[scan]) < smallestDiff) {
                    smallestDiff = Math.abs(data[scan+1]-data[scan]);
                	results.clear();
	                results.add(data[scan]);	              
	        		results.add(data[scan+1]);
                }
            }
        }
        return results;
	}
	
	
}
