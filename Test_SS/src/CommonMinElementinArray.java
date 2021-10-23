import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CommonMinElementinArray {

	public static void main(String[] args) {
		int[] arr1 = { 3, 10, 1, 0, 9 };
		int[] arr2 = { 32, 5, 10, 6, 19, 2, 20 };

		System.out.println(commonMinElement2(arr1, arr2));

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

	static int commonMinElement2(int[] a, int[] b) {
		Arrays.sort(a);
		Arrays.sort(b);

		int i = 0;
		int m = a.length;
		int n = b.length;
		int commMinElement = 0;

		for (int j = 0; j < n;) {
			if (a[i] == b[j]) {
				commMinElement = a[i];
				break;
			} else if (i < m - 1 && a[i] < b[j])
				i++;
			else
				j++;
		}

		return commMinElement;
	}

}
