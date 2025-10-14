package arrayProblems;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ElementFrequencyCounter {
	public static void main(String[] args) {
		int arr[] = { 4, 6, 7, 89, 100, 100 };
		Map<Integer, Integer> occuranceOfNumbers = new LinkedHashMap<>();
		for (int num : arr) {
			occuranceOfNumbers.put(num, occuranceOfNumbers.getOrDefault(num, 0) + 1);
		}
		for (Entry<Integer, Integer> entries : occuranceOfNumbers.entrySet()) {
			System.out.println(entries.getKey() + " --> " + entries.getValue());
		}
	}
}
