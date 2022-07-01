package constructor;

public class Car {
	private int size;
	private String type;

	public Car(int size) {
		super();
		this.size = size;
		System.out.println("constructor has 1 argument of class CAR");
	}

	public Car(int size, String type) {
		super();
		this.size = size;
		this.type = type;
	}

	public Car(String type) {
		super();
		this.type = type;
	}

	public Car() {
		super();
		System.out.println("constructor default of class CAR");
	}
}
