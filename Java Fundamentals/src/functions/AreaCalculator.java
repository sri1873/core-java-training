package functions;

public class AreaCalculator {
	public static void main(String[] args) {
		System.out.println("Thank you for using the area calculator");
		System.out.println("This calculator lets you get the area of: ");
		System.out.println("1 - Square\n2 - Rectangle\n3 - Triangle\n4 - Circle\n");

		//Task 5 – Call area functions.

		double square = areaSquare(2);
		double rectangle = areaRectangle(1, 2);
		double triangle = areaTriangle(1, 2);
		double circle = areaCircle(2);

		//Task 7 – Call a function that prints all the areas. 
		printAreas(square, rectangle, triangle, circle);
	}

	//Task 1 - Write a function that calculates the area of a square. 

	public static double areaSquare(double side) {
		if (side < 0) {
			System.out.println("Error: impossible");
			System.exit(0);
		}
		return Math.pow(side, 2);
	}

	//Task 2 - Write a function that calculates the area of a rectangle. 

	public static double areaRectangle(double length, double width) {
		if (length < 0 || width < 0) {
			System.out.println("Error: impossible");
			System.exit(0);
		}
		return length * width;
	}

	//Task 3 - Write a function that calculates the area of a triangle.  
	public static double areaTriangle(double base, double height) {
		if (base < 0 || height < 0) {
			System.out.println("Error: impossible");
			System.exit(0);
		}
		return (base * height) / 2;
	}

	//Task 4 - Write a function that calculates the area of circle. 
	public static double areaCircle(double radius) {
		if (radius < 0) {
			System.out.println("Error: impossible");
			System.exit(0);
		}
		return Math.PI * Math.pow(radius, 2);
	}

	//Task 6: Write a function that prints every area.

	public static void printAreas(double square, double rectangle, double triangle, double circle) {
		System.out.println("Square area: " + square);
		System.out.println("Rectangle area: " + rectangle);
		System.out.println("Triangle area: " + triangle);
		System.out.println("Circle area: " + circle);
		
		

	}
}
