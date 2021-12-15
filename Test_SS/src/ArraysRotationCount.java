
public class ArraysRotationCount {

	public static void main(String[] args) {
		int inputArr[] = { 3, 4, 5, 6, 7, 1, 2 };
		System.out.println(findTheRotatedCount(inputArr));
	}

	private static int findTheRotatedCount(int[] arr) {
		int min = arr[0], min_index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
				min_index = i;
			}
		}
		return arr.length - min_index;
	}

}
