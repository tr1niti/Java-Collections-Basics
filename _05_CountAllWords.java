import java.util.Scanner;

public class _05_CountAllWords {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String string = scan.nextLine();
		String[] splitStrings = string.split("[, .\\(\\)'\\-!;]+");
		int counter = 0;
		for (int i = 0; i < splitStrings.length; i++) {
			counter++;
		}
		System.out.println(counter);
	}
}
