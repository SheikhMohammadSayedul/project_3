import java.util.Scanner;

public class FloatingPointCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a floating-point number: ");
        double num = scanner.nextDouble();
        scanner.close();
        if (num == 0) {
            System.out.println("Zero");
        }
        else if (num > 0) {
            System.out.print("Positive ");
            if (Math.abs(num) < 1) {
                System.out.println("small");
            }
            else if (num > 1000000) {
                System.out.println("large");
            }
        }
        else {
            System.out.print("Negative ");
            if (Math.abs(num) < 1) {
                System.out.println("small");
            }
            else if (num < -1000000) {
                System.out.println("large");
            }
        }
    }
}
