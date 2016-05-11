import java.io.*;
public class SumNumbersTextFile {
    public static void main(String[] args) {
        File file = new File("numbersInput.txt");
        int sum = 0;
        try  {
            //FileReader reader = new FileReader(file);
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
