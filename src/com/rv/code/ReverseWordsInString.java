/**
 * 
 */
package com.rv.code;

/**
 * Code to reverse each string in a word
 * 
 * @author arvind
 *
 */
public class ReverseWordsInString {

	/**
	 * Work Flow:
	 * 
	 * 1. Split the string to get words array.
	 * 
	 * 2. Break each word into char array.
	 * 
	 * 3. Loop the word collect letters in reverse order in a String Builder.
	 * 
	 * 4. Add each reversed word to the outString builder.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		String inputString = "Greeks will watch BigBang";
		
		String[] wordArray = inputString.split(" ");
		char[] word;
		StringBuilder reverseWord;
		StringBuilder outputString = new StringBuilder();
		
		for(int i=0; i<wordArray.length; i++) {
			
			System.out.println(wordArray[i]);
			word = wordArray[i].toCharArray();
			reverseWord = new StringBuilder();
			for(int j= word.length-1; j>=0; j--) {
				reverseWord.append(word[j]);
			}
			outputString.append(reverseWord.toString());
			outputString.append(" ");
		}
		
		System.out.println(outputString.toString().substring(0,outputString.length()-1));
		
	}

}
