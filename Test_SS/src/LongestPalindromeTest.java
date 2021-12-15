
public class LongestPalindromeTest {

	public static void main(String[] args) {
		String input = "forgeeksskeegfor";
		palindromeTest(input);
		palindromeTest2(input);
	}

	private static void palindromeTest(String input) {
		int start = 0;
		int maxlength = 1;

		for (int i = 0; i < input.length(); i++) {
			for (int j = i; j < input.length(); j++) {
				boolean flag = false;
				for (int k = 0; k < (j - i + 1) / 2; k++) {
					if (input.charAt(i + k) != input.charAt(j - k))
						flag = true;
				}

				if (!flag && (j - i + 1) > maxlength) {
					start = i;
					maxlength = j - i + 1;
				}
			}
		}

		System.out.print("Longest Palindrome of a given string is :: ");

		printSubString(input, start, start + maxlength);

		System.out.println("Max Palin String Length is :: " + maxlength);

	}

	private static void palindromeTest2(String str) {
		int start = 0;
		int maxLength = 1;

		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				int flag = 1;

				// Check palindrome
				for (int k = 0; k < (j - i + 1) / 2; k++)
					if (str.charAt(i + k) != str.charAt(j - k))
						flag = 0;

				// Palindrome
				if (flag != 0 && (j - i + 1) > maxLength) {
					start = i;
					maxLength = j - i + 1;
				}
			}
		}

		System.out.print("Longest Palindrome of a given string is :: ");

		printSubString(str, start, start + maxLength);

		System.out.println("Max Palin String Length is :: " + maxLength);

	}

	private static void printSubString(String input, int start, int end) {
//		for (int i = start; i < end; ++i)
		System.out.print(input.substring(start, end));

		System.out.println();

	}

}
