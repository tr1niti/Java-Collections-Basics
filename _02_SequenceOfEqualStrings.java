import java.util.Scanner;

public class _02_SequenceOfEqualStrings {
	public static void main(String... args) {
	
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] sequence = input.split("[ ]+");
		System.out.print(sequence[0]);
		for (int i = 1; i < sequence.length; i++) {
			if (sequence[i].equals(sequence[i - 1])) {
				System.out.print(" " + sequence[i]);
			} else {
				System.out.println();
				System.out.print(sequence[i]);
			}
		}
	}
}
