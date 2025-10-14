package arrayProblems;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
	public static void main(String[] args) {
		int arr[] = { 4, 6, 7, 89, 100, 100 };
		int[] result = removeDuplicates(arr);
		System.out.println(Arrays.toString(result));
	}

	public static int[] removeDuplicates(int[] arr) {
		if (arr.length == 0)
			return new int[0];

		int j = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[j]) {
				j++;
				arr[j] = arr[i];
			}
		}
		return Arrays.copyOf(arr, j + 1);
	}
}
