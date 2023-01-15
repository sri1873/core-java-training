package abstraction;

public class Calculator extends Calculate {
	public void calc();

	public static void main(String[] args) {
		Calculate ex1 = new Calculate(5, 5, '+');
		Calculate ex2 = new Calculate(5, 5, '-');
		Calculate ex3 = new Calculate(5, 5, '*');
		Calculate ex4 = new Calculate(5, 5, '/');
		Calculate ex5 = new Calculate(5, 5, '%');

	}

}
