
public class LinkedList<T> {

	private Node head;

	class Node {
		Node next;
		T element;

		Node(T element) {
			this.element = element;
		}

	}

	LinkedList<T> add(T e) {
		Node head = this.head;
		Node currNode = new Node(e);
		currNode.next = null;
		Node last = head;

		if (head == null) {
			this.head = currNode;
		} else {
			while (last.next != null) {
				last = last.next;
			}

			last.next = currNode;
		}
		return this;
	}

	void print() {

		Node curr = this.head;
		while (curr != null) {
			System.out.println("LinkedList : " + curr.element);
			curr = curr.next;
		}

	}

	void printMiddle() {

		Node fastPtr = this.head;
		Node slowPtr = this.head;
		while (fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
		}

		System.out.println("Middle LinkedList Element is : " + slowPtr.element);

	}

	private void delete(int position) {
		// If linked list is empty
		if (head == null)
			return;

		// Store head node
		Node temp = head;

		// If head needs to be removed
		if (position == 0) {
			head = temp.next; // Change head
			return;
		}

		// Find previous node of the node to be deleted
		for (int i = 0; temp != null && i < position - 1; i++)
			temp = temp.next;

		// If position is more than number of nodes
		if (temp == null || temp.next == null)
			return;

		// Node temp->next is the node to be deleted
		// Store pointer to the next of node to be deleted
		Node next = temp.next.next;

		temp.next = next; // Unlink the deleted node from list

	}

	public static void main(String[] args) {

		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(40);
		linkedList.add(50);
		linkedList.add(60);
		linkedList.add(70);
		linkedList.add(80);
		linkedList.add(90);
		linkedList.add(40);
		linkedList.add(40);

		linkedList.print();
		linkedList.printMiddle();
		linkedList.delete(1);

		linkedList.print();

	}

}
