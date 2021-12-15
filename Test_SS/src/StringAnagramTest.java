import java.util.Arrays;

public class StringAnagramTest {

	public static void main(String[] args) {
		String s1="ab",s2="ba";
		boolean result = isAnagrams(s1,s2);
		System.out.println(result);

	}

	private static boolean isAnagrams(String s1, String s2) {
		if(s1.length() != s2.length())
			return false;
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		s1 = new String(c1);
		s2 = new String(c2);
		
		return s1.equals(s2);
	}

}
