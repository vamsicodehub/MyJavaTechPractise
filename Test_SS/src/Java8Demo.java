import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Java8Demo {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(10, 20, 20, 50, 60);

		Optional<Integer> optional = intList.stream().filter(i -> i % 10 == 0).findAny();
		System.out.println(optional.isPresent() ? optional.get() : optional.orElseThrow());

		intList.stream().filter(i -> i % 100 == 0).findAny().ifPresentOrElse((value) -> System.out.println(value),
				() -> System.out.println("Value does not exist"));
	}

}
