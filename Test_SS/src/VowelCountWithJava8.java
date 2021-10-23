import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class VowelCountWithJava8 {

	public static void main(String[] args) {
		List<Character> charList = new ArrayList<>();
		String s = "fhjjfghjfjfioeaaeiou";
		for (int i = 0; i < s.toCharArray().length; i++) {
			charList.add(s.charAt(i));
		}
		List<Integer> inputList = Arrays.asList(10, 20, 23, 45, 55, 65, 70, 80, 90, 40, 30);
		System.out.println("Sequential:"
				+ inputList.stream().filter(l -> (l % 10 == 0)).collect(Collectors.toCollection(ArrayList::new)));
		System.out.println(
				"Parallel:" + inputList.parallelStream().filter(l -> (l % 10 == 0)).collect(Collectors.toList()));
		List<Character> vowelChars = Arrays.asList('a', 'e', 'i', 'o', 'u');
		Map<Object, Integer> vowelCountMap = charList.parallelStream().filter(e -> vowelChars.contains(e))
				.collect(Collectors.toConcurrentMap(w -> w, w -> 1, Integer::sum));

		System.out.println(charList.parallelStream().filter(e -> vowelChars.contains(e))
				.collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, Collectors.toList())));

		System.out.println(charList.parallelStream().filter(e -> vowelChars.contains(e))
				.collect(Collectors.groupingBy(i -> i, Collectors.counting())));

		System.out.println(charList.parallelStream().filter(e -> vowelChars.contains(e))
				.collect(Collectors.groupingBy(i -> i, Collectors.averagingInt(i -> i))));
		
		System.out.println(charList.parallelStream().filter(e -> vowelChars.contains(e))
				.collect(Collectors.groupingBy(i -> i, Collectors.summarizingInt(i -> i))));

		System.out.println(vowelCountMap);

	}

}
