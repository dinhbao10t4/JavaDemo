package hashcode.equals;

public class Student {
	private String firstName;
	private String lastName;
	private int age;

	@Override
	public int hashCode() {
		int result = 17;
		if (firstName != null) {
	        result = 31 * result + firstName.hashCode();
		}
		
		if (lastName != null) {
	        result = 31 * result + lastName.hashCode();
		}
		return  result + age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
	        return true;
	    if (!(obj instanceof Student))
	        return false;
		Student student = (Student) obj;
		return this.firstName == student.getFirstName() && this.lastName == student.getLastName()
				&& this.age == student.getAge();
	}

	public Student() {
		super();
	}

	public Student(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}

}
