package fawadPackage;

public class BasicCalculator {

	    // Method for addition
	    public static double add(double num1, double num2) {
	        return num1 + num2;
	    }

	    // Method for subtraction
	    public static double subtract(double num1, double num2) {
	        return num1 - num2;
	    }

	    // Method for multiplication
	    public static double multiply(double num1, double num2) {
	        return num1 * num2;
	    }

	    // Method for division
	    public static double divide(double num1, double num2) {
	        if (num2 == 0) {
	            throw new ArithmeticException("Division by zero is not allowed.");
	        }
	        return num1 / num2;
	    }

	    public static void main1(String[] args) {
	        double num1 = 10.0;
	        double num2 = 5.0;

	        // Perform calculations using the methods
	        double additionResult = add(num1, num2);
	        double subtractionResult = subtract(num1, num2);
	        double multiplicationResult = multiply(num1, num2);

	        try {
	            double divisionResult = divide(num1, num2);
	            System.out.println("Addition: " + additionResult);
	            System.out.println("Subtraction: " + subtractionResult);
	            System.out.println("Multiplication: " + multiplicationResult);
	            System.out.println("Division: " + divisionResult);
	        } catch (ArithmeticException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	

	}
 

