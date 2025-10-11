package arrayProblems;

public class MaximumAndMinimumInAnArray {
	public static void main(String[] args) {
		int arr[] = { 3, -4, 7, -3, 9, 2 };
		int maxNumber = Integer.MIN_VALUE;
		int minNumber = Integer.MAX_VALUE;
		if (arr.length == 0) {
			System.out.println("The array is empty ");
			return;
		}
		for (int num : arr) {
			if (num > maxNumber) {
				maxNumber = num;
			}
			if (num < minNumber) {
				minNumber = num;
			}
		}
		System.out.println("The biggest number in an array is " + maxNumber);
		System.out.println("The smallest number in an array is " + minNumber);
	}
}
