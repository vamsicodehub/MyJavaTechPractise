
public class CloneDeepTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Test4 t1 = new Test4();
        t1.a = 10;
        t1.b = 20;
        t1.c.x = 30;
        t1.c.y = 40;
 
        Test4 t2 = (Test4)t1.clone();
 
        // Creating a copy of object t1
        // and passing it to t2
        t2.a = 100;
 
        // Change in primitive type of t2 will
        // not be reflected in t1 field
        t2.c.x = 300;
 
        // Change in object type field will be
        // reflected in both t2 and t1(shallow copy)
        System.out.println(t1.a + " " + t1.b + " " + t1.c.x
                           + " " + t1.c.y);
        System.out.println(t2.a + " " + t2.b + " " + t2.c.x
                           + " " + t2.c.y);

	}

}

class Test3 {
    int x, y;
}
 
// Contains a reference of Test and
// implements clone with shallow copy.
class Test4 implements Cloneable {
    int a;
    int b;
    Test3 c = new Test3();
    public Object clone() throws CloneNotSupportedException
    {
    	Test4 t4 = (Test4) super.clone();
    	c = new Test3();
    	t4.c.x = c.x;
    	t4.c.y = c.y;
    	
        return t4;
    }
}
