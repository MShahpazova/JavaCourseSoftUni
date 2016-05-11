import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ExtractEmails {
    public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            Pattern pattern =  Pattern.compile("(([a-zA-Z0-9.-_]+)@([a-zA-Z-.]+))");
            Matcher matcher = pattern.matcher(input);
            List<String> emails = new ArrayList<String>();
            int counter = 0;
        while (matcher.find()){
            String match = matcher.group(0);
            if ( match.charAt(match.length()-1) == '.'){
                match = match.substring(0, match.length() - 1);

            }
            emails.add(match);
        }
        System.out.println(String.join(" ", emails));

    }
}
