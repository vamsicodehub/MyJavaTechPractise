
public class OddPlacedMobileNoSum {

	public static void main(String[] args) {
		long number = 7715002967l;
		number = reverse(number);
		int i = 1;
		long result = 0, rem = 0;
		while (number != 0) {
			rem = number % 10;
			if (i % 2 != 0) {
				result += rem;
			}
			number = number / 10;
			i++;
		}

		System.out.println(result);
	}

	private static long reverse(long number) {
		long revNumber = 0;
		while (number != 0) {
			revNumber = revNumber * 10 + number % 10;
			number /= 10;
		}
		return revNumber;
	}

}
