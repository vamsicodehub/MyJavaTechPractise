import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MinMaxAlgo {

	public static void main(String[] args) {
		minMaxResult(Arrays.asList(1, 2, 40, 30, 20));

	}

	private static void minMaxResult(List<Integer> asList) {
		Collections.sort(asList);

		int size = asList.size();
		long minSum = 0;
		long maxSum = 0;

		for (int i = 0, j = size - 1; i < size - 1; i++, j--) {
			minSum = minSum + asList.get(i);
			maxSum += asList.get(j);
		}
		
		System.out.println(asList.stream().collect(Collectors.toConcurrentMap(null, null)));
		
		System.out.println("minSum :: "+minSum);
		System.out.println("maxSum :: "+maxSum);
	}

}
