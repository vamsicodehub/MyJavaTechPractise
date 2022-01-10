import java.util.Arrays;

public class SmallestPositiveInteger {

	public static void main(String[] args) {
		int array[] = { 1, 3, 6, 4, 1, 2 };
		int result = findSmallestPositiveMissingInteger(array);
		System.out.println("Result = " + result);
	}

	static int findSmallestPositiveMissingInteger(int[] array) {

		Arrays.sort(array);
		int j, i = 1;
		for (j = 0; j < array.length; j++) {
			if (array[j] == i) {
				i++;
			}
		}
		return i;

	}

}
