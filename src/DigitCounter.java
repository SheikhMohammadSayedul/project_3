import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        scanner.close();
        if (num < 0) {
            num *= -1;
        }
        int digitCount = 1;
        int temp = num;
        while (temp >= 10) {
            temp /= 10;
            digitCount++;
        }
        System.out.println("The number has " + digitCount + " digit(s).");
    }
}
