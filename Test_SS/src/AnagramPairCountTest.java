import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramPairCountTest {

	public static void main(String[] args) {
		anagramPairCount("xyyx");
		subString("xyyx");
	}

	private static void anagramPairCount(String string) {
		Map<String, Integer> pairMap = new HashMap<>();
		int anagramPairCount = 0;
		for (int i = 0; i < string.length(); i++) {
			for (int j = i; j < string.length(); j++) {
				char[] ch = string.substring(i, j + 1).toCharArray();
				Arrays.sort(ch);
				String newStr = new String(ch);
				if (pairMap.get(newStr) != null)
					pairMap.put(newStr, pairMap.get(newStr) + 1);
				else
					pairMap.put(newStr, 1);

			}
		}

		for (String anVal : pairMap.keySet()) {
			int n = pairMap.get(anVal);
			anagramPairCount += (n * (n - 1)) / 2;
		}

		System.out.println("AnagramPairCount :: " + anagramPairCount);

	}

	static void subString(String s) {
		HashMap<String, Integer> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				char[] valC = s.substring(i, j + 1).toCharArray();
				Arrays.sort(valC);
				String val = new String(valC);
				if (map.containsKey(val))
					map.put(val, map.get(val) + 1);
				else
					map.put(val, 1);
			}
		}
		int anagramPairCount = 0;
		for (String key : map.keySet()) {
			int n = map.get(key);
			anagramPairCount += (n * (n - 1)) / 2;
		}
		System.out.println(anagramPairCount);
	}

}
