package br.com.gabrielguimaraes.wordcounter;

import org.junit.Before;
import org.junit.Test;

import br.com.gabrielguimaraes.wordcounter.WordCounter;

import static org.junit.Assert.*;


public class WordCounterTest {
	
	private WordCounter wordCounter;
	
	@Before
	public void setUp() {
		wordCounter = new WordCounter();
	}
	
	
	@Test
	public void testThreeTimesWordDog() {
		wordCounter.putWord("Dog");
		wordCounter.putWord("Dog");
		wordCounter.putWord("Dog");
		Integer totalResult = new Integer(3);
		assertEquals(totalResult, wordCounter.manyTimesGivenWord("Dog"));
		
	}
	
	@Test
	public void testIfDogIsntInTheWordCounter() {
		Integer totalResult = new Integer(0);
		assertEquals(totalResult, wordCounter.manyTimesGivenWord("Dog"));
	}
	
	@Test
	public void testIfDogChangesItsNumberWithDifferentWords() {
		wordCounter.putWord("Dog");
		wordCounter.putWord("Dog");
		wordCounter.putWord("Dog");
		wordCounter.putWord("Fish");
		
		Integer totalResult = new Integer(3);
		assertEquals(totalResult, wordCounter.manyTimesGivenWord("Dog"));
	}
	
	@Test
	public void testTwoTimesWordCat() {
		wordCounter.putWord("Cat");
		wordCounter.putWord("Cat");
		Integer totalResult = new Integer(2);
		assertEquals(totalResult, wordCounter.manyTimesGivenWord("Cat"));
		
	}
}
