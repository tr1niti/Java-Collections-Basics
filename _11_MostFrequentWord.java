import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _11_MostFrequentWord {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] text = scanner.nextLine().toLowerCase().split("\\W+");
		Map<String, Integer> wordsCount = new TreeMap<String, Integer>();
		int maximumCount = 0;
		for (String word : text) {
			Integer count = wordsCount.get(word);
			if (count == null) {
				count = 0;
			}
			if (count + 1 > maximumCount) {
				maximumCount = count + 1;
			}
			wordsCount.put(word, count + 1);
		}

		for (Map.Entry<String, Integer> entry : wordsCount.entrySet()) {
			if (entry.getValue() == maximumCount) {
				System.out.printf("%s -> %d times\n", entry.getKey(),
						entry.getValue());
			}
		}
	}
}
