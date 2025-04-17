package oops;

public class Product {
	public Product(String name) {
		this.product_name=name;
	}
	private String product_name;
	public String getProduct() {
		return product_name;
	}
	public void setProduct(String product_name) {
		this.product_name=product_name;
	}
}
