package statics;

public class Foof {
	final int size = 3;
	// now you can't change size
	final int whuffie;

	Foof() {
		whuffie = 42;
//		size = 9;
		// now you can't change whuffie
	}

	void doStuff(final int x) {
		// you can�t change x
	}

	void doMore() {
		final int z = 7;
		// you can�t change z
	}

}
