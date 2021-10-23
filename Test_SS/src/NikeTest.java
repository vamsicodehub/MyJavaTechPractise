import java.util.Stack;

public class NikeTest {

	public static void main(String[] args) {
		String input = "}}";
		System.out.println(bracketReconcile(input));
	}

	private static boolean bracketReconcile(String input) {
		char[] chr = input.toCharArray();
		Stack<String> inputStack = new Stack<>();
		String popElement = "";
		for (char c : chr) {
			String inputStr = c + "";
			
			if ("(".equals(inputStr) || "{".equals(inputStr) || "[".equals(inputStr))
				inputStack.push(c + "");
			else if (!inputStack.isEmpty())
				popElement = inputStack.pop();

			if ((")".equals(inputStr) && "(".equals(popElement)) || ("]".equals(inputStr) && "[".equals(popElement))
					|| ("}".equals(inputStr) && "{".equals(popElement)))
				return true;

		}
		return false;
	}

}
