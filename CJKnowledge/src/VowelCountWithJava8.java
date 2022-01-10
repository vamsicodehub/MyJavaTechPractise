import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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


		Stream.of(s.toCharArray());
		List<Character> vowelChars = Arrays.asList('a','e','i','o','u');
		Map<Object, Integer> vowelCountMap = charList.parallelStream().filter(e -> vowelChars.contains(e)).
	            collect(Collectors.toConcurrentMap(w -> w, w -> 1, Integer::sum));
		
		System.out.println(vowelCountMap);
		
		System.out.println(charList.parallelStream().filter(e -> vowelChars.contains(e)).
				collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, Collectors.toList()))
				);
		
		Map<Object, Long> charCountMap = charList.parallelStream().filter(e -> vowelChars.contains(e)).
				collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, Collectors.counting()));
		
		System.out.println(charCountMap);
		
		System.out.println(charCountMap.entrySet().stream().filter(e -> e.getValue() == 1).findFirst().get());
		
		charList.stream().sorted((o1,o2) -> o2.compareTo(o1)).forEach(System.out::print);
		System.out.println();
		charList.stream().sorted().forEach(System.out::print);
		
		charList.parallelStream().filter(e -> vowelChars.contains(e)).
        collect(Collectors.maxBy(Comparator.reverseOrder())).stream().forEach(System.out::print);
		
		charList.parallelStream().filter(e -> vowelChars.contains(e)).
        collect(Collectors.minBy(Comparator.comparing(e -> e))).stream().forEach(System.out::print);
	
	}
	
}

@FunctionalInterface
interface fi1 {
	void m1();
}

@FunctionalInterface
interface fi2 extends fi1 {
	public default void m1() {
		m12();
	}
	
	private void m12() {
		
	}
	
	void m2();
}
