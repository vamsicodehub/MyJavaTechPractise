import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i<100; i++) {
			list.add(i);
		}
		
//		List<Integer> resultList = list.stream().filter(el -> el%2 == 0).collect(Collectors.toList());
		
		List<Integer> primeNoList = list.stream().filter(e -> getPrime(e)).collect(Collectors.toList());
		
		System.out.println(primeNoList);

	}

	private static boolean getPrime(Integer e) {
		int temp = e;
		int count = 0;
		while(e >= 1) {
			if(temp % e == 0)
				count++;
			
			e--;
			
		}
		if(count == 2)	
			return true;
		
		return false;
	}

}
