package accessmodifier.samepackage;

public class WithInPackage {
	public static void main(String[] args) {
		Access access = new Access();
//		access.privateFunction();
		access.defaultFunction();
		access.protectedFunction();
		access.publicFunction();
	}
}
