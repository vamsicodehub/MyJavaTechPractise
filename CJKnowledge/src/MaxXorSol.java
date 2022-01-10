import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class MaxXorSol {

	public static void main(String[] args) {
		System.out.println(maxSubarrayXOR(3, new int[] { 9,5,3 }));
//		System.out.println(maxSubarrayXOR2(3, new int[] { 9,5,3 }));
	}

	static int maxSubarrayXOR(int N, int arr[]) {
		int maxXor = 0;
		int[] maxXorSubArr = new int[2];
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				System.out.println(Math.max(maxXor, (arr[i] ^ arr[j])));
				if(maxXor < (arr[i] ^ arr[j])) {
					maxXor = arr[i] ^ arr[j];
					maxXorSubArr[0] = arr[i];
					maxXorSubArr[1] = arr[j];
				}
			}
		}
		System.out.println(Arrays.toString(maxXorSubArr));
		return maxXor;
	}
	
	static int maxSubarrayXOR2(int N, int arr[]) {
		long start = System.nanoTime();
		int maxXor = Integer.MIN_VALUE;
		for (int i = 0; i < N; i++) {
			int currMaxXOr = 0;
			for (int j = i; j < N; j++) {
				currMaxXOr = currMaxXOr^arr[j];
				maxXor = Math.max(currMaxXOr, maxXor);
			}
		}
		System.out.println(System.nanoTime() - start);
		return maxXor;
	}

}
