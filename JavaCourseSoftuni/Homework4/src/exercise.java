import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int rows = scnr.nextInt();
        scnr.nextLine();
        for (int i = 0; i < rows; i++) {

            //String[] input = scnr.nextLine().replaceAll("\\s+", "").split("");
            String[] input = scnr.nextLine().split("\\s+");
            System.out.println(String.join(" ", input));
        }
    }
}