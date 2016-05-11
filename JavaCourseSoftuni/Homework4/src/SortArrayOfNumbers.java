import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class SortArrayOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<Integer>();
        while (scanner.hasNextInt() && scanner.next() != "\n"){
            int number = scanner.nextInt();
            numbers.add(number);


        }
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i)+ " ");

        }
    }
}
