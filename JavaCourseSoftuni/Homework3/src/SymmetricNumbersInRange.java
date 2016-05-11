import java.util.Scanner;

/**
 * Created by maria on 9/2/2015.
 */
public class SymmetricNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        String number;
        StringBuilder output = new StringBuilder();
        for (int i = a; i <= b; i++) {

            number = Integer.toString(i);
            String reverse = new StringBuffer(number).reverse().toString();
            if (number.equals(reverse))
            {
                output.append(number + " ");
            }
        }
        System.out.println(output.toString().trim());
    }
}
