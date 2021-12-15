public class BrutForceTest {
	
  public static void main(String[] args) {
	int n = 5;
	int pos = 2;
	
	int result = josephusPosition(n, pos);
	System.out.println("Josephus should sit on position# " + result);
  }
  
  private static int josephusPosition(int n, int pos) {
	if(n == 1)
	  return n;
	
	return (josephusPosition(n - 1, pos) + pos -1 ) % n + 1;
	
  }
}