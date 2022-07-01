package exception.handler;

import java.io.IOException;

public class MainClass {
	public static void main(String[] args) {
		// try {
		// System.out.println(5/0);
		// System.out.println(Integer.parseInt(""));
		// } catch(NumberFormatException ex){
		// System.out.println("NumberFormatException");
		// } catch(ArithmeticException except){
		// System.out.println("ArithmeticException");
		// } catch(Exception ex){
		// System.out.println(ex.getMessage());
		// } finally {
		// System.out.println("FINALLY");
		// }

		try {
			doRisk(9, 0);
		} catch (ArithmeticException e) {
			System.out.println("ERROR");
		}
	}

	public static void doRisk(int a, int b) throws ArithmeticException {
		if(b == 0){
			throw new ArithmeticException();
//			throw new IOException();
		} else {
			System.out.println("Thuc hien phep chia a va b");
		}
	}
}
