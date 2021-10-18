import java.util.Stack;

public class Test1 {

	public static void main(String[] args) {
		String input = "}}";
		System.out.println(bracketReconcile(input));
	}

	private static boolean bracketReconcile(String input) {
		char[] chr = input.toCharArray();
		Stack<String> inputStack = new Stack<>();
		String popElement = "";
		for(char c : chr) {
			String inputStr = c + "";
			if("(".equals(inputStr) || "{".equals(inputStr) || "[".equals(inputStr))
				inputStack.push(c + "");
			else if(!inputStack.isEmpty())
				popElement = inputStack.pop();
			
			if(")".equals(inputStr) && popElement.equals("(") || "]".equals(inputStr) && popElement.equals("[")
					|| "}".equals(inputStr) && popElement.equals("{"))
				return true;
			
		}
		return false;
	}

}
