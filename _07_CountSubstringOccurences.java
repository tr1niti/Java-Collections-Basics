import java.util.Scanner;

public class _07_CountSubstringOccurences {
	public static void main(String... args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine().toLowerCase();
		String word = scan.nextLine().toLowerCase();
		String[] text = input.split("[, .\\(\\)'\\-!;]+");
		int counter = 0;
		for (int i = 0; i < text.length; i++) {
			if (text[i].contains(word)) {
				counter++;
			} else {
				continue;
			}
		}
		System.out.println(counter);
	}
}
