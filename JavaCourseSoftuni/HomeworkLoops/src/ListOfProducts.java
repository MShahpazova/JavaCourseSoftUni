import java.io.*;
import java.util.*;
import java.util.Comparator;
import java.util.stream.Collectors;


public class ListOfProducts {

    public static FileWriter writer;

    public static void main(String[] args) throws Exception, IOException {
        writer = new FileWriter("filetowrite.txt");
        List<Product> products = new ArrayList<Product>();
        File file = new File("products.txt");
        BufferedReader reader = null;
        String maria = "Maria";

        try  {
             reader = new BufferedReader(new FileReader(file));
            String line = null;

            while ((line = reader.readLine()) != null)
            {
                String [] arguments = line.split(" ");
                String name = arguments[0];
                double price = Double.parseDouble(arguments[1]);
                Product product = new Product();
                product.setName(name);
                product.setPrice(price);
                products.add(product);
            }
            //FileWriter fr = new FileWriter("filetowrite.txt");
            products
                   .stream() // Stream API
                   .sorted((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()))
                   .forEach(ListOfProducts::writeLine);

            //.Select(int.Parse)
            // string[] masiv = new string[] {"123", "321"}
            // int[] drug = masiv.Select(int.Parse);

            writer.flush();
            writer.close();
        }
        catch    (IOException ex) {
            System.err.println(ex);
        }
        finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() == o2.getPrice()) {
                    return 0;
                }

                if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                }

                return 1;
            }
        });
    }

    public static void writeLine(Product line) {
        try {
            writer.write(line.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
