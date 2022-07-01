package statics;

public class Foo {
	public static final int FOO_X = 25;
	public static final int FOO_SIGN;

	static {
		FOO_SIGN = 25;
	}
	
	public static void main(String[] args) {
		System.out.println("FOO_X: " + FOO_X);
		System.out.println("FOO_SIGN: " + FOO_SIGN);
	}
}
