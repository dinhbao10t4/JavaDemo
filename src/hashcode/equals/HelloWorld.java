package hashcode.equals;

public class HelloWorld {
	public static void main(String[] args) {
		Student student1 = new Student("A", "A", 18);
		Student student2 = new Student("A", "A", 18);
		System.out.println(student1.equals(student2));
		System.out.println(student1 == student2);
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
	}
}
