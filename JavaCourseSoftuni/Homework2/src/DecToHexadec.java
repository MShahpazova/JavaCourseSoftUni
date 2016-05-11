import java.util.Scanner;

/**
 * Created by maria on 9/1/2015.
 */
public class DecToHexadec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decNum = scanner.nextInt();
        int remainder = 0;
        StringBuilder hexDec = new StringBuilder();

        while (decNum != 0) {
            remainder = decNum % 16;
            switch (remainder) {
                case 10:
                    hexDec.append("A");
                    break;
                case 11:
                    hexDec.append("B");
                    break;
                case 12:
                    hexDec.append("C");
                    break;
                case 13:
                    hexDec.append("D");
                    break;
                case 14:
                    hexDec.append("E");
                    break;
                case 15:
                    hexDec.append("F");
                    break;
                default:
                    hexDec.append(remainder);
            }
            decNum /= 16;
        }
        hexDec.reverse();
        String result = "0x"+ hexDec;
        System.out.println(result);
    }
}