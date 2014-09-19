import java.util.Scanner;
import java.util.regex.*;

public class _08_ExtractEmailAddresses {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String regex = "([a-zA-Z0-9]+[_.-]*)+@{1}(([a-z]+[.-]+))+[a-z]+";
		Pattern emailPattern = Pattern.compile(regex);
		Matcher matcher = emailPattern.matcher(input);
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
