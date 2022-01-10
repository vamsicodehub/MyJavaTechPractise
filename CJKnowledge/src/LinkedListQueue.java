
public class LinkedListQueue<T> {
	Node front,rear;
	
	class Node {
		 T element;
		 Node next;
		 
		 Node(T element) {
			 this.element = element;
		 }
	}
	
	public void enqueue(T insert) {
		Node insertNode = new Node(insert);
		if(this.front == null) {
			this.front = this.rear = insertNode;
			return;
		}
		Node temp = this.front;
		this.front.next = temp;
		this.front = insertNode;
		
	}
	
	public Node deque() {
		if(this.rear == null)
			return null;
		Node returnNode  = this.rear;
		this.rear = null;
		return returnNode;
	}
	
	public int size() {
		return 0;
	}
	
	public static void main(String[] args) {
		LinkedListQueue<Integer> queue = new LinkedListQueue<>();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		
		System.out.println("Checking queue's front"+ queue.front.element);
		System.out.println("Checking queue's rear"+ queue.rear.element);
		
		queue.deque();
		
		System.out.println("Checking queue's front"+ queue.front.element);
		System.out.println("Checking queue's rear"+ queue.rear.element);
	}

}
