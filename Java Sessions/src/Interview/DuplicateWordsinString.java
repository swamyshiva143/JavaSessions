package Interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsinString {

	//Hey, java is java best language is java...its java.
	//java-4,  // is-2
	
	public static void main(String[] args) {
		findDuplicatewords("Hey, java is java java is not at all good java but it is good practicing java");
		findDuplicatewords("100 200 300 200 100");
		findDuplicatewords("langa lafanga langa langa ganga lafanga langa ganga");

	}
	
	public static void findDuplicatewords(String inputString) {
		
		//split
		
		String words[]= inputString.split(" ");
		
		//Create one Hashmap
		Map<String,Integer> wordCount= new HashMap<String, Integer>();
		
		//to check each word in given array
		for(String word: words) {
			
			//if word is present
			if(wordCount.containsKey(word)){
				wordCount.put(word.toLowerCase(), wordCount.get(word)+1);
				
			}
			else {
				wordCount.put(word, 1);
			}
		}
				
		//Extracting all the keys of map-wordCount
		Set<String>wordsInString= wordCount.keySet();
		
		//loop through all the words in wordCount
		for(String word:wordsInString) {
			if(wordCount.get(word)>1) {
				
				System.out.println(word +" : "+ wordCount.get(word));
			}
		}
	}
	

}
