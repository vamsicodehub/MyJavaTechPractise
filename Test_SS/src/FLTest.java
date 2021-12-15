import java.util.Arrays;
import java.util.List;

public class FLTest {

	public static void main(String[] args) {
		int arr[] = { 1, 5, 3, 2, 4 };
		findTriplets(arr);
	}

	private static void findTriplets(int[] arr) {
		List<Integer> list = Arrays.stream(arr).boxed().toList();
		int count = 0;
		int len = arr.length;
		for (int i = 0; i < len; i++) {
//			int val = arr[i];
			for (int j = i + 1; j < len; j++) {
				if (list.contains(arr[i] + arr[j]))
					count++;
			}
		}
		
		System.out.println(count);
	}

}
