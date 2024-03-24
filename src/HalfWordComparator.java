import java.util.Scanner;

public class HalfWordComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String inputWord = scanner.nextLine();
        scanner.close();
        int length = inputWord.length();
        int midpoint = length / 2;
        String firstHalf = inputWord.substring(0, midpoint);
        String secondHalf;

        if (length % 2 == 0) {
            secondHalf = inputWord.substring(midpoint);
        } else {
            secondHalf = inputWord.substring(midpoint + 1);
        }
        if (firstHalf.equals(secondHalf)) {
            System.out.println("First and second half are the same.");
        } else {
            System.out.println("First and second half are different.");
        }
    }
}
