package low.coupling;

public class MainClass {
	public static void main(String[] args) {
		CustomerRepository customerRepository = new CustomerRepository(new MySqlDatabase());
		customerRepository.add("Nguyen Van A");
	}
}
