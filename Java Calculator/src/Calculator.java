import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();
        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        double result = 0;
        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            default -> {
                System.out.println("Invalid operator");
                return;
            }
        }
        System.out.println("The result is: " + result);
    }
}
