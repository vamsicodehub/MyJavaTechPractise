import java.util.Arrays;

public class ArraySortBasedOnLastName {

	public static void main(String[] args) {
		String[] input = { "Rahul Gandhi", "Narendra Modi", "Mamata Banerjee" };
		Arrays.sort(input, (String o1, String o2) -> {
			return o1.split("\\s")[1].compareTo(o2.split("\\s")[1]);
		});

		System.out.println(Arrays.toString(input));
	}

}
