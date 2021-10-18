import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * @author Lenovo
 *
 */
public class BlockingQueueDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BlockingQueue<Integer> priorityBQueue = new ArrayBlockingQueue<>(10);
		BlockingQueue<Employee> priorityBQueue1 = new PriorityBlockingQueue<>();
		
		for(int i = 0; i<10; i++) {
			priorityBQueue.add(i);
		}
		
		System.out.println(priorityBQueue.size());
		System.out.println(priorityBQueue);
		
		priorityBQueue1.add(new Employee("v", 0));
		priorityBQueue1.add(new Employee("v", 0));
		
		System.out.println(priorityBQueue1.size());
		System.out.println(priorityBQueue1);
	}

}

class Employee {
	private String name;
	private int id;

	Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
}
