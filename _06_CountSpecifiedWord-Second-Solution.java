import java.util.Scanner;

public class _06_01_CountSpecifiedWord {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sequence = scan.nextLine().toLowerCase();
		String word = scan.nextLine().toLowerCase();
		int counter = 0, k = 0, i = 0, j = 0;

		for (j = 0; j < sequence.length() - word.length() + 1; j++) {
			k = j;
			for (i = 0; i < word.length(); i++) {
				if (sequence.charAt(k) == word.charAt(i)) {
					if (i == word.length() - 1) {
						counter++;
					} else {
						k++;
					}
				} else {
					break;
				}
			}
		}
		System.out.println(counter);
	}
}
