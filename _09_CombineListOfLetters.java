import java.util.Scanner;
import java.util.ArrayList;

public class _09_CombineListOfLetters {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Character> arrayFirst = new ArrayList<Character>();
		ArrayList<Character> arrSecond = new ArrayList<Character>();
		ArrayList<Character> arrPrint = new ArrayList<Character>();

		for (char ch : scan.nextLine().toCharArray()) {
			arrayFirst.add(ch);
		}
		for (char ch : scan.nextLine().toCharArray()) {
			arrSecond.add(ch);
		}
		arrPrint.addAll(arrayFirst);

		for (int i = 0; i < arrSecond.size(); i++) {
			if (arrayFirst.contains(arrSecond.get(i))) {
				continue;
			} else {
				arrPrint.add(' ');
				arrPrint.add(arrSecond.get(i));
			}
		}

		for (int i = 0; i < arrPrint.size(); i++) {
			System.out.print(arrPrint.get(i));
		}
	}
}
