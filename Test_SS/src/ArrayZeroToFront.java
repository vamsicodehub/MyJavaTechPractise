import java.util.Arrays;

public class ArrayZeroToFront {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 0, 4, 6, 0, 9, 0, 4, 0, 3, 0, 9, 0, 1, 0, 3, 0 };
		moveNumbersToFront(arr);
	}

	private static void moveNumbersToFront(int[] arr) {
		int length = arr.length;
		int[] newArr = new int[length];

		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] != 0) {
				length--;
				newArr[length] = arr[i];
			}
		}

		while (length > 0) {
			length--;
			newArr[length] = 0;
		}

		System.out.println(Arrays.toString(newArr));
	}

}
