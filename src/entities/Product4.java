package entities;

public class Product4 {

	private String name;
	private Double price;

	public Product4() {

	}

	public Product4(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product4 [name=" + name + ", price=" + price + "]";
	}

}
