package collection;

public class Book /*implements Comparable<Book>*/ {
	private String title;

	public Book(String t) {
		title = t;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "Book [title=" + title + "]";
	}

	/*@Override
	public int compareTo(Book o) {
		return title.compareTo(o.getTitle());
	}*/
	
}
