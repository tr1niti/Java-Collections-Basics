import java.util.Scanner;

public class _04_LongestIncreasingSequence {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String string = input.nextLine();

		String[] splitStrings = string.split(" ");
		int[] numbers = new int[splitStrings.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(splitStrings[i]);
		}

		int counter = 1;
		int counterTemp = 1; // length of the longest sequence
		int positionOfNumber = 0;

		System.out.print(numbers[0]);
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > numbers[i - 1]) {
				counterTemp++;
				System.out.print(" " + numbers[i]);
			} else {
				counterTemp = 1;
				System.out.println();
				System.out.print(numbers[i]);
			}
			if (counterTemp > counter) {
				counter = counterTemp;
				positionOfNumber = i;
			}
		}
		System.out.println();
		System.out.print("Longest: ");
		for (int j = 0; j < counter - 1; j++) {
			System.out.print(numbers[positionOfNumber - counter + 1 + j] + " ");
		}
		System.out.println(numbers[positionOfNumber]);
	}
}
