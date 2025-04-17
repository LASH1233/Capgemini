package Set;

import java.util.TreeSet;

public class BookDriver {
	public static void main(String[] args) {
		SortByName s = new SortByName();
		SortByPrice s2 = new SortByPrice();
		TreeSet<Book> t = new TreeSet<Book>(s2);
		Book b = new Book(2,"ZZZ",760);
		Book b2 = new Book(1,"CCC",460);
		t.add(b);
		t.add(b2);
		System.out.println(t);
	}
}
