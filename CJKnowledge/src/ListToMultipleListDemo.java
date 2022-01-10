import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMultipleListDemo {

	public static void main(String[] args) {
		
		double d1 = 10.0;
		double d2 = 10.0;
		
		System.out.println(d1== d2);
		List<Integer> inputList = Arrays.asList(12, 22, 45, 76, 89, 8, 9, 0, 5);
		Map<Boolean, List<Integer>> outMap = inputList.stream().collect(Collectors.partitioningBy(i -> i > 10));
		System.out.println(outMap);
		List<Integer> lessTenList = outMap.get(false);
		List<Integer> greaterTenList = outMap.get(true);
		
		System.out.println(lessTenList);
		System.out.println(greaterTenList);

	}

}
