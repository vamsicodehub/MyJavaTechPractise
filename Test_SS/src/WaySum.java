import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WaySum {
	static int count = 0;

	public static void main(String[] args) {
		System.out.println((char) 97);
//		System.out.println(ways(5, 2));
//		System.out.println(waysRecursion(5, 2));
//		System.out.println(playlist(Arrays.asList(5, 30, 20, 150, 100, 40)));
		
		List<List<Integer>> mainList = new ArrayList<>();
		
		List<Integer> intList = new ArrayList<>();
		intList.add(0);
		intList.add(2);
		mainList.add(intList);
		
		intList = new ArrayList<>();
		intList.add(1);
		intList.add(3);
		mainList.add(intList);
		
		intList = new ArrayList<>();
		intList.add(0);
		intList.add(7);
		mainList.add(intList);
		
		
		System.out.println(slowestKey(mainList));

	}

	public static int ways(int total, int k) {
		total = total - 1;
		k = k - 1;
		int[][] result = new int[total + 1][k + 1];
		for (int i = 0; i <= total; i++) {
			for (int j = 0; j <= Math.min(i, k); j++) {
				if (j == 0 || j == i)
					result[i][j] = 1;
				else
					result[i][j] = result[i - 1][j - 1] + result[i - 1][j];
			}
		}

		return result[total][k];
	}

	public static int waysRecursion(int total, int k) {

		if (total == 0) {
			count++;
			return count;
		}
		for (int i = Math.min(total, k); i >= 1; i--) {
			waysRecursion(total - i, i);
		}
		return count;
	}

	public static char slowestKey(List<List<Integer>> keyTimes) {
		// Write your code here
		int res = 0;
		int it = 0;
		
		int size = keyTimes.size();
		int latest = 0;
		while (it < size) {
			int temp = latest;
			latest = keyTimes.get(it).get(1) - latest;
			if (temp < latest)
				res = keyTimes.get(it).get(0) + 97;
			it++;
		}

		return (char) res;

	}

	public static long playlist(List<Integer> songs) {
		long result = 0L;
		int l = 0, r = songs.size() - 1;
		Collections.sort(songs);
		while (l < r) {
			if ((songs.get(l) + songs.get(r)) % 60 == 0) {
				result++;
				l++;
				r--;
			}

			else if ((songs.get(l) + songs.get(r)) < 60)
				l++;
			else
				r--;
		}
		return result;

	}

}
