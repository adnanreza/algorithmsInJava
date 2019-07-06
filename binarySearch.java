/*Binary Search*/

class BinarySearch {

	public static int binarySearch(int [] array, int target) {
		return binarySearchR(int [] array, int target, 0, array.length -1);
	}

	/*Recursive binary search algorithm*/
	public static int binarySearchR(int [] array, int target, int left, int right) {
		//base case
		if(left > right){ 
			return -1;
		}
		//recursive case
		int middle = (left + right) / 2;
		if(target == array[middle]) {
			return middle;
		}
		else if(target > array[middle]) {
			return binarySearchR(array, target, middle+1, right);
		}
		else {
			return binarySearchR(array, target, left, middle-1);
		}
	}

	/*Iterative binary search algorithm*/
	public static int binarySearchI(int [] array, int target, int left, int right) {
		while(left <= right) {
			int middle = (left + right) / 2;
		}
		if(target == array[middle]) {
			return middle;
		}
		else if(target > array[middle]) {
			left = middle + 1;
		}
		else {
			right = middle - 1;
		}
		//if not found
		return -1;
	}

}