
public class LinkedListStack<E> {

	Node top;

	class Node {
		E data;
		Node next;

		Node(E data) {
			this.data = data;
		}
	}

	void push(E element) {
		Node node = new Node(element);
		node.next = top;
		top = node;
	}

	E pop() {
		Node currNode = this.top;
		Node nextTop = this.top.next;
		if (currNode != null) {
			this.top = null;
			this.top = nextTop;
			return currNode.data;
		}

		return null;
	}
	
	E peek() {
		if (!isEmpty()) {
			return top.data;
		}

		return null;
	}

	public boolean isEmpty() {
		return top == null;
	}

	public static void main(String[] args) {
		
		LinkedListStack<Integer> linkedListStack = new LinkedListStack<>();
		linkedListStack.push(10);
		linkedListStack.push(20);
		
		System.out.println(linkedListStack.peek());
		System.out.println(linkedListStack.pop());
		System.out.println(linkedListStack.peek());

	}

}
