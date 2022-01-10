import java.util.SortedSet;
import java.util.TreeSet;

public class GeneralTestDemo {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(2);
		treeSet.add(3);
		treeSet.add(5);
		treeSet.add(7);
		
		SortedSet<Integer> sortedSet = treeSet.subSet(1, 7);
		System.out.println(sortedSet);
		sortedSet.add(4);
		sortedSet.add(6);
		System.out.println(sortedSet);
		System.out.println(treeSet);
	}

}
