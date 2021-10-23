import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo {

	public static void main(String[] args) {
		// Serialization
		Student s1 = null;
		try {
			// Creating the object
			s1 = new Student(10, "Vamsi", "Java", 1200);
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

		// Deserialization
		// Deserialization
		try {
			// Reading the object from a file
			FileInputStream file = new FileInputStream("f.txt");
			ObjectInputStream in = new ObjectInputStream(file);

			// Method for deserialization of object
			s1 = (Student) in.readObject();

			in.close();
			file.close();

			System.out.println("Object has been deserialized ");
			System.out.println("Id = " + s1.id);
			System.out.println("Name = " + s1.name);
			System.out.println("Course = " + s1.course);
			System.out.println("Fee = " + s1.fee);
		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException is caught");
		}
	}

}

class Person implements Serializable 
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

class Student extends Person  implements Serializable
{
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