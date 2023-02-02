package abstraction;

abstract class Calculate {
	double num4;
	double num2;
	char operator;

	Calculate() {
	}

	abstract void calc(double num1, double num2, char operator);
}

public class Calculator extends Calculate {
	public void calc(double num1, double num2, char operator) {
		switch (operator) {
		case '+':
			System.out.println(num1 + num2);
			break;
		case '-':
			System.out.println(num1 - num2);
			break;
		case '*':
			System.out.println(num1 * num2);
			break;
		case '/':
			System.out.println(num1 / num2);
			break;
		default:
			System.out.println("Not in +,-,*,/");
		}
	};

	public static void main(String[] args) {
		Calculator ex1 = new Calculator();
		Calculator ex2 = new Calculator();
		
		ex1.calc(10, 5, '+');
		ex2.calc(23.3, 10, '-');
	}
}
