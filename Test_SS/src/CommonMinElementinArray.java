import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CommonMinElementinArray {

	public static void main(String[] args) {
		int[] arr1 = { 3, 10, 1, 0, 9 };
		int[] arr2 = { 32, 5, 10, 6, 9, 1 };

		System.out.println(commonMinElement(arr1, arr2));

	}

	static int commonMinElement(int[] a, int[] b) {
		List<Integer> result = new ArrayList<>();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					result.add(a[i]);
				}
			}

		}
		Collections.sort(result);

		System.out.println(result);

		return result.get(0);
	}

}
