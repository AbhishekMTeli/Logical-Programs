package arrayProblems;

public class PositiveNegativeZeroCounter {
	public static void main(String[] args) {
		int[] numbers = { 4, -7, 0, 12, -3, 0, 9, -1, 0, 5 };

		if (numbers.length == 0) {
			System.out.println("Empty Array");
			return;
		}

		int positiveCount = 0, negativeCount = 0, zeroCount = 0;
		String positives = "", negatives = "", zeros = "";

		for (int num : numbers) {
			if (num > 0) {
				positives += num + " ";
				positiveCount++;
			} else if (num < 0) {
				negatives += num + " ";
				negativeCount++;
			} else {
				zeros += num + " ";
				zeroCount++;
			}
		}

		System.out.println("Positives: " + positives + "→ " + positiveCount);
		System.out.println("Negatives: " + negatives + "→ " + negativeCount);
		System.out.println("Zeros: " + zeros + "→ " + zeroCount);
	}
}
