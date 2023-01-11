package classes;

public class Catalogue {

	public static void main(String[] args) {
		Product item1 = new Product("Catla", "It is a fish", 20, "kg");
		Product item2 = new Product("Puffer Fish", "Also a fish", 100, "Per unit");

		item1.ShowItem();
		item2.ShowItem();
	}

}
