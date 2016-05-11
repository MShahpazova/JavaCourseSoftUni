import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
/**
 * Created by maria on 9/14/2015.
 */
public class Enigma {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        in.nextLine();

//        String [] symbols = input.trim().split("[\\d ]+");
//        List<String> stringsWithoutNums =
//                Arrays.stream(symbols).map(s -> s.trim()).collect(Collectors.toList());
//        String [] stringsArrWithNums = input.trim().split("\\s+");
//        List<String> stringsWithNums = Arrays.stream(stringsArrWithNums).map(s -> s.trim()).collect(Collectors.toList());

        for (int i = 0; i < n; i++) {
            String input = in.nextLine();
            String [] symbols = input.trim().split("[\\d]+");
            List<String> stringsWithoutNums =
                    Arrays.stream(symbols).map(s -> s.trim()).collect(Collectors.toList());

            String [] stringsArrWithNums = input.trim().split("\\s+");
            List<String> stringsWithNums = Arrays.stream(stringsArrWithNums).map(s -> s.trim()).collect(Collectors.toList());
            int charCount = input.trim().replaceAll("[\\d ]+", "").toCharArray().length/2;
            List<String> result = new ArrayList<String>();
            for (int j = 0; j < stringsWithNums.size(); j++) {

                char [] currentWord = stringsWithNums.get(j).toCharArray();

                String decryptedWord = "";

                for (int k = 0; k < currentWord.length; k++) {
                    char decrypted = 0;
                    if ((currentWord[k] >= '0' && currentWord[k]  <= '9')){
                        decrypted = currentWord[k];
                        decryptedWord += decrypted;

                    }
                    else {
                         decrypted = (char)((int)currentWord[k] + charCount);
                        decryptedWord += decrypted;
                    }



                }
                result.add(decryptedWord);
            }
            System.out.println(String.join(" ", result));
        }
    }
}

