
import java.util.Scanner;

public class LogicFirst {

    public static void main(String[] args) {
        loopExercise();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the Operation +, -, *, / ");
        char operator = scanner.next().charAt(0);

        switch (operator) {

            case '+' ->
                System.out.println(a + " + " + b + " = " + (a + b));
            case '-' ->
                System.out.println(a + " + " + b + " = " + (a - b));
            case '*' ->
                System.out.println(a + " + " + b + " = " + (a * b));
            case '/' ->
                System.out.println(a + " + " + b + " = " + (a / b));
            default ->
                System.out.println("Enter the correct operator");

        }

    }

    public static void loopExercise() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to find the Odd Number, Sum of Natural Number and Factorial");
        int a = scanner.nextInt();
        scanner.nextLine();

        System.out.println("The odd numbers are ");

        for (int i = 0; i < a; i++) {
            System.out.print(2 * i + 1 + " ");

        }
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum = sum + i;

        }
        System.out.println("\nThe Sum of Natural Numbers" + sum);
        int factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial = factorial * i;

        }
        System.out.println("The Factorial of " + a + " is " + factorial);

    }
}
