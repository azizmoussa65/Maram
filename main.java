import java.util.Scanner;

public class Calculator {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    do {
      System.out.println("Enter the first number: ");
      double firstNumber;
      try {
        firstNumber = scanner.nextDouble();
      } catch (NumberFormatException e) {
        System.out.println("Invalid input. Please enter a number.");
        scanner.nextLine(); // Clear the scanner buffer
        continue;
      }

      System.out.println("Enter the operator (+, -, *, /, ^): ");
      char operator = scanner.next().charAt(0);

      System.out.println("Enter the second number: ");
      double secondNumber;
      try {
        secondNumber = scanner.nextDouble();
      } catch (NumberFormatException e) {
        System.out.println("Invalid input. Please enter a number.");
        scanner.nextLine(); // Clear the scanner buffer
        continue;
      }

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
            continue;
          }
          result = firstNumber / secondNumber;
          break;
        case '^':
          result = Math.pow(firstNumber, secondNumber);
          break;
        default:
          System.out.println("Invalid operator");
          continue;
      }

      System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + result);

      System.out.println("Do you want to perform another calculation? (y/n)");
    } while (scanner.next().toLowerCase().charAt(0) == 'y');

    System.out.println("Exiting calculator.");
  }
}
