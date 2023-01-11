package classes;

public class Product {
	String name;
	String description;
	int price;
	String uom;

	Product() {
	}

	Product(String name, String description, int price, String uom) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.uom = uom;
	}

	void ShowItem() {
		System.out.println("Product Name: " + name + "\n" + "Description: " + description + "\n" + "Price: " + price
				+ "\n" + "Unit of Measure: " + uom + "\n");
	}
}
