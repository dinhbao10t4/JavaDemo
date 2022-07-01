package accessmodifier.samepackage;

public class Child extends Access {
	public static void main(String[] args) {
		Child access = new Child();
//		access.privateFunction();
		access.defaultFunction();
		access.protectedFunction();
		access.publicFunction();
	}
}
