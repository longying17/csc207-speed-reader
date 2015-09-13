import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class WordGenerator {
	private int sentenceCount;
	private int wordCount;
	private String filename;
	private Scanner text;
	
	public WordGenerator(String filename) throws FileNotFoundException {
		this.sentenceCount = 0;
		this.wordCount = 0;
		this.filename = filename;
		this.text = new Scanner(new File(this.filename));
	}
	
	public boolean hasNext() throws IllegalStateException{
		if (text.hasNext()) {
		return true;
		} else return false;
	}
	 	
	public String next() {
		wordCount++;
		String wordNext = text.next();
		if(wordNext.charAt(wordNext.length() - 1) == '.'){
			sentenceCount++;
		}
		return wordNext;
	}
	
	public int getWordCount() {
		return wordCount;
	}
	
	public int getSentenceCount() {
		return sentenceCount;
	}
	
}