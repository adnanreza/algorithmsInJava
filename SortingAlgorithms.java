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
	  Helper subroutine: Swap
	*/
	public static void swap(int [] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

}