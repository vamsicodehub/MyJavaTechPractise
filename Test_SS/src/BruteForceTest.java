
class BruteForeceTest {
	  public static void main(String[] args) {
		int n = 41;
		int pos = 2;
		
		int result = josephusPosition(n, pos);
		System.out.println(result);
	  }
	  

	private static int josephusPosition(int n, int pos) {
		if(n == 1)
		  return n;
		
		return (josephusPosition(n - 1, pos) + pos - 1) % n + 1;
		
	  }
	}
