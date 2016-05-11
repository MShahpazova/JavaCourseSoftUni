import java.util.Scanner;

/**
 * Created by maria on 9/1/2015.
 */
public class CountOfBit1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decNum = scanner.nextInt();
        String binaryNum = Integer.toBinaryString(decNum);
        char[] binaryNumAsArray = binaryNum.toCharArray();
        int countOfBitOne = 0;
        for (int i = 0; i < binaryNumAsArray.length; i++) {
            if (binaryNumAsArray[i] == 1) {
                countOfBitOne++;
            }
            System.out.println(countOfBitOne);
        }
    }
}