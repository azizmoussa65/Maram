import java.util.Scanner;

public class Calculator {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the first number: ");
    double firstNumber = scanner.nextDouble();

    System.out.println("Enter the operator (+, -, *, /): ");
    char operator = scanner.next().charAt(0);

    System.out.println("Enter the second number: ");
    double secondNumber = scanner.nextDouble();

    double result;
    switch (operator) {
      case '+':
        result = firstNumber + secondNumber;
        break;
      case '-':
        result = firstNumber - secondNumber;
        break;
      case '*':
        result = firstNumber * secondNumber;
        break;
      case '/':
        if (secondNumber == 0) {
          System.out.println("Error: Division by zero");
          return;
        }
        result = firstNumber / secondNumber;
        break;
      default:
        System.out.println("Invalid operator");
        return;
    }

    System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + result);
  }
}
