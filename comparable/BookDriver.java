package comparable;

import java.util.Arrays;

public class BookDriver {
	public static void main(String[] args) {
		Book[] books = {
				new Book(1,"Csd",67.89),
				new Book(5,"Adf",37.89),
				new Book(2,"Bhd",57.89),
		};
		
		SortbyId byId = new SortbyId();
		SortbyName byName = new SortbyName();
		SortbyPrice byPrice = new SortbyPrice();
		Arrays.sort(books,byPrice);
		for(Book book:books) {
			System.out.println(book);
		}
	}
}
