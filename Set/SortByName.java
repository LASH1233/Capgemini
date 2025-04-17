package Set;

import java.util.Comparator;

public class SortByName implements Comparator<Book>{
	public int compare(Book b1,Book b2) {
		return b1.getTitle().compareTo(b2.getTitle());
	}
}
