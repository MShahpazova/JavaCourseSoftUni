import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;


public class SumNumbersTextFile {
    public static void main(String[] args) {
        File file = new File("numbersInput.txt");
        try {
            FileReader f = new FileReader(file);
            char[] a = new char[50];
            f.read(a);
            System.out.println(a.length);
            for(char c : a)
                System.out.print(c);
            System.exit(1);

        } catch (IOException fe) {
        }
        try (BufferedReader reader =
                     new BufferedReader(new FileReader(file))) {

                String line = null;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }

        } catch (IOException x) {
            System.err.println(x);
        }


    }




}
