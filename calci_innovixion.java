import java.util.Scanner;
public class calci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Command Line Simple-Calculator");
        boolean continueCalculating = true;
        while (continueCalculating) {
	    System.out.print("Enter an operator like (+, -, *, /): ");
            String operator = sc.next();
            double result=0.0,num1,num2;
            switch (operator) {
                case "+":
                    System.out.print("Enter the first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = sc.nextDouble();
                    result = num1 + num2;
                    break;
                case "-":
                    System.out.print("Enter the first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = sc.nextDouble();
                    result = num1 - num2;
                    break;
                case "*":
                    System.out.print("Enter the first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = sc.nextDouble();
                    result = num1 * num2;
                    break;
                case "/":
                    System.out.print("Enter the first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = sc.nextDouble();
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid operator***, Please select given above operator");
                    break;
            }

            System.out.println("Result: " + result);
            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String choice = sc.next();
            continueCalculating = choice.equalsIgnoreCase("yes");
        }
        sc.close();
    }
}