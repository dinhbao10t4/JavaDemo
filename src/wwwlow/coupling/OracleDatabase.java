package low.coupling;

public class OracleDatabase implements Database{
	@Override
	public void addRow(String table, String Value) {
		System.out.println("Oracle add row");
	}
}
