import java.io.*;

/**
 * Created by maria on 9/4/2015.
 */
public class SumNumbersFromTextFile {
    public static void main(String[] args) {
        File file = new File("numbersInput.txt");
        int sum = 0;
        try  {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;

            while ((line = reader.readLine()) != null)
            {
                int num = Integer.parseInt(line);
                sum+=num;
            }
        }
        catch    (IOException ex) {
            System.err.println(ex);
        }
        System.out.println(sum);
    }
}
