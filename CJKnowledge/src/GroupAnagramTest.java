import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagramTest {

	public static void main(String[] args) {
		groupAnagramAndPrint("eat,tea,tan,ate,bat");
	}

	private static void groupAnagramAndPrint(String input) {
		Map<String, List<String>> groupMap = new HashMap<>();
		for(String inputStr : input.split(",")) {
			char ch[] = inputStr.toCharArray();
			Arrays.sort(ch);
			String newStr = new String(ch);
			groupMap.putIfAbsent(newStr, new ArrayList<>());
			groupMap.get(newStr).add(inputStr);
		}
		
		groupMap.values().stream().forEach(System.out::print);
	}

}
