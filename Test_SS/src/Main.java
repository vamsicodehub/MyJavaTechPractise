import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	static Map<Integer, Integer> resultValidatorMap = new LinkedHashMap<>();

	public static void main(String[] args) {

		List<Integer> a = Arrays.asList(5, 6, 7);
		List<Integer> b = Arrays.asList(5, 9, 8);
		List<Integer> result = compareTriplets(a, b);
		System.out.println(result.stream().reduce(0, Integer::sum));
		System.out.println(result.stream().map(Object::toString).collect(Collectors.joining(" ")) + "\n");
		resultValidatorMap.put(1, 1);
		resultValidatorMap.put(2, 3);
		resultValidatorMap.put(3, 7);
		resultValidatorMap.put(4, 9);
		resultValidatorMap.put(5, 1);
		resultValidatorMap.put(6, 3);
		resultValidatorMap.put(7, 7);
		resultValidatorMap.put(8, 9);
		resultValidatorMap.put(9, 1);
		resultValidatorMap.put(10, 3);
		resultValidatorMap.put(11, 1);

		Scanner scan = null;
		try {
			scan = new Scanner(System.in);
			int count = 0;
			while (scan.hasNextLine()) {
				String string = scan.nextLine();

				if (count > 0) {
					System.out.println(validatePSEL(string));
				}
				count++;
			}
		} catch (Exception e) {
		} finally {
			scan.close();
		}
	}

	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		int aSize = a.size();
		int bSize = b.size();
		Integer[] resultList = new Integer[2];

		if (aSize != bSize)
			return new ArrayList<>();

		while (--aSize >= 0) {
			if (a.get(aSize) > b.get(aSize))
				resultList[0] = (resultList[0] != null ? resultList[0] + 1 : 1);
			else if (a.get(aSize) < b.get(aSize))
				resultList[1] = (resultList[1] != null ? resultList[1] + 1 : 1);

		}
		
		return Stream.of(resultList).filter(i -> i!= null).collect(Collectors.toList());
		
	}

	private static String validatePSEL(String string) {
		char[] charArr = string.toCharArray();
		int value = 0;
		for (int i = 0; i < charArr.length; i++) {
			value = value + resultValidatorMap.get(i + 1) * Integer.valueOf(charArr[i] + "");
		}

		if (value % 10 == 0) {
			return "Y";
		} else {
			return "N";
		}
	}
}