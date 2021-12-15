import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeMultipleCollectionsToSIngle {
	
	static int[] n1 = {1,2,3,4,5};
	static int[] n2 = {6,7,8,9};
	
	public static void main(String[] args) {
		
		venus(n1, n2);
		
		Stream.concat(Arrays.stream(n1).boxed(), Arrays.stream(n2).boxed()).collect(Collectors.toList()).forEach(System.out::println);;
		List<Integer> mergedList = Stream.concat(Arrays.stream(n1).boxed(), Arrays.stream(n2).boxed()).collect(Collectors.toList());
		int[] mergedArray = mergedList.stream().mapToInt(i -> i).toArray();
		System.out.println(mergedList);
		System.out.println(mergedArray);
	}

	private static void venus(int[]... n12) {
		 for(int[] n1 : n12)
			 System.out.print(n1[0]);
		
	}

}
