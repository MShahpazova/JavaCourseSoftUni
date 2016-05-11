import java.util.Scanner;


public class CountAllWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pattern = "[^A-Za-z]+";
        String [] sentense = scanner.nextLine().split(pattern);
        int countOfWords = sentense.length;
        System.out.println(countOfWords);
        System.out.println(String.join(" ", sentense));
    }
}
