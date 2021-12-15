import java.util.Stack;

public class TestHereStackSorting {

	public static void main(String[] args) {

		Stack<Integer> inputStack = new Stack<>();
		inputStack.add(10);
		inputStack.add(40);
		inputStack.add(20);
		inputStack.add(30);
		inputStack.add(50);
		
		System.out.println(sortStack(inputStack));
	}

	private static Stack<Integer> sortStack(Stack<Integer> inputStack) {
		Stack<Integer> tmpStack = new Stack<Integer>();
		int tmp = 0;
		
		while(!inputStack.isEmpty()) {
			tmp = inputStack.pop();
			while(!tmpStack.isEmpty() && tmpStack.peek() < tmp) {
				inputStack.push(tmpStack.pop());
			}
			tmpStack.push(tmp);
		}
		
		return tmpStack;
		
	}


}
