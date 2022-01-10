public class LinkedListInsertWithOutChangingSortingOrder {

	Node start = null;
	Node head = null;

	class Node {
		Integer body;
		Node nextNode;

		Node(Integer value) {
			body = value;
		}
	}

	private void insertInMiddle(Integer value) {
		head = start;
		if (start == null) {
			start = new Node(value);
			head = start;
			head.nextNode = null;
			return;
		}
		
		if(head.body > value) {
			Node newNode = new Node(value);
			newNode.nextNode = head.nextNode;
			head.nextNode = newNode;
			return;
		}
			

		while (head.body < value) {
			if (head.nextNode == null || head.nextNode.body >= value) {
				Node newNode = new Node(value);
				newNode.nextNode = head.nextNode;
				head.nextNode = newNode;

				break;
			}
			head = head.nextNode;
		}
	}

	private void traverse() {
		head = start;
		while (head != null) {
			System.out.println(head.body);
			head = head.nextNode;
		}
	}

	public static void main(String[] args) {
		LinkedListInsertWithOutChangingSortingOrder ll = new LinkedListInsertWithOutChangingSortingOrder();

		ll.insertInMiddle(50);
		ll.insertInMiddle(5);
		ll.insertInMiddle(10);
		ll.insertInMiddle(15);
		ll.insertInMiddle(7);

		ll.traverse();

	}
}