package br.com.gabrielguimaraes.wordcounter;

import java.util.HashMap;

public class WordCounter {

	private final HashMap<String,Integer> wordCounter = new HashMap<>();

	public void putWord(String word) {
		Integer counter = getNumberOfWordRepetition(word);
		
		wordCounter.put(word, ++counter);
	}

	public Integer manyTimesGivenWord(String word) {
		return getNumberOfWordRepetition(word);
	}

	public Integer getNumberOfWordRepetition(String word) {
		Integer counter = wordCounter.get(word);
		
		return (counter == null) ? 0 : counter;
	}
	
}
