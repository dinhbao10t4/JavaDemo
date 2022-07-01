package overload.override;

public class Overloads {
	public int addNums(int a, int b) {
		return a + b;
	}

	private double addNums(double a, double b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		Overloads overloads = new Overloads();
		System.out.println(overloads.addNums(15.0, 16));
	}

}
