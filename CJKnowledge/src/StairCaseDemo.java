
public class StairCaseDemo {

	public static void main(String[] args) {
		int n = 10;
		stairCaseSol(n);
		System.out.println("--------------------------------");
		reversestairCaseSol(n);

	}

	private static void stairCaseSol(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j < n - 1 - i)
					System.out.print(" ");
				else
					System.out.print("#");
			}
			System.out.println("");
		}
	}

	private static void reversestairCaseSol(int n) {
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print("#");
			}
			System.out.println("");
		}
	}

}
