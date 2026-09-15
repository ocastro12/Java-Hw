import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenizerConcat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two words: ");
        String input = scanner.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(input);
        String firstWord = tokenizer.nextToken();
        String secondWord = tokenizer.nextToken();

        System.out.println("First word: " + firstWord);
        System.out.println("Second word: " + secondWord);

        System.out.print("Enter a separator (+, -, *): ");
        String separator = scanner.nextLine();

        if (separator.equals("+") || separator.equals("-") || separator.equals("*")) {
            String concatenated = firstWord + separator + secondWord;
            System.out.println("Concatenated string: " + concatenated);
        } else {
            System.out.println("Not valid separator.");
        }

        scanner.close();
    }
}