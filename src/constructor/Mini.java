package constructor;

public class Mini extends Car {
	public static final String COLOR_DEFAULT = "BLUE";
	public static final int ZISE_DEFAULT = 10;
	private String color;

	public Mini() {
		super(10);
//		this(Mini.COLOR_DEFAULT);
		System.out.println("constructor default of class MINI");
	}
	
	public Mini(String color) {
//		this();
		System.out.println("constructor co doi so la STRING");
		this.color = color;
	}

	public Mini(int size, String color) {
		super(size);
		this.color = color;
	}
}
