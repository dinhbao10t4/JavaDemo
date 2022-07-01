package study;

public class PassByValueDemo {
	public static void main(String[] args) {
		go();
	}

	public static void go() {
		int[] arr = new int[2];
		arr[0] = 0;
		arr[1] = 1;
		
		System.out.println("Before Method: " + arr[0] + " " + arr[1]);
		changeArray(arr);
		System.out.println("After Method: " + arr[0] + " " + arr[1]);
	}

	public static void changeArray(int[] arr){
		arr[0] = 5;
	}
	
}
