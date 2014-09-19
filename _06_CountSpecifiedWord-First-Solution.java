import java.util.Scanner;

public class _06_CountSpecifiedWord {
	public static void main(String... args) {
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine().toLowerCase();
		String word = scan.nextLine().toLowerCase();
		int textLength = text.length();
		int wordLength = word.length();
		int counterTemp = wordLength; 
		int counterSpecifiedWord = 0; 
		String counter = null;

		for (int i = 0; i < textLength - counterTemp + 1; i++) {
			counter = text.substring(i, wordLength);
			if (counter.equals(word)) {
				counterSpecifiedWord++;
			}
			wordLength++;
		}
		System.out.println(counterSpecifiedWord);
		
	}
}
