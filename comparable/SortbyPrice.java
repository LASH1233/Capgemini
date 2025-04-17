package comparable;

import java.util.Comparator;

public class SortbyPrice implements Comparator<Book>{
	public int compare(Book b1,Book b2) {
		return Double.compare(b2.price, b1.price);
	}
}
