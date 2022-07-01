package overload.override;

public class MainClass {
	public static void main(String[] args) {
		Appliance appliance = new Toaster();
//		appliance.close();
//		appliance.turnOff(5);
		
		if(appliance instanceof Appliance){
			System.out.println("true");
		}
	}
}
