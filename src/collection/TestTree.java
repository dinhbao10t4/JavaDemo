package collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestTree {
	class BookCompare implements Comparator<Book> {
		public int compare(Book one, Book two) {
			return (one.getTitle().compareTo(two.getTitle()));
		}
	}

	public void go() {
		Book b1 = new Book("How Cats Work");
		Book b2 = new Book("Remix your Body");
		Book b3 = new Book("Finding Emo");

		BookCompare bookCompare = new BookCompare();
		Set<Book> tree = new TreeSet<Book>(bookCompare);
		tree.add(b1);
		tree.add(b2);
		tree.add(b3);
		for (Book book : tree) {
			System.out.println(book.toString());
		}
	}

	public static void main(String[] args) {
		new TestTree().go();
	}

}
