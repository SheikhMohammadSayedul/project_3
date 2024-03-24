import java.util.Scanner;

public class NumberOrderComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter mode ('strict' or 'lenient'): ");
        String mode = scanner.nextLine().trim().toLowerCase();
        if (!mode.equals("strict") && !mode.equals("lenient")) {
            System.out.println("Invalid mode. Please enter 'strict' or 'lenient'.");
            return;
        }
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        scanner.close();
        if (mode.equals("strict") && num1 < num2 && num2 < num3 ||
                mode.equals("lenient") && num1 <= num2 && num2 <= num3) {
            System.out.println("Increasing");
        } else if (mode.equals("strict") && num1 > num2 && num2 > num3 ||
                mode.equals("lenient") && num1 >= num2 && num2 >= num3) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither");
        }
    }
}
