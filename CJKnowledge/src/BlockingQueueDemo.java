import java.util.StringJoiner;
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
		
		priorityBQueue1.add(new Employee("Vamsi", 3103));
		priorityBQueue1.add(new Employee("Sachin", 10));
		
		System.out.println(priorityBQueue1.size());
		System.out.println(priorityBQueue1);
	}

}

class Employee implements Comparable<Employee>{
	private String name;
	private int id;

	Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public int compareTo(Employee o) {
		return this.name.compareTo(o.name);
	}
	
	@Override
	public String toString() {
		StringJoiner joiner = new StringJoiner("[,]","Id="+id, " Name="+name);
		return joiner.toString();
	}

}
