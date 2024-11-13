import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        double num1, num2, sum;
        System.out.println("Welcome User");

        java.util.Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first value : ");
        num1 = scanner.nextDouble();

        System.out.print("Enter the second value : ");
        num2 = scanner.nextDouble();

        sum = num1 + num2;

        System.out.printf(num1 + " + " + num2 + " = " + "%.2f\n" ,sum );

    }
}
