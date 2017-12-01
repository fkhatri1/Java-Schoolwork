import java.util.Random;
import java.util.Date;
import java.time.*;

public class Simulator {
	
	private static int nElements = 1000;
	private static int nTrials = 500;

	static TrialRun[] bubbleTrials = new TrialRun[nTrials];
	static TrialRun[] quickTrials = new TrialRun[nTrials];
	static TrialRun[] mergeTrials = new TrialRun[nTrials];
	
	static Random rand = new Random();
	static Date date = new Date();
	static Runtime runtime = Runtime.getRuntime();
	
	static long usedMemory = 0;
	static long timeSpent = 0;
	
	public static void main(String[] args) {
		System.out.println("Running " + nTrials + " trials of each algorithm with arrays of " + nElements + " integers...");
		
		for (int i=0; i<nTrials; i++) {
			bubbleTrials[i] = new TrialRun();
			quickTrials[i] = new TrialRun();
			mergeTrials[i] = new TrialRun();
		}

		
		//run bubble trials
		for (int i=0; i<nTrials; i++) {
			Integer[] testArray = generateRandomArray(nElements);
			System.gc(); //garbage collect after creating random array
			long startingMemory = runtime.freeMemory();
			long startingTime = Instant.now().toEpochMilli();
			
			Sorting.bubblePair(testArray);
			
			bubbleTrials[i].memoryUsed=(startingMemory - runtime.freeMemory());
			bubbleTrials[i].duration=(Instant.now().toEpochMilli() - startingTime);
			
			//System.out.println("BTrial #" + (i+1) + " - Memory Used: " + bubbleTrials[i].memoryUsed + " bytes - Duration: " + bubbleTrials[i].duration + "ms");
			
		}
		
		
		//quick Trials
		for (int i=0; i<nTrials; i++) {
			Integer[] testArray = generateRandomArray(nElements);
			System.gc(); //garbage collect after creating random array
			long startingMemory = runtime.freeMemory();
			long startingTime = Instant.now().toEpochMilli();
			
			Sorting.quickPair(testArray);
			
			quickTrials[i].duration=(Instant.now().toEpochMilli() - startingTime);
			quickTrials[i].memoryUsed=(startingMemory - runtime.freeMemory());
					

			//System.out.println("QTrial #" + (i+1) + " - Memory Used: " + quickTrials[i].memoryUsed + " bytes - Duration: " + quickTrials[i].duration + "ms");
			
		}

		
		//merge Trials
		for (int i=0; i<nTrials; i++) {
			Integer[] testArray = generateRandomArray(nElements);
			System.gc(); //garbage collect after creating random array
			long startingMemory = runtime.freeMemory();
			long startingTime = Instant.now().toEpochMilli();
			
			Sorting.mergePair(testArray,0,testArray.length-1);
			
			quickTrials[i].duration=(Instant.now().toEpochMilli() - startingTime);
			mergeTrials[i].memoryUsed=(startingMemory - runtime.freeMemory());
			
			

			//System.out.println("MTrial #" + (i+1) + " - Memory Used: " + mergeTrials[i].memoryUsed + " bytes - Duration: " + mergeTrials[i].duration + "ms");
		} 
	printAverages();
	
	}
	
	public static Integer[] generateRandomArray(int len) {
		Integer[] a = new Integer[len];
		Random rand = new Random();

	    for (int ii=0;ii<a.length;ii++) {
	    	a[ii] = rand.nextInt(1000);
	    }			
	    return a;
	}
	
	public static void printAverages() {
		long avgBubbleMem = 0;
		long avgBubbleTime = 0;
		int goodBubbleRuns = 0;
		long avgQuickMem = 0;
		long avgQuickTime = 0;
		int goodQuickRuns = 0;
		long avgMergeMem = 0;
		long avgMergeTime = 0;	
		int goodMergeRuns = 0;
		
		for (int i=0; i<nTrials; i++) {
			if (bubbleTrials[i].memoryUsed > 0) {
				avgBubbleMem += bubbleTrials[i].memoryUsed;
				goodBubbleRuns++;
			}
			if (quickTrials[i].memoryUsed > 0) {
				avgQuickMem += quickTrials[i].memoryUsed;
				goodQuickRuns++;
			}
			if (mergeTrials[i].memoryUsed > 0) {
				avgMergeMem += mergeTrials[i].memoryUsed;
				goodMergeRuns++;
			}
			
			avgBubbleTime += bubbleTrials[i].duration;
			avgQuickTime += quickTrials[i].duration;
			avgMergeTime += mergeTrials[i].duration;
		}
		
		avgBubbleMem = avgBubbleMem/goodBubbleRuns;
		avgQuickMem = avgQuickMem/goodQuickRuns;
		avgMergeMem = avgMergeMem/goodMergeRuns;

		avgBubbleTime = avgBubbleTime/nTrials;
		avgQuickTime = avgQuickTime/nTrials;
		avgMergeTime = avgMergeTime/nTrials;
		
		System.out.println("Observed Bubble Performance:");
		System.out.println("\tAverage Duration: " + avgBubbleTime + " ms");
		System.out.println("\tAverage Memory Usage: " + avgBubbleMem + " bytes");
		
		System.out.println("Observed Quick Performance:");
		System.out.println("\tAverage Duration: " + avgQuickTime + " ms");
		System.out.println("\tAverage Memory Usage: " + avgQuickMem + " bytes");
		
		System.out.println("Observed Merge Performance:");
		System.out.println("\tAverage Duration: " + avgMergeTime + " ms");
		System.out.println("\tAverage Memory Usage: " + avgMergeMem + " bytes");
	}
}
	