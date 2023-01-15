package abstraction;

abstract class Calculate {
	double num1;
	double num2;
	char operator;

	Calculate() {
	}

	Calculate(double num1, double num2, char operator) {
		this.num1 = num1;
		this.num2 = num2;
		this.operator = operator;
		calc();
	}

	abstract calc() {
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
		default:System.out.println("Not in +,-,*,/");  
		}

	}
}
