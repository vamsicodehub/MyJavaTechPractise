import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo {

	public static void main(String[] args) {
		try {
			// Creating the object
			Student s1 = new Student("ravi",211);
			// Creating stream and writing the object
			FileOutputStream fout = new FileOutputStream("f.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(s1);
			out.flush();
			// closing the stream
			out.close();
			System.out.println("success");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

class Person //implements Serializable 
{
	int id;
	String name;

	Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Person() {
	}
}

class Student extends Person implements Serializable {
	String course;
	int fee;
	
	public Student(String course, int fee) {
		super();
		this.course = course;
		this.fee = fee;
	}

	public Student(int id, String name, String course, int fee) {
		super(id, name);
		this.course = course;
		this.fee = fee;
	}
}