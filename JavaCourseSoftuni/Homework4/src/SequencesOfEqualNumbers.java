import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SequencesOfEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String [] strings = input.split(" ");
        List<String> sequences = new ArrayList<String>();
        for (int i = 1; i < strings.length; i++) {
            if ( strings[i-1].equals(strings[i])) {
                System.out.print(strings[i - 1] + " ");
            } else {
                System.out.println(strings[i - 1]);
            }
        }

        System.out.println(strings[strings.length - 1]);

    }
}
