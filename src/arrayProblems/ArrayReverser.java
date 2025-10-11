package arrayProblems;

import java.util.Arrays;

public class ArrayReverser {
	public static void main(String[] args) {
		int[] numbers = { 4, -7, 0, 12, -3, 0, 9, -1, 0, 5 };

		int left = 0, right = numbers.length - 1;
		while (left < right) {
			int temp = numbers[left];
			numbers[left] = numbers[right];
			numbers[right] = temp;
			left++;
			right--;
		}

		System.out.println(Arrays.toString(numbers));
	}
}
