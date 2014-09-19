import java.util.Scanner;

public class _03_LargestSequenceOfStrings {
	public static void main(String... args) {

			Scanner scan = new Scanner(System.in);
			String input = scan.nextLine();
			String[] words = input.split(" ");
			int counterTemp = 1;
			int counter = 1;
			int positionOfWord = 0; 
			
			for (int i = 1; i < words.length; i++) {
				if (words[i].equals(words[i-1])) {
					counterTemp++;					
				}
				else {
					counter = 1;
				}
				if (counterTemp > counter) {
					counter = counterTemp;
					positionOfWord = i;					
				}
			}
			for (int j = 0; j < counter - 1; j++) {
				System.out.println(words[positionOfWord]);
			}
	}
}
			
