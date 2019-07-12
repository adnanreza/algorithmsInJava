/*Sorting Algorithms in Java*/

class SortingAlgorithms {

	/*
	  Bubble Sort
	  Best case: O(n) time | O(1) space
	  Average case: O(n^2) time | O(1) space
	  Worst case: O(n^2) time | O(1) space
	*/
	public static int[] bubbleSort(int [] array) {
		//empty array: send back an empty array which is sorted by definition
		if(array.length == 0) {
			return new int[] {};
		}
		boolean isSorted = false;
		while(!isSorted) {
			isSorted = true;
			for(int i=0; i<array.length; i++) {
				if(array[i] > array[i+1]) {
					swap(array, i, i+1);
					isSorted = false;
				}
			}
		}
		return array;
	}

	/*
	  Selection Sort
	*/
	public static int[] selectionSort(int [] array) {
		//Start index of unsorted list
		int startIndex = 0;

		while(startIndex < array.length - 1) {
			int smallIndex = startIndex; //keep pointer of smallest index of unsorted list
			for(int i=startIndex + 1; i<array.length; i++) {
				if(array[i] < array[smallIndex]) {
					smallIndex = i;
				}
			}
			swap(array, smallIndex, startIndex);
			startIndex++;
		}
		return array;
	}

	/*
	  Insertion Sort
	*/
	public static int[] insertionSort(int [] array) {
		//if array is empty, it is already sorted
		if(array.length == 0) {
			return new int[] {};
		}

		for(int i=1; i<array.length; i++) {
			int j = i; //j points to current index we are looking at
			while(j > 0 && array[j] < array[j-1]) {
				swap(array, j, j-1);
				j--;
			}
		}
		return array;
	}

	/*
	  Quick Sort
	*/
	public static int[] quickSort(int[] array) {
		quickSort(array, 0, array.length-1);
		return array;
	}
	public static void quickSort(int[] array, int startIdx, int endIdx) {
		//stopping condition
		if(startIdx >= endIdx) {
			return;
		}
		int pivotIdx = startIdx;
		int leftIdx = startIdx + 1;
		int rightIdx = endIdx;
		while(rightIdx >= leftIdx) {
			
		}
	}


	/*
	  Helper subroutine: Swap
	*/
	public static void swap(int [] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

}