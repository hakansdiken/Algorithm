import java.io.*;
import java.util.*;
public class WordCount {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		countWords();
		
	}
	
	public static void countWords() throws FileNotFoundException {
		Scanner input = new Scanner (new File("text.txt"));
		
		Set<String> words = new HashSet<String>();
		
		while(input.hasNext()) {
			String word = input.next().toLowerCase();
			words.add(word);
		}
		System.out.println("kelimeler : "+words);
		System.out.println("kelime sayýsý : "+words.size());
	}
}
