package functionalInterface;

import java.util.function.Predicate;

@FunctionalInterface
interface functional {
	void show();
}

class Implement implements functional {
	public void show() {
		System.out.println("Functional interfaces");
	}
}

public class Demo {

	public static void main(String[] args) {
		functional obj1 = new Implement();
		obj1.show();
		Predicate<String> checkLength = str -> str.length() > 5;
		System.out.println(checkLength.test("length"));
	}

}
