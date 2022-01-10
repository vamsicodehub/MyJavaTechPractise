
public class Interface8Test implements def8,def81{

	public static void main(String[] args) {
		new Interface8Test().m1();
	}

	@Override
	public void m1() {
		def8.super.m1();
		def81.super.m1();
	}

}

interface def8 {
	
	default void m1() {
		
		System.out.println("def1");
		
	}
}

interface def81 {
	
	default void m1() {
		
		System.out.println("def1");
		
	}
}