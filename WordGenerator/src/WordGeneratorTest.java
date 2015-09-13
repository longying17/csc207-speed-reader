import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;

public class WordGeneratorTest {

	@Test
	public void testWordCount() throws FileNotFoundException {
		WordGenerator w1 = new WordGenerator("/home/longying17/CSC207/homework/csc207-speed-reader/README.md");
		while (w1.hasNext()) {
		System.out.println(w1.next());
		}
		assertEquals("w1.getWordCount = 11", 11, w1.getWordCount());
	} 
	
	@Test
	public void testSentenceCount() throws FileNotFoundException {
		WordGenerator w1 = new WordGenerator("/home/longying17/CSC207/homework/csc207-speed-reader/README.md");
		while (w1.hasNext()) {
	        System.out.print(w1.next());
	    }
		assertEquals("w1.getSentenceCount = 1", 1, w1.getSentenceCount());
	} 
}