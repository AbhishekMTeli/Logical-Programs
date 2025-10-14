package arrayProblems;

public class ArraySortedChecker {
	public static void main(String[] args) {
		int arr[] = { 4, 6, 7, 89, 100 };
		checkArraySorted(arr);
	}

	public static void checkArraySorted(int[] arr) {
		boolean ascending = true;
		boolean descending = true;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				ascending = false;
			}
			if (arr[i] < arr[i + 1]) {
				descending = false;
			}
		}

		if (ascending) {
			System.out.println("Array is sorted in ascending order.");
		} else if (descending) {
			System.out.println("Array is sorted in descending order.");
		} else {
			System.out.println("Array is not sorted.");
		}
	}
}
