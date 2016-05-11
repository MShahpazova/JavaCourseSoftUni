import java.text.MessageFormat;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by maria on 9/2/2015.
 */
public class Generate3LetterWords {
    public static void main(String[] args) {
        HashSet<String> combinations = new HashSet<String>();
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        char [] letters = input.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < letters.length; j++) {
                for (int k = 0; k < letters.length; k++) {
                    combinations.add(String.format("%s%s%s", letters[i], letters[j],letters[k]));
                }
            }
        }
        System.out.println(String.join(" ", combinations));
    }
}