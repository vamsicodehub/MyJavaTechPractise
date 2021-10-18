import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Test_SS_1 {

	public static void main(String[] args) throws Exception {
		"s".toCharArray();
		System.out.println(new A("").name);
		System.out.println(new B("").getName());
		static1 static1 = new static1();
		static1 static12 = new static1();
		int a = 2;
		static1.add(a, a + 1);
		static12.add(5, a);
		System.out.println(static1.x + " " + static12.y);
		test2();
		test("barfoothefoobarman" + "", Arrays.asList("foo", "bar"));
		System.out.println(NthTerm(6));
		System.out.println(majorityElement(new int[] { 1, 2, 4 }, 1));

	}

	static BigInteger NthTerm(int N) {
		BigInteger result = new BigInteger("2");
		BigInteger initVal = null;
		if (N % 2 == 0) {
			int i = N / 2 - 1;
			while (i != 0) {
				initVal = new BigInteger("1");
				for (int j = 1; j <= 3; j++) {
					initVal = result.multiply(initVal);
				}
				result = initVal;
				i--;
			}
		} else {
			int i = N / 2;
			while (i != 0) {
				initVal = new BigInteger("1");
				for (int j = 1; j <= 2; j++) {
					initVal = result.multiply(initVal);
				}
				result = initVal;
				i--;
			}
		}
		return result;
	}

	static int majorityElement(int[] a, int size) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			if (map.get(a[i]) != null)
				map.put(a[i], map.get(a[i]) + 1);
			else
				map.put(a[i], 1);
		}

		for (Map.Entry<Integer, Integer> entryMap : map.entrySet()) {
			if (entryMap.getValue() > size / 2)
				return entryMap.getKey();
		}

		return -1;
	}

	private static void test2() {
		List<String> list1 = new LinkedList<>();
		list1.add("geeks");
		list1.add("for");
		list1.add("geeks");
		list1.add("geeksforgeeks");

		List<String> list2 = new LinkedList<>();
		list2.add("geeks");

		list1.removeAll(list2);

		System.out.println(list1);

	}

	private static void test(String input, List<String> reqCharIndices) {
		for (String str : reqCharIndices) {
			System.out.println(input.indexOf(str));
		}
	}

}

class A {
	public String name = "vamsi";

	A(String s) throws IOException {
		System.out.println("A");
	}

	public void doo() throws Throwable {
	}

}

class B extends A {
	private String name = "Nag";

	B(String s) throws NullPointerException, IOException {
		super(s);
		System.out.println("A");
	}

	public String getName() {
		return name;
	}

	@Override
	public void doo() throws Exception {

	}
}

class static1 {
	static int x, y;

	void add(int a, int b) {
		x = a + b;
		y = x + b;
	}
}
