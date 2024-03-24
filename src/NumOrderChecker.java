import java.util.Scanner;

public class NumOrderChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        scanner.close();

        if ((num1 <= num2 && num2 <= num3) || (num1 >= num2 && num2 >= num3)) {
            System.out.println("In order");
        } else {
            System.out.println("Not in order");
        }
    }
}
