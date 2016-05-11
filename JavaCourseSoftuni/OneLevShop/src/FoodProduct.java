import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by maria on 9/24/2015.
 */
public class FoodProduct extends Product implements Expirable, Comparable<FoodProduct> {
    private Date expirationDate;
    private final double expirationDiscount;
    public FoodProduct(String name, double price, int quantity, AgeRestriction ageRestriction, Date expirationDate){
        super(name, price, quantity, ageRestriction);
        this.setExpirationDate(expirationDate);
        this.expirationDiscount = 70d/100d;

    }

    public Date getExpirationDate(){
        return this.expirationDate;
    }

    public void setExpirationDate(Date expirationDate){
        this.expirationDate = expirationDate;
    }

    public double getExpirationDiscount(){
        return this.expirationDiscount;
    }

    @Override
    public double getPrice(){
        Date now = new Date();
        long diffBetweenDays = expirationDate.getTime() - now.getTime();
        long days = TimeUnit.MILLISECONDS.convert(diffBetweenDays, TimeUnit.DAYS);
        if(days >= 15) {
            return expirationDiscount * super.getPrice();
        }
        else
            return super.getPrice();

    }
      public boolean hasExpired(){
          Date now = new Date();
          long diffBetweenDays = expirationDate.getTime() - now.getTime();
          if ( diffBetweenDays < 0 ){
              return true;
          }
          else {
              return false;
          }
      }

    @Override
    public int compareTo(FoodProduct o) {
        return this.getExpirationDate().compareTo(o.getExpirationDate());
    }
}
