package comparable;

import java.util.Comparator;

public class SortbyId implements Comparator<Book>{
	public int compare(Book b1,Book b2) {
		return b1.id-b2.id;
	}
}
