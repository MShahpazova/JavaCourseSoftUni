import java.util.Scanner;


public class CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pattern = "[^A-Za-z]+";
        int wordOccuranses = 0;
        String [] sentense = scanner.nextLine().split(pattern);
        String word = scanner.nextLine();
        for (int i = 0; i < sentense.length; i++) {
            if ( sentense[i].equalsIgnoreCase(word)){
                wordOccuranses++;
            }
        }
        System.out.println(wordOccuranses);
    }
}
