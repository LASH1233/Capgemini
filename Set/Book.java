package Set;


public class Book implements Comparable{
	private int id;
	private String title;
	private double price;
	public Book(int id,String title,double price) {
		this.id=id;
		this.price=price;
		this.title=title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String toString() {
		return "ID: "+this.id+" "+"Title: "+this.title+" "+"Price: "+this.price;
	}
	@Override
	public int compareTo(Object o) {
		
		return this.id-((Book)o).id;
	}

	
}
