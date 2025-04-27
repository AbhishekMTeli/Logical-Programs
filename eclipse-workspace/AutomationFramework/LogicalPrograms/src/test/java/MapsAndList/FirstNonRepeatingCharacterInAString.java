package MapsAndList;

import java.util.Map;
import java.util.TreeMap;

public class FirstNonRepeatingCharacterInAString {
	public static void main(String[] args) {
		String s = "Amazon";
		char ch []=s.toLowerCase().toCharArray();
		Map <Character, Integer> map = new TreeMap<>();
		for (int i = 0; i < ch.length; i++) {	
			map.put(ch[i], map.getOrDefault(ch[i], 0)+1);
		}
		for(Map.Entry<Character, Integer> entry :map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println("The First Non Repiting Character is " +entry.getKey());
				return;
			}
		}
		System.out.println("No non Repeating Characters");
	}
}
