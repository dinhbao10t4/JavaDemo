package low.coupling;

public class CustomerRepository {
	private Database database;
	
	public CustomerRepository(Database database) {
		super();
		this.database = database;
	}

	public void add(String customerName){
		database.addRow("Customer", customerName);
    }
}
