package functionalInterface;

import java.util.function.Function;

public class FunctionInterface {
	static String show(String message) {
		return "Hello " + message;
	}

	public static void main(String[] args) {
		Function<String, String> func1 = FunctionInterface::show;
		System.out.println(func1.apply("Peter"));
	}
}
