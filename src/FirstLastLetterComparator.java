import java.util.Scanner;

public class FirstLastLetterComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();
        char firstLetter = inputString.charAt(0);
        char lastLetter = inputString.charAt(inputString.length() - 1);
        if (Character.toLowerCase(firstLetter) == Character.toLowerCase(lastLetter)) {
            System.out.println("First and last letter are the same.");
        } else {
            System.out.println("First and last letter are different.");
        }
    }
}
