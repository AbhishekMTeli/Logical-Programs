package arrayProblems;

import java.util.Arrays;

public class SecondLargestSmallestFinder {
	public static void main(String[] args) {
		int[] numbers = { 4, -7, 0, 12, -3, 0, 9, -1, 0, 5 };

		if (numbers.length < 2) {
			System.out.println("Array must have at least 2 elements");
			return;
		}

		// Remove duplicates and sort
		int[] sortedUnique = Arrays.stream(numbers).distinct().sorted().toArray();

		if (sortedUnique.length < 2) {
			System.out.println("Not enough unique elements to find second largest and second smallest");
			return;
		}

		int secondSmallest = sortedUnique[1];
		int secondLargest = sortedUnique[sortedUnique.length - 2];

		System.out.println("Second smallest number: " + secondSmallest);
		System.out.println("Second largest number: " + secondLargest);
	}
}
