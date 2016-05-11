import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by maria on 9/29/2015.
 */
public class Program {
    public static void main(String[] args) {
        List <Product> products = new ArrayList<Product>();
        FoodProduct cigars = new FoodProduct("420 Blaze it fgt", 6.90, 1400, AgeRestriction.Adult, new Date());

        Customer pecata = new Customer("Pecata", 17, 30.00);
        try {
            PurchaseManager.processOrder(cigars, pecata);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        Customer gopeto = new Customer("Gopeto", 18, 0.44);
        try {
            PurchaseManager.processOrder(cigars, gopeto);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date;
        try {
            date = sdf.parse("30/09/2015");
        } catch (ParseException e){
            System.out.println(e.getMessage());
            date = new Date();
        }

        FoodProduct chocolate = new FoodProduct("Lindt", 3.50, 3, AgeRestriction.None, date);
        products.add(cigars);
        products.add(chocolate);
        Date shampooDate;

        try{
            shampooDate = sdf.parse("29/09/2015");
        }catch (ParseException e){
            shampooDate = new Date();
        }
        FoodProduct shampoo = new FoodProduct("H&Sh", 5, 2, AgeRestriction.None, shampooDate);
        products.add(shampoo);
        Product computer = new Computer("Samsung", 1000, 2, AgeRestriction.Adult);
        Product MirosComp = new Computer("Lenovo", 999, 1, AgeRestriction.Adult);
        Product TaniaComp = new Computer("Toshiba", 500, 1, AgeRestriction.Adult);

        List<Product> expirableProducts = products.stream().filter(p -> p instanceof FoodProduct).collect(Collectors.toList());
        expirableProducts.forEach(p -> System.out.println(p.getName()));

        List<FoodProduct> expirableFoodProducts = new ArrayList<FoodProduct>();
        expirableProducts.forEach(p -> expirableFoodProducts.add((FoodProduct) p));
        Collections.sort(expirableFoodProducts, new Comparator<FoodProduct>() {
            @Override
            public int compare(FoodProduct o1, FoodProduct o2) {
                return o1.getExpirationDate().compareTo(o2.getExpirationDate());
            }
        });
        FoodProduct soonest = expirableFoodProducts.get(0);
       // Collections.sort(expirableProducts, (s1, s2) -> s1.getExpirationDate().compareTo(s2.getExpirationDate()));
        System.out.println(soonest.getName());

    }
}
