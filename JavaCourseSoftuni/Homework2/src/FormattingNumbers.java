import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

/**
 * Created by maria on 9/1/2015.
 */
public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();
        System.out.printf("|%1$-10X|", a);
        String binary = Integer.toBinaryString(a);
       // String paddedBinary=StringUtils.leftPad(binary,'0');
        String binaryFormatted = String.format("%10s|", binary);
        System.out.printf(String.format("%10s",binaryFormatted).replace(' ', '0'));
        System.out.printf("%10.2f|", b);
        System.out.printf("%-10.3f|",c);


    }
}
