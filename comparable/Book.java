package comparable;

public class Book {
	int id;
	String title;
	double price;
	
	public Book(int id,String title,double price) {
		this.id=id;
		this.title=title;
		this.price=price;
	}
	public String toString() {
		return id+"\t"+title+"\t"+price;
	}
}
