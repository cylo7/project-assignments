package com.revature.eval.java.core;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public Main() {
		// TODO Auto-generated constructor stub

		System.out.println(getScrabbleScore("knowledge"));
	}

	public int getScrabbleScore(String string) {

		String[] letters = new String[] {"AEIOULNRST", "DG", "BCMP", "FHVWY", "K", "JX", "QZ"};

		int[] values = new int[] {1, 2, 3, 4, 5, 8, 10};

		Map<Character, Integer> wordValues = new HashMap<Character, Integer>();

		for (int i = 0; i < 7; i++) {
			String word = letters[i];
			// map letters with values
			for (int v = 0; v < word.length(); v++) {
				int score = values[i];
				wordValues.put(word.charAt(v), score);
			}
		}

		int wordScore = 0;

		for (int i = 0; i < string.length(); i++) {
			String newWord = Character.toString(string.charAt(i)).toUpperCase();
			wordScore += wordValues.get(newWord.charAt(0));
		}

		return wordScore;
	}

}
