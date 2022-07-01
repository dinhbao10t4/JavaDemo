package low.coupling;

public class MySqlDatabase implements Database{
	@Override
	public void addRow(String table, String value) {
		System.out.println("MySql add row");
	}
}
