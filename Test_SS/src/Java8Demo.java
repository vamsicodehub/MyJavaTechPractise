import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Java8Demo {

	public static void main(String[] args) {
<<<<<<< HEAD
		List<Integer> intList = Arrays.asList(10, 20, 20, 50, 60);

		Optional<Integer> optional = intList.stream().filter(i -> i % 10 == 0).findAny();
		System.out.println(optional.isPresent() ? optional.get() : optional.orElseThrow());

		intList.stream().filter(i -> i % 100 == 0).findAny().ifPresentOrElse((value) -> System.out.println(value),
				() -> System.out.println("Value does not exist"));
=======
		List<Integer> intList = Arrays.asList(1,10,20,20,50,600);
		List<String> strList = Arrays.asList("a", "b", "c", "d", "e");
		System.out.println(strList.stream().collect(Collectors.joining()).toUpperCase());
		intList.stream().filter(f -> (f /10 == 1 || f == 1)).forEach(System.out::print);
		
		Optional<Integer> optional = intList.stream().filter(i -> i%100 == 0).findAny();
		System.out.println(optional.orElseThrow());
>>>>>>> 395f683 (commiting the incremental changes)
	}

}
