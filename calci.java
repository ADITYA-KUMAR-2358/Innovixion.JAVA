import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Command Line Calculator!");

        while (true) {
            System.out.println("\nEnter an expression (e.g., 2 + 3) or 'exit' to quit:");

            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            try {
                double result = evaluateExpression(input);
                System.out.println("Result: " + result);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }

    private static double evaluateExpression(String expression) {
        String[] tokens = expression.split(" ");
        if (tokens.length != 3) {
            throw new IllegalArgumentException("Invalid expression format. Please use: operand1 operator operand2");
        }

        double operand1 = Double.parseDouble(tokens[0]);
        double operand2 = Double.parseDouble(tokens[2]);
        String operator = tokens[1];

        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 == 0) {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator. Supported operators are +, -, *, /");
        }
    }
}