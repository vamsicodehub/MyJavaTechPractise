import java.util.Set;
import java.util.TreeSet;

/* Code to verify whether a particular sentence contains alphabets A - Z */
public class CGTest {

	public static void main(String[] args) {
		String input = "Waltz, bad nymph, for quick jigs vex.";
		System.out.println(checkForAlpha(input));
	}

	static boolean checkForAlpha(String input) {
		input = input.toUpperCase();
		char start = 'A', end = 'Z';
		Set<Integer> resultList = new TreeSet<>();
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) >= start && input.charAt(i) <= end) {
				resultList.add(input.charAt(i) - start);
			}
		}
		int counter = 0;
		for (Integer it : resultList) {
			if (it.intValue() != counter++)
				return false;
		}

		return true;

	}

}
