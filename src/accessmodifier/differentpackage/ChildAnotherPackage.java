package accessmodifier.differentpackage;


import accessmodifier.samepackage.Access;

public final class ChildAnotherPackage extends Access {
	private ChildAnotherPackage(){
		
	}
	
	public static void main(String[] args) {
		ChildAnotherPackage access = new ChildAnotherPackage();
//		access.privateFunction();
//		access.defaultFunction();
		access.protectedFunction();
		access.publicFunction();
	}
}
