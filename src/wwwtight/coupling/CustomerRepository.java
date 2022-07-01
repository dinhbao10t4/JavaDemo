package tight.coupling;

public class CustomerRepository {
	private MySqlDatabase mysqlDatabase;
	
	public CustomerRepository(MySqlDatabase mysqlDatabase) {
		super();
		this.mysqlDatabase = mysqlDatabase;
	}

	public void add(String customerName){
		mysqlDatabase.addRowToDatabase("Customer", customerName);
    }
}
