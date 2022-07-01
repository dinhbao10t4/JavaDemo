package low.coupling;

public interface Database {
	public int TIMEOUT = 15;
	public abstract void addRow(String table, String value);
}
