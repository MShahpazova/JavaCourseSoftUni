import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class CountSubstringOccurances {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String subSeq = scanner.nextLine();
        Pattern pattern = Pattern.compile(subSeq, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        int c = 0;
        for (int i = 0; i < input.length(); i += 0) {

            matcher.region(i, input.length());
            if (matcher.find()) {
                c++;
                i = matcher.end() - 1;
            } else {
                i++;
            }
        }
        System.out.println(c);
    }
}
