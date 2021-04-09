package Question;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateStrings {

	public static void main(String[] args) {
		
		duplicateStrings("swamyshiva akula is the hero of the decade ");

	}
	public static void duplicateStrings(String str) {
		
		char words[]= str.toCharArray();
		Map<Character, Integer> charMap= new HashMap<Character, Integer>();
		
		for(Character ch: words) {
			if(charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch)+1);
			}
			else {
				charMap.put(ch, 1);
			}
		}
		
		//print the map
		Set<Map.Entry<Character, Integer>> entrySet= charMap.entrySet();
		for(Map.Entry<Character, Integer> entry:entrySet) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
		}
		
	}

}
