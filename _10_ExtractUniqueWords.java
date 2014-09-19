import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class _10_ExtractUniqueWords {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine().toLowerCase();
		String[] sequence = str.split("\\W+");
		Set<String> wordsCount = new TreeSet<>();
		for (String word : sequence) {
			wordsCount.add(word);
		}
		System.out.println(wordsCount);
	}
}
